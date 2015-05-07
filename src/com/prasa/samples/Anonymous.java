package com.prasa.samples;

public class Anonymous {

	public static void main(String[] args) {
		Person p = new Person() {
			public void eat() {
				System.out.println("Eating fruits and chips");
             	}
		
			public void drink(){                    
				System.out.println("ï like to drink tea in the evening");
			}
			};
			
	
		Fruits f=new Fruits(){
			public void sell(){
				System.out.println("apples,Grapes,banana and pappaya");
			}
			};
			
		p.eat();
		p.drink();
		f.sell();
		
	}

}
