package edu.exeter.cs;

public class MultiSphere {

	public static void main(String[] args){
		Sphere basketball = new Sphere(9.4);
		Sphere tennisball = new Sphere();

		System.out.println(basketball);
		System.out.println("A basketball's surface area is " + basketball.surfaceArea());
		System.out.println("A basketball's volume is " + basketball.volume());
		System.out.println("The circumference of a basketball is " + basketball.circumference());
		System.out.println("Wait, I thought it was 28.5...");
		basketball.setDiameter(9.1);
		System.out.println("The circumference of a women's basketball is " + basketball.circumference());
		System.out.println();
		
		tennisball.setDiameter(2.7);
		System.out.println("This is a tennis ball " + tennisball);
		System.out.println("A tennis ball's volume is " + tennisball.volume());
		tennisball.setDiameter(2.9);
		System.out.println("A baseball is a little bigger. It's volume is " + tennisball.volume());

	}
	
}
