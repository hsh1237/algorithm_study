package algorithm_study_20190303;

import java.util.ArrayList;

//소수 찾기
public class Solution1 {
	static ArrayList<String> list = new ArrayList<String>();
	public int solution(String numbers) {
        int answer = 0;
        
        String[] strArr =numbers.split("");
        int[] arr = new int[strArr.length];
        
        for(int i=0;i<strArr.length;i++) {
        	arr[i] = Integer.parseInt(strArr[i]);
        }
        doPermutation(arr,0);
        
        
        for(String a : list) {
        	System.out.println(a);
        }
        
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
            //System.out.println("str : " + str);
            //System.out.println();
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
		Solution1 sol = new Solution1();
		sol.solution("17");

	}

}
