/**
 * Project Name:test
 * File Name:HasStatic.java
 * Package Name:test
 * Date:2016年3月24日下午2:13:11
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package test;
/**
 * ClassName:HasStatic 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年3月24日 下午2:13:11 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class HasStatic {
	private static int x=100;
	     public static void main(String args[]){
	         HasStatic hs1=new HasStatic();
	         hs1.x++;
	         System.out.println(x);
	         HasStatic  hs2=new HasStatic();
	         hs2.x++;
	         System.out.println(x);
	         hs1=new HasStatic();
	          hs1.x++;
	          System.out.println(x);
	        HasStatic.x--;
	       System.out.println("x="+x);
	     }
}

