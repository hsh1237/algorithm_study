package algorithm_study_20190202;

//2. 콜라츠 추측
public class Solution2 {
	
	 public int solution(long num) {

	      int cnt = 0;
	      
	      while(num > 1) {
	    	  if(num % 2 == 0) {
	    		  num = num/2;
	    	  }else {
	    		  num = (num * 3) + 1; 
	    	  }
	    	  cnt++;
	    	  
	    	  if(cnt > 500) {
	    		  cnt = -1;
	    		  break;
	    	  }
	      }
	      return cnt;
	   
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(6));
		System.out.println(sol.solution(626331));

	}

}
