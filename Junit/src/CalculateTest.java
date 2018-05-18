import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**     
* @author 李安迪
* @date 2018年5月17日
* @description
*/
@RunWith(Parameterized.class)
public class CalculateTest {

	private int expected;
	private int first;
	private int second;
	
	public CalculateTest(int expected, int first, int second){
		this.expected = expected;
		this.first = first;
		this.second = second;
	}
	 
	@Parameters
	public static Collection addNums(){
		return Arrays.asList(new Integer[][] {{3,1,2},{4,2,2}});
	}
	@Test
	public void test() {
		Calculate add = new Calculate();
		System.out.println("Addition with parameters : " + first + " and "
				+ second);
		
		assertEquals(expected,add.add(first,second));
	}

}
