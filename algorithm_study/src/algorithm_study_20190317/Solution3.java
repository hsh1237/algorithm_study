package algorithm_study_20190317;

import java.util.ArrayList;
import java.util.HashMap;


//구명보트
public class Solution3 {
	
	public int solution(int[] people, int limit) {
        int answer = 0;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
 /*       for(int i=0;i<people.length;i++) {
        	
        	for(int j=0;j<people.length;j++) {
        		
        		
        	}
        }
        */
        
        for(int i=0;i<people.length;i++) {
        	
        	for(int j=i+1;j<people.length;j++) {
        		if(people[i] != 0) {
        			if(people[i] + people[j] <= 100) { 
        				list.add(people[i] + people[j]);
        				people[j] = 0;
        				break;
        			}else {
        				list.add(people[i]);
        			}	
        		}
        	}
        }
        
        for(int a : list) {
        	System.out.println(a);
        }
        answer = list.size();
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		//2명
		//(20, 30, 60, 70)
		
		System.out.println(sol.solution(new int[] {70, 50, 80, 50}, 100));
		//System.out.println(sol.solution(new int[] {70, 80, 50}, 100));
		

	}

}
