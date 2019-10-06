package algorithm_study_20190512;
//행렬의 곱셈
//answer[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + … + A[i][k]*B[k][j]
public class Solution1 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		
		int[][] answer = new int[arr1.length][arr2[0].length];
		
        for (int i = 0; i < answer.length; i++) {
        	
            for (int j = 0; j < answer[0].length; j++) {
            	
                for (int k = 0; k < arr1[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                    
                    System.out.println("(" + i + " , " + j + ") = " + arr1[i][k] + " * " + arr2[k][j]);
                    System.out.println(answer[i][j]);
                }
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		
		Solution1 sol = new Solution1();
		
		int[][] result = sol.solution(arr1, arr2);
		System.out.print("[");
		for(int i=0;i<result.length;i++) {
			
			System.out.print("[");
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j] + ",");
			}
			
			System.out.print("]");
			System.out.print(",");
			
		}
		System.out.print("]");

	}

}
