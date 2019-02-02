package algorithm_study_20190202;

//1. 최대공약수와 최소공배수
public class Solution1 {
	
	public int[] solution(int n, int m) {
	      
	      int GCD = 0;
	      int limit =0;
	      
	      if(n>m) {
	    	  limit = n;
	      }else {
	    	  limit = m;
	      }
	      
	      //System.out.println("limit : " + limit);
	      for(int i=1; i<=limit; i++) {
	    	  if(n % i == 0 && m % i == 0) {
	    		  GCD = i;
	    	  }
	      }
	    
		  //최소 공배수 : 최대 공약수 * 공약수로 나눈 몫들의 곱
	      //3 * (12/3) * (3/3)
	      int LCM = GCD * (n/GCD) * (m/GCD);
	      //System.out.println(LCM);
	      //System.out.println(GCD);
	      
	      return new int[] {GCD,LCM};
	}

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		int[] result = sol.solution(3, 12);
		//int[] result = sol.solution(2, 5);
		for(int a : result) {
			System.out.println(a);
		}

	}

}
