package algorithm_study_20190119;

//이상한 문자 만들기
public class Solution4 {
	
	public String solution(String s) {
	     String answer = "";
	      
	     String[] arr = s.split(" ");
	     
	     for(int i=0; i<arr.length; i++) {
	    	 for(int j=0; j<arr[i].length();j++) {
	    		 if(j % 2 == 0)  {
	    			 answer += String.valueOf(arr[i].charAt(j)).toUpperCase();
	    		 } else if(j % 2 == 1){
	    			 answer += String.valueOf(arr[i].charAt(j)).toLowerCase();
	    		 }
	    	 }
	    	 if(i!=arr.length-1) {	    		 
	    		 answer += " ";
	    	 }
	     }
	     int cnt = s.length() - answer.length();
	     for(int i=0; i<cnt;i++) {
	    	 answer+=" ";
	     }
	      
	      return answer;
	}
	
	public static void main(String[] args) {
		
		Solution4 sol = new Solution4();
		System.out.println(sol.solution("try hello world"));


	}

}
