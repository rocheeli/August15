package com.monday.notes;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Paths;

import java.util.ArrayList;

public class MyFavoriteBooks
{

	public static void main(String[] args)
	{
		ArrayList<String>erinsFavBooks = new ArrayList<>();
				
		Path ourNewPath = Paths.get("\\Users\\admin\\desktop\\myfabbooks.txt");
		File aNewFile = ourNewPath.toFile();
		
		try(BufferedReader in = new BufferedReader(new FileReader(aNewFile))){
			
			String aBook;
			while((aBook = in.readLine()) !=null)
			{
				erinsFavBooks.add(aBook);
			}
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
		for (int i = 0; i < erinsFavBooks.size(); i++)
		{
			System.out.println(erinsFavBooks.get(i));
		}
	}//main

}//class
