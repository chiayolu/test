/**
 * Project Name:test
 * File Name:TestEmu.java
 * Package Name:枚举
 * Date:2016年5月12日下午5:29:23
 *
*/

package 枚举;
/**
 * ClassName:TestEmu 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月12日 下午5:29:23 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestEmu {
	public static void main(String[] args) {
		// 普通枚举型
		String aa = ColorEnum.blue.toString();
		System.out.println(aa);
		ColorEnum res = ColorEnum.green;
		switch (res) {
		case green:
			System.out.println("green");
			break;
		case blue:
			System.out.println("blue");
			break;
		}
		
		// 枚举类型的常量和方法
		String test = ColorEnum.Test;
		ColorEnum col = ColorEnum.getColor();
		
		// 带有构造器的枚举
		System.out.println(GenderEnum.man.getValue());
		TestEmu testEmu = new TestEmu();
		System.out.println(testEmu.getA(GenderEnum.man));
		
		// 遍历枚举
		for (GenderEnum ge : GenderEnum.values()) {
			System.out.println(ge.getValue());
		}
		
		for (ColorEnum ce : ColorEnum.values()) {
			System.out.println(ce);
		}
		
		// 得到枚举的个数
		System.out.println(ColorEnum.values().length);
		
		// 得到某个枚举的下标
		System.out.println(ColorEnum.red.ordinal());
	}
	
	
	public String getA(GenderEnum genderEnum) {
		return genderEnum.getValue();
	}
}

