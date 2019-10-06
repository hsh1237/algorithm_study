package algorithm_study_20190602;
//영어 끝말잇기
public class Solution3 {
	
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        String startWord = words[0];
        for(int i=1;i<words.length-1;i++) {
        	if(i == 1) {
        		//System.out.println(startWord.substring(startWord.length()-1));
        		//System.out.println(words[i].substring(0,1));
        		if(!startWord.substring(startWord.length()-1).equals(words[i].substring(0,1))) {
        			
        		}
        	}else {
        		if(!words[i].substring(words[i].length()-1).equals(words[i].substring(0,1))) {
        			
        		}
        	}
        	
        	
        }

        return answer;
    }
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
		String[] words = {"tank","kick","know","wheel","land","dream","mother","robot","tank"}; 
		
		int[] result = sol.solution(3, words);
		
		for(int a : result ) {
			System.out.print(a + " , ");
		}
		
		
	}

}
