package chinese_zodiac;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the year you were born");
		int year = keyboard.nextInt();
		String animal;
		
		//input valiation 
		while(year < 1900 || year > 2026) //updates every January 1
		{
			System.out.println("Invalid entry.  Try again");
			year = keyboard.nextInt();
		}
			
		if(year % 12 == 0)
			animal = "monkey";
		
		else if(year % 12 == 1)
			animal = "rooster";
		
		else if(year % 12 == 2)
			animal = "dog";
		
		else if (year % 12 == 3)
			animal = "pig";
		
		else if(year % 12 == 4)
			animal = "rat";
		
		else if(year % 12 == 5)
			animal = "ox";
		
		else  if(year % 12 == 6)
			animal = "tiger";
		
		else if(year % 12 == 7)
			animal = "rabbit";
		
		else if(year % 12 == 8)
				animal = "dragon";
		 
		else if(year % 12 == 9)
			animal = "snake";
		
		else if(year % 12 == 10)
			animal = "horse";
		
		else
			animal = "goat";
		
		System.out.println("You were born on the year of the " + animal);
	}

}
