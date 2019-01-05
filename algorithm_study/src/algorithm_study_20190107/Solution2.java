package algorithm_study_20190107;

public class Solution2 {

	
	public long solution(int a, int b) {
	      long answer = 0;
	      int start = 0;
	      int end = 0;
		    
	      if(a < b) {
	          start = a;
	          end = b;
	      }else {
	          start =b;
	          end = a;
	      }
		      
	      for(int i = start;i<=end;i++){
	          //System.out.println(i);
	          answer += i;
	      }
	      //for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
	      //    answer+=i;
	      //}
	      return answer;
	  }
	
	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(3, 5));
		System.out.println(sol.solution(3, 3));
		System.out.println(sol.solution(5, 3));

	}

}
