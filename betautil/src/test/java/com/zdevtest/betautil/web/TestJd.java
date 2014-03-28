package com.zdevtest.betautil.web;

import static org.junit.Assert.*;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.srnpr.zapcom.basehelper.TestHelper;
import com.srnpr.zapcom.basesupport.WebClientSupport;

public class TestJd extends TestHelper {

	@Test
	public void test() {
		
		
		String sUrlString="http://item.jd.com/842330.html";
		
		//WebClientSupport webClientSupport=new WebClientSupport();
		
		try {
			String sReString= doGet(sUrlString);
			
			bLogTest(sReString);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	public String doGet(String sUrl) throws Exception {
		String sReturnString = null;
		HttpClientBuilder hClientBuilder = HttpClientBuilder.create();

		CloseableHttpClient httpclient = hClientBuilder.build();

		// HttpPost httppost = new HttpPost(sUrl);

		sUrl="http://club.jd.com/productpage/p-842330-s-1-t-3-p-6.html";
		
		HttpGet httpGet = new HttpGet(sUrl);
		
		httpGet.setHeader("Referer", "http://item.jd.com/842330.html");
		

		CloseableHttpResponse response = null;

		try {

			response = httpclient.execute(httpGet);
			
			
			
			for(Header header:response.getAllHeaders())
			{
				bLogTest("name:"+header.getName()+"   value:"+header.getValue());
			}
			
			
			
			

			HttpEntity resEntity = response.getEntity();
			
			
			

			if (resEntity != null) {

				sReturnString = EntityUtils.toString(resEntity);

			}
			if (resEntity != null) {

				EntityUtils.consume(resEntity);

			}

		} catch (Exception e) {
			httpGet.reset();
			httpclient = null;
			e.printStackTrace();
			throw e;

		} finally {
			response.close();

			httpGet.reset();
			httpclient.close();
			httpclient = null;

		}

		return sReturnString;
	}
	
	
	
	

}
