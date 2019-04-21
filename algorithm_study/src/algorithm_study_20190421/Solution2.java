package algorithm_study_20190421;

//땅따먹기
public class Solution2 {
	
	int solution(int[][] land) {
        int answer = 0;

        int max = 0;
        int[] point = new int[land.length];
        //point[i] = -1;
        point[0] = -1;

        for(int i=0; i<land.length;i++) {
        	max = 0;
        	System.out.println(i + " 행 시작");
        	for(int j=0; j<land[i].length;j++) {
        		System.out.println("check point : "+ point[i] + " / j : "+ j + " value : " + land[i][j]);
        		if(i == 0) {
        			if(land[i][j] > max && j != point[i]) {
            			max = land[i][j];
            			point[i] = j;
            		}else if(j == point[i]) {
            			System.out.println("skip");
            		}
        		}else {
        			if(land[i][j] > max && j != point[i-1]) {
            			max = land[i][j];
            			point[i] = j;
            		}else if(j == point[i]) {
            			System.out.println("skip");
            		}
        		}
        		
        		
        	}
        	answer += max;
        	System.out.println("point["+i+ "] : "+point[i]);
        	System.out.println("max : "+ max);
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int[][] land = {{9,8,7,6},{8,7,6,5},{9,8,7,6},{1000,1,2,3}};
		//int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(land));
	}

}
