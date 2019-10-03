import java.rmi.Naming;

public class StartServer {
	public static void main(String[] args) {
		try {
			// System.setSecurityManager(new RMISecurityManager());
			java.rmi.registry.LocateRegistry.createRegistry(555);

			ChatServerInt b = new ChatServer();
			Naming.rebind("rmi://127.0.0.1/myabc", b);
			System.out.println("[System] Chat Server is ready.");
		} catch (Exception e) {
			System.out.println("Chat Server failed: " + e);
		}
	}
}