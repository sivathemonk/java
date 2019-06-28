// HACKERRANK Problem : URL : https://www.hackerrank.com/challenges/kangaroo/problem

import java.io.*;
import java.util.*;

class kangaroo{
  static String kangarooskip( int x1, int v1, int x2, int v2 ){
    int i = 1;
    String res = "No" ;
    int var1 = x1 + v1 ;
    int var2 = x2 + v2 ;
    while(var1 > var2){
      //int i = 1 ;
      var1 = x1 + i*v1 ;
      var2 = x2 + i*v2 ;
      if(var1 == var2) { res = "YES" ; break ;}
      i ++;
    }
    while(var2 > var1){
      //int i = 1
      var1 = x1 + i*v1 ;
      var2 = x2 + i*v2 ;
      if(var1 == var2) { res = "YES" ; break ;}
      i ++;

    }
    if(var1 == var2) { res = "YES" ; }
    return res;
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] x1v1x2v2 = scanner.nextLine().split(" ");
    int x1 = Integer.parseInt(x1v1x2v2[0]);
    int v1 = Integer.parseInt(x1v1x2v2[1]);
    int x2 = Integer.parseInt(x1v1x2v2[2]);
    int v2 = Integer.parseInt(x1v1x2v2[3]);

    String res = kangarooskip( x1, v1, x2, v2 ) ;
    System.out.println(res);

  }
}
