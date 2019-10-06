package algorithm_study_20191005;

//네트워크
public class Solution2 {

	//[
	// [1, 1, 0], 
	// [1, 1, 0], 
	// [0, 0, 1]
	//]
		
	//[
	// [1, 1, 0], 
	// [1, 1, 1], 
	// [0, 1, 1]
	// ]
	static boolean[] isNetwork;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        isNetwork = new boolean[n];
        
        for(int i=0; i<computers.length; i++) {       	
        	if(!isNetwork[i]) {
        		answer++;
        		dfs(computers,i,n);
        	}
        }
        
 
        return answer;
    }
    
    public void dfs(int[][] computers, int cnt, int n) {
    	isNetwork[cnt] = true;
    	for(int i=0; i<n; i++) {
    		if(computers[cnt][i] == 1 && !isNetwork[i]) {
    			isNetwork[i] = true;
    			dfs(computers, i , n);
    		}
    	}
    }
    
	public static void main(String[] args) {
		
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		int[][] computers2 = {{1,1,0},{1,1,1},{0,1,1}};
		
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(3, computers));
		System.out.println(sol.solution(3, computers2));
		

	}

}

