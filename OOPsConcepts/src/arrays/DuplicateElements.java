package arrays;

public class DuplicateElements {

	public boolean isContains(int[] arr, int val){
		for(int a : arr){
			if(a==val)
				return true;
		}
		return false;
	}
	public int[] removeDuplicateElementInArray(int[]array){
		int [] newArray = new int[array.length];
		int a=0;
		for(int i=0; i<array.length; i++){
			if(!isContains(newArray, array[i])){
				newArray[a++] = array[i];
			}
		}
		return newArray;
	}
	public static void main(String[] args) {
		DuplicateElements rm = new DuplicateElements();
		int [] array = {10,20,30,10,40,20,50,30};
		int [] uniqueArray = rm.removeDuplicateElementInArray(array);
		System.out.println("************ array after removing duplicate values***********");
		for(int a: uniqueArray){
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
