package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Count characters in given string
 *
 */
public class CharacterCount {

	public static void countCharacter(String string){
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<string.length(); i++){
			if(map.containsKey(string.charAt(i))){
				map.put(string.charAt(i), map.get(string.charAt(i))+1);
			}else{
				map.put(string.charAt(i), 1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String string = sc.nextLine();
		countCharacter(string);
		sc.close();

	}

}
