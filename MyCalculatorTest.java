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
	public float divide(float a,float b){
		assertEquals(1+1, 2);
		assertEquals(1+0, 1);
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public int nfactorial(int n){
		int factorial = 1;
		
		for(int i=1;i<n;i++)
			factorial *= i;
		
		return factorial;
	}
	
	// binary search in an array
	int binarySearch(int[] a,int x){
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){
			middle = (lower+upper)/2;
			if(x>a[middle]) lower = middle + 1;
			else if(x<a[middle]) upper = middle - 1;
			else return middle;
		}
		
		return 1;
	}
	
}
