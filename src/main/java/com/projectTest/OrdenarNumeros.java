package com.projectTest;

public class OrdenarNumeros {

	public void OrdenaNumeros(int[] numeros) {
		for (int i = 0; i < (numeros.length-1); i++) {
			for (int j = i + 1; j > 0; j--) {
				if(numeros[j] > numeros[j-1]) {
					int temp = numeros[j-1];
					numeros[j-1] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
		
		for (int i : numeros) {
			System.out.println(i);
		}
	}
}
