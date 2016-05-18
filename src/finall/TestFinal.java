/**
 * Project Name:test
 * File Name:TestFinal.java
 * Package Name:finall
 * Date:2016年5月18日上午11:33:13
 *
*/

package finall;
/**
 * ClassName:TestFinal 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月18日 上午11:33:13 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestFinal {
	public static void main(String[] args) {
		String a = "hello2"; 
        final String b = "hello";
        String c = b + 2; 
        System.out.println((a == c));

        String d = "hello";
        String e = d + 2;
        System.out.println((a == e));
        

        String str1 = "aaa2";
        String str2 = "aaa";
        String str3 = str2 + "2";
        System.out.println(str1 == str3);
	}
	
	// 原因：当final变量是基本数据类型以及String类型时，如果在编译期间能知道它的确切值，则编译器会把它当做编译期常量使用。也就是说在用到该final变量的地方，相当于直接访问的这个常量，不需要在运行时确定。这种和C语言中的宏替换有点像。因此在上面的一段代码中，由于变量b被final修饰，因此会被当做编译器常量，所以在使用到b的地方会直接将变量b 替换为它的  值。而对于变量d的访问却需要在运行时通过链接来进行。
}

