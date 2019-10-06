package algorithm_study_20190512;
//N개의 최소 공배수
public class Solution3 {

	
	//최대 공약수
	public int getGcd(int a, int b) {
		
		int temp = 0;
		
 		while(b !=0) {
			temp = b;
			b = a % b;
			a =temp;
			//System.out.println("temp :" + temp);
			//System.out.println("b :" + b);
			//System.out.println("a :" + a);
		}
		
		return a;
		
	}
	
	//최소 공배수
	public int getLcm(int a, int b) {
		if ( a <= 0 || b <= 0) {
			return -1;
		}
		return a*b / getGcd(a,b);
	}
	
	public int solution(int[] arr) {
		
		int answer = 0;
	    int num = arr[0];
	    
		for(int i=0; i<arr.length-1;i++) {
			num = getLcm(num,arr[i+1]);
		}
		answer = num;
	    return answer;
	}
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
		int[] arr = {2,6,8,14};
		
		System.out.println(sol.solution(arr));

	}

}
