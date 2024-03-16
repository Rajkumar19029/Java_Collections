/*In Java java.util package few important
collextion classes exist:
i) Vector
ii) Hashtable
iii) Enumeration
iv) ArrayList
v) Hashset
vi)Hasmap
vii) Iterator

class ArrayList{
	// some important methods
	public boolean add(Object o)
	public Object get(int index)
	public  Object remove(int index)
	public Iterator <Object> iterator()
	arr[0]=""
}
interface Iterator{
	public boolean hasNext()
	public Object next()
}
class Scanner{
	public int nextInt()
	public long nextLong()
	public float nextFloat()
	public double nextDouble()
	public String next()
	public String nextLine()
}
*/
//ToDo9.java
import java.util.*;
class ToDo9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<String>();
		while(true){
			System.out.println("ToDo List Application");
			System.out.println("1. Add Task");
			System.out.println("2. Remove Task");
			System.out.println("3. Display all Tasks");
			System.out.println("4. Quit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			if (choice==1){
				System.out.println("Enter Task: ");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("Task added: "+task);
				System.out.println(" ");
			}
			else if(choice==2){
				System.out.println("Enter taskno: ");
				int taskno=sc.nextInt();
				sc.nextLine();
				tasks.remove(taskno-1);
				System.out.println("Task "+taskno+" removed");
				System.out.println(" ");
			}
			else if(choice==3){
				Iterator<String> i=tasks.iterator();
				int slno=1;
				while(i.hasNext()){
					String task=i.next();
					System.out.println(slno+++". "+task);
				}
				System.out.println(" ");
			}
			else if(choice==4){
			
				System.out.println("Byebye!");
				System.exit(0);
			
			}
			else{
				System.out.println("Wrong Choice");
			}
			
			
		}
	}
}