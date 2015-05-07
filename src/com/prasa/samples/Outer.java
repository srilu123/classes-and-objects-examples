package com.prasa.samples;

public class Outer {
	private String name="LOHITAKSHAY";
	public static class StaticClass{
		void msg(){
		System.out.println("this static nested class");
	}
	}
	public class Inner{
		void msg(){
			System.out.println("this is innerclass");
		}
	}
	 public static void main(String args[]){
		Outer out=new Outer();
		Outer.Inner inn=out.new Inner();
		inn.msg();
		Outer.StaticClass sc=new Outer.StaticClass();
		sc.msg();
	 }

}
