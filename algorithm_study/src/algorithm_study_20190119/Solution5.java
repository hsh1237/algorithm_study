package algorithm_study_20190119;

//자릿수 더하기
public class Solution5 {

	public int solution(int n) {
        int answer = 0;
        String[] arr = String.valueOf(n).split("");
        
        for(String s : arr) {
        	answer += Integer.parseInt(s);
        }
              
        /*while ( n!=0 ) {
        	answer += n % 10;
        	n /= 10;
        }*/
        return answer;
    }
	
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		
		System.out.println(sol.solution(123));
		System.out.println(sol.solution(987));
	}
	
}
