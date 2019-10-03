
/**
This is the remote interface that resides on the Client 
gets implemented on the server.
*/
import java.rmi.*;
public interface Adder extends Remote{
	public int add(int x, int y)throws RemoteException;
	public int sub(int x, int y)throws RemoteException;
	public float div(int x, int y)throws RemoteException;
	public int mul (int x, int y)throws RemoteException;
}
