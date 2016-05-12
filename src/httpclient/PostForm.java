package httpclient;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
/**
 * @author Stony Zhang  (Mybeautiful)
 * @MSN  stonyz@live.com
 * @QQ   55279427
 *
 */
public class PostForm {
	private HttpClient httpClient = new HttpClient();

	private String serverURL = "";

	public String postPage(String page) {
		String url = this.getURL(page);
		PostMethod postMethod = new PostMethod(url);
		return this.post(postMethod);
	}

	private String getURL(String page) {
		// TODO Auto-generated method stub
		return "http://" + this.serverURL + "/" + page;
	}

	public String postPage(String page, Properties pdata) {
		String url = this.getURL(page);
		PostMethod postMethod = new PostMethod(url);
		NameValuePair[] data = new NameValuePair[pdata.size()];
		Enumeration keys = pdata.keys();
		int i = 0;
		for (; keys.hasMoreElements();) {
			String k = (String) keys.nextElement();
			String v = (String) pdata.get(k);
			data[i] = new NameValuePair(k, v);
			i++;
		}
		postMethod.setRequestBody(data);
		return this.post(postMethod);
	}

	private String post(PostMethod postMethod) {
		String result = "";
		try {
			int statusCode = httpClient.executeMethod(postMethod);
			// 301 or 302
			if (statusCode == HttpStatus.SC_MOVED_PERMANENTLY
					|| statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {
				Header locationHeader = postMethod
						.getResponseHeader("location");
				String location = null;
				if (locationHeader != null) {
					location = locationHeader.getValue();
					System.out
							.println("The page was redirected to:" + location);
				} else {
					System.err.println("Location field value is null.");
				}
			}
			result = postMethod.getResponseBodyAsString();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}

	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;

	}

	public String getServerURL() {
		return serverURL;
	}

}

