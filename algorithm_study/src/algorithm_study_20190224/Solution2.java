package algorithm_study_20190224;

import java.util.Arrays;

//더 맵게
public class Solution2 {
	
	boolean overScoville(int[] arr, int k) {	
		for(int a : arr) {
			if(k >= a) {
				return false;
			}
		}
		return true;
	}
	//{1, 2, 3, 9, 10, 12};
	public int[] newScovilleArr(int[] scoville) {
		//범위 수정
		if(scoville.length >= 2) {			
			Arrays.sort(scoville);
			int sum = scoville[0] + (scoville[1] * 2);
			
			//sum 값이 K보다 큰지 확인.
			
			
			int[] result = new int[scoville.length-1];
			
			result[0] = sum;
			
			for(int i=1;i < scoville.length-1;i++) {
				result[i] = scoville[i+1];	
			}
			
			
			for(int a: result) {
				System.out.println(a);
			}
			return result;
		}
		return new int[] {-1};
		
	}
	
	public int solution(int[] scoville, int K) {
		
		//answer = 0
		//처리 후 판별
		
		int answer = 1;
		//newScovilleArr(scoville);
		boolean is = false;
		
		int[] arr = newScovilleArr(scoville);
		
		for(int i=0; i < scoville.length;i++) {
			System.out.println("-------" + i + "-------");
			arr = newScovilleArr(arr);
			is = overScoville(arr, K);
			answer++;
			if(is) {
				break;
			}
		}
		
		if(!is) {
			return -1;
		}
		//System.out.println(is);

		
		
	/*	for(int a: arr) {
			System.out.println(a);
		}*/
		
		
		
        return answer;
    }

	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		int[] scoville =  {1, 2, 3, 9, 10, 12};
		System.out.println(" 결과 : " + sol.solution(scoville, 7));

	}

}
