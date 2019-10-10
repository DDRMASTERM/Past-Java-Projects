/**
 * 
 * @author
 *
 */
public class MethodForRandom {

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
		int a = method1();
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
		System.out.println("-22,-18,-14,-10,-6: "+a);
	}
}
