package algorithm_study_20190303;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//h-index
public class Solution3 {

	public int solution(int[] citations) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(citations);
        
        for(int a : citations) {
        	list.add(a);
        }
        
        Collections.reverse(list);
        

       //6 5 3 0 1
       for(int i=0;i<list.size();i++) {
    	    System.out.println( i + " : " + list.get(i));
    	    //i+1 = 인용횟수
 
        	if(list.get(i) < i+1) {
        		return i;
        	}
       }
        
       
       /* Arrays.sort(citations);
       
       // System.out.println(citations.length);
        
        
        for(int a : citations) {
        	System.out.println(a);
        }
       
        if(citations.length%2 == 0) {
        	answer = citations[(citations.length/2)+1];	
        }else {        	
        	answer = citations[citations.length/2];
        }*/
       
        
        answer = citations.length;
        return answer;
    }
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
		System.out.println(sol.solution(new int[] {3,0,6,1,5}));
		//System.out.println(sol.solution(new int[] {1,2,3,0,3}));
		//System.out.println(sol.solution(new int[] {1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10}));
		

	}

}
