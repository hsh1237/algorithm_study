package algorithm_study_20190330;

import java.util.Stack;

//올바른 괄호
public class Solution3 {
	
	boolean solution(String s) {
        boolean answer = false;
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
       
        while(s.length()>0) {			
			if(!s.contains("()")) {
				answer = false;
				break;
			}
			s = s.replace("()", "");	
			//System.out.println(s);
			answer= true;
		}
		

        return answer;
    }
	
	public static void main(String[] args) {

		Solution3 sol =  new Solution3();
		System.out.println(sol.solution("()()"));
		System.out.println(sol.solution("(())()"));
		System.out.println(sol.solution(")()("));
		System.out.println(sol.solution("(()("));
		

	}
}
