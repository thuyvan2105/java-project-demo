package model;

import bean.Book;
import bean.ReferenceBook;
import bean.Textbook;
import common.Status;

public class BookStore {
	private BookStore() {
	}
	
	public static Book[] getBooks() {
		Textbook tb1 = new Textbook("SGK01", 45, "Nhi Dong", Status.OLD);
		Textbook tb2 = new Textbook("SGK02", 145, "Fahasa", Status.NEW);
		Textbook tb3 = new Textbook("SGK03", 200, "Thai Ha", Status.NEW);
		ReferenceBook rb1 = new ReferenceBook("STK04", 300, "Tien Phong", 1.5d);
		ReferenceBook rb2 = new ReferenceBook("STK05", 400, "Nhi Dong", 2d);
		
		return new Book[] { tb1, tb2, tb3, rb1, rb2 };
	}
}
