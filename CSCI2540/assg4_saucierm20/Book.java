/*
 * @author - Madeleine Saucier
 * A class for a Book
 */
package assg4_saucierm20;

public class Book {

	private String bookId;
	private String title;
	private String isbn;
	private String author;
	private char category;
	
	/*
	 *  constructor
	 */
	public Book(String id, String givenTitle, String isbnNo, String authorName, char categoryChar) {
		bookId = id;
		title = givenTitle;
		isbn = isbnNo;
		author = authorName;
		category = categoryChar;
	}
	
	/*
	 * retrieve the Id of the book
	 * @return book ID
	 */
	public String getId() {
		return bookId;
	}
	
	/*
	 * retrieve the title of the book
	 * @return  title
	 */
	public String getTitle() {
		return title;
	}
	
	/*
	 * retrieve the isbn of the book
	 * @return book ISBN
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/*
	 * retrieve the name of the author
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	
	/*
	 * retrieve the category of the book
	 * @return category char
	 */
	public char getCategory() {
		return category;
	}
	
	/*
	 * give a string with all the info about the book
	 * @return string with id, title, isbn, author, and category
	 */
	@Override
	public String toString() {
		String categoryName;
		if(category == 'N') {
			categoryName = "Non-Fiction";
		}
		else {
			categoryName = "Fiction";
		}
		return "ID: " + bookId + "\nTitle: " + title + "\nISBN: " + isbn + "\nAuthor: " + author + "\nCategory: " + categoryName + "\n";
	}
	
	/*
	 * searches the catalog for a book with a certain id
	 * @param array of book catalog, number of books in catalog, id of book that is being searched for
	 * @return array position of book if found
	 * @throws BookNotFoundException
	 */
	public static int bookSearch(Book catalog[], int noOfBooks, String id) throws BookNotFoundException {
		for(int i = 0; i < noOfBooks; i++) {
			if(catalog[i].getId().equals(id)) {
				return i;
			}
		}
		throw new BookNotFoundException();
	}
}

