package algorithm_study_20190107;

import java.util.Arrays;

public class Solution3 {
	
	 public String[] solution(String[] strings, int n) {
		 
	    String[] answer = {};
	    Arrays.sort(strings);
		
		String temp = "";
			
		for(int i=0; i<strings.length;i++){
			for(int j=0; j<strings.length-1;j++) {
				if(strings[j].charAt(n) > strings[j+1].charAt(n)) {
					temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;
				}
			}
		}		
		answer = strings;
	    return answer;
	  }

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
		//String[] strings = {"sun", "bed", "car"};
		String[] strings = {"abce", "abcd", "cdx"};
		
		
		String[] result = sol.solution(strings, 2);
		
		for(String a : result) {
			System.out.println(a);
		}

	}

}
