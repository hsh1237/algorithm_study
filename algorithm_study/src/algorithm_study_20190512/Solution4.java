package algorithm_study_20190512;


import java.util.Stack;

//짝지어 제거하기
public class Solution4 {
	public int solution(String s){
        int answer = 0;
        
        char[] charArr = s.toCharArray();
       
        //글자 하나면 걍 실패
        if(charArr.length % 2 != 0) {
        	return answer;
        }
       
        Stack<Character> stack = new Stack<Character>();
        for(char a : charArr) {
        	//System.out.println(a);
        	stack.add(a);
        	
        }
       
        System.out.println("START : " + stack.size());
        boolean check = true;
        while(check) {
        	Stack<Character> temp = new Stack<Character>();	
        	
        	int cnt = 0;
        	for(int i=0;i<stack.size()-1;i++) {
        		System.out.println("---------" + i + "---------");
        		char n = stack.pop();
        		/*System.out.println("POP : "+ n);
        		System.out.println("STACK SIZE: "+ stack.size());*/
        		System.out.println("confirm -- "  + n + " / " + stack.peek());
    			if(n != stack.peek()) {
    				System.out.println("add : "+ n);
    				temp.add(n);
    			}else {
    				System.out.println("remove -- " + n + " / " + stack.peek());
    				cnt++;
    				stack.pop();
    			}

        	}
        	
        	System.out.println("temp size : " + temp.size());
        	stack.clear();
        	stack = temp;
        	if(cnt == 0) {
        		check = false;
        	}

        }
        System.out.println("size : " + stack.size());
        if(stack.size() == 0) {
        	answer = 1;
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		System.out.println(sol.solution("baabaa"));

	}

}
