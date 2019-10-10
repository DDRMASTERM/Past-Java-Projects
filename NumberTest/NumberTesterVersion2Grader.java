/**
 * 
 * @author 
 *
 */
public class NumberTesterVersion2Grader {

	private static int passed = 0;
	private static int failed = 0;

	public static void main(String[] args) {
		testSimpleMethod();

		testFindTheTruthUsingOrOperator();
		testGetTheFirst5NumbersAfterTheDecimalPoint();
		testCountHowManyTimesTheNumber2IsInTheArray();
		testFindTheThirdPositiveIntegerInTheArray();

		System.out.println("Num Success: " + passed + ", Num Failure: " + failed);
		if(failed > 0){
			System.out.println("Total Score: " + ((passed*100)/(failed+passed)) + "%");
		}
		else{
			System.out.println("Everything Passed !!! 100%");
		}
	}

	/*
	 * This method is just an example.  We will come up with some example in class Wednesday.  This test method is not graded
	 * If you miss class, feel free to email me for the code we typed up.
	 */
	public static void testSimpleMethod(){
		System.out.println("Testing the simple method");

		int b = NumberTesterVersion2.simpleMethod(1);
		if(b == 1){
			System.out.println("\tSuccess");
		}
		else{
			System.err.println("\tFailure");
		}

		b = NumberTesterVersion2.simpleMethod(-1);
		if(b == -1){
			System.out.println("\tSuccess");
		}
		else{
			System.err.println("\tFailure");
		}

		b = NumberTesterVersion2.simpleMethod(0);
		if(b == 0){
			System.out.println("\tSuccess");
		}
		else{
			System.err.println("\tFailure");
		}


	}

	//DO NOT CHANGE THIS METHOD
	public static void testFindTheTruthUsingOrOperator(){
		System.out.println("Testing findTheTruthUsingOrOperator");
		boolean b;
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(false, false, false);
		if(b==false){
			passed++;
		}
		else{
			failed++;
		}
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(false, false, true); 
		if(b==true){
			passed++;
		}
		else{
			failed++;
		}
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(false, true, false); 
		if(b==true){
			passed++;
		}
		else{
			failed++;
		}
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(false, true, true); 
		if(b==true){
			passed++;
		}
		else{
			failed++;
		}
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(true, false, false); 
		if(b==true){
			passed++;
		}
		else{
			failed++;
		}
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(true, false, true); 
		if(b==true){
			passed++;
		}
		else{
			failed++;
		}
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(true, true, false); 
		if(b==true){
			passed++;
		}
		else{
			failed++;
		}
		b = NumberTesterVersion2.findTheTruthUsingOrOperator(true, true, true); 
		if(b==true){
			passed++;
		}
		else{
			failed++;
		}
		System.out.println("\tCurrent Num Success: " + passed + ", Num Failure: " + failed);
	}

	//DO NOT CHANGE THIS METHOD
	public static void testGetTheFirst5NumbersAfterTheDecimalPoint(){
		System.out.println("Testing getTheFirst5NumbersAfterTheDecimalPoint");
		for(int z = 0; z < 10; z++){
			int a = (int)(Math.random()*9+1);
			int b = (int)(Math.random()*9+1);
			int c = (int)(Math.random()*9+1);
			int d = (int)(Math.random()*9+1);
			int e = (int)(Math.random()*9+1);
			int f = (int)(Math.random()*9+1);
			int g = (int)(Math.random()*9+1);
			int h = (int)(Math.random()*9+1);
			int i = (int)(Math.random()*9+1);
			int j = (int)(Math.random()*9+1);
			int k = (int)(Math.random()*9+1);
			int shift = (int)(Math.random()*4+1);
			
			double num = 0;
			int five = 0;
			
			if(shift == 1){
				num = Double.parseDouble(a + "." + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i + "" + j + ""+ k );
				five = Integer.parseInt(b + "" + c + "" + d + "" + e + "" + f);
			}
			else if(shift == 2){
				num = Double.parseDouble(a + "" + b + "." + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i + "" + j + ""+ k );
				five = Integer.parseInt(c + "" + d + "" + e + "" + f + "" + g);
			}
			else if(shift == 3){
				num = Double.parseDouble(a + "" + b + "" + c + "." + d + "" + e + "" + f + "" + g + "" + h + "" + i + "" + j + ""+ k );
				five = Integer.parseInt(d + "" + e + "" + f + "" + g + "" + h);
			}
			else {
				num = Double.parseDouble(a + "" + b + "" + c + "" + d + "." + e + "" + f + "" + g + "" + h + "" + i + "" + j + ""+ k );
				five = Integer.parseInt(e + "" + f + "" + g + "" + h + "" + i);
			}
			int result = NumberTesterVersion2.getTheFirst5NumbersAfterTheDecimalPoint(num);
			if(result != five){
				failed++;
			}
			else{
				passed++;
			}
		}
		System.out.println("\tNum Success: " + passed + ", Num Failure: " + failed);
	}


	//DO NOT CHANGE THIS METHOD
	public static void testCountHowManyTimesTheNumber2IsInTheArray(){
		System.out.println("Testing countHowManyTimesTheNumber2IsInTheArray");
		for(int i = 0; i < 10; i++){
			int size = (int)(Math.random()*100+10);
			int [] a = new int[size];
			int num2s = 0;
			for(int j = 0; j < a.length; j++){
				a[j] = (int)(Math.random()*10);
				if(a[j] == 2){
					num2s++;
				}
			}
			int result = NumberTesterVersion2.countHowManyTimesTheNumber2IsInTheArray(a);
			if(result != num2s){
				failed++;
			}
			else{
				passed++;
			}
		}
		System.out.println("\tNum Success: " + passed + ", Num Failure: " + failed);
	}



	//DO NOT CHANGE THIS METHOD
	public static void testFindTheThirdPositiveIntegerInTheArray(){
		System.out.println("Testing findTheThirdPositiveIntegerInTheArray");
		int [][] a = { {-1,-3,1,-22,3,-3,3,-5,1,9,8,2},
				{-5, -8, -9, 4, 5, 1, -9, 3, -5, 8},
				{4, 5, 5, -5, 8, -5, -2, -5, 8, 2},
				{-6, -4, 8, -1, 4, -1, -1, 2, 2, 3}, 
				{7, 5, 4, 5, -9, 6, -8, 4, 2, -4}, 
				{-7, 5, 5, -1, -3, -2, 1, -9, 5, 5}, 
				{-3, -2, 9, -9, 0, 0, -6, 2, -2, 9}, 
				{-3, 0, 2, 5, -5, 4, 8, 1, 8, 0}, 
				{-7, 7, -4, -5, 3, -4, -8, 5, -1, 5}, 
				{-5, 8, -1, 3, 7, -7, -6, -3, -5, 2}, 
				{3, 8, 6, 0, 5, -7, 0, 3, -6, 5}};

		int [] b = {3,1,5,2,4,1,9,4,5,7,6};

		for(int i = 0; i < a.length; i++){
			if(NumberTesterVersion2.findTheThirdPositiveIntegerInTheArray(a[i]) == b[i]){
				passed++;
			}
			else{
				failed++;
			}
		}

		System.out.println("\tNum Success: " + passed + ", Num Failure: " + failed);
	}




}
