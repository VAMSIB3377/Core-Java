package com.pointcircle.point;

public class TestPoint {
	public static void main(String[] args)
	{
		Point p1 = new Point(5,10);
		
		p1.setXY(20,30);
		System.out.println(p1.getXY());
		System.out.println(p1.toString());
		System.out.println(p1.distance());
	}

}

