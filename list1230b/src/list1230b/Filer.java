package list1230b;
import java.util.ArrayList;

import java.io.*;

public class Filer
{
	
	public ArrayList<Item> getFile(String name)
	{
		
		ArrayList<Item> items = new ArrayList<>();
		BufferedReader in = getReader(name);
		items = readItem(in);
		return items;
	}
	
	private BufferedReader getReader(String name)
	{
		BufferedReader in = null;
		try {
			File file = new File(name);
			in = new BufferedReader(
					new FileReader(file) );
		}
		catch (FileNotFoundException e) {
			System.out.println("Error 1");
			System.exit(0);
		}
		return in;
	}
	
	private ArrayList<Item> readItem(BufferedReader in)
	{
		ArrayList<Item> items = new ArrayList<>();
		
		
		String line = "";	//read text file line by line
		String[] data;		//array of strings to hold split line
		
		do
		{
			try
			{
				line = in.readLine();
			}
			catch (IOException e)
			{
				System.out.println("Error 2");
				System.exit(0);
			}
			if (line != null)
			{
			Item item = new Item();
			data = line.split("\t");	//splits by tab
			item.food = data[0];
			item.aisle = data[1];
			items.add(item);
			}
		
		} while (line != null);
		
		return items;
		}
}
	

