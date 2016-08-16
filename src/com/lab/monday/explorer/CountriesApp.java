package com.lab.monday.explorer;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp

{
	private static boolean unitedNations = true;

	public static void main(String[] args)
	{
		Scanner map = new Scanner(System.in);
		String userSelection = null;
		String menuChoice = null;
		String userCountry = null;
		String removeCountry = null;
		Path ourNewPath = Paths.get(
				"\\Users\\admin\\newworkspace\\AListOfCountries\\src\\com\\lab\\monday\\explorer\\countryListExplorer");
		File aNewFile = ourNewPath.toFile();
		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile)))
		{

			String aCountry;
			while ((aCountry = in.readLine()) != null)
			{
				ReadAndWrite.countries.add(aCountry);
			}
			in.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		while (unitedNations == true)
		{
			System.out.println();
			System.out.println("Welcome to the Countries App!");
			System.out.println();

			do
			{
				System.out.println("Please choose 1, 2, 3, or 4 to continue:" + "\n\t 1) Display the Countries in file"
						+ "\n\t 2) Enter a Country to add to file" + "\n\t 3) Delete a Country" + "\n\t 4) Exit");
				menuChoice = map.nextLine();
			} while (Validation.isValidMenuChoice(menuChoice));

			switch (menuChoice)
			{
			case "1":
				ReadAndWrite display = new ReadAndWrite();
				System.out.println("Here is the list of countries:\n ");
				display.readCountries();
				break;

			case "2":
				System.out.println("Please enter the name of a country to add:");
				userCountry = map.nextLine();
				ReadAndWrite addCountry = new ReadAndWrite();
				addCountry.writeCountries(userCountry);
				break;

			case "3":

				ReadAndWrite delete = new ReadAndWrite();
				delete.deleteLastCountryFromArray();
				ReadAndWrite deleteArray = new ReadAndWrite();
				deleteArray.deleteLastCountryFromArray();
				System.out.println("The previous country has been deleted");
				break;

			case "4":
				System.out.println("Goodbye");
				System.exit(0);
				break;

			}
		}

	}

}// class
