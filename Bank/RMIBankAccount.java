public interface RMIBankAccount extends java.rmi.Remote
{
public double checkBalance() throws java.rmi.RemoteException;
public void withdraw(double amount) throws java.rmi.RemoteException;
public void deposit(double amount) throws java.rmi.RemoteException;
public void clear() throws java.rmi.RemoteException;
}
