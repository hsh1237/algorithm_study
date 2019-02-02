package algorithm_study_20190202;

//4. 하샤드 수
public class Solution4 {
	
	public boolean solution(int x) {
	      boolean answer = true;
	      
	      /*if(x % ((x/10) + (x%10)) != 0) {
		   	  answer = false;
		  }*/
	      
	      String[] str = (x+"").split("");
	      int num = 0;
	      for(String a : str) {
	    	  num += Integer.parseInt(a);
	      }
	      
	      //System.out.println(num);
	      if(x % num != 0) {
		   	  answer = false;
		  }
	      
	      return answer;
	  }

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(12));
		System.out.println(sol.solution(123));
		System.out.println(sol.solution(1430));

	}

}
