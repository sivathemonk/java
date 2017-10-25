package com.siva.geeksforgeeks;


public class Scope_Variables {
	
	
	static int x = 11;
	private int y = 33;
	public void method(int x) {
		Scope_Variables sv = new Scope_Variables();
		this.x = 22;
		y = 44;
		
		System.out.println("Scope_Variables.x: " + Scope_Variables.x);
		System.out.println("sv.x: " + sv.x);
		System.out.println("sv.y: " + sv.y);
		System.out.println("y: " + y);
	}
	public static void main(String[] args) {
		
		Scope_Variables sv = new Scope_Variables();
		sv.method(5);
		
		//return 0;
	}

}
