import java.util.*;
class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int marks;
	Student(int r,String n,int m){
		this.rollNo=r;
		this.name=n;
		this.marks=m;
	}
	public void setRollNo(int r){
		this.rollNo=r;
	}
	public int getRollNo(){
		return rollNo;
	}
	public void setName(String n){
		this.name=n;
	}
	public String getName(){
		return name;
	}
	public void setMarks(int m){
		this.marks=m;
	}
	public int getMarks(){
		return marks;
	}
	public int compareTo(Student other){
		return Integer.compare(this.rollNo,other.rollNo);
	}
	public String toString(){
		return rollNo+" "+name+" "+marks;
	}
}
class StudentData{
	List<Student> lst;
	StudentData(){
		lst=new ArrayList<>();
	}
	public void addStudent(Student st){
		lst.add(st);
		Collections.sort(lst);
	}
	public void displayStudents(){
		for(Student s:lst){
			System.out.println(s);
		}
		System.out.println();
	}
	public void searchStudent(int roll){
		for (Student st:lst){
			if(st.getRollNo()==roll){
				System.out.println(st+"\n");
				return;
			}
		}
		System.out.println("No Student with Roll No "+roll);
		System.out.println();
	}
	public void calculateAvg(){
		int n=0;
		int sum=0;
		for(Student st:lst){
			sum+=st.getMarks();
			n++;
		}
		System.out.println("Avg Marks: "+sum/n);
		System.out.println();
	}
	public void removeStudent(int roll){
		Iterator<Student> itr=lst.iterator();
		while(itr.hasNext()){
			Student st=itr.next();
			if(st.getRollNo()==roll){
				itr.remove();
				Collections.sort(lst);
				System.out.println("Student Removed");
				System.out.println();
				return;
			}
		}
		System.out.println("No Student with Roll No "+roll);
		System.out.println();
	}
	static int menu(){
		System.out.println("Enter Your Choice:");
		System.out.println();
		System.out.println("1.Add");
		System.out.println("2.Display");
		System.out.println("3.Search");
		System.out.println("4.Calculate");
		System.out.println("5.Remove");
		System.out.println("6.Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		return ch;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		StudentData stu=new StudentData();
		int ch=0;
		while(ch!=6){
			ch=menu();
			System.out.println();
			switch(ch){
				case 1:
					System.out.println("Enter Student Details");
					System.out.println();
					System.out.print("Roll No: ");
					int r=sc.nextInt();
					sc.nextLine();
					System.out.print("Name: ");
					String n=sc.nextLine();
					System.out.print("Marks: ");
					int m=sc.nextInt();
					stu.addStudent(new Student(r,n,m));
					System.out.println("Student Added");
					System.out.println();
				break;
				case 2:
					System.out.println("Students Details");
					System.out.println();
					stu.displayStudents();
				break;
				case 3:
					System.out.print("Roll No: ");
					int ro=sc.nextInt();
					sc.nextLine();
					stu.searchStudent(ro);
				break;
				case 4:
					stu.calculateAvg();
				break;
				case 5:
					System.out.print("Roll No: ");
					int rollno=sc.nextInt();
					sc.nextLine();
					stu.removeStudent(rollno);
				break;
				case 6:
					System.out.println("bye bye!");
					System.out.println();
				break;
				default:
					System.out.println("Choose Correct Option");
					System.out.println();
			}
		}
		
	}
}