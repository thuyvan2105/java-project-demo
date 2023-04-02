package bean;

import common.Status;

public class Textbook extends Book {
	private Status status;

	public Textbook() {
	}

	public Textbook(String id, double price, String publisher, Status status) {
		super(id, price, publisher);
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Textbook [status=" + status + ", toString()=" + super.toString() + "]\n";
	}

	@Override
	public double getSalesPrice() {
		if (Status.OLD.equals(getStatus())) {
			return getPrice() * 0.7;
		}
		return getPrice();
	}
}