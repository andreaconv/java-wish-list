package org.java.es2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserire una parola: ");
		String parola = sc.nextLine();
		
		Map<Character, Integer> arrCaratteri = new HashMap<>();
		
		for (int i = 0; i < parola.length(); i++) {
			
			char charParola = parola.toLowerCase().charAt(i);
			
			if (arrCaratteri.containsKey(charParola)) {
				
				arrCaratteri.put(charParola, arrCaratteri.get(charParola) + 1);
			} else {
				
				arrCaratteri.put(charParola, 1);
			}
		}
		
		//STAMPA 1
		System.out.println("\n" + arrCaratteri);
		
		System.out.println("\n----------------\n");
		
		//STAMPA 2
		for (Character chiave : arrCaratteri.keySet()) {
			
			Integer valore = arrCaratteri.get(chiave);
			
			System.out.println(" " + chiave + " --> " + valore);
		}
		
		System.out.println("\n----------------\n");
		
		//STAMPA 3
		for (Character key : arrCaratteri.keySet()) {
		    System.out.println(" " + key + ": " + arrCaratteri.get(key));
		}
		
		System.out.println("\n----------------\n");
		
		Collection<Integer> values = arrCaratteri.values();
		for (Integer value : values) { 
			System.out.println(" value: " + value);
		}
		
	}
}
