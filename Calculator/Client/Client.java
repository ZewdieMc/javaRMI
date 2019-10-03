import java.rmi.*;
import java.net.*;
public class Client {
	/**
	only if the server&client are on the same host,the HOST_NAME must be localhost.
	*/
	private static final String HOST_NAME = "localhost";
	private static final int port  = 1099;
	private static String remote_object = "Adder";
	public static void main(String...args){
		try{
		Adder adder = (Adder)Naming.lookup("rmi://"+HOST_NAME+":"+port+"/"+remote_object);
		Thread t = new Thread(new Runnable(){
		@Override
		public void run(){
		int a = 0, b = 0;
			for(int i = 0 ;i<10;i++)
				try{
					a = new java.util.Random().nextInt(100)+1;
					b = new java.util.Random().nextInt(100)+1;
					System.out.println(a+" + "+b+" = "+adder.add(a,b));
					System.out.println(a+" - "+b+" = "+adder.sub(a,b));
					System.out.println(a+" / "+b+" = "+adder.div(a,b));
					System.out.println(a+" * "+b+" = "+adder.mul(a,b));
					System.out.println();
					Thread.sleep(1000);
				}
				catch(InterruptedException w){System.out.println(" Error."+w);}
				catch(RemoteException y){System.out.println("Error ."+y);}
		}
		});
		t.start();
		}
		
		catch(MalformedURLException x){System.out.println("Error . "+x );}
		catch(RemoteException y){System.out.println("Error ."+y);}
		catch(NotBoundException z){System.out.println("Error ."+z);}	
		
	}
}
