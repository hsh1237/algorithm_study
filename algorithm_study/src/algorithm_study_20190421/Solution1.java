package algorithm_study_20190421;

//다음 큰 숫자
public class Solution1 {

	public int getCount(int num) {
		
		int count = 0;
		
		char[] binary = Integer.toBinaryString(num).toCharArray();
		for(int i=0;i<binary.length;i++) {
			if(binary[i] == '1') {
				count++;
			}
		}
		//System.out.println("count : " + count);
		return count;
		
	}
	
	public int solution(int n) {
		int answer = 0;
		int cnt = 0;
		Boolean check = false;
		
		cnt = getCount(n);
		while(!check) {
			n++;
			if(cnt == getCount(n)) {
				check = true;
				break;
			}
		}
		
		answer = n;
		
		return answer;
	}
	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		//System.out.println(sol.solution(78));
		System.out.println(sol.solution(15));
	}

}
