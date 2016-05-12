/**
 * Project Name:test
 * File Name:TestSplit.java
 * Package Name:截取字符串
 * Date:2016年5月9日上午10:55:47
 *
*/

package 截取字符串;
/**
 * ClassName:TestSplit 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月9日 上午10:55:47 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestSplit {
	public static void main(String[] args) {
		String str = "aaaaa;bbbbb";
		String[] arr = str.split(";");
		System.out.println(arr[0]);
	}
}

