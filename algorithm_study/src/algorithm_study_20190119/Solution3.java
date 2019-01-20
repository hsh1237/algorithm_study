package algorithm_study_20190119;

//약수의 합
public class Solution3 {

	public int solution(int n) {
	      int answer = 0;
	      
	      for(int i=1;i<=n;i++) {
	    	  if(n % i == 0) {
	    		  answer += i;
	    	  }
	      }
	      
	      return answer;
	}
	
	public static void main(String[] args) {
		
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(12));
		System.out.println(sol.solution(5));

	}

}
