package com.composition.Author;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Author one = new Author("Vamsi","bvamsi.1036@gmail.com",'m');
		
		
		one.setEmail("vamsi.b.b@capgemini.com");
		System.out.println(one.getName());
		System.out.println(one.getEmail());
		System.out.println(one.getGender());
		System.out.println(one.toString());
		

	}

}
