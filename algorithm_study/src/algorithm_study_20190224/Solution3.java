package algorithm_study_20190224;

import java.util.ArrayList;
import java.util.Collections;

//큰수 만들기
public class Solution3 {

	ArrayList<Long> result = new ArrayList<Long>();
	public void doCombination(String[] combArr, int n, int r, int index, int target, String[] arr){
	
        if(r == 0){
            String value = "";
            for(int i=0; i<index; i++) {
            	value += arr[Integer.parseInt(combArr[i])];
            	System.out.print(arr[Integer.parseInt(combArr[i])]);
         
            }
           result.add(Long.parseLong(value));
           System.out.println();

        }else if(target == n){          
        	return;
        }else{
            combArr[index] = String.valueOf(target);   
            //뽑는경우
            doCombination(combArr, n, r-1, index+1, target+1, arr);
            
            //안뽑는경우
            doCombination(combArr, n, r, index, target+1, arr); 
        }
    }
	
	public String solution(String number, int k) {
		String answer = "";
		
		String[] arr = number.split("");
		// 1 9 2 4
		int n = arr.length;
		int r = n-k;
		String[] combArr = new String[n];
		doCombination(combArr, n, r, 0, 0, arr);
		//System.out.println("result size :" + result.size());
		
		Collections.sort(result);
		//Collections.reverse(result);
		
		answer = result.get(result.size()-1).toString();
		//System.out.println("answer : " + answer);
        return answer;
    }
	public static void main(String[] args) {
		
		Solution3 sol = new Solution3();
		
		System.out.println("정답 : " + sol.solution("1924", 2));
		//System.out.println("정답 : " + sol.solution("98724212", 4));
		//System.out.println(sol.solution("123456345345345345", 3));
		//System.out.println(sol.solution("4177252841", 4));

	}

}
