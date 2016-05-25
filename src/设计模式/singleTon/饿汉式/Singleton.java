/**
 * Project Name:test
 * File Name:Singleton.java
 * Package Name:设计模式.singleTon.饿汉式
 * Date:2016年5月23日下午5:46:41
 *
*/

package 设计模式.singleTon.饿汉式;
/**
 * ClassName:Singleton 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月23日 下午5:46:41 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class Singleton {
	private static final Singleton singleton= new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}

