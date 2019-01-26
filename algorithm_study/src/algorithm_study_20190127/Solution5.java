package algorithm_study_20190127;

//5. 짝수와 홀수
public class Solution5 {

	public String solution(int num) {
	    String answer = "";
	    
	    if(num%2==0) {
	    	answer = "Even";
	    }else {
	    	answer = "Odd";
	    }
	    
	    return answer;
	}
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(3));
		System.out.println(sol.solution(4));

	}

}
