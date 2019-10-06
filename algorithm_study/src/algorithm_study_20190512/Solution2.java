package algorithm_study_20190512;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//JadenCase 문자열 만들기
public class Solution2 {
	
	//영문자 확인
	static Pattern pattern = Pattern.compile("(^[a-z]*$)"); 
	
	public String solution(String s) {
	      String answer = "";
	      Matcher matcher;
	      
	      //맨 뒤 " " 을위해 split의 limit은 글자 갯수만큼
	      String[] arr = s.toLowerCase().split(" ",s.length());
	      //System.out.println("arr length : " + arr.length);
	   
	      for(String str : arr) {
	    	  matcher = pattern.matcher(str);
	    	  if(str.length()>0) {	    		  
	    		  if(matcher.matches()) {
	    			  str = str.substring(0,1).toUpperCase() + str.substring(1);
	    			  answer += str + " ";	    	  
	    		  }else {
	    			  answer += str + " ";
	    		  }
	    	  }else {
	    		  answer += str + " ";
	    	  }
	      }
	
	      //일반적인 split의 경우 맨 뒤 " "은 무시되므로 추가 조건문 작성
	      /*if(s.lastIndexOf(" ") == s.length()-1) {
	    	  return answer.substring(0,answer.length());
	      }*/
	      return answer.substring(0,answer.length()-1);
	}
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution("624Dor  the  last   week "));
		

	}

}
