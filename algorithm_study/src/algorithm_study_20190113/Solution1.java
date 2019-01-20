package algorithm_study_20190113;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

//문자열 내림차순으로 배치하기
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
	     
	     
	     //char[] sol = str.toCharArray();
	     //Arrays.sort(sol);
	     //return new StringBuilder(new String(sol)).reverse().toString();
	}
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		System.out.println(sol.solution("Zbcdefg"));

	}

}
