//Write a static method remove(intv,int[] in) that will return a new array of the integers in the given array, but with the
//value v removed. For example, if v is 3 and in contains 0, 1, 3, 2, 3, 0, 3, and 1, the method will return an array
//containing 0, 1, 2, 0, and 1.

public class RemoveVal {
	
	static int[] remove( int v, int[] in)   {
		int last = 0;
		int[] temp = new int[in.length];
		for (int i=0; i<in.length; i++)
			if (in[i] != v)   {
				temp[last] = in[i];
				last++  ;
		}	
		int[] r = new int[last];
		for (int i = 0; i < last; i++)
			r[i] = temp[i];
		
		return r;		
	}
	public static void main(String[] args) {
		int v = 3;
		int[] arrayRef = {0, 1, 3, 2, 3, 0 , 3, 1};
		int[] result;
		result = remove(v, arrayRef);
		for (int j = 0; j < result.length; j++)
			System.out.print(result[j]);
	}	
}

