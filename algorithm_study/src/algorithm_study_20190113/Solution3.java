package algorithm_study_20190113;


//서울에서 김서방 찾기
public class Solution3 {
	
	public String solution(String[] seoul) {
	    String answer = "";
	      
	    for(int i=0;i<seoul.length;i++){
	      if(seoul[i].equals("Kim")) {
	        answer = "김서방은 " + i + "에 있다";
	        break;
	      }
	    }
	    return answer;
	    
	    //return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String[] seoul = {"Jane","Kim"};
		
		System.out.println(sol.solution(seoul));

	}

}
