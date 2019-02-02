package algorithm_study_20190127;

//1. 자연수 뒤집어 배열로만들기
public class Solution1 {


	public int[] solution(long n) {
	    
	    String[] arr = String.valueOf(n).split("");
	    
	    int[] answer = new int[arr.length];
	    
	    int lastNum = arr.length;
	    
	    for(int i=0; i<arr.length;i++) {
	    	answer[i] = Integer.parseInt(arr[lastNum-1]);
	    	System.out.println(answer[i]);
	    	lastNum--;
	    }
	    
	    
	    return answer;
	}
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(12345));

	}

}
