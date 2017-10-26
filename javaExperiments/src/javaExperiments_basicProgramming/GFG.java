package javaExperiments_basicProgramming;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean isPerfect(int[] arr){
        boolean perfect = false;
        for(int i = 0; i <= arr.length/2; i++){
            if(arr[i] == arr[arr.length-1-i]){
                perfect = true;
            }
            else{
                perfect = false;
                break;
            }
            
            
            
        }
        return perfect;
    }
    
    public static int[] getArray(int k){
        Scanner sc1 = new Scanner(System.in);
        int[] arr = new int[k];
        for(int i = 0; i < k; i ++){
            try{
                arr[i] = sc1.nextInt();
            }
            catch(Exception ex){
                System.out.println("The problem is with " + i);
            }
        }
        sc1.close();
        return arr;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
		    int m = sc.nextInt();
		    int[] arr = getArray(m);
		    if(isPerfect(arr)){
		        System.out.println("PERFECT");
		    }
		    else{
		        System.out.println("NOT PERFECT");
		    }
		    n = n- 1; 
		}
	}
}