class DLL{
	Node head;
	DLL(){
		this.head=null;
	}
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	
	//ADD FRONT
	public void addFirst(int data){
		Node newNode=new Node(data);
		newNode.next=head;
		newNode.prev=null;
		if(head!=null){
			head.prev=newNode;
		}
		head=newNode;
	}
	
	
	//ADD LAST
	public void addLast(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=null){
			currentNode=currentNode.next;
		}
		newNode.prev=currentNode;
		newNode.next=null;
		currentNode.next=newNode;
	}
	
	
	//ADD AFTER
	public void addAfter(int key,int data){
		Node newNode=new Node(data);
		if (head==null){
			return;
		}
		Node currentNode=head;
		while(currentNode!=null){
			if(currentNode.data==key){
				newNode.prev=currentNode;
				newNode.next=currentNode.next;
				if(currentNode.next!=null){
					currentNode.next.prev=newNode;
				}
				currentNode.next=newNode;
				return;
			}
			currentNode=currentNode.next;
		}
		System.out.println(key+" not found");
	}
	
	
	//DELETE FRONT
	public void deleteFront(){
		if (head==null){
			return;
		}
		if (head.next==null){
			head=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	
	
	//DELETE END
	public void deleteLast(){
		if (head==null){
			return;
		}
		if (head.next==null){
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
		if (head==null){
			return;
		}
		Node currentNode=head;
		while(currentNode!=null){
			if(currentNode.data==key){
				if(currentNode.next==null){
					head=null;
					return;
				}
				currentNode.prev.next=currentNode.next;
				currentNode.next.prev=currentNode.prev;
				return;
			}
			currentNode=currentNode.next;
		}
	}
	
	
	//Print DLL
	public void printLL(){
		if(head==null){
			System.out.println("List is Empty ");
			return;
		}
		
		
		//Forward
		Node currentNode=head;
		while(currentNode.next!=null){
			System.out.print(currentNode.data+"<->");
			currentNode=currentNode.next;
		}
		System.out.println(currentNode.data);
		
		
		
		//Reverse
		currentNode=head;
		while(currentNode.next!=null){
			currentNode=currentNode.next;
		}
		while(currentNode!=head){
			System.out.print(currentNode.data+"<->");
			currentNode=currentNode.prev;
		}
		System.out.println(head.data);
	}
	
	
	
	public static void main(String args[]){
		DLL list=new DLL();
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addFirst(0);
		list.addLast(5);
		list.addAfter(3,4);
		list.addAfter(4,10);
		list.addLast(6);
		list.deleteFront();
		list.deleteLast();
		list.deleteValue(10);
		list.printLL();
	}
}