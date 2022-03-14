package com.pointcircle.circle;
import com.pointcircle.point.*;
public class TestCircle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Circle one = new Circle();
		Circle Two = new Circle(4,8,5.4);
		Circle Three = new Circle(new Point(10,15),6.8);
		
		System.out.println(one.getArea());
		System.out.println(one.getCenterXY(10,20));
		
		
		
		
	}

}
