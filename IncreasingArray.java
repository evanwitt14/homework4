
public class IncreasingArray {
	
	static boolean isStrictlyIncreasing(double[] in) {
	
		for (int i = 0; i < (in.length-1); i++)
			
			if (in[i] > in[i+1])
					return false;						
		return true;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result;
		
		double[] arrayRef = {5,6,7,8,9,24,28,30};
		
		result = isStrictlyIncreasing(arrayRef);
		System.out.println(result);
		
	}
}
