package algorithm_study_20190107;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
	
	public int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      
	      ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%divisor == 0) {
					list.add(arr[i]);
				}
			}
			
			if(list.size() > 0) {
				answer = new int[list.size()];
				
				for(int i=0;i<list.size();i++) {
					answer[i] = (int) list.get(i);
				}
				Arrays.sort(answer);
				
			}else{
				answer = new int[1];
				answer[0] = -1;
			}

	      return answer;
	  }

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		//int[] arr = {5,9,7,10};
		//int[] arr = {2,36,1,3};
		int[] arr = {3,2,6};
		int[] result = sol.solution(arr, 10);
		
		for(int a : result) {
			System.out.println(a);
		}
		

	}

}
