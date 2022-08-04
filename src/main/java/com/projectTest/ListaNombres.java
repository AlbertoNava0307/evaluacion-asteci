package com.projectTest;

public class ListaNombres {

	public void actualizaNombres() {
		String[] nombres = {"juan", "pedro", "jose", "maria", "sofia"};
		
		for (int i = 0; i < nombres.length; i++) {
			if(i == 0) {
				nombres[i] = nombres[i].toUpperCase().charAt(0) + nombres[i].substring(1, nombres[i].length());
			}
		}
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
}
