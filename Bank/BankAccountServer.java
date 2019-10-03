import java.rmi.*;
import java.rmi.server.*;
public class BankAccountServer
{
public static void main(String args[])
{
System.out.println("Loading RMI service");
try{
	RMIBankAccountImpl bankService =  new RMIBankAccountImpl();
	RemoteRef location = bankService.getRef();
	System.out.println(location.remoteToString());
	String registry = "localhost";
	if(args.length>=1)
		registry = args[0];
	String registration = "rmi://" + registry + "/RMIBankAccount";
	Naming.rebind(registration,bankService);
}catch(RemoteException e){
	System.out.println("Remote  Error: "+e);
}catch(Exception e){
	System.out.println("Error: "+e);
}
}
}
