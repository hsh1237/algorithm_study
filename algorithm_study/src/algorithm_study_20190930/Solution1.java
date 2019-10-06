package algorithm_study_20190930;


// 2xn 타일링
public class Solution1 {
	
	public int solution(int n) {
		
	      int answer = 0; 
	      int num1=0;
	      int num2=1;
	      for(int i=0; i<n;i++) {
	    	  answer = (num1 + num2) % 1000000007;
	    	  num1 = num2;
	    	  num2 = answer;
	      }
	      
	      //answer = fibo(n+1);
	      
	      return answer;
	      
	}
	
	public int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}else {
			return fibo(n-2) + fibo(n-1);
		}
	}
	
	
	public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
		int result = 0;
        if(r == 0){
            for(int i=0; i<index; i++) {
            	result += arr[combArr[i]];
            	System.out.print(arr[combArr[i]] + " ");
            }

        }else if(target == n) {
        	return;
        }else{
            combArr[index] = target;
            doCombination(combArr, n, r-1, index+1, target+1, arr);
            doCombination(combArr, n, r, index, target+1, arr);
        }
    }
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol = new Solution1();
		 System.out.println(sol.solution(123));

	}

}
