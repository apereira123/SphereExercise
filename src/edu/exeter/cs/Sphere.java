package edu.exeter.cs;

public class Sphere {

	private double diameter = 0;
	
	public Sphere(double dia) {
		diameter = dia;
	}
	public Sphere(){}
	
	public void setDiameter(double dia) {
		diameter = dia;
	}
	
	public double circumference() {
		return Math.PI*diameter;
	}
	public double surfaceArea() {
		return 2*Math.PI*Math.pow(diameter/2, 2);
	}
	public double volume() {
		return (4./3.)*Math.PI*Math.pow(diameter/2, 3);
	}
	
	public String toString() {
		return "The diameter is " + diameter + ".";
	}
	
}
