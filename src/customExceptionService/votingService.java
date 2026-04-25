package customExceptionService;

public class votingService {

	public void ageInvalidException(int enteredage,int ageInFile)  
	{	
		try {
			if(enteredage<ageInFile) {
				throw  new InvalidAgeException("the age is less than expected");
			}
		}
		catch(InvalidAgeException i)
		{
			i.printStackTrace();
		
		}
	}
	
}



