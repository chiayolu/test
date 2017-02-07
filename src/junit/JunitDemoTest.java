/**
 * Project Name:test
 * File Name:JunitDemoTest.java
 * Package Name:junit
 * Date:2016年5月5日下午7:50:21
 *
*/

package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * ClassName:JunitDemoTest Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2016年5月5日 下午7:50:21
 * 
 * @author "jia"
 * @version
 * @see
 */
public class JunitDemoTest {

	@Test(expected = ArithmeticException.class)
	public void testMul() {
		assertEquals(2, new JunitDemo().mul(6, 0));
	}

	@Ignore("ddd")
	@Test(timeout = 50)
	public void testTime() {
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		while (true) {
			System.out.println("aa");
		}
	}
}
