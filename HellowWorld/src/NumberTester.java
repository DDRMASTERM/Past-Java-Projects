/**
 * 
 * @author 
 *
 */
public class NumberTester {

	public static void main(String[] args) {
		//testSimpleMethod();

		testFindIntegerMidPoint();
		testGetTheFirst5NumbersAfterTheDecimalPoint();
		testAddAllPositiveIntsTogetherUpToThisNumber();
		testFindTheTruthUsingAndOperator();
		
	}

	/*
	 * This method is just an example.  We will come up with some example in class Wednesday.  This test method is not graded
	 * If you miss class, feel free to email me for the code we typed up.
	 */
	public static void testSimpleMethod(){

		System.out.println("Start test");
		for(int i=Integer.MIN_VALUE; i<=Integer.MAX_VALUE; i++) {
			int a=simpleMethod(i);
			if(i!=a)
			System.out.println("I am pass a "+i+" and I got back the following int: "+a);
		}
		System.out.println("Stop test");
	}

	//This method should return exactly what it was given
	public static int simpleMethod(int i){
		
		return 0;
	}
	
	/*
	 * I would like you to write 3 test cases that would test and make sure the findIntegerMidPoint works correctly
	 */
	public static void testFindIntegerMidPoint(){
		int a=findIntegerMidPoint(7,1081);
		int success=0;
		if(a==544) {
			System.out.println("I am passing a thing and I got back the following int: "+a);
			success++;
		}
		else{
			System.out.println("I am passing a thing and I got back the following int: "+a);
		}
		a=findIntegerMidPoint(147,171);
		if(a==159) {
			System.out.println("I am passing a thing and I got back the following int: "+a);
			success++;
			}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+a);
		}
		a=findIntegerMidPoint(8549,9047);
		if(a==8798) {
			System.out.println("I am passing a thing and I got back the following int: "+a);
			success++;
			}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+a);
		}
		System.out.println("Code works "+success+" out of 3");
		return;
	}
	
	//This method should take 2 numbers (it does) and return the number in the middle of those 2 numbers
	public static int findIntegerMidPoint(int start, int end){
		//DO NOT WRITE ANY CODE FOR THIS METHOD YET
		return 0;
	}

	//I would like you to write 4 test cases that would test and make sure the addAllPositiveIntsTogetherUpToThisNumber works correctly
	//You cannot use any test cases (for points) with numbers less than 6
	public static void testAddAllPositiveIntsTogetherUpToThisNumber(){
		long x=addAllPositiveIntsTogetherUpToThisNumber(15);
		int success=0;
		if(x==141) {
			System.out.println("I am passing a thing and I got back the following int: "+x);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+x);
		}
		x=addAllPositiveIntsTogetherUpToThisNumber(90);
		if(x==4050) {
			System.out.println("I am passing a thing and I got back the following int: "+x);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+x);
		}
		x=addAllPositiveIntsTogetherUpToThisNumber(75);
		if(x==2850) {
			System.out.println("I am passing a thing and I got back the following int: "+x);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+x);
		}
		x=addAllPositiveIntsTogetherUpToThisNumber(112);
		if(x==6328) {
			System.out.println("I am passing a thing and I got back the following int: "+x);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+x);
		}
		System.out.println("Code works "+success+" out of 4");
		return;
	}
	
	//This method should add up all the positive numbers up to the number given.
	//For example, if n was 2, this method would return 1 because that is all the positive numbers below 2
	//Another example, if n was 4, this method would return 6 because 1+2+3=6, and those are all the numbers less than 4
	public static long addAllPositiveIntsTogetherUpToThisNumber(int n){
		//DO NOT WRITE ANY CODE FOR THIS METHOD YET
		return 0;
	}
	
	
	//I would like you to write 5 test cases that would test and make sure the getTheFirst5NumbersAfterTheDecimalPoint method works correctly.
	//You cannot use any number that starts with 3 in your test cases
	public static void testGetTheFirst5NumbersAfterTheDecimalPoint(){
		int d=getTheFirst5NumbersAfterTheDecimalPoint(12.3421905);
		int success=0;
		if(d==34219) {
			System.out.println("I am passing a thing and I got back the following int: "+d);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+d);
		}
		d=getTheFirst5NumbersAfterTheDecimalPoint(55.675802213);
		if(d==67580) {
			System.out.println("I am passing a thing and I got back the following int: "+d);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+d);
		}
		d=getTheFirst5NumbersAfterTheDecimalPoint(77.777776);
		if(d==77777) {
			System.out.println("I am passing a thing and I got back the following int: "+d);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+d);
		}
		d=getTheFirst5NumbersAfterTheDecimalPoint(9876543210.123456789);
		if(d==12345) {
			System.out.println("I am passing a thing and I got back the following int: "+d);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+d);
		}
		d=getTheFirst5NumbersAfterTheDecimalPoint(47.394851);
		if(d==39485) {
			System.out.println("I am passing a thing and I got back the following int: "+d);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following int: "+d);
		}
		System.out.println("Code works "+success+" out of 5");
	}
	//This method should return the first 5 numbers (as a positive int) after the decimal point.
	//For example, with 3.1415926535897932384 it would return 14159
	public static int getTheFirst5NumbersAfterTheDecimalPoint(double a){
		return 0;
	}
	
	
	//There are 8 possible values for the findTheTruthUsingAndOperator.  I want you to test all 8
	public static void testFindTheTruthUsingAndOperator(){
		boolean t=findTheTruthUsingAndOperator(false,false,false);
		int success=0;
		if(t==false) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		t=findTheTruthUsingAndOperator(true,false,false);
		if(t==false) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		t=findTheTruthUsingAndOperator(false,true,false);
		if(t==false) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		t=findTheTruthUsingAndOperator(false,false,true);
		if(t==false) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		t=findTheTruthUsingAndOperator(false,true,true);
		if(t==false) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		t=findTheTruthUsingAndOperator(true,false,true);
		if(t==false) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		t=findTheTruthUsingAndOperator(true,true,false);
		if(t==false) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		t=findTheTruthUsingAndOperator(true,true,true);
		if(t==true) {
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
			success++;
		}
			else{
			System.out.println("I am passing a thing and I got back the following boolean: "+t);
		}
		System.out.println("Code works "+success+" out of 8");
		return;
	}
	
	//Like Figure 4.13 in the book except with 3 values, this method should calculate the Conditional AND relationship  
	public static boolean findTheTruthUsingAndOperator(boolean a, boolean b, boolean c){
		return false;
	}
	
}
