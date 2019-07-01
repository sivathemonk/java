import java.io.* ;
import java.util.* ;

class gettotalx{

int lcmfun(arr){
int max = arr[0];
int lcm = 0;
for (int i = 1 ; i < arr.length ; i ++){
if(arr[i]>max)
max = arr[i];

}
//while(lcm!=0)
condition :
for(int j = 0; j <arr.length ; j ++){
for(int i = 0 ; i < arr.length ; i ++){
if((max*j)%arr[i] == 0 ){
lcm = max*j;
break condition;
}
}
}
return lcm;
}

int result(int[] arr1, int arr2){
lcm = lcmfun(arr1);

}

public static void main(String[] args){

Scanner sc = new Scanner(System.in) ;

//Scanning Strings
String size = sc.nextLine();
String arr1 = sc.nextLine();
String arr2 = sc.nextLine();

//splitting the strings
int sizearr[] = size.split(" ");
int arr1num = arr1.split(" ");
int arr2num = arr2.split(" ");

//total integers
int total = gettotalx.result(arr1num, arr2num);

System.out.println(total);
}

}
