class LL{
	private int size;
	LL(){
		this.size=0;
	}
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	
	//Add First
	public void addFirst(int data){
		Node newNode= new Node(data);
		if (head==null){
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	
	//Add Last
	public void addLast(int data){
		Node newNode=new Node(data);
		if (head==null){
			head=newNode;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=null){
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
	}
	
	
	//Add After a given Node
	public void addAfter(int key,int data){
		Node newNode=new Node(data);
		if (head==null){
			System.out.println("List is Empty");
			return;
		}
		Node currentNode=head;
		while(currentNode!=null){
			if(currentNode.data==key){
				newNode.next=currentNode.next;
				currentNode.next=newNode;
				return;
			}
			currentNode=currentNode.next;
		}
		System.out.println(key+" not found");
	}
	
	
	// Remove First
	public void removeFirst(){
		if (head==null){
			return;
		}
		Node newHead=head.next;
		head=newHead;
		size--;
	}
	
	
	//Remove Last
	public void removeLast(){
		if (head==null){
			return;
		}
		size--;
		if(head.next==null){
			head=null;
			return;
		}
		Node currentNode=head;
		while(currentNode.next.next!=null){
			currentNode=currentNode.next;
		}
		currentNode.next=null;
	}
	
	
	//Delete by Value
	public void deleteValue(int key){
		if(head==null){
			return;
		}
		Node prevNode=head;
		Node currentNode=head.next;
		if (currentNode==null){
			size--;
			return;
		}
		while(currentNode!=null){
			if(currentNode.data==key){
				prevNode.next=currentNode.next;
				size--;
				return;
			}
			currentNode=currentNode.next;
			prevNode=prevNode.next;
		}
		System.out.println(key+" is not found");
	}
	
	
	//Reverese Linked List Using Iterative
	public void reverse(){
		if (head==null || head.next==null){
			return;
		}
		Node prevNode=head;
		Node currentNode=head.next;
		while(currentNode!=null){
			Node nextNode=currentNode.next;
			currentNode.next=prevNode;
			
			prevNode=currentNode;
			currentNode=nextNode;
		}
		head.next=null;
		head=prevNode;
	}
	
	
	//Reverse Linked List using Recursive
	public void revers(Node head){
		if (head==null || head.next==null){
			return;
		}
		Node newHead=revers(head.next);
		head.next.next=head;
		head.next=null;
		
		return newHead;
	}
	
	
	//Print Linked List
	public void printList(){
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		Node currentNode=head;
		while(currentNode!=null){
			System.out.print(currentNode.data+"-> ");
			currentNode=currentNode.next;
		}
		System.out.println("NULL");
	}
	
	
	public int getSize(){
		return size;
	}
	

	//Main Method
	public static void main(String args[]){
		LL list= new LL();
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(5);
		list.addAfter(3,4);
		list.addAfter(4,7);
		list.addFirst(0);
		list.addLast(10);
		list.removeFirst();
		list.removeLast();
		list.deleteValue(7);
		list.printList();
		list.reverse();
		list.head=list.revers(list.Node);
		list.printList();
		System.out.println("Length of Linked List: "+list.getSize());
	}
}