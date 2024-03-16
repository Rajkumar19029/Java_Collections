import java.util.*;
class Qmain2{
	static int menu(){
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Count");
		System.out.println("4. Show");
		System.out.println("5. Quit");
		System.out.println("Enter your choice");
		int ch;
		ch=sc.nextInt();
		return ch;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name;
		int ch=0;
		Queue<String> names=new LinkedList<>();
		while(ch!=5){
			ch=menu();
			switch(ch){
				case 1:
					System.out.println("Enter name: ");
					name=sc.nextLine();
					names.add(name);
					System.out.println("Name added");
					break;
				case 2:
					System.out.println("Removed Name: "+names.poll());
					break;
				case 3:
					System.out.println("Count: "+names.size());
					break;
				case 4:
					System.out.println(names);
					break;
				case 5:
					; 
					break;
				default:
					System.out.println("Wrong Choice");
			}
		}

	}
}