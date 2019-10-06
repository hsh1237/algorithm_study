package algorithm_study_20191005;

import java.util.ArrayList;

//타일 장식물
public class Solution1 {

	public long solution(int N) {
        long answer = 0;
        
        ArrayList<Long> fiboList = new ArrayList<Long>();
        long sum = 0; 
        long num1=0;
        long num2=1;
	    
    	for(int i=0;i<N+3;i++) {
    		if(i == 0) {
    			fiboList.add((long) 1);
    		}else {    			
    			sum = (num1 + num2);
    			num1 = num2;
    			num2 = sum;
    			fiboList.add(sum);
    		}
    		//fiboList.add(fibo(i));
		}
        
    	answer = (fiboList.get(N-1) * 2) + ((fiboList.get(N-1) + fiboList.get(N-2))* 2);
        return answer;
    }
	
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		System.out.println(sol.solution(5));
		System.out.println(sol.solution(6));
		System.out.println(sol.solution(7));
		System.out.println(sol.solution(8));
		

	}
	
	public int fibo(int n) {
		if (n <= 1) {
			return n;
		}else {
            return fibo(n-2) + fibo(n-1);
		}
	}


}

