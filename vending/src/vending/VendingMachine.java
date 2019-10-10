package vending;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachine {

	private VendingItem [] items;
	private double  money;

	public VendingMachine(String filename){
		try {
			Scanner fileScanner=new Scanner(new File(filename));
			int numItems=fileScanner.nextInt();
			fileScanner.nextLine();
			items=new VendingItem[numItems];
			for(int i=0; i<items.length; i++){
				items[i]=new VendingItem(fileScanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String []args){
		VendingMachine vm= new VendingMachine(args[0]);
		Scanner input= new Scanner(System.in);
		int choice=0;
		do{
			System.out.println("Welcome to our vending machine; what would you like to do?");
			System.out.println("1. Insert Money");
			System.out.println("2. Select Item");
			System.out.println("3. Get Change");
			choice= input.nextInt();
			switch(choice){
			case 1:
				System.out.println("How much money do you wish to insert?");
				double moneyIn=input.nextDouble();
				vm.insertMoney(moneyIn);
				break;
			case 2:
				vm.displayItems();
				System.out.println("What do you wish to buy?");
				int i=input.nextInt();
				vm.selectItem(i);
				break;
			case 3:
				vm.getChange();

			}
		}while(choice!=3);
	}

	public void displayItems(){
		for(int i=0; i<items.length; i++){
			System.out.println(i+":"+items[i].toString());
		}
	}

	public void insertMoney(double moneyIn){
		money+=moneyIn;
	}

	public void selectItem(int i){
		if(money>=items[i].getPrice()&&items[i].getQuantity()>0){
			System.out.println("Congratulations! You have purchased "+ items[i].getKind());
			items[i].setQuantity(items[i].getQuantity()-1);
			money-=items[i].getPrice();
		}
		else{
			System.out.println("Sorry, transaction cannot be completed at this time!");
		}
	}

	public void getChange(){
		System.out.println("Your change is "+money);
		money=0;
	}
}
