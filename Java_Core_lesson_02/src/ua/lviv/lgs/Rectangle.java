package ua.lviv.lgs;

public class Rectangle {
	
	private int length;
	private int width;
	private int S;
	private int P;
	
	Rectangle (){
		this.length = 20;
		this.width = 10;
	}
	
	Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void square() {
		S = length * width;
		System.out.println("Площа прямокутника = " + S);
	}
	
	public void perimetr() {
		P = 2*(width + length);
		System.out.println("Периметр прямокутника = " + P);
	}
	
}
