package com.lab.monday.explorer;

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
	static ArrayList<String> countries = new ArrayList<>();
	Path ourNewPath = Paths.get(
			"\\Users\\admin\\newworkspace\\AListOfCountries\\src\\com\\lab\\monday\\explorer\\countryListExplorer");
	File aNewFile = ourNewPath.toFile();

	public void readCountries()
	{

		for (int i = 0; i < countries.size(); i++)

		{
			System.out.println(countries.get(i));

		}
	}

	public void writeCountries(String userCountry)

	{
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true))))
		{
			out.print(userCountry);
			countries.add(userCountry);
			out.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void deleteCountries()
	{
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile))))
		{
			out.print("\n" + countries.get(0));
			out.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true))))
		{
			for (int i = 1; i < (countries.size()) - 1; i++)
			{
				out.print(countries.get(i));
			}
			out.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void deleteLastCountryFromArray()
	{
		countries.remove(countries.size() - 1);
		countries.trimToSize();

	}
}
