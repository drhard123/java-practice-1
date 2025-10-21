package practiceJava;

public class coreJavaCodingQuestions {

	public static void main(String[] args) {
		
		try {
			int i = 10/0;
			
		}catch(ArithmeticException e) {
			System.out.println("Error: Division by zero");
			e.printStackTrace();
			
		}finally {
			System.out.println("This block will always execute.");
		}
		
		

	}

}
