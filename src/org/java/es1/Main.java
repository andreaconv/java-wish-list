package org.java.es1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean finish = true;
		
		//cambio struttura da List a Map che rappresenta una collezione di coppie "chiave-valore"
		Map<String, String> regali = new HashMap<>();
		
		System.err.println("Inserisci il nome del regalo e successivamente il destinatario altrimenti scrivi 'STOP' se vuoi concludere \n");
		do {
			System.out.print("Nome del regalo: ");
			String regalo = sc.nextLine();
			
			//condizione per concludere il ciclo
			if(regalo.toLowerCase().equals("stop")) {
				finish = false;
				
				System.out.println("\nLa lista che hai scritto è questa: \n");
				
				//stampo gli elementi
				for (String key : regali.keySet()) {
				    System.out.println(key + ": " + regali.get(key) + "\n");
				}
				
			} else {
				
				System.out.print("Nome del destinatario: ");
				String destinatario = sc.nextLine();
				
				//array -- chiave ----- valore
				regali.put(destinatario, regalo);
				
				System.out.println("La lista regali contiene: " + regali.size() + ((regali.size() <= 1) ? " regalo" : " regali"));
				System.out.println("\n----------------------------------\n");
				
			}
		} while (finish);
		
	}

}

