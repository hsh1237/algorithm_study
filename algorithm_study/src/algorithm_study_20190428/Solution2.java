package algorithm_study_20190428;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {
	public String solution(String s) {
	      String answer = "";
	      
	      String[] arr = s.split(" ");
	      
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      
	      for(String a : arr) {
	    	  list.add(Integer.parseInt(a));
	      }
	      
	      Collections.sort(list);
	      
	      
	      
	      //Arrays.sort(arr);
	      answer = list.get(0) + " " + list.get(list.size()-1);
	      return answer;
	  }
	
	
	public static void main(String[] args) {

		String s = "-1 -2 -3 -4";	
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(s));
 
	}

}
