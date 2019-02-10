package algorithm_study_20190202;

//3. 평균 구하기
public class Solution3 {
	public double solution(int[] arr) {   
	      double sum=0;
	      for (int num : arr) {
	          sum+=num;
	      }
	      return sum/arr.length;
	}
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] arr = {1,2,3,4};
		System.out.println(sol.solution(arr));

	}

}
