package demo;

import static model.BookStore.getBooks;
import java.util.Arrays;
import java.util.function.Predicate;
import bean.Book;
import bean.BookDetail;
import bean.Customer;
import bean.Order;

public class BookStoreApp {
	public static void main(String[] args) {
		Book[] books = getBooks();
		
		Book[] byPublisher = filter(books, book -> "Nhi Dong".equals(book.getPublisher()));	
		System.out.println("1. Find all books from \"Nhi Dong\" publishing house\n" + Arrays.toString(byPublisher));
		
		Book[] booksUnder50 = filter(books, book -> book.getPrice() < 50);
		System.out.println("\n2. Find all books with a unit price less than 50\n" + Arrays.toString(booksUnder50));
		
		Book[] textBooks100To200 = filter(books, book -> book.getPrice() >= 100 && book.getPrice() <= 200);
		System.out.println("\n3. Find all textbooks with unit prices from 100 to 200\n" + Arrays.toString(textBooks100To200));
		
		Customer customer = new Customer("KH01", "Tran Tam Nhi", "01215565494", "Danang");
		Order order = new Order(customer,
				new BookDetail[] { new BookDetail(books[0], 1), new BookDetail(books[4], 1) });
		System.out.println("\n4. The total amount that the customer has to pay\n" + getTotal(order));
	}
	
	private static Book[] filter(Book[] books, Predicate<Book> predicate) {
		return Arrays.stream(books)
			.filter(predicate)
			.toArray(Book[]::new);
	}
	
	private static double getTotal(Order order) {
        return Arrays.stream(order.getBookDetails())
                .mapToDouble(bookDetail -> bookDetail.getBook().getSalesPrice())
                .sum();
    }
}