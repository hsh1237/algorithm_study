package algorithm_study_20190323;


//타켓 넘버
public class Solution2 {
	
	static int answer = 0;
	
	public int solution(int[] numbers, int target) {
	        //int answer = 0;
		
			dfs(target, numbers,0);
	        
	        return answer;
    }
	
	
	public void dfs(int target, int[] numbers, int depth) {
		
		
		if(depth == numbers.length) {
			int sum = 0;
			System.out.print("result : ");
			for(int num : numbers) {
				System.out.print(num + " ");
				sum += num;
			}
			
			System.out.println();				
			System.out.println("DEPTH : " + depth + ", SUM : " + sum);
			
			if(sum == target) {
				answer++;				
				System.out.println();
			}
			
		}else {
			System.out.println(" + + ");
			System.out.println("DEPTH : " + depth + " : " + numbers[depth]);
			numbers[depth] *= 1;
			dfs(target,numbers,depth+1);
			
			System.out.println();
			
			System.out.println(" - - ");
			System.out.println("DEPTH : " + depth + " : " + numbers[depth]);
			numbers[depth] *= -1;
			dfs(target,numbers,depth+1);
		}
	}

	public static void main(String[] args) {

		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(new int[] {1,1,1,1,1}, 3));

	}

}
