import java.util.Scanner;
class Account {
 public static void main(String args []) {
	 int balance = 10000;
	 int withdraw = 0;
	 int deposit = 0;
	 int newBalance = 0;
	 System.out.println("Choose 1 for Balance");
	 System.out.println("Choose 2 for Withdraw");
	 System.out.println("Choose 3 for Deposite");
	 System.out.println("Choose 4 for Exit");
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the required operation: ");
		
		 int n = scan.nextInt();
				 
				 switch(n) {
			     case 1:
				 System.out.println("The available balance is : "+ balance);
				 System.out.println("Thankyou for using ");
				 System.out.println("For any queries contact your branch");
				 break;
				 case 2:
				 System.out.println("Enter the money for withdraw: ");
				 withdraw = scan.nextInt();
				  if (balance>withdraw) {
					  balance = balance - withdraw;
					  System.out.println("Please collect the money"+" "+balance+" "+"from the ATM machine");
				  } 
				  else {
					  System.out.println("Insufficient balance ");
				  }
				  System.out.println("Thankyou for using ");
				  System.out.println("For any queries contact your branch");
				  break;
					  case 3:
					    System.out.println("Enter the deposit amount: ");
					    deposit = scan.nextInt();
					    newBalance = balance + deposit;
					     System.out.println("The available balance is : "+newBalance);
					 case 4:
					   System.out.println("Thankyou for using ");
					   System.out.println("For any queries contact your branch");
				  }
			}
	}
			
	 
	  
