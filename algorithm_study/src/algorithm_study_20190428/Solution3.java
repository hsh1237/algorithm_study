package algorithm_study_20190428;

import java.util.Arrays;

//최솟값 만들기
public class Solution3 {
	
	public int solution(int []A, int []B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length;i++) {
        	//System.out.println(i + " : " + ((A.length-1)-i));
        	answer += A[i] * B[(A.length-1)-i];
        	
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		
		int []A = new int[] {1,4,2};
		int []B = new int[] {5,4,4};
		
		Solution3 sol = new Solution3();
		
		System.out.println(sol.solution(A, B));
		
	}

}
