package demo;

import static model.DataProvider.mockCDs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import bean.CD;

public class CDDemo {
	public static void main(String[] args) {
		Map<Integer, CD> cds = mockCDs();
		
		System.out.println("List of all current CDs:\n " + cds);
		
		add(cds, 10, new CD(5, "Pop", "Blackpink", 25, 350000));
		System.out.println("\n1. After adding a new CD:\n " + cds);
		
		System.out.println("\n2. The number of CDs: " + cds.size());
		
		System.out.println("\n3. Sum of all CDs: " + sumPrice(cds));
		
		System.out.println("\n4. Sort the list in descending order according to the price:\n " + sortByPrice(cds));
		
		System.out.println("\n5. Sort the list in ascending order according to the id:\n " + sortByCDid(cds));	
	}

	private static void add(Map<Integer, CD> cdMap, int id, CD cd) {
		 if (!cdMap.containsKey(id)) {
	            cdMap.put(id, cd);
	        } else {
	            System.out.println("CD id already exists!");
	        }
	    }
		
	private static double sumPrice(Map<Integer, CD> cdMap) {
		double sum = 0;
		for (CD cd : cdMap.values()) {
			sum += cd.getPrice();
		}
		return sum;
	}
	
	private static Map<Integer, CD> sortByPrice(Map<Integer, CD> cdMap) {
		Set<Entry<Integer, CD>> elements = cdMap.entrySet();
		List<Entry<Integer, CD>> sortedList = new ArrayList<>(elements);
		Collections.sort(sortedList, (cd1, cd2) -> Double.compare(cd2.getValue().getPrice(), cd1.getValue().getPrice()));
		Map<Integer, CD> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, CD> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}		
		return sortedMap;
	}
	
	private static Map<Integer, CD> sortByCDid(Map<Integer, CD> cdMap) {
		Map<Integer, CD> sortedMap = new TreeMap<>(cdMap);
		return sortedMap;
	}
}