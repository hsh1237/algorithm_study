package algorithm_study_20190421;

import java.util.HashMap;

//폰켓몬
public class Solution3 {
	public int solution(int[] nums) {
        int answer = 0;
        //HASHSET을 이용하자.
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        
        for(int num : nums) {
        	
        	if(hash.get(num) != null) {
        		hash.put(num, 1);
        	}else {        		
        		hash.put(num, hash.get(num));
        	}
        }

        if(hash.size() > nums.length/2) {
        	answer = nums.length/2;
        }else {
        	answer = hash.size();
        }

        return answer;
    }
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		Solution3 sol = new Solution3();
		
		System.out.println(sol.solution(nums));

	}

}
