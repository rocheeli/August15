package com.lab.monday.adventure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReadAndWrite
{
	Path ourNewPath = Paths.get(
			"\\Users\\admin\\newworkspace\\AListOfCountries\\src\\com\\lab\\monday\\adventure\\countryListAdventure");
	File aNewFile = ourNewPath.toFile();

	public String readCountries()
	{
		ArrayList<String> countries = new ArrayList<>();

		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile)))
		{

			String aCountry;
			while ((aCountry = in.readLine()) != null)
			{
				countries.add(aCountry);
			}
			in.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		for (int i = 0; i < countries.size(); i++)

		{
			System.out.println(countries.get(i));

		}
		return null;
	}

	public void writeCountries(String userCountry)

	{
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true))))
		{
			out.print(userCountry);
			out.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}// method

}// class
