import java.rmi.*;
import java.util.Scanner;

public class BankAccountClient
	{
	 public static void main(String args[])
	  {
	   System.out.println("Looking for Bank account service");
	 	try{
	  		String registry = "localhost";
	  		if(args.length>=1)
	  			registry = args[0];//enter the server address as command line arguement
	  		String registration = "rmi://" + registry + "/RMIBankAccount";
	 		Remote remoteService = Naming.lookup(registration);
		 	RMIBankAccount bankService = (RMIBankAccount) remoteService;
	 		Scanner sc = new Scanner(System.in);
	 
	 		int i;
	 		double amount;
			while(true)
			{
				 System.out.println();
	 			 System.out.println("options:");
	 			 System.out.println("1. to check balance");
	 			 System.out.println("2. to deposit");
	 			 System.out.println("3. to withdraw");
	 			 System.out.println("4. to clear account");
	 			 System.out.println("5. to stop operation");
	 			 System.out.print("please enter your choice:");
	 			 i = sc.nextInt();
			switch(i)
			{
			case 1:
			System.out.println("the current balance is: "+bankService.checkBalance());
	 		break;
			case 2:
	 		System.out.print("Enter the amount to deposit:");
	  		amount = sc.nextInt();
	  		bankService.deposit(amount);
			System.out.println("Successfully deposited!");
	  		break;
			case 3:
	 		System.out.print("Enter the amount to withdraw:");
	  		amount=sc.nextInt();
	 		if(amount>bankService.checkBalance())
			{
			System.out.println("Insufficient balance!");
			}
			else
			{
	 		 bankService.withdraw(amount);
	  		System.out.println("you withdraw "+ amount+ " birr successfully!");
			}
	 	 break;
		case 4:
	 	bankService.clear();
	 	System.out.println("you successfully cleared the account.");
	 	break;
		case 5:
	 	System.exit(0);
		default:
		 System.out.println("Invalid Entry!");
		break;
		}
		}
		}catch(RemoteException e)
		{
		System.out.println("Remote Error: "+e);
		}catch(Exception e)
		{
		System.out.println("Error: "+e);
		}
	}
}
