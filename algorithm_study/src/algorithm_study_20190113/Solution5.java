package algorithm_study_20190113;

//수박수박수박수박수
public class Solution5 {
	 public String solution(int n) {
	     String answer = "";
	     String[] str = new String[]{"수","박"};
	     for(int i=1; i <= n; i++) {
	        if(i%2 == 1) {
	            answer+= str[0];
	        }else{
	            answer+= str[1]; 
	        }
	     }
		 return answer;
	     // return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
	  }

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		
		System.out.println(sol.solution(3));
		System.out.println(sol.solution(5));
		System.out.println(sol.solution(4));

	}

}
