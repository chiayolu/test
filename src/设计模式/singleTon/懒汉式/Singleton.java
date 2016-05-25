/**
 * Project Name:test
 * File Name:Singleton.java
 * Package Name:设计模式.singleTon.懒汉式
 * Date:2016年5月23日下午3:58:42
 *
*/

package 设计模式.singleTon.懒汉式;
/**
 * ClassName:Singleton 
 * Reason:	 懒汉式单例类.在第一次调用的时候实例化自己
 * Date:     2016年5月23日 下午3:58:42 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class Singleton {
	private static Singleton single = null;		//变量为private static
	
	private Singleton() {						//构造方法也为private，这样可以避免在外部被实例化

	}
	
	// 工厂方法  用static修饰
	public static Singleton getInstance(){
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
	
}

