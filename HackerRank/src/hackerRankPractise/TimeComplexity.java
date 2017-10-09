package hackerRankPractise;

public class TimeComplexity {
	
	public static int findNumberOfRepititions(String s, char[] c) {
		int sum = 0;
		char[] arr = s.toCharArray();
		for(int i = 0; i < s.length(); i ++) {
			for(int j = 0; j < c.length; j++)
				if(s.charAt(i) == c[j])
				sum++;
		
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		String s = "some in the lawn is planting the trees. Some one in the lawn is playing with the kids. Some one in the lawn is commiting murder";
		char[] c = {'t','n','a','o'};
		int n = findNumberOfRepititions(s, c);
		long stopTime = System.currentTimeMillis();
		long duration = System.currentTimeMillis() - startTime;
		System.out.println(duration + " ms for the duration and  " + n + " number of repetitions " + stopTime + " " + startTime );


	}

}
