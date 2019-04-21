package algorithm_study_20190330;

//카펫
public class Solution1 {
	
	public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        
        int total = brown + red;

        for(int i=3; i <= total ; i++) {
        	//System.out.println(i + " : " + total / i);
        	if(total % i == 0) {
        		if((i-2)*((total/i)-2) == red) {        		
    				System.out.println(i + " : " + total / i);
    				answer[1] = i;
    				answer[0] = total/i;      
    				
    				break;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		
		int[] result = sol.solution(10, 2);
		
		for(int a : result) {
			System.out.println(a);
		}

	}

}
