/**
 * Project Name:test
 * File Name:Test.java
 * Package Name:suiji
 * Date:2016年3月18日下午6:51:59
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package suiji;
/**
 * ClassName:Test 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年3月18日 下午6:51:59 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class Test implements TestInterface{
	int num;
	public void setNum(int num){
		this.num = num;
	}
	
	public static void main(String[] args) {
		int num = 16;
		System.out.println(num / 3);
	}
}

