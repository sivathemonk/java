package com.java.thirtydaychallenge;

import java.util.Scanner;

public class Day26_NestedLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int date1 = sc.nextInt();
		int month1 = sc.nextInt();
		int year1 = sc.nextInt();
		int date2 = sc.nextInt();
		int month2 = sc.nextInt();
		int year2 = sc.nextInt();
		int fine = 0;
		if(year1 > year2) {
			fine = 10000;
		}
		else {
			if(year1 < year2) {
				fine = 0;
			}
			else {
				if(month1 > month2) {
					fine = 500 * (month1-month2);
				}
				else {
					if(date1 > date2) {
						fine = 15 * (date1-date2);
					}
				}
				
			}
		
		}
		System.out.println(fine);
		//Date d1 = sc.nextLine();
		//if(compareTo(date1, date2))
		//	System.out.println(date2 date1);
			//System.out.println(sme)

	}

}
