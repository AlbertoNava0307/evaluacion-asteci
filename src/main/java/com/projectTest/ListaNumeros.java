package com.projectTest;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {

	public void filtrarPares() {
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(8);
		numeros.add(5);
		numeros.add(2);
		numeros.add(33);
		numeros.add(54);
		numeros.add(22);
		numeros.add(6);
		numeros.add(88);
		numeros.add(13);
		
		numeros.stream().filter(num -> num%2 == 0).forEach(num -> System.out.println(num));
		
	}
}
