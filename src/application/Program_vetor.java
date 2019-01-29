package application;

import java.util.Scanner;

import entities.Rent;

public class Program_vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent nQuartos[] = new Rent[9];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
			
		for(int i=1; i<=n; i++) {
			
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int quarto  = sc.nextInt();
			nQuartos[quarto] = new Rent(name, email, quarto);
			System.out.println();
		}
		
		int num = 1;
		System.out.println("Busy rooms:");
		
		for(int i=0; i<nQuartos.length; i++) {
			
			if (nQuartos[i] != null) {
				
				System.out.println(nQuartos[i].getBedroom() +": " + nQuartos[i].getName() + "," + nQuartos[i].getEmail());
				num++;
				
			}
			
		
			
			
		}
		
		
		
		
		
		sc.close();
		
		
				
				
		
	}

}
