package algorithm_study_20190113;

import java.util.HashSet;


//소수찾기
//set remove 말고 다른방법

public class Solution4 {
	
	public int solution(int n) {
		int answer = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=2;i<=n;i++) {
			set.add(i);
		}
		Object[] count = getCount((int)Math.sqrt(n));
		System.out.println("result : " + count.length);
		
		for(int i=0;i<count.length;i++) {
			for(int j = (int) count[i]; j<=n; j +=(int) count[i]) {
				if(j > (int) count[i]) {
					set.remove(j);
				}
			}
			
		}

		answer = set.size();
		return answer;
	/*    for(int i=2;i<=n;i++) {
	        if(isTure(i)) {
	            answer++;
	        }
	      }
	      return answer;*/
	}
	
	
/*    public boolean isTure(int num) {
		
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		//System.out.println(num);
		return true; 
	}*/

	public Object[] getCount(int count) {
		System.out.println("count : " + count);
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=2;i<=count;i++) {
			set.add(i);
		}

		for(double d=2;d<Math.sqrt(count);d++) {
			for(int i=2;i<=count;i++) {
				if(i>d && i%d ==0) {
					set.remove(i);
				}
			}	
		}
	
		Object[] result = set.toArray();
		return result;
	}
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(10000000));
		System.out.println(sol.solution(50));
		System.out.println(sol.solution(5));
		//System.out.println(d);
		

	}

}
