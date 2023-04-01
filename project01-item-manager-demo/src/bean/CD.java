package bean;

import java.util.Objects;

public class CD {
	private int id;
	private String type;
	private String singer;
	private int numberOfSongs;
	private double price;
	
	public CD() {
	}

	public CD(int id, String type, String singer, int numberOfSongs, double price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberOfSongs = numberOfSongs;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CD)) {
			return false;
		}

		CD that = (CD) obj;

		return getId() == that.getId()
			&& getNumberOfSongs() == that.getNumberOfSongs()
			&& getPrice() == that.getPrice()
			&& getSinger().equals(that.getSinger())
			&& getType().equals(that.getType());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getNumberOfSongs(), getPrice(), getSinger(), getType());
	}
	

	@Override
	public String toString() {
		return "CD{" +
                "id: " + id +
                ", type: '" + type + '\'' +
                ", singer: '" + singer + '\'' +
                ", numberOfSongs: " + numberOfSongs +
                ", price: " + price +
                "}\n";
	}
}