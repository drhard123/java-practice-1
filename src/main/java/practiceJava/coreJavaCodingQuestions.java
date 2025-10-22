package practiceJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
		
		
		/* Reverse words in a sentence */
		
		String str4 = "He is a boy.";
		String[] words = str4.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + "");
		}
		
		
		/* Occurence of each character */
		
		String str5 = "Automation Testing";
		Map<Character, Integer> map = new HashMap<>();
		for (char c: str5.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(map);
		
		
		/* find duplicate characters */
		
		String str6 = "Automation Testing";
		Set<Character> set = new HashSet<>();
		for (char c: str6.toCharArray()) {
			if(!set.add(c)) {
				System.out.println(c +" ");
			}
		}
		
		
		/* Swap two numbers without a variable */
		int a = 5;
		int b = 10;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = "+a+" b = "+b);
		
		
		
		/* Largest number in an array */
		
		int[] arr = {10,30,5,40,57,74,85};
		int max = arr[0];
		for (int n: arr) {
			if (n>max) {
				max = n;
			}	
		
	}
		System.out.println(max);
		
		
		/* Count words in a string */
		
		String str8 = "He is a good boy";
		int count = str8.split(" ").length;
		System.out.println(count);
		
		
		/* check if a number is prime or not */
		
		int m = 7, flag = 0;
		for (int i = 2; i<=m/2; i++) {
			if (m % i == 0) {
				flag = 1;
			}
		}System.out.println(flag ==0 ? "Prime" : "not a prime");
		
		
		/* Fibonacci series */
		int n1 = 0, n2 = 1, n3, count2 = 7;
		System.out.println(n1+ " ");
		for (int k =2; k<count2; k++) {
			n3 = n1+n2;
			System.out.println(n3+ " ");
			n1 = n2;
			n2=n3;
			
		}
		
		
		/* Sum of digits of a number */
		int num2 = 12345;
		int sum = 0;
		while(num2!=0) {
			sum = sum + num2%10;
			num2/=10;
		}
		System.out.println(sum);
		
		
		
		/* Replace all spaces from a string */
		String kinder = "Kinder is a good chocolate";
		System.out.println(kinder.replaceAll("\\s", ""));
	
	
		
		/* Reverse integer number */
		int number = 456;
		while (number !=0) {
			int digit = 0;
			digit = number%10;
			System.out.print(digit);
			number = number/10;
		}
		
		
		/* Armstrong number cube of each digits of a number is the digit or not */
		int numbera  = 153, temp = numbera, suma=0;
		while(numbera!=0) {
		    int d = numbera%10;
			suma=suma+ (d*d*d);
			numbera= numbera/10;
		}
		System.out.println(suma == temp ? "\n armstrong" : "not armstrong");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
