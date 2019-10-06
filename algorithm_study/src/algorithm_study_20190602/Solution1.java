package algorithm_study_20190602;
//소수만들기
public class Solution1 {
	
	static int check = 0;
	
	public boolean isPrimeNum(int result, int length) {
		System.out.println("result : " + result);
		for(int i=2;i<result;i++) {
			if(result % i == 0) {
				
				return false;
			}
		}
		
		return true;
	}
	
	public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
		int result = 0;
        if(r == 0){
            for(int i=0; i<index; i++) {
            	result += arr[combArr[i]];
            	System.out.print(arr[combArr[i]] + " ");
            }
            System.out.println();
           
            if(isPrimeNum(result, index)) {
            	check++;
            }
        }else if(target == n) {
        	return;
        }else{
            combArr[index] = target;
            doCombination(combArr, n, r-1, index+1, target+1, arr);
            doCombination(combArr, n, r, index, target+1, arr);
        }
    }

	public int solution(int[] nums) {
        int answer = -1;
        int[] combArr = new int[nums.length];
        doCombination(combArr,nums.length,3,0,0,nums);
     
        
        answer = check;
        return answer;
    }
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		int[] nums = new int[] {1,2,3,4};
		//int[] nums = new int[] {1,2,7,6,4};
		
		System.out.println(sol.solution(nums));
		//System.out.println("check : " + check);
	}

}
