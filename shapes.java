package com.sapient.shapes;

public class shapes {
	//private  numberOfSides;//
	void calculateShapeArea(int numberOfSides,int length)
	{int a=length;
	int sides=numberOfSides;
		if(sides==1) 
		{
			System.out.println("area of circle is"+" "+(3.14*a*a));
			
		}
		else if(sides==3)
		{
			System.out.println("area of triangle is"+" "+(0.433*a*a));
		}
		else if(sides==4)
		{
			System.out.println("area of square is"+" "+(a*a));
		}
		else
			System.out.println("no shapes presnet to calculate area");
	}
	
	
}
