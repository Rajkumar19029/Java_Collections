class CLL{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=next;
		}
	}
	
	
	//ADD FRONT
	public void addFirst(int data){
		Node newNode=new Node(data);
		if (head==null){
			head=newNode;
			head.next=head;
			return;
		}
		newNode.next=head;
		Node currentNode=head;
		while(currentNode.next!=head){
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
		head=newNode;
	}
	
	
	//ADD LAST
	public void addLast(int data){
		Node newNode=new Node(data);
		if (head==null){
			head=newNode;
			head.next=head;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=head){
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
		newNode.next=head;
		
	}
	
	
	//ADD AFTER
	public void addAfter(int key,int data){
		Node newNode=new Node(data);
		if(head==null){
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=head){
			if(currentNode.data==key){
				newNode.next=currentNode.next;
				currentNode.next=newNode;
				return;
			}
			currentNode=currentNode.next;
		}
		if(currentNode.data==key){
			currentNode.next=newNode;
			newNode.next=head;
		}
		else{
			System.out.println(key+" not found");
		}
	}
	
	
	
	//Remove Front
	public void removeFront(){
		if(head==null){
			return;
		}
		if(head.next==head){
			head=null;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=head){
			currentNode=currentNode.next;
		}
		currentNode.next=head.next;
		head=head.next;
	}
	
	
	//REMOVE LAST
	public void removeLast(){
		if(head==null){
			return;
		}
		if(head.next==head){
			head=null;
			return;
		}
		Node currentNode=head;
		while(currentNode.next.next!=head){
			currentNode=currentNode.next;
		}
		currentNode.next=head;
	}
	
	
	
	//DELETE BY VALUE
	public void deleteValue(int key){
		if(head==null){
			return;
		}
		Node prevNode=head;
		Node currentNode=head.next;
		if(currentNode==null){
			head=null;
			return;
		}
		while(currentNode.next!=head){
			if(currentNode.data==key){
				prevNode.next=currentNode.next;
				return;
			}
			currentNode=currentNode.next;
			prevNode=prevNode.next;
		}
		if(currentNode.data==key){
			prevNode.next=head;
		}
		else{
			System.out.println(key+" not found");
		}
		
		
	}
	
	
	
	//PRINT
	public void printLL(){
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=head){
			System.out.print(currentNode.data+"<->");
			currentNode=currentNode.next;
		}
		System.out.print(currentNode.data);
	}
	public static void main(String args[]){
		CLL list=new CLL();
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addFirst(0);
		list.addLast(5);
		list.addLast(11);
		list.addAfter(3,10);
		list.addAfter(3,4);
		list.addAfter(5,6);
		list.removeFront();
		list.removeLast();
		list.deleteValue(10);
		list.deleteValue(6);
		list.printLL();
	}
}