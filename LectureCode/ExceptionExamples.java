import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author
 *
 */
public class ExceptionExamples {

	public static int divide(int a, int b) throws Exception{
		if(b !=0) {
			int x = a / b;
			return x;
		}
		else
			throw new Exception();
		
	}
	
	public static void main(String[] args) {
		boolean keepGoing = true;
		
		while(keepGoing) {
			try{
				int i = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter a number for division: ");
			int userNumber = in.nextInt();
			System.out.println("divide returned " + i);
			keepGoing=false;
			
				//i= divide(5,userNumber);
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("You can't divide by zero you idiot.");
		/**	} catch (InputMismatchException ) {
				e.printStackTrace();
				System.out.println("Give me an integer or else.");
			} catch (Exception e)
			e.printStackTrace();
			System.out.println("How did you manage this?");
		*/}
	}

	}}
