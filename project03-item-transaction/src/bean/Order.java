package bean;

import java.util.Arrays;

public class Order {
	private Customer customer;
	private BookDetail[] bookDetails;

	public Order() {
	}

	public Order(Customer customer, BookDetail[] bookDetails) {
		this.customer = customer;
		this.bookDetails = bookDetails;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BookDetail[] getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetail[] bookDetails) {
		this.bookDetails = bookDetails;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", bookDetails=" + Arrays.toString(bookDetails) + "]";
	}
}