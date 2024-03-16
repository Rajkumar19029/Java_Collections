import java.util.*;
class Task implements Comparable<Task>{
	String name;
	int priority;
	Task(String n,int p){
		this.name=n;
		this.priority=p;
	}
	public int compareTo(Task other){
		return Integer.compare(this.priority,other.priority);
	}
	public String toString(){
		return name+" "+"Priority: "+priority;
	}
}
class PriorityQueue2{
	public static void main(String args[]){
		PriorityQueue<Task> queue=new PriorityQueue<>();
		queue.add(new Task("Task 1",3));
		queue.add(new Task("Task 2",1));
		queue.add(new Task("Task 3",2));
		for(Task t:queue){
			System.out.println(t);
		}
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
}