/*
 * @author - Madeleine Saucier
 * A class to create and search a book catalog
 */
package assg4_saucierm20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookSearch {
	
	public static void main(String[] args) {
		
		Book[] catalog = new Book[10];
		int bookCount = 0;
		
		Scanner inputStream = null;
		Scanner kbd = new Scanner(System.in);
		
		String filename = "assg4_catalog.txt";
		String search;
		int bookPosition = 0;
		
		String id, title, author, isbn, category;
		char catChar;
		
		
		//file input exception handling
		try {
			inputStream = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + filename);
			System.exit(0);
		}

		//read input
		while(inputStream.hasNextLine()) {
			//line = inputStream.nextLine();
			

			id = inputStream.next();
			System.out.println(id);
			
			
			if(bookCount == 0) {
				title = inputStream.next();
				System.out.println(title);
				isbn = inputStream.next();
				System.out.println(isbn);	
				author = inputStream.next();
				System.out.println(author);
				category = inputStream.next();
				catChar = category.charAt(0);
				System.out.println(catChar + "\n\n");
				
				catalog[bookCount] = new Book(id, title, isbn, author, catChar);
				bookCount++;
				continue;
			}
			else {
				try {
					if(Book.bookSearch(catalog, bookCount, id) >= 0)
					{
						throw new BookIdAlreadyExistException();
					}
				}
				catch(BookIdAlreadyExistException e) {
					System.out.println(e.getMessage());
					//skip to next line
						@SuppressWarnings("unused")
						String skip = inputStream.nextLine();
					continue;
				} 
				catch (BookNotFoundException e) {
					title = inputStream.next();
					System.out.println(title);
					isbn = inputStream.next();
					System.out.println(isbn);	
					author = inputStream.next();
					System.out.println(author);
					category = inputStream.next();
					catChar = category.charAt(0);
					System.out.println(catChar + "\n\n");
					catalog[bookCount] = new Book(id, title, isbn, author, catChar);
					bookCount++;
				}
			}
		}
		
		inputStream.close();
		
		
		
		//print all info
		System.out.println("Catalog: \n ");
		for(int i = 0; i < bookCount; i++) {
			System.out.println(catalog[i].toString() + "\n");
		}
		System.out.println("Total number of books: " + bookCount + "\n");
		
		
		//allow user to search catalog
		do {
			System.out.println("Enter book ID to search: ");
			search = kbd.next();
			try {
				bookPosition = Book.bookSearch(catalog, bookCount, search);
			}
			catch(BookNotFoundException e) {
				System.out.println(e.getMessage());
				continue;
			}
			System.out.println(catalog[bookPosition].toString());
		} while(!(search.equals("STOP")));
		
		kbd.close();
	}
}
