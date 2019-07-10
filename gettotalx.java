import java.io.* ;
import java.util.* ;

class gettotalx{

static int lcmfun(int[] arr){
int max = arr[0];
int lcm = 0;
int prod = 1;
for (int i = 1 ; i < arr.length ; i ++){
if(arr[i]>max)
max = arr[i];
prod = prod * arr[i];
}
prod = prod * arr[0];
//while(lcm!=0)
condition :
for(int j = 1; j < prod ; j ++){
for(int i = 0 ; i < arr.length ; i ++){
if((max*j)%arr[i] == 0 ){
lcm = max*j;
break condition;
}
}
}
return lcm;
}

static int result(int[] arr1, int[] arr2){
int count = 0;
int lcm = lcmfun(arr1);
int min = arr2[0];
for( int i=1; i < arr2.length ; i++ ){
	if(arr2[i] < min){ min = arr2[i] ; }
}
for( int i = 1 ; i <= min/lcm ; i++ ){
	int cond = 0;
	condi:
	for(int j = 0 ; j < arr2.length ; j++ ){
		if(arr2[j] % (lcm*i) == 0) {cond = 1;}
		else { cond = 0; break condi; }
	}
	if(cond == 1){ count ++; System.out.println(lcm*i + " " + min);}
}
	return count ;

}



public static void main(String[] args){

Scanner sc = new Scanner(System.in) ;

//Scanning Strings
String size = sc.nextLine();
String arr1 = sc.nextLine();
String arr2 = sc.nextLine();

//splitting the strings
String[] sizearr = size.split(" ");
String[] arr1num = arr1.split(" ");
String[] arr2num = arr2.split(" ");

//Making integer arrays
int s = sizearr.length;
int[] sizearrnum = new int[s];
for(int i=0 ; i < s ; i++ ){
	sizearrnum[i] = Integer.parseInt(sizearr[i]);
}
int[] arr1num1 = new int[arr1num.length];
for(int i = 0; i < arr1num.length ; i++ ){
	arr1num1[i] = Integer.parseInt(arr1num[i]);
	//System.out.print(arr1num1[i]);
}
int[] arr2num1 = new int[arr2num.length];
for(int i = 0; i< arr2num.length ; i ++){
	arr2num1[i] = Integer.parseInt(arr2num[i]);
	//System.out.print(arr2num1[i]);
}
//total integers
int total = gettotalx.result(arr1num1, arr2num1);

System.out.println(total);
}

}
