package algorithm_study_20190428;
//숫자의 표현
public class Solution1 {

	public int solution(int n) {
	      int answer = 0;
	      
	      
	      for(int i=1;i<=n;i++) {
	    	  boolean check = true;
	    	  int sum = 0;
	    	  int num = i;
	    	  while(check) {
	    		  System.out.print(num+" ");
	    		  sum += num;
	    		  
	    		  num++;

	    		  if(sum == n) {
	    			  answer++;
	    			  check = false;
	    			  System.out.print(" = " + sum);
	    			  break;
	    		  }else if(sum > n) {
	    			  check = false;
	    			  break;
	    		  }	    		  
	    	  }
	    	  System.out.println();
	      }
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(5));
	}

}
