package algorithm_study_20190202;

//5. 핸드폰 번호 가리기
public class Solution5 {
	
	public String solution(String phone_number) {
	      String answer = "";
	      
	      answer = phone_number.replace(phone_number.substring(0, phone_number.length()-4), replace(phone_number.substring(0, phone_number.length()-4).length()));
	      
	      return answer;
	}
	
	public String replace(int lenth) {
		String result = "";
		for(int i = 0; i<lenth;i++) {
			result += "*";
		}
		return result;
	}

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		
		System.out.println(sol.solution("0103333 4444"));

	}

}
