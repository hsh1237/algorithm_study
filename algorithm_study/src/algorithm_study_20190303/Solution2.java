package algorithm_study_20190303;

import java.util.ArrayList;
import java.util.Collections;

//가장 큰 수

//순열은 효율성 FAIL
public class Solution2 {
	static ArrayList<String> list = new ArrayList<String>();
	public String solution(int[] numbers) {
        String answer = "";
      
        doPermutation(numbers,0);
        Collections.sort(list);
        answer  = list.get(list.size()-1);
        
        return answer;
    }

	 public void doPermutation(int[] arr, int startIdx){
	 	String str = "";
        int length = arr.length;
        if(startIdx == length-1){
            for(int n: arr) {
            	str += n;
            	//System.out.print(n + " ");
            }
            list.add(str);
            System.out.println("str : " + str);
            System.out.println();
            return;
        }

        for(int i=startIdx; i<length; i++){
            swap(arr, startIdx, i);
            doPermutation(arr, startIdx+1);
            swap(arr, startIdx, i);
        }
    }

    public void swap(int[] arr, int n1, int n2){
	        int temp = arr[n1];
	        arr[n1] = arr[n2];
	        arr[n2] = temp;
    }
	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();

		//System.out.println(sol.solution(new int[] {6,10,2}));
		System.out.println(sol.solution(new int[] {3,30,34,5,9}));
		
		

	}

}
