package algorithm_study_20190303;

import java.util.ArrayList;

public class test {

	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		int[] arr = {6,10,2};
		test ex = new test();
		ex.doPermutation(arr, 0);
		
		for(int a : list) {
			System.out.println("list : " + a);
		}
	}
	
	 public void doPermutation(int[] arr, int startIdx){
		 	String str = "";
	        int length = arr.length;
	        if(startIdx == length-1){
	            for(int n: arr) {
	            	str += n;
	            	System.out.print(n + " ");
	            }
	            list.add(Integer.parseInt(str));
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

}
