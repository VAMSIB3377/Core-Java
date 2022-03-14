package com.book_Author;

import com.composition.Author.Author;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author one = new Author("George R Martin","georgemartin@gmail.com",'m');
		
		
		book1 d_book = new book1("Game of Thrones",one,4000,8);
		
		
		
		d_book.setPrice(5056.98);
		d_book.setQty(80);
		System.out.println("Book Name : "+d_book.getName());
		System.out.println("Author "+d_book.getAuthor());
		System.out.println("Total No of Books :"+d_book.getQty());
		
		

	}

}
