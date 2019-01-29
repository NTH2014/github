package application;

import java.util.ArrayList;
import java.util.List;



public class Listas {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Nicolas");
		lista.add("Nelio");
		lista.add("Nilza");
		lista.add("André");
		lista.add("Caio");
		
		for(String x: lista) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		lista.remove(0);
		lista.removeIf(x -> x.charAt(0) == 'N'); //remove x tal que o primeiro caractere seja "n"
		System.out.println(lista);

	}

}
