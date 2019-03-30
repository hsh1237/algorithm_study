package algorithm_study_20190224;

//조이스틱
public class Solution4 {

	public String up(String str) {
		int alpa = str.charAt(0)+1;
		return String.valueOf((char)alpa);
		
	}
	
	public String down(String str) {
		if(str.equals("A")) {
			return "Z";
		}else {			
			int alpa = str.charAt(0)-1;
			return String.valueOf((char)alpa);
		}
	}
	
	public int solution(String name) {
        int answer = 0;
        
        String[] arr = name.split("");
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println("시작 : " + arr[i]);
        	String start = "A";
        	
        	if(arr[i].charAt(0) - start.charAt(0) < 13) {
        		while(!start.equals(arr[i])) {
        			start = up(start);
        			answer++;
        			System.out.println(start + " : " + answer);
        		}
        		
        	}else {
        		
        		while(!start.equals(arr[i])) {
        			start = down(start);
        			answer++;
        			System.out.println(start + " : " + answer);
        		}
        		
        	}
        	if(i != arr.length-1) {
        		answer++;        		
        		System.out.println("다음 커서 : " + answer );
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		//System.out.println(sol.solution("JEROEN"));
		System.out.println(sol.solution("JAZ"));
		System.out.println("-----");
		System.out.println(sol.solution("JEROEN"));
		
/*		String r = "A";
		boolean check = false;
		int cnt = 0;
		while(!check) {
			r = sol.up(r);
			cnt++;
			if(r.equals("J")) {
				check = true;
			}
		}
		
		String a = "A";
		String b = "J";
		System.out.println((int)b.charAt(0));
		System.out.println((int)a.charAt(0));
		System.out.println("-- : " +  (b.charAt(0) - a.charAt(0)));
		
		
		
		System.out.println(r);
		System.out.println(cnt);*/
		
		
	}
	
	

}
