package com.projectTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectAsteciApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAsteciApplication.class, args);
	}

	@Bean
	public void test() {
		System.out.println("ejercicio 1");
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.calculaArea(15, 5);
		
		System.out.println("ejercicio 2");
		ListaNombres lista = new ListaNombres();
		lista.actualizaNombres();
		
		System.out.println("ejercicio 5");
		ListaNumeros listaNum = new ListaNumeros();
		listaNum.filtrarPares();
		
		System.out.println("ejercicio 6");
		ListaPaises listaPaises = new ListaPaises();
		listaPaises.filtrarPaises();
		
		System.out.println("ejercicio 8");
		OrdenarNumeros ordenaNumeros = new OrdenarNumeros();
		int[] numeros = {23,50,12};
		ordenaNumeros.OrdenaNumeros(numeros);
	}
}
