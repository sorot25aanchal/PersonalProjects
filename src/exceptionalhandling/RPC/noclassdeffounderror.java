package exceptionalhandling.RPC;

//import com.epic.RPC.CommunicationRPC;

public class noclassdeffounderror{

	public static void main(String[] args) {
		try {
			//CommunicationRPC r = new CommunicationRPC();
			//System.out.println(r);
			//r.getcommunication("fhfhj", "hgfhg", "ghfdghh", "6546757");
		} catch (NoClassDefFoundError e) {
			System.out.println("Some error occured");
				if(e instanceof NoClassDefFoundError) {
					System.out.println("no class");
				}

		}
	}

}

