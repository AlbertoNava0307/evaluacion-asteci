package com.projectTest;

import java.util.ArrayList;
import java.util.List;

public class ListaPaises {

	public void filtrarPaises() {
		List<String> paises = new ArrayList<String>();
		paises.add("Rusia");
		paises.add("Estados Unidos");
		paises.add("Brasil");
		paises.add("Canada");
		paises.add("México");
		
		paises.stream().filter(pais -> String.valueOf(pais.charAt(pais.length()-1)).equals("a")
										|| String.valueOf(pais.charAt(pais.length()-1)).equals("e")
										|| String.valueOf(pais.charAt(pais.length()-1)).equals("i")
										|| String.valueOf(pais.charAt(pais.length()-1)).equals("o")
										|| String.valueOf(pais.charAt(pais.length()-1)).equals("u"))
						.map(pais -> pais.toUpperCase())
						.forEach(pais -> System.out.println(pais));
	}
}
