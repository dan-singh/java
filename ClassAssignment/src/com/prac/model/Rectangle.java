package com.prac.model;

public class Rectangle {

	private static double mLength;
	private static double mWidth;

	public Rectangle(double length, double width)
	{
		mLength = length;
		mWidth = width;
	}   
	public double getLength()
	{
		return mLength;
	}

	public double getWidth()
	{
		return mWidth;
	}

	public  double getArea()
	{
		double area = mWidth*mLength;
		return area;    
	}
	
	public  double getPerimeter()
	{
		double perimeter = (mWidth*2)+(mLength*2);
		return perimeter;

	}
}
