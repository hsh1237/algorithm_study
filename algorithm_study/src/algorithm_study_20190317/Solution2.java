package algorithm_study_20190317;

import java.util.HashMap;

//위장
public class Solution2 {

	public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,String> hash = new HashMap<String,String>();
       // String temp = "";
        for(int i=0;i<clothes.length;i++) {
        	for(int j=0;j<1;j++) {
        		if(hash.get(clothes[i][1]) == null) {
        			//System.out.println(clothes[i][1]);
        			hash.put(clothes[i][1], clothes[i][0]);
        		}else {
        			//String temp = hash.get(clothes[i][1]) + "," + clothes[i][0];
        			hash.put(clothes[i][1], hash.get(clothes[i][1]) + "," + clothes[i][0]);
        		}
        	}
        }
        
        for(String a : hash.keySet()) {
        	System.out.println(a);
        	String[] arr = hash.get(a).split(",");
        	
        	answer *= arr.length+1;
        	
        	//System.out.println(answer);
        }
        
        for(String a : hash.keySet()) {
        	System.out.println(a + " : " + hash.get(a));
        }
        
        return answer-1;
    }
	
	public static void main(String[] args) {
		
		//String[][] clothes = {{"crow_mask", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		
		String[][] clothes = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
		
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(clothes));

	}

}
