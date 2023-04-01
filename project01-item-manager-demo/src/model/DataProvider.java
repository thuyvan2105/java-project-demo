package model;

import java.util.HashMap;
import java.util.Map;

import bean.CD;

public class DataProvider {
	private DataProvider() {
	}
	
	public static Map<Integer, CD> mockCDs() {
		Map<Integer, CD> cds = new HashMap<>();

		cds.put(1, new CD(1, "Pop", "Taylor Swift", 12, 200000));
		cds.put(2, new CD(2, "Rock", "Linkin Park", 10, 250000));
		cds.put(3, new CD(3, "Hip-hop", "Eminem", 15, 180000));
		cds.put(4, new CD(4, "Ballad", "IU", 20, 300000));
		cds.put(5, new CD(5, "Pop", "Adele", 25, 350000));
		cds.put(6, new CD(6, "Jazz", "John Coltrane", 8, 220000));
		cds.put(7, new CD(7, "Classical", "Ludwig van Beethoven", 5, 280000));
		cds.put(8, new CD(8, "Jazz", "Norah Jones", 15, 290000));
		cds.put(9, new CD(9, "R&B", "The Weeknd", 18, 320000));
		cds.put(10, new CD(10, "Rock", "Queen", 10, 230000));

		return cds;
	}
}