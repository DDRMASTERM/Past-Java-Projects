package application;
	
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int roll1=0;
		int roll2=0;
		System.out.print("How many sides does this die have?");
		int die1=input.nextInt();
		System.out.print("How many sides does this second die have?");
		int die2=input.nextInt();
		int [][] dieTable = new int [die1+1][die2+1];
		for (int i=0; i<die1+1; i++) {
			dieTable[i][0]=i;
			//System.out.print(" "+dieTable[i][0]);
		}
		for (int i=0; i<die2+1; i++) {
			dieTable[0][i]=i;
			//System.out.println(" "+dieTable[0][i]);
		}
		System.out.print("How many times would you like to roll them?");
		int rolls=input.nextInt();
		for(int i=0; i<rolls; i++) {
			roll1= (int)(Math.random()*die1)+1;
			roll2= (int)(Math.random()*die2)+1;
			dieTable[roll1][roll2]++;
		}
		for (int i=0; i<die1+1; i++) {
			for (int j=0; j<die2+1; j++) {
				if(i==0&&j==0) 
					System.out.print("  ");
				else
					System.out.print(" "+dieTable[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}