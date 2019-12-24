package ua.lviv.lgs;

public class Circle {

	private double radius;
	private double diameter;
	private double S;
	private double C;
	private double pi = 3.14;
	
	Circle(){
		this.radius = 10;
		this.diameter = 20;
	}

public void Square() {
	System.out.println((pi * diameter * diameter)/4 );
}

public void Length() {
	System.out.println(2 * pi * radius);
}
	
}