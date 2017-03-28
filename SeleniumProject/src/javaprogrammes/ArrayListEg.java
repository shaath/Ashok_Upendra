package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<>();
		
		//Writing the data into arraylist
		
		s.add("Ashok");
		s.add("Sharath");
		s.add("Sirisha");
		s.add("Sharath");
		
		s.add(2, "Selenium");
		s.add(2, "UFT");
		//Finding the length of the array
		
		System.out.println(s.size());
		
		//Reading the data from Arraylist
		
//		System.out.println(s.get(2));
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
		}

	}

}
