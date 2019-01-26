package algorithm_study_20190127;

//3. 정수 제곱근 판별
public class Solution3 {
	
	public long solution(long n) {
	      long answer = 0;
	      //System.out.println(Math.sqrt(n) % 1);
	      double num =  Math.sqrt(n);
	      if(num % 1 == 0) {
	    	  answer =  (long) Math.pow(num+1, 2);
	      } else {
	    	  answer = -1;
	      }
	      return answer;
	}
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(121));
		System.out.println(sol.solution(3));
	}
}
