package exceptionalhandling.RPC;

public class noclassfoundexception {

	public static void main(String[] args)  {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e)
		{
			
		}
	}
}
