package algorithm_study_20190127;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4. 제일 작은 수 제거하기
public class Solution4 {
	public int[] solution(int[] arr) {
	     int[] answer = {};
	     List<Integer> list = new ArrayList<Integer>();
	     int[] copy = Arrays.copyOf(arr, arr.length);
	     
	     
	     Arrays.sort(copy);
	     int num = copy[0];
	     
	     for(int n : arr) {
	    	 if(n != num) {
	    		 list.add(n);
	    	 }
	     }
	     
	     if(list.isEmpty()) {
	    	 list.add(-1);
	     }
	     
	     answer = new int[list.size()];
	     for(int i=0; i<answer.length;i++) {
	    	 answer[i] = list.get(i);
	     }
	     
	     return answer;
	}
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		//int[] arr = {4,3,2,1};
		int[] arr = {10};
		int[] result = sol.solution(arr);
		for(int a : result) {
			System.out.println(a);			
		}
		
		

	}

}
