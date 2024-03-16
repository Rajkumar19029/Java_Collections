import java.util.*;
class PQueueMerge{
	public static void main(String args[]){
		PriorityQueue<Integer> queue1=new PriorityQueue<>();
		PriorityQueue<Integer> queue2=new PriorityQueue<>();
		queue1.add(3);
		queue1.add(2);
		queue1.add(1);
		queue2.add(4);
		queue2.add(6);
		queue2.add(5);
		PriorityQueue<Integer> mergedQueue=new PriorityQueue<>();
		mergedQueue.addAll(queue1);
		mergedQueue.addAll(queue2);
		
		
		//Integer[] arr=mergedQueue.toArray(new Integer[0]);
		
		
			while(!mergedQueue.isEmpty()){
			System.out.print(mergedQueue.poll()+" ");
		}
		
	}
}