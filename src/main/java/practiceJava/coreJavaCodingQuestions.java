package practiceJava;

public class coreJavaCodingQuestions {

	public static void main(String[] args) {
		
		
		/* 1. Example for exception handling */
		
		try {
			int i = 10/0;
			
		}catch(ArithmeticException e) {
			System.out.println("Error: Division by zero");
			e.printStackTrace();
			
		}finally {
			System.out.println("This block will always execute.");
		}
		
		
		/* 2. Example for reversing a string */
		
		String str1 = "John Doe";
		String reverse = "";
		for (int i = str1.length()-1; i>=0; i--) {
			reverse += str1.charAt(i);
		}
		
		System.out.println("Reverse of the string "+str1+" = "+reverse);
		
		/*
		 * 3. Check Palindrome String
		 */
		String str2 = "1221";
		String str3 = new StringBuilder(str2).reverse().toString();
		System.out.println(str3.equals(str2) ? "Its a palindrome" : "Its not a palindrome");

	}

}
