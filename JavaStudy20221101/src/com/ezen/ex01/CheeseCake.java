package com.ezen.ex01;

class Cake {
	   public void yummy() {
	      System.out.println("Yummy Cake");
	   }
}

class CheeseCake extends Cake {
	   public void yummy() { 
		   super.yummy();
	      System.out.println("Yummy Cheese Cake");
	   }
	   
	   public void tasty() {
		      super.yummy();    
		      System.out.println("Yummy Tasty Cake");
	    }

	   public static void main(String[] args) {
			Cake c1 = new CheeseCake();
			CheeseCake c2 = new CheeseCake();
			Cake c3 = new Cake();
		
			c1.yummy();   // Yummy Cheese Cake
			System.out.println("-----------------");
			
			c2.yummy();  // Yummy Cheese Cake
			System.out.println("-----------------");
			c2.tasty();
			System.out.println("-----------------");
			c3.yummy();   
		}
}


