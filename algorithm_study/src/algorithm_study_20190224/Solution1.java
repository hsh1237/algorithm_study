package algorithm_study_20190224;

import java.util.ArrayList;

public class Solution1 {

	public int solution(String arrangement) {
        int answer = 0;
        
        arrangement = arrangement.replace("()", "!");
        System.out.println(arrangement);
        
        // ! ((( ! ! ) ( ! ) ! )) ( ! )
        
        ArrayList<Character> stack = new ArrayList<Character>();
        ArrayList<Character> arrangementList = new ArrayList<Character>();
        
        for(int i = 0; i < arrangement.length(); i++){
        	arrangementList.add(arrangement.charAt(i));
        }
        
        
        for(int i = 0; i < arrangementList.size(); i++){
        	
            if(arrangementList.get(i) == '('){          	
                stack.add(arrangementList.get(i));
            }else if(arrangementList.get(i) == ')'){
            	answer ++;            	
                stack.remove(stack.size()-1); 
                
            }else if(arrangementList.get(i) == '!'){
            	
                answer += stack.size();
                
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		
		System.out.println(sol.solution("()(((()())(())()))(())"));

	}

}
