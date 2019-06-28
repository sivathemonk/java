package javaExperiments_basicProgramming;

import java.util.*;

public class EmptyMain {

	Scanner sc1 = new Scanner(System.in);
	int m1 = sc1.nextInt();  //non-static integer variable and hence primarily the scope is limited
	static Scanner sc = new Scanner(System.in);
	static int m = sc.nextInt();
	EmptyMain(){ //Constructor is declared but not getting initialized
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		//int m = sc.nextInt();
		//EmptyMain e = new EmptyMain();  //the calling of this variable is not working with the constructo
		System.out.println(m);//variable is a static variable, printing is working
	}
}
