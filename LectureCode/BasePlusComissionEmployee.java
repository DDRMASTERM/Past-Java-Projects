// Fig. 9.4: CommissionEmployee.java
// CommissionEmployee class represents a commission employee.

public class BasePlusComissionEmployee extends CommissionEmployee
{

   private double basePay;

   public BasePlusComissionEmployee(String first, String last, String ssn, double sales, double rate, double basePay)
   {
      super(first,last,ssn,sales,rate);
      
      setBasePay(basePay);
   }
   
   public double getBasePay() {
	   return basePay;
   }
   
   public void setBasePay(double basePay) {
	   if(basePay > 7.25) {
		   this.basePay=basePay;
	   }
   }

   public double earnings()
   {
      return super.earnings() + basePay;
   }

   public String toString()
   {
      return super.toString() + "\nIn the Base Plus Code";
   }
   
   public static void main(String args[]){
	      BasePlusComissionEmployee employee1 = new BasePlusComissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06, 800 );
	      
	      System.out.println( "Employee information obtained by get methods: \n" );
	      System.out.printf( "%s %s\n", "First name is", employee1.getFirstName() );
	      System.out.printf( "%s %s\n", "Last name is",  employee1.getLastName() );
	      System.out.printf( "%s %s\n", "Social security number is", employee1.getSocialSecurityNumber() );
	      System.out.printf( "%s %.2f\n", "Gross sales is", employee1.getGrossSales() );
	      System.out.printf( "%s %.2f\n", "Commission rate is", employee1.getCommissionRate() );

	      employee1.setGrossSales( 500 );
	      employee1.setCommissionRate( .1 );
	      
	      System.out.printf( "\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee1 );
	      
	      
	      // instantiate BasePlusCommissionEmployee object
	      BasePlusComissionEmployee employee2 = new BasePlusComissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
	      
	      // get base-salaried commission employee data
	      System.out.println( "Employee information obtained by get methods: \n" );
	      System.out.printf( "%s %s\n", "First name is", employee2.getFirstName() );
	      System.out.printf( "%s %s\n", "Last name is", employee2.getLastName() );
	      System.out.printf( "%s %s\n", "Social security number is", employee2.getSocialSecurityNumber() );
	      System.out.printf( "%s %.2f\n", "Gross sales is", employee2.getGrossSales() );
	      System.out.printf( "%s %.2f\n", "Commission rate is", employee2.getCommissionRate() );
	      System.out.printf( "%s %.2f\n", "Base salary is", employee2.getBasePay() );

	      employee2.setBasePay( 1000 ); // set base salary
	      
	      System.out.printf( "\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee2.toString() );
	      

	      
	      
	      //Leave this commented out until a Chap 10 lecture
	      BasePlusComissionEmployee bplus = new BasePlusComissionEmployee("Robert", "Jordan", "555-55-5555", 50000, .06, 3000);
	      CommissionEmployee poly = bplus; //bplus is a BasePlusComissionEmployee
	      System.out.println("\n\nPolymorphism Test");
	      System.out.println(poly.toString());

	      
   }
   
   
}
