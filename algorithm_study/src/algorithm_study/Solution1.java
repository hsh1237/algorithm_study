package algorithm_study;

import java.util.HashMap;

//완주하지 못한 선수
public class Solution1 {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
     
     HashMap<String, Integer> map = new  HashMap<String, Integer>();
     
     for (String str : completion) {
     	if(!map.containsKey(str)) {
     		map.put(str, 1);
     	} else {
     		map.put(str, map.get(str)+1);
     	}
	}

     for (String str2 : participant) {
		if(!map.containsKey(str2)) {		
			return str2;

		} else {
			if(map.get(str2) == 0) {
				return str2;
				
			} else {
				map.put(str2, map.get(str2)-1);
			}
		}
	}
     
     return answer;
 }

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		String[] participant =  {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String result = sol.solution(participant, completion);
		
		System.out.println(result);

		
	}

}
