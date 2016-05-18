/**
 * Project Name:test
 * File Name:TestFormat.java
 * Package Name:字符串
 * Date:2016年5月17日上午9:16:04
 *
*/

package 字符串;

import java.text.MessageFormat;

/**
 * ClassName:TestFormat 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月17日 上午9:16:04 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestFormat {
	public static void main(String[] args) {
		String url = "http://101.200.228.238/smsport/default.asmx/SendSms?username={0}&password={1}&phonelist={2}&msg={3}&longnum={4}";
		url = MessageFormat.format(url, "aa", "bb", "cc", "dd", "ee");
		System.out.println(url);
	}
}

