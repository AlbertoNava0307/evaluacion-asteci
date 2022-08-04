package com.projectTest;

public class Rectangulo implements Forma {
	
	public int area;

	@Override
	public void calculaArea(int base, int altura) {
		this.area = base * altura;
		System.out.println("Area: " + area);
	}

}
