package com.ninja.assignment;
//import java.util.Arrays;
import java.util.Scanner;


public class HarryPotter {

	public static void main(String[] args) {
		int[] movieNumber= {1,2,3,4,5,6,7,8};
		int[] movieYear= {2001,2002, 2004, 2005, 2007, 2009, 2010, 2011};
		String[] movieName = {"Harry Potter and the Philosopher's Stone", "Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire", "Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince", "Harry Potter and the Deathly Hallows – Part 1", "Harry Potter and the Deathly Hallows – Part 2"};
		
		//Calculate the elasped time between first and last Harry Potter movies
		int elapsedYear =	movieYear[movieYear.length-1] - movieYear[0];
		System.out.println("\nElasped Year between first and last Harry Potter Movies: "+elapsedYear);
		
		//Approximate time for each movie release
		int years = (movieYear[movieYear.length-1] - movieYear[0])/movieName.length;
		int months = (movieYear[movieYear.length-1] - movieYear[0])%movieName.length;
		System.out.println("\nApproximate time for each movie release: " +years +" year " +months +" Months");
		
		//User Input and print the movie name
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter the movie number: ");
		int mNumber = input.nextInt();
		if (mNumber > 0 && mNumber <= 8) {
			int index = mNumber-1;
			System.out.println("\nThe name of the Harry Potter Movie is : "+movieName[index]);		
		}else {
			System.out.println("\nValue entered is not valid. Harry Potter has 8 releases");
		}
		
		//First and Last Movie
		if (mNumber == 1) {
			System.out.println("\nFirst Movie: " +movieName[0]);	
		} else if (mNumber == 8){
			System.out.println("\nLast Movie: " +movieName[7]);
		}else {
			System.out.println("\nThe value entered is not first or last Movie");
		}
		
		input.close();
		
		//For loop to print the list of movies along with movie number and year released
		System.out.println("\nDisplaying all the Harry Potter Movies\n");
		System.out.format("\n%-15s%-15s%-30s\n", "Movie Number", "Year Released" , "Movie Name");
		for (int index =0; index<movieNumber.length; index++) {
			System.out.format("%-15s%-15s%-30s\n", movieNumber[index],movieYear[index],movieName[index] );
			//System.out.println("\nThe movie" +movieNumber[index]+" was released in the year " +movieYear[index]+ " and the movie Name is \"" +movieName[index] +"\"");
		}
		
	}
	
	public class potter2 {
		public static void main(String[] args) {
			//int[] movieNumber= {1,2,3,4,5,6,7,8};
			//int[] movieYear= {2001,2002, 2004, 2005, 2007, 2009, 2010, 2011};
			String[] movieName = {"Harry Potter and the Philosopher's Stone", "Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire", "Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince", "Harry Potter and the Deathly Hallows – Part 1", "Harry Potter and the Deathly Hallows – Part 2"};
			
			Scanner mNumber = new Scanner(System.in);
			System.out.println("Enter the movie Number : " );
			
			//Get User Input and print the name of the movie until user inputs a invalid value
			
			while(mNumber.hasNext()) {
				int mNum = mNumber.nextInt();
				if (mNum >=1 && mNum<=8) {
					System.out.println("\nHarry Potter movie name is : " +movieName[mNum -1]);
					System.out.println("\nEnter the movie Number: ");
				}else {
					System.out.println("\nInvalid Input!! Harry Potter has only 8 parts");
					break;
				}//End of IFELSE loop
			}// END of While loop
			mNumber.close();
		}//End of main method
	}//End of potter2 class
	
	public class arrayInputsMethod{
		public static void main(String[] args) {
			
			String[] movieName = {"Harry Potter and the Philosopher's Stone", "Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire", "Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince", "Harry Potter and the Deathly Hallows – Part 1", "Harry Potter and the Deathly Hallows – Part 2"};
			int[] inputValue= new int[5];
			
			//Getting input from user and storing in the array
			Scanner userInput = new Scanner(System.in);	
			for (int i=0;i<5;i++) {
				System.out.println("Enter the number: ");
				inputValue[i] = userInput.nextInt();
			}
			
			for (int usrInput:inputValue) {
				if (usrInput>0 && usrInput<=8) {
					System.out.println("\nInput: "+usrInput +" the movie name is " +movieName[usrInput-1]);
				}else {
					System.out.println("\nThe value " +usrInput +" is not valid. Harry potter has 8 parts");
				}//end of if loop
				//System.out.println("print the value for a: "+usrInput);
			}//End of for loop
			userInput.close();
		}//End of Main Method
	}//End of arrayInputMethod
}
