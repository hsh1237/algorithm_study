package algorithm_study_20190317;

import java.util.Arrays;

//전화 번호 목록
public class Solution1 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        String str = phone_book[0];
        phone_book[0] ="";
        
        for(String a: phone_book) {
        	if(a.contains(str)) {
        		System.out.println(a);
        		answer = false;
        		break;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		System.out.println(sol.solution(new String[] {"119", "97674223", "1195524421"}));
		System.out.println(sol.solution(new String[] {"123","456","789"}));
		System.out.println(sol.solution(new String[] {"12","123","1235","567","88"}));
	}

}
