/**
 * Project Name:test
 * File Name:TestClient.java
 * Package Name:httpclient
 * Date:2016年4月20日下午4:46:10
 *
*/

package httpclient;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * ClassName:TestClient 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年4月20日 下午4:46:10 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestClient {

	public void getMethod(){
		 HttpClient client = new HttpClient();
		 GetMethod get = new GetMethod("https://www.baidu.com/index.php?tn=monline_3_dg");
		 String response = "";
		 try {
		 System.out.println(client.executeMethod(get));
		 //打印服务器返回的状态
		 System.out.println(get.getStatusLine());
		 //打印返回的信息
		 response = get.getResponseBodyAsString();
		 System.out.println(response);
		 } catch (HttpException e) {
		
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		
		 } catch (IOException e) {
		
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		
		 }
	}
	
	public static void main(String[] args) {
		TestClient tx = new TestClient();
		tx.getMethod();
	}
}

