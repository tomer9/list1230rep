package list1230b;

import java.util.ArrayList;

public class List1230b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filer filer = new Filer();
		Item item = new Item();
		ArrayList<Item> items = new ArrayList<>();
		
		items = filer.getFile("food.txt");
		
		for (Item i : items)
		{
			System.out.println(i.food + " " + i.aisle);
			
		}
			
	}

}
