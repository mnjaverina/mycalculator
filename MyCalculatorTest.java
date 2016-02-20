public class MyCalculatorTest{
	
	@Test
	public float add(){
		assertEquals(1+1, 2);
		assertEquals(1+0, 1);
	}
	
	public float subtract(){
		assertEquals(1-0, 1);
		assertEquals(0-1, -1);
		assertEquals(3-1, 2);
	}
	
	public float multiply(){
		assertEquals(2*1, 2);
		assertEquals(2*0, 0);
	}
	
	// divide two numbers
	public float divide(){
		assertEquals(2/1, 1);
		assertEquals(0/1, 0);
	}
	
	// x^2 of two numbers
	public float square(){
		assertEquals(2, 4);
		assertEquals(0, 0);
		assertEquals(1, 1);
	}
	
	// x^3 of three numbers
	public float cube(){
		assertEquals(2, 8);
		assertEquals(0, 0);
		assertEquals(1, 1);
		assertEquals(3, 27);
	}
	
	// n! of an integer
	public int nfactorial(){
		assertEquals(1, 1);
		assertEquals(0, 1);
		assertEquals(2, 2);
		assertEquals(3, 6);
	}
	
	// binary search in an array
	int binarySearch(){
		assertEquals({1,2,3},2, 2);
		assertEquals({1,2,3},0, 1);
	}
	
}
