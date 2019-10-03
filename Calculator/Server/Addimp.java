/**
This is the implementation of the remote interface "Adder" on the server.
*/

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Addimp extends UnicastRemoteObject implements Adder{
	public Addimp()throws RemoteException{
		super();
			}

	 @Override public int add(int x, int y){return x+y;}
	 @Override public int sub(int x, int y){return x-y;}
	 @Override public float div(int x, int y){return (float)x/y;}
	 @Override public int mul(int x, int y){return x*y;}
}
