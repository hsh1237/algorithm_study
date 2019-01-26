package algorithm_study_20190127;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

//2. 정수 내림차순으로 배치하기
public class Solution2 {

	public long solution(long n) {
	      long answer = 0;
	      String str = "";
	      
	      String[] arr = String.valueOf(n).split("");
	      Stream<String> stream = Arrays.stream(arr);
	      
	      Object[] result = stream.sorted(Comparator.reverseOrder()).toArray(); 
	      
	      for(Object a : result) {
		    	 str += a.toString();
		  }
	      answer = Long.parseLong(str);
	      return answer;
	}
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(118372));

	}

}
