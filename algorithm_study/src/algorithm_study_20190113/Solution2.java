package algorithm_study_20190113;

//문자열 다루기 기본
public class Solution2 {

	public boolean solution(String s) {
      //boolean answer = true;
		
      if(s.length() == 4 || s.length() == 6) {
          return s.matches("^[0-9]*$"); 
      }else{
          return false;  
      }
  
      //return answer;
	}
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.solution("a234"));
		System.out.println(sol.solution("1234"));
		System.out.println(sol.solution("123b"));
	}

}
