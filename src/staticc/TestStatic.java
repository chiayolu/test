/**
 * Project Name:test
 * File Name:TestStatic.java
 * Package Name:
 * Date:2016年5月18日上午9:43:31
 *
*/
package staticc;
/**
 * ClassName:TestStatic Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2016年5月18日 上午9:43:31
 * 
 * @author "jia"
 * @version
 * @see
 */
public class TestStatic {
	String outerneraa = "aa";
	static String outerbb = "bb";

	public static void outerStaticMehtod() {

	}

	public void outerMethod() {

	}

	// 静态内部类(可创建静态成员和非静态成员)
	static class staticinner {
		String staticinneraa = "aa";
		static String staticinnerbb = "bb";

		// 普通方法
		public void sitest() {
			// 静态内部类 普通方法 不能访问外部类的普通成员变量
//			System.out.println(TestStatic.this.outerneraa);
			// 静态内部类 普通方法 可以访问外部类的静态成员变量
			System.out.println(TestStatic.outerbb); // 或者 	TestStatic.outerbb
			
			// 普通内部类 普通方法 不能访问外部类普通方法
//			outerMethod(); 
			// 普通内部类 普通方法 可以访问外部类静态方法
			outerStaticMehtod();	//或者 TestStatic.outerStaticMehtod();
			System.out.println(staticinneraa);
		}
		
		// 静态方法
		public static void staticMe(){
			// 静态内部类 静态方法 不能访问外部类的普通成员变量
//			System.out.println(TestStatic.this.outerneraa);
			// 静态内部类 静态方法 可以访问外部类的静态成员变量
			System.out.println(TestStatic.outerbb); // 或者 	TestStatic.outerbb
			
			// 普通内部类 静态方法 不能访问外部类普通方法
//			outerMethod(); 
			// 普通内部类 静态方法 可以访问外部类静态方法
			outerStaticMehtod();	//或者 TestStatic.outerStaticMehtod();
		}
	}

	// 普通内部类(可创建静态成员和非静态成员)
	class inner {
		String inneraa = "aa";
		// static String innerbb = "bb"; 报错 普通成员创建普通方法

		// 普通方法
		public void itest() {
			// 普通内部类 普通方法 可以访问外部类的普通成员变量
			System.out.println(TestStatic.this.outerneraa);
			// 普通内部类 普通方法 可以访问外部类的静态成员变量
			System.out.println(TestStatic.this.outerbb); // 或者 	TestStatic.outerbb

			// 普通内部类 普通方法 可以访问外部类普通方法
			outerMethod(); // 或者 TestStatic.this.outerMethod();
			// 普通内部类 普通方法 可以访问外部类静态方法
			outerStaticMehtod();	//或者 TestStatic.outerStaticMehtod();
		}

		// 普通内部类不能创建静态方法
//		public static void staticMe() {
//		}
	}
}
