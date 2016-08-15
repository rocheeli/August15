package com.lab.monday.adventure;

import java.io.*;
import java.nio.file.*;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.JSpinner.ListEditor;

public class CountriesApp
{
	private static boolean unitedNations = true;

	public static void main(String[] args)
	{
		while (unitedNations == true)
		{

			Scanner map = new Scanner(System.in);
			String userSelection = null;
			String menuChoice = null;
			String userCountry = null;
		//	String userRemoved = null;
			System.out.println();
			System.out.println("Welcome to the Countries App!");
			System.out.println();

			do
			{
				System.out.println("Please choose 1, 2, 3 or 4 to continue:" + "\n\t 1) Display the Countries in file"
						+ "\n\t 2) Enter a Country to add to file" + "\n\t 3) Exit"
						+ "\n\t 4) Delete a Country from file");
				menuChoice = map.nextLine();
			} while (Validation.isValidMenuChoice(menuChoice));

			switch (menuChoice)
			{
			case "1":
				ReadAndWrite display = new ReadAndWrite();
				System.out.println("Here is the list of countries: ");
				display.readCountries();
				break;

			case "2":
				System.out.println("Please enter the name of a country to add:");
				userCountry = map.nextLine();
				ReadAndWrite addCountry = new ReadAndWrite();
				addCountry.writeCountries("\n" + userCountry);

				break;

			case "3":
				System.out.println("Goodbye");
				System.exit(0);
				break;

//			case "4":
//				System.out.println("Which Country would you like to delete?");
//				userRemoved = map.nextLine();
//				ReadAndWrite removeCountry = new ReadAndWrite();
//			
//				break;

			}
		}

	}// main

}// class
