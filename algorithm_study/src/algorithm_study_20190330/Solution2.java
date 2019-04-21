package algorithm_study_20190330;
//라면 공장
public class Solution2 {
	
	public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        
        for(int i=1; i<=dates.length;i++) {
        	
        	stock += supplies[i-1];
        	
        	System.out.println("k :"+ k + " / stock : " + stock);
        	if(stock > k) {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		//int[] dates = {1,2,3,4};
		int[] dates = {4,10,15};
		//int[] supplies = {10,40,30,20};
		int[] supplies = {20,5,10};
		
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(4, dates, supplies, 30));

	}

}
