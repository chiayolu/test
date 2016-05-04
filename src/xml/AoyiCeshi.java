/**
 * Project Name:test
 * File Name:AoyiCeshi.java
 * Package Name:xml
 * Date:2016年4月18日下午2:06:44
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package xml;
/**
 * ClassName:AoyiCeshi 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年4月18日 下午2:06:44 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class AoyiCeshi {
	public static void main(String[] args) {
		String str = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<string xmlns=\"http://tempuri.org/\">1|14609534724207808</string>";
		String resultNum = "";
		int startIndex = str.indexOf(">" ,str.indexOf(">") + 1);
		int endIndex = str.lastIndexOf("<");
		String num = str.substring(startIndex + 1, endIndex);
		int successnum= num.indexOf("|");
		if (successnum > -1) {
			endIndex = str.indexOf("|");
			resultNum = str.substring(startIndex +1, endIndex);
		} else {
			resultNum = str.substring(startIndex +1, endIndex);
		}
		System.out.println(resultNum);
	}
}

