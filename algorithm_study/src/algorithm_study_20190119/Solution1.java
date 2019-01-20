package algorithm_study_20190119;

//문자열을 정수로 바꾸기
public class Solution1 {

	
	public int solution(String s) {
	      
	      return Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		System.out.println(sol.solution("-1234"));
		System.out.println(sol.solution("1234"));

	}

}
