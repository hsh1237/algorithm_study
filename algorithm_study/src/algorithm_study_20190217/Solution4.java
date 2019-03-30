package algorithm_study_20190217;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//프린터
public class Solution4 {

	class printDoc {
		
		int priorities;
		int location;
		
		public printDoc(int priorities, int location) {
			this.priorities = priorities;
			this.location = location;
		}
		
	}
	
	public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<printDoc> printQueue = new LinkedList<printDoc>();
        
        for(int i = 0; i < priorities.length;i++) {
        	printQueue.add(new printDoc(priorities[i],i));
        }
        //수정해야함.
        int[] pri = priorities;
        Arrays.sort(pri);
        
        
        while(printQueue.isEmpty()) {
        	printDoc post = printQueue.poll();
        	Boolean isPrint = false;
        	
        	//int max= post.priorities;
        	
        	int max = pri[pri.length-1];
        	
        	/*for(int i=0 ; i < pri.length-i ; i--) {
        		if(post.priorities < pri[i]) {
        			max = pri[i];
        		}
        	}*/
        	
        	if(max == post.priorities) {
        		isPrint = true;
        		//pri[pri.length-1] = 0;
        		//max 값 삭제해야함
        		
    		}
        	
        	
        	
        	int printStart = post.priorities;        	
        	Object[] arr = printQueue.toArray();
        	
        	for(Object a : arr) {
        		if(printStart < (int) a) {
        			printQueue.add(post);
        		}else {
        			answer++;
        		}
        		break;
        	}

        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		
		Solution4 sol = new Solution4();
		//sol.solution(new int[] {2,1,3,2}, 2);
		System.out.println(sol.solution(new int[] {2,1,3,2}, 2));
		//System.out.println(sol.solution(new int[] {1,1,9,1,1,1}, 1));

	}

}
