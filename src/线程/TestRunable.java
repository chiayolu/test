/**
 * Project Name:test
 * File Name:TestRunable.java
 * Package Name:线程
 * Date:2016年3月21日下午12:06:01
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package 线程;

/**
 * ClassName:TestRunable Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2016年3月21日 下午12:06:01
 * 
 * @author "jia"
 * @version
 * @see
 */
public class TestRunable {

	public void st() {
		TestRun testRun = new TestRun("aaaa");
		Thread thread = new Thread(testRun);
		try {
			System.out.println("dddddd");
			thread.start();
			System.out.println("ccccccccc");
			if (true) {

			}
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public class TestRun implements Runnable {
		String str;

		public TestRun(String str) {
			this.str = str;
		}

		public void run() {

			try {
				Thread.sleep(10000);
				System.out.println("输出" + str);
			} catch (InterruptedException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

	public static void main(String[] args) {
		TestRunable testRunable = new TestRunable();
		testRunable.st();
	}
}
