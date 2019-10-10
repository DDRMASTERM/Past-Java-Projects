import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author
 *
 */
public class WriterReader {

	public static void main(String[] args) {
		String filename = "tmp.txt";
		writeRandomNumbersToFile(filename);
		sumIntsInFile(filename);
	}
	
	@SuppressWarnings("unused")
	public static void writeRandomNumbersToFile(String filename){
		try {
			Random rand= new Random();
			Formatter out = new Formatter(filename);
			for (int i = 0; i < 10; i++){
				int r = rand.nextInt(10);
				out.format(r+"");
				//Write r to the file
			}
			System.out.println("We wrote all things to the file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Use a Formatter
		
		
	}
	
	public static void sumIntsInFile(String filename){
		int sum = 0;
		//Create a scanner
		Scanner in = new Scanner(Path.get(filename));
		while( in.hasNext()){
			int a = in.nextInt();
			sum+=a;
		}
		System.out.println("The Sum Is: " + sum);
	}

}
