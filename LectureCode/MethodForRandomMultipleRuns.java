import java.util.Scanner;

/**
 * 
 * @author
 *
 */

public class MethodForRandomMultipleRuns {

	/**
	 * 
	 * @return an integer in the range 1 <= n <= 2
	 */
	public static int method1(){
		int i = (int)(Math.random()*2)+1;
		return i;
	}
	
	/**
	 * 
	 * @return an integer in the range 1 <= n <= 100
	 */
	public static int method2(){
		int i = (int)(Math.random()*100)+1;
		return i;
	}
	
	/**
	 * 
	 * @return an integer in the range 0 <= n <= 9
	 */
	public static int method3(){
		int i = (int)(Math.random()*10);
		return i;
	}
	
	/**
	 * 
	 * @return an integer in the range 1000 <= n <= 1112
	 */
	public static int method4(){
		int i = (int)(Math.random()*113)+1000;
		return i;
	}
	
	/**
	 * 
	 * @return an integer in the range -1 <= n <= 1
	 */
	public static int method5(){
		int i = (int)(Math.random()*3)-1;
		return i;
	}
	
	/**
	 * 
	 * @return an integer in the range -3 <= n <= 11
	 */
	public static int method6(){
		int i = (int)(Math.random()*15)-3;
		return i;
	}

	/**
	 * 
	 * @return an integer in the set 2,4,6,8,10
	 */
	public static int method7(){
		int i = ((int)(Math.random()*5)*2)+2;
		return i;
	}

	/**
	 * 
	 * @return an integer in the set 3,5,7,9,11
	 */
	public static int method8(){
		int i = ((int)(Math.random()*5)*2)+3;
		return i;
	}
	
	/**
	 * 
	 * @return an integer in the set 6,10,14,18,22
	 */
	public static int method9(){
		int i = (((int)(Math.random()*5)*2)+3)*2;
		return i;
	}
	
	
	/**
	 * 
	 * @return an integer in the set -22,-18,-14,-10,-6 
	 */
	public static int method10(){
		int i = (((int)(Math.random()*5)*2)+3)*-2;
		return i;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int intput=0;
		/*int a = method1();
		System.out.println("1 <= n <= 2: "+a);
		a = method2();
		System.out.println("1 <= n <= 100: "+a);
		a = method3();
		System.out.println("0 <= n <= 9: "+a);
		a = method4();
		System.out.println("1000 <= n <= 1112: "+a);
		a = method5();
		System.out.println("-1 <= n <= 1: "+a);
		a = method6();
		System.out.println("-3 <= n <= 11: "+a);
		a = method7();
		System.out.println("2,4,6,8,10: "+a);
		a = method8();
		System.out.println("3,5,7,9,11: "+a);
		a = method9();
		System.out.println("6,10,14,18,22: "+a);
		a = method10();
		System.out.println("-22,-18,-14,-10,-6: "+a);*/
		System.out.println("This function should generate a number from -1 to 1.");
		System.out.println("How many times would you like to test it? ");
		intput=input.nextInt();
		int minusOne=0;
		int zero=0;
		int one=0;
		int unexpectedNum=0;
		int [] a1= new int[intput];
		for(int i=0; i<intput; i++) {
			a1[i] = method5();
			System.out.println("-1 <= n <= 1: "+a1[i]);
			if(a1[i]==-1)
				minusOne++;
			else if(a1[i]==0)
				zero++;
			else if(a1[i]==1)
				one++;
			else
				unexpectedNum++;
		}
		System.out.println("Number of -1 results: "+minusOne);
		System.out.println("Number of 0 results: "+zero);
		System.out.println("Number of 1 results: "+one);
		if(unexpectedNum!=0)
			System.out.println("Number of other results: "+unexpectedNum);
		System.out.println("This function should generate one of the following: 6,10,14,18,22.");
		System.out.println("How many times would you like to test it? ");
		intput=input.nextInt();
		int six=0;
		int ten=0;
		int fourteen=0;
		int eighteen=0;
		int twentyTwo=0;
		unexpectedNum=0;
		int [] a2= new int[intput];
		for(int i=0; i<intput; i++) {
			a2[i] = method9();
			System.out.println("6,10,14,18,22: "+a2[i]);
			if(a2[i]==6)
				six++;
			else if(a2[i]==10)
				ten++;
			else if(a2[i]==14)
				fourteen++;
			else if(a2[i]==18)
				eighteen++;
			else if(a2[i]==22)
				twentyTwo++;
			else
				unexpectedNum++;
		}
		System.out.println("Number of 6 results: "+six);
		System.out.println("Number of 10 results: "+ten);
		System.out.println("Number of 14 results: "+fourteen);
		System.out.println("Number of 18 results: "+eighteen);
		System.out.println("Number of 22 results: "+twentyTwo);
		if(unexpectedNum!=0)
			System.out.println("Number of other results: "+unexpectedNum);
	}
}
