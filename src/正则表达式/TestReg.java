/**
 * Project Name:test
 * File Name:TestReg.java
 * Package Name:正则表达式
 * Date:2016年5月18日下午3:55:44
 *
*/

package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName:TestReg Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2016年5月18日 下午3:55:44
 * 
 * @author "jia"
 * @version
 * @see
 */
public class TestReg {

	public static void main(String[] args) {
		// 判断字符串是否匹配正则表达式
		String str = "aababxx";
		String regex = "b.b";
		System.out.println("str符合正则表达式" + str.matches(regex));
		
		// 对字符串进行分割，匹配的字串为分隔符，分割成字符串数组
		String[] strArray = str.split(regex,2);		//数字2指的是字符串数组的个数
		for(String st : strArray){
			System.out.println(st);
		}
		
		// 对字符串进行分割，找到匹配正则表达式的字符数组
		String str2 = "</input><p>12312312312</br><a>b.jsp</a>";
        String regex2 = "</?[a-z]+(>)";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(str2);
        while (matcher.find()) {
        	System.out.println(matcher.start(0));
        }
	}
}
