import java.io.*;
import java.util.*;

class TimeConversion{

  static String timeConversion(String s) {
    String[] s1 = s.split(":",3) ;
    String hour = "0";
    int hours = Integer.parseInt( s1[0] );
    char[] AMPM = s1[2].toCharArray();
  if( AMPM[2] == 'P' ) { if( hours == 12 ) { hour = "12" ; } else{ hours = hours + 12 ; hour = Integer.toString(hours) ; } }
  else { if( hours == 12 ) { hour = "00" ; } else { hour = hour.concat(Integer.toString(hours)); } }
    String time = hour.concat(":").concat(s1[1]).concat(":").concat(String.valueOf(AMPM[0])).concat(String.valueOf(AMPM[1]));

    return time;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String res = timeConversion(s);
    System.out.println(res);
    sc.close();
  }

}
