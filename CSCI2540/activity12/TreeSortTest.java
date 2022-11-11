package activity12;

import java.io.*;
import java.util.*;

public class TreeSortTest {

	public static void main(String[] args) {
		Scanner input = null;
		String filename = "cityList.txt";
		String line, city, country;
		int comma;
		ArrayList<City> cityList = new ArrayList<City>();
		ArrayList<City> sortedList = new ArrayList<City>();
		Iterator<City> iter;
		
		try {
			input = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + filename);
			System.exit(0);
		}
		
		while(input.hasNextLine()) {
			line =  input.nextLine();
			if(!line.isBlank()) {
				comma = line.indexOf(",");
				
				city = line.substring(0, comma);
				comma += 2;
				country = line.substring(comma);
				
				cityList.add(new City(city, country));
			}
		}
		
		sortedList = treeSort(cityList);
		
		iter = sortedList.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		
		
	}
	
	public static ArrayList<City> treeSort(ArrayList<City> unsorted){
		ArrayList<City> sorted = new ArrayList<City>();
		BinarySearchTree<City, String> cityTree = new BinarySearchTree<City, String>();
		Iterator<City> iter = unsorted.iterator();
		
		//create tree
		while(iter.hasNext()) {
			cityTree.insert(iter.next());
		}
		
		//create sorted list w/ inorder traversal
		TreeIterator<City> treeIter = new TreeIterator<City>(cityTree);
		treeIter.setInorder();
		
		while(treeIter.hasNext()) {
			sorted.add(treeIter.next());
		}
		
		
		return sorted;
	}
	
	
}
