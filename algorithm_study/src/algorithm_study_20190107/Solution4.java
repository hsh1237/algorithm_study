package algorithm_study_20190107;

public class Solution4 {

	
	 boolean solution(String s) {
	        boolean answer = true;

	        s = s.toUpperCase();
	        int p = 0;
	        int y = 0;
	        
	        for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i) == 'P') {
	        		p++;
	        	}else if(s.charAt(i) == 'Y') {
	        		y++;
	        	}
	        }
	        
	        if(p != y) {
	        	answer = false;
	        }
	        
	        //s = s.toUpperCase();
	        //return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	        return answer;
	    }
	 
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		System.out.println(sol.solution("pPoooyY"));
		System.out.println(sol.solution("Pyy"));

	}

}
