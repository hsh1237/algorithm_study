package algorithm_study_20190113;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Solution1 {

	public String solution(String s) {
	     String answer = "";

	    
	     String[] arr = s.split("");	
	     Stream<String> strStreamArr = Arrays.stream(arr);
	     Object[] result = strStreamArr.sorted(Comparator.reverseOrder()).toArray(); 
	     for(Object a : result) {
	    	 answer += a.toString();
	     }
	     
	     
	     
	     return answer;
	}
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		System.out.println(sol.solution("Zbcdefg"));

	}

}
