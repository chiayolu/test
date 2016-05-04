/**
 * Project Name:test
 * File Name:InnerClass.java
 * Package Name:suiji
 * Date:2016年3月18日下午6:53:09
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package suiji;
/**
 * ClassName:InnerClass 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年3月18日 下午6:53:09 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class InnerClass {
	public static void main(String[] args) {
		TestInterface ti = new TestInterface(){

			@Override
			public void setNum(int num) {
				System.out.println("aaaa");
				// TODO Auto-generated method stub
				
			}
		
		};
		ti.setNum(11);
	}
}

