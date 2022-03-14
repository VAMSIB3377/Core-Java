package com.book_Author;

import com.composition.Author.Author;

public class book1 {
	
		private String name;
		private Author author;
		private double price;
		private int qty;
		
		
		public book1(String name,Author author, double price,int qty)
		{
			this.name = name;
			this.author = author;
			this.price = price;
			this.qty = qty;
		}
		
		public String getName()
		{
			return name;
		}
		public Author getAuthor()
		{
			return author;
		}
		public double getPrice()
		{
			return price;
		}
		
		public void setPrice(double price)
		{
			this.price = price;
		}
		public int getQty()
		{
			return qty;
		}
		public void setQty(int qty)
		{
			this.qty = qty;
		}
		public String toString()
		{
			return "Name :"+name+"\n Author :"+author+"\n Price :"+price+"\nQty :"+qty;
		}
}


