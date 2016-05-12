/**
 * Project Name:test
 * File Name:Enum.java
 * Package Name:枚举
 * Date:2016年5月12日下午5:33:18
 *
*/

package 枚举;
/**
 * ClassName:Enum 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月12日 下午5:33:18 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public enum ColorEnum {
	red,green,blue;
	
	public static final String Test = "Test";
	
	public static ColorEnum getColor(){
		if ("Test".equals(Test)) {
			return red;
		} else {
			return blue;
		}
	}
}

