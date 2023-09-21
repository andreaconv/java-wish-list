package org.java.es1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean finish = true;
		
		List<String> regali = new ArrayList<>();
		
		System.err.println("Inserisci il nome del regalo altrimenti scrivi 'STOP' se vuoi concludere \n");
		do {
			System.out.print("Nome del regalo: ");
			String input = sc.nextLine();
			
			//condizione per concludere il ciclo
			if(input.toLowerCase().equals("stop")) {
				finish = false;
				System.out.println("La lista che hai scritto è questa: ");
				
				System.out.println(regali);
				
			} else {
				
				regali.add(input);
				
				System.out.println("La lista regali contiene: " + regali.size() + ((regali.size() <= 1) ? " regalo" : " regali"));
				System.out.println("\n----------------------------------\n");
				
			}
		} while (finish);
		
	}

}

