public class StringDemo{
	public static void main(String args[]){
			String string = "Hello Shri";
			System.out.println("Length of String is : "+ string.length());
			System.out.println("To Upper Case String: "+ string.toUpperCase());
			System.out.println("substring()of String: "+ string.substring(0,4));
			System.out.println("charAt() of String  : "+ string.charAt(6));
			System.out.println("endsWith()String    : "+ string.endsWith("i"));
			System.out.println("startsWith()String  : "+ string.startsWith("H"));
			System.out.println("indexOf(char ch)    : "+ string.indexOf('o'));
			System.out.println("lastIndexOf(char ch): "+ string.lastIndexOf('r'));
			System.out.println("toCharArray()       : "+ string.toCharArray());
			System.out.println("trim() method String: "+ string.trim());
			System.out.println("lowercase() string  : "+ string.toLowerCase());
	}
}
