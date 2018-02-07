package arrays;

/**
 * 
 * @author Shri
 * 
 *
 */
public class ArrayExample {

	public static void main(String[] args) {

		/**
		 * single dimensional array
		 */
		int [] arr; //array declaration
		arr = new int[5]; //array creation
		arr[0] = 10; //array initialization
		
		int [] arr1 = {10,20,30,50}; //declaration, creation and initialization in one line
		/**
		 * iterate single dimensional array
		 */
		for(int a: arr1){
			System.out.print(a + " ");
		}
		System.out.println();
		/**
		 * multidimensional array
		 * 
		 */
		int [][] marray = {{10,20}, {30,40}}; //2*2 dimensional array 
		/**
		 * iterating array
		 */
		for(int i=0; i<marray.length; i++){
			for(int j=0; j<marray.length; j++){
				System.out.print(marray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
