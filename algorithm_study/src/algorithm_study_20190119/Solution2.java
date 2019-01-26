package algorithm_study_20190119;

//시저암호
public class Solution2 {
	
	public String solution(String s, int n) {
		String answer = "";
      
		n = n%26;
        System.out.println(n);
        for(int i=0; i<s.length(); i++) {
        	
            char ch = s.charAt(i);
            
            if(Character.isLowerCase(ch)) {           
                ch = (char) ((ch-'a'+n) % 26 +'a');                 
            }else if(Character.isUpperCase(ch)) {
                ch = (char) ((ch-'A'+n) % 26 +'A');
                 
            }
            answer += ch;
             
        }
      
		return answer;
	}
	

	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution("AB", 1));
		System.out.println(sol.solution("z", 1));
		System.out.println(sol.solution("a B z", 4));


	}

}
