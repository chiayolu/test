/**
 * Project Name:test
 * File Name:SeasonEnum.java
 * Package Name:枚举
 * Date:2016年5月12日下午5:58:07
 *
*/

package 枚举;
/**
 * ClassName:SeasonEnum 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月12日 下午5:58:07 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public enum GenderEnum {
	man("MAN"), woman("WOMAN");
	
	private String value;
	
	GenderEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}

