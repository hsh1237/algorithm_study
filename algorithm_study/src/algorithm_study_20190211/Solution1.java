package algorithm_study_20190211;

//행렬의 덧셈
public class Solution1 {
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
	      int[][] answer = new int[arr1.length][arr1[0].length];
      
	      for(int i=0;i<arr1.length;i++) {
	    	  for(int j=0;j<arr1[i].length;j++) {
	    		  answer[i][j] = arr1[i][j] + arr2[i][j];
	    		  System.out.println(answer[i][j]);
	    	  }
	      }
	      

	      return answer;
	}

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		sol.solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}});
		
		
		
		//sol.solution(new int[][] {{1},{2}}, new int[][] {{3},{4}});
		
		

		
	}

}
