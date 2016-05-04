/**
 * Project Name:test
 * File Name:TestStr.java
 * Package Name:可变长参数
 * Date:2016年3月30日下午2:08:23
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package 可变长参数;
/**
 * ClassName:TestStr 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年3月30日 下午2:08:23 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestStr {
	
	public void varargs(int num,String... str){
		System.out.println(str.length);
	}
	
	public static void main(String[] args) {
		TestStr ts = new TestStr();
		ts.varargs(1, "aaa", "bbb", "ccc");
		int[] num = new int[]{1,2,3};

	}
}

