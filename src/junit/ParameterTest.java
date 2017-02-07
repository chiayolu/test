package junit;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	int expect = 0;
	int input1 = 1;
	int input2 = 2;


	
	public ParameterTest(int expect, int input1, int input2) {
		this.expect = expect;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Parameters
	public static Collection<Object[]> test(){
		return Arrays.asList(new Object[][]{
			{2,4,2},
			{2,6,3}
		});
	}
	
	@Test
	public void testMul() {
		assertEquals(expect, new JunitDemo().mul(input1, input2));
	}
}
