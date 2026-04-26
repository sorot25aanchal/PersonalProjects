package exceptionalhandling.RPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import customExceptionService.InvalidAgeException;
import customExceptionService.votingService;

public class VotingRPC {
//feature branch changes
	public static void main(String[] args) throws InvalidAgeException  {
		votingService voting = new votingService();
		int ageInFile = 0, ageEntered;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Your Age");
		ageEntered = scanner.nextInt();
		File file = new File("D:\\Documents\\age.txt");
		try {
			Scanner read = new Scanner(file);
			if (read.hasNextInt()) {
				ageInFile = read.nextInt();
				System.out.println("Age in file second:" + ageInFile);
			}
				voting.ageInvalidException(ageEntered, ageInFile);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}

}
