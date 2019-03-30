package algorithm_study_20190217;

import java.util.LinkedList;
import java.util.Queue;

//다리를 지나는 트럭
public class Solution3 {
	

	 class Truck{
        int position;
        int weight;

        public Truck(int weight) {
            this.weight = weight;
            this.position =0;
        }
	}
	 
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		
	   int answer = 0;
		
	   //트럭 큐
	   Queue<Truck> truckQueue = new LinkedList<>();
		
	   //다리 큐 
	   Queue<Truck> bridgeQueue = new LinkedList<>();
		
	   int totalWeight=0;
		  
       for(int truck_weight: truck_weights){
    	   truckQueue.add(new Truck(truck_weight));
       }
       
       totalWeight += truckQueue.peek().weight;
       bridgeQueue.add(truckQueue.poll());
       
       while (!bridgeQueue.isEmpty()){
    	   answer++;
    	   
            for(Truck truck:bridgeQueue){
                truck.position++;
            }

            
            if(bridgeQueue.peek().position > bridge_length){
            	totalWeight -= bridgeQueue.poll().weight;
            }
            
            if(!truckQueue.isEmpty() && (totalWeight+truckQueue.peek().weight <= weight)){
            	totalWeight += truckQueue.peek().weight;
            	truckQueue.peek().position++;
            	bridgeQueue.add(truckQueue.poll());
            }
        }
        
        return answer;
    }

	public static void main(String[] args) {
		
		Solution3 sol = new Solution3();
		
		System.out.println(sol.solution(2, 10, new int[] {7,4,5,6}));
		
		

	}

}
