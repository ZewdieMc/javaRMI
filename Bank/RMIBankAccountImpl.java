import java.rmi.*;
import java.rmi.server.*;
public class RMIBankAccountImpl extends UnicastRemoteObject implements RMIBankAccount
{
private double balance;
public RMIBankAccountImpl() throws RemoteException 
{
balance=0;
}
public void deposit(double amount) throws RemoteException
{
balance=balance+amount;
}
public void withdraw(double amount) throws RemoteException
{
balance=balance-amount;
}
public double checkBalance() throws RemoteException
{
return balance;
}
public void clear() throws RemoteException
{
balance=0;
} 
}
