package algorithm_study_20190428;

//피보나치 수
public class Solution4 {
	
	public int Fibonacci(int n) {
		if(n <= 1) {
			return n;
		}else {			
			return Fibonacci(n-1) +  Fibonacci(n-2);
		}
	}
	
	public int dynamicFibonacci(int n) {
    
		int[] nums = new int[n+1];
		
		nums[1] = 1;
		nums[2] = 1;
  
		
        if(n <= 2) {
        	return 1;        	
        }
   
        for(int i=3; i <=n; i++) {
        	nums[i] = (nums[i-1] + nums[i-2]) % 1234567;
        	System.out.println(nums[n]);
        }
        return nums[n];
    }
	
	public int solution(int n) {
		int answer = 0;
	   
	    answer = dynamicFibonacci(n);
	  
	    return answer;
	}
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		System.out.println(sol.solution(3));

	}

}
