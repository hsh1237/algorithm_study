package algorithm_study_20190217;

import java.util.Stack;

//탑
public class Solution1 {
	
	public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
  
        Stack<Integer> result = new Stack<Integer>();
        
        int cnt = 2;
        boolean isT = false;
        
        for(int i=heights.length-1; i >= 0;i--) {
        	//System.out.println("비교 : " + heights[i]);
        	isT = false;	
        	for(int j=heights.length-cnt;j >= 0;j--) {
        		//System.out.println("비교  j: " + heights[j]);
        		if(heights[j] > heights[i]) {
        			answer[i] = heights[j];
        			//System.out.println(heights[j]);
        			//System.out.println(j+1);
        			result.push(j+1);
        			isT = true;
        			break;
        		}
        	}
        	if(isT == false) {
        		//System.out.println(0);
        		result.push(0);
        	}
        	cnt++;
        }
        System.out.println("SIZE : " + result.size());
      
        int loop = result.size();
        
        for(int i=0; i < loop ; i++) {
        	answer[i] = result.pop();
        }
        
        return answer;
    }


	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		int[] heights = new int[] {6,9,5,7,4};
		//int[] heights = new int[] {3,9,9,3,5,7,2};
		//int[] heights = new int[] {1,5,3,6,7,6,5};
		
		int[] result = sol.solution(heights);
		
		for(int a : result) {
			System.out.println(a);
		}

	}

}
