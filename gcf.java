import java.util.*;


class gcf{

	static int gicf(int a, int b){
		if(a%b != 0){
			b = a;
			a = a%b;
			gicf(a,b);
		}
		return b;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if(a>b)
			c = gicf(a,b);
		else
			c = gicf(b,a);
		System.out.println(a/c + "\t" + b/c);

	}


}
