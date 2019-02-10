package algorithm_study_20190211;
// x만큼 간격이 있는 n개의 숫자

public class Solution2 {

	public long[] solution(int x, int n) {
	      long[] answer = new long[n];
	      
	      for(int i=0; i < n ; i++) {
	          answer[i] = (long)x * (i+1);   
	      }
	      
	      return answer;
	}
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		long[] result = sol.solution(-4, 3);
		//long[] result = sol.solution(2, 5);
		//long[] result = sol.solution(2, 5);
		for(long a : result) {
			System.out.println(a);
		}

	}

}
