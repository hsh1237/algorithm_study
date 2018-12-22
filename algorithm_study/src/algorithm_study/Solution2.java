package algorithm_study;

//모의고사
public class Solution2 {
	
	public int[] solution(int[] answers) {
	      int[] answer = {};
	        
	      int[] std1 = {1,2,3,4,5};
	      int[] std2 = {2,1,2,3,2,4,2,5};
	      int[] std3 = {3,3,1,1,2,2,4,4,5,5};
	        
	      Integer std1Score = 0;
	      Integer std2Score = 0;
	      Integer std3Score = 0;

	        for(int i=0;i<answers.length;i++) {
	        	
	        	if(std1[i%5] == answers[i]) { // 5개마다		
	        		std1Score += 1;
	        	}        		
	        	
	           	if(std2[i%8] == answers[i]) { // 8개마다
	        		std2Score += 1;
	        	}
	           	
	           	if(std3[i%10] == answers[i]) { // 10개마다
	        		std3Score += 1;
	        	}
	        }
	        
	        //0 이면 제외
	        int cnt = 0;
	       	if(std1Score > 0) {
	       		cnt++;
	       	}
	       	if(std2Score > 0) {
	       		cnt++;
	       	}
	       	if(std3Score > 0) {
	       		cnt++;
	       	}
	       	answer = new int[cnt];
	        
	        if(std1Score > std2Score && std1Score > std3Score) { 
	        	answer[0] = 1;
	        	if(std2Score > std3Score) {   
	        		answer[1] = 2;
	        		if(std3Score != 0) {        			
	        			answer[2] = 3;
	        		}
	        	}else if(std3Score > std2Score){
	        		       			
	        		answer[1] = 3;
	        		if (std2Score != 0) {         			
	        			answer[2] = 2;
	        		}
	        	}else if(std3Score != 0 && std2Score !=0 && std3Score==std2Score){
	        		answer[1] = 2;
	        		answer[2] = 3;
	        	}
	        }else if (std2Score > std3Score && std2Score > std1Score) {
	        	answer[0] = 2;
	        	if(std3Score > std1Score) {
	        		
	        		answer[1] = 3;
	        		if(std1Score != 0) {        			
	        			answer[2] = 1;
	        		}
	        	}else if(std1Score > std3Score){
	        		answer[1] = 1;
	        		if(std3Score != 0) {        			
	        			answer[2] = 3;
	        		}
	        	}else if(std1Score != 0 && std3Score !=0 && std1Score==std3Score) {
	        		answer[1] = 2;
	        		answer[2] = 3;
	        	}
	        }else if (std3Score > std2Score && std3Score > std1Score) {
	        	answer[0] = 3;
	        	if(std2Score > std1Score) {
	        		answer[1] = 2;
	        		if(std1Score != 0) {
	        			answer[2] = 1;        			
	        		}
	        	}else if(std1Score > std2Score) {
	        		answer[1] = 1;
	        		if(std2Score != 0) {
	        			answer[2] = 2;        			
	        		}
	        	}else if(std1Score != 0 && std2Score !=0 && std1Score==std2Score) {
	        		answer[1] = 2;
	        		answer[2] = 3;
	        	}
	        }else {
	        	answer[0] = 1;
	        	answer[1] = 2;
	        	answer[2] = 3;
	        }
	        
	        System.out.println("std1Score : " + std1Score);
	        System.out.println("std2Score : " + std2Score);
	        System.out.println("std3Score : " + std3Score);
	        return answer;
	    }

	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		
		//int[] answers = {1,2,3,4,5};
		int[] answers = {1,3,2,4,2};
		
		int[] result = sol.solution(answers);
		
		for(int i : result) {
			System.out.println(i);
		}

	}

}
