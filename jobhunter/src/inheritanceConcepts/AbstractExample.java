package inheritanceConcepts;

import java.util.Scanner;
abstract  class Shape // static block ==no reason Illegal modifier for the class Shape; only public, abstract & final are permitted
{
	Scanner scr=new Scanner(System.in);
	final static  float PI=3.14f;
	abstract void calculateArea();	
	
}

class Circle extends Shape
{
	float radius;

	@Override
	void calculateArea()
	{
		System.out.println("enter the radis r:");
		radius=scr.nextFloat();
		float area=PI*radius*radius;
		System.out.println("area of circle is :" +area);
	}
	
}

class Triangle extends Shape
{
float b,h;
	@Override
	void calculateArea() 
	{
		System.out.println("Enter base and height");
		b=scr.nextFloat();
		h=scr.nextFloat();				
	float area=(b*h)/2;
	System.out.println("Area of triangle is :"+area);
	}	
}


public class AbstractExample {

	public static void main(String[] args)
	{
		Shape shape=new Triangle();		
		shape.calculateArea();
		
		shape=new Circle();		
		shape.calculateArea();	
		
	}

}
