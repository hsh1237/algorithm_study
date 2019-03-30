package algorithm_study_20190211;

import java.util.Arrays;

// 예산
public class Solution4 {
	public int solution(int[] d, int budget) {
	      int answer = 0;
	      
	      
	      Arrays.sort(d);
	      
	      for(int a : d) {
	    	  if(budget - a >= 0 ) {
	    		  budget -= a;
	    		  answer++;
	    	  }else {
	    		  break;
	    	  }
	      }
	      
	      return answer;
	}
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		System.out.println(sol.solution(new int[] {2,2,3,3},10));

	}

}
