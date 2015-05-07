package com.prasa.samples;

public class Local1 {
	
	public void display(){
		String name="how are you bangaram i miss so much pandu";
		class Local{
			void msg(){
				System.out.println("hello lohitakshay");
				System.out.println(name);
			}
			
		}
		Local l=new Local();
		l.msg();
		
	}

	public static void main(String[] args) {
		Local1 l1=new Local1();
		l1.display();

	}

}
