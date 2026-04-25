package exceptionalhandling.RPC;

public class arrayoutofboundException {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		String arr[]={"a","b","c"};
		try {
		System.out.println("dvfb"+arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("enter something within the range");	
		}
	}
	
	
	
}
