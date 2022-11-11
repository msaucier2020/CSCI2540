package activity11;

import java.util.*;

public class MergeSort {

	/*
	 *  main method to ask user for an integer list of a certain size and return the list sorted
	 */
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int size;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter total number of integers to be sorted: ");
		size = kbd.nextInt();
		
		System.out.println("Enter integers separated by a space: ");
		for(int i = 0; i < size; i++) {
			list.add(kbd.nextInt());
		}
		
		System.out.println("List before sorting: ");
		for(int i = 0; i < size; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(" ");
		
		list = mergeSort(list);
		
		System.out.println("List after sorting: ");
		for(int i = 0; i < size; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(" ");
		
		kbd.close();
	}
	
	/*
	 * merge the two sorted lists
	 * @param 2 sorted lists
	 * @return merged sorted list
	 */
	public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> merged = new ArrayList<Integer>();
		int i = 0, j = 0;
		
		do {
			if(list1.get(i) < list2.get(j)) {
				merged.add(list1.get(i));
				i++;
			}
			else {
				merged.add(list2.get(j));
				j++;
			}
			
		} while(i <  list1.size() && j < list2.size());
		
		if(i <  list1.size()) {
			for(int a = i; a < list1.size(); a++) {
				merged.add(list1.get(a));
			}
		}
		else {
			for(int a = j; a < list2.size(); a++) {
				merged.add(list2.get(a));
			}
		}
		
		return merged;
	}
	
	/*
	 * recursive method to implement mergeSort: split list in 2 halves, sort, and merge
	 * @param unsorted list
	 * @return sorted list
	 */
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> list){
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		ArrayList<Integer> sub1 = new ArrayList<Integer>();
		ArrayList<Integer> sub2 = new ArrayList<Integer>();
		
		if(list.size() == 1) {
			return list;
		}
		else {
		
			for(int i = 0; i < list.size()/2; i++) {
				sub1.add(list.get(i));
			}
			for(int i = list.size()/2; i < list.size(); i++) {
				sub2.add(list.get(i));
			}
		
			
			sub1 = mergeSort(sub1);
			sub2 = mergeSort(sub2);
			
			sorted = merge(sub1, sub2);
			return sorted;
		}
		
	}
}
