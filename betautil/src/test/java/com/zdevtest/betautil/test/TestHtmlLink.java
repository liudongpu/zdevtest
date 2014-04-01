package com.zdevtest.betautil.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import com.srnpr.zapcom.basehelper.TestHelper;
import com.srnpr.zapdata.dbdo.DbUp;
import com.srnpr.zapweb.webmodel.MWebResult;

import us.codecraft.webmagic.selector.Html;
import us.codecraft.xsoup.ElementOperator.Regex;

public class TestHtmlLink extends TestHelper {

	@Test
	public void test() {

		bLogTest("aa");
		String sHtml ="";
		 sHtml = DbUp.upTable("pc_productdescription").one("product_code", "8016402276").get("description_info");
		

		//sHtml = "<a href=\"www.taobao.com\"></a>";
		//sHtml = "<a href=\"http://www.cctvmall.com/abcdefg\"></a>";
		
		bLogTest(sHtml);
		bLogTest("####################################");

		String sAllowString = "http://.*?(cctvmall\\.com|cctvmall\\.cn|cntv\\.cn)/";

		checkLinks(sHtml,sAllowString);
	}

	public MWebResult checkLinks(String sSource, String sAllow) {
		MWebResult mResult = new MWebResult();

		if (sSource.indexOf("<") > -1) {
			Html htmlSource = new Html(StringUtils.lowerCase(sSource));

			List<String> listCheck = new ArrayList<String>();

			listCheck.addAll(htmlSource.xpath("//a/@href").all());
			listCheck.addAll(htmlSource.xpath("//img/@src").all());

			if (listCheck.size() > 0) {

				Pattern pattern=Pattern.compile(sAllow); 

				for (String sCheck : listCheck) {
					// 判断如果是空 则跳过该链接
					if (StringUtils.isEmpty(sCheck)) {
						continue;
					}
					// 判断如果是以#号开始 则跳过处理
					if (StringUtils.startsWith(sCheck, "#")) {
						continue;
					}

					// 将链接中的#号替换为空
					String sRegexCheck =StringUtils.substringBefore(sCheck, "#");
					
					Matcher matcher = pattern.matcher(sRegexCheck);
					if(!matcher.find())
					{
							mResult.setResultCode(2);
							bLogTest(sCheck);
					}
					
					

				}
			}
		}

		return mResult;

	}

}
