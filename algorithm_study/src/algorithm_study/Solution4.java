package algorithm_study;

//��� ���� ã��
public class Solution4 {
	
	 public String solution(String s) {
	      String answer = "";
	        if(s.length() % 2 == 0) {
	         	 answer = s.substring((s.length()/2)-1,(s.length()/2)+1);
	        }else{
	        	 answer = s.substring((s.length()/2),(s.length()/2)+1);
	        }
	      return answer;
	      
	      //���� �ڵ�
	      //return s.substring((s.length()-1) / 2, s.length()/2 + 1);    
	  }

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		String s = "abcde";
		//String s = "qwer";
		
		String result = sol.solution(s);
		
		System.out.println(result);

	}

}
