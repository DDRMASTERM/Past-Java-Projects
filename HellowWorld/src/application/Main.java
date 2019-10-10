package application;
	
import java.util.Random;

public class Main{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Random random= new Random();
		int [] a = new int[10];
		int total=0;
		for(int i=0; i<a.length; i++) {
			a[i]=(i+1)*2;
		}
		for(int i:a) {
			total+=i;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("total is"+total);
		
		System.out.println("Spot 0 is" +a[0]);
		takeAnIntAndAddOneToIt
	}



public static void takeAnIntAndAddOneToIt(int theInt){
	theInt++;
}
public static void takeAnIntAndAddOneToIt(int [] theArray){
	theArray[0]++;
}
}