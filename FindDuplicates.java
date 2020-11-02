 // Write a static method removeDuplicates(Character[] in) that returns a new array of the characters in the given array, 
// but without any duplicate characters. Always keep the first copy of the character and remove subsequent ones. For
// example, if in contains b, d, a, b, f, a, g, a, a, and f, the method will return an array containing b, d a, f, and g. (Hint:
// One way to solve this problem is to create a boolean array of the same size as the given array in and use it to keep
// track of which characters to keep. The values in the new boolean array will determine the size of the array to return.)



public class FindDuplicates {

	
	static char[] removeDuplicates(char[] in) {
		char[] out = new char[in.length];
		int last = 0;
		boolean found = false;
		for (int i = 0; i < (in.length); i++) {
			found = false;
			for (int j = 0; j < last; j++) {
				if (in[i] == out[j]) {
					found = true;
					break;
				}
			}	
			if (found == false) {
				out[last] = in[i];
				last++;
			}	
	}		
		return out;	
}

	public static void main(String[] args) {
		
		char[] arrayRef = {'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f'};
		System.out.println(removeDuplicates(arrayRef));

		
	}
	
}

