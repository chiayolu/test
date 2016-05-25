/**
 * Project Name:test
 * File Name:StaticSingleton.java
 * Package Name:设计模式.singleTon.懒汉式
 * Date:2016年5月23日下午4:18:36
 *
*/

package 设计模式.singleTon.懒汉式;
/**
 * ClassName:StaticSingleton 
 * Reason:	 内部类创建懒汉式单例模式
 * Date:     2016年5月23日 下午4:18:36 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class StaticSingleton {
	private StaticSingleton() {

	}
	
	public static final StaticSingleton getInstance(){
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder{
		private static final StaticSingleton INSTANCE = new StaticSingleton();
	}
}

