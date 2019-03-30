package algorithm_study_20190217;

import java.util.LinkedList;
import java.util.Queue;

//기능개발
public class Solution2 {
	
	public int[] solution(int[] progresses, int[] speeds) {
		
		//완료 작업 큐
		Queue<Integer> progressesQueue = new LinkedList<Integer>();
	      
        int completion = 0;
        
        for(int i = 0; i <= progresses.length; i++){
        	System.out.println("i : " + i);
        	
        	//마지막
            if(i == progresses.length){
            	System.out.println("last : " + completion);
            	progressesQueue.add(completion);
                break;
            }
            
            if(progresses[i] >= 100){
            	completion++;
                continue;
            }
            
            if(completion != 0){
            	System.out.println("completion : " + completion);
            	progressesQueue.add(completion);
            }
            completion = 0;
            
            
            //진행률
            int progress = 100 - progresses[i];
            //소요 날짜
            int spendDay = progress / speeds[i];
            
            //다음날 완료
            if(progress % speeds[i] != 0){
            	spendDay++;
            }
           
            //작업 갱신
            for(int j = i; j < progresses.length; j++){
                progresses[j] += (spendDay * speeds[j]);
                System.out.println(progresses[j]);
            }
            completion++;
          
        }

        System.out.println("size : " + progressesQueue.size());
        int[] answer = new int[progressesQueue.size()];
   
        for(int i = 0; i < answer.length; i++){
            answer[i] = progressesQueue.poll();
        }
        return answer;
    }
	
	

	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		
		int[] result = sol.solution(progresses, speeds);
		
		for(int a : result) {
			System.out.println(a);
		}

	}

}
