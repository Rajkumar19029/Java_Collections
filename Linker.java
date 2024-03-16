//ArrayList ,Sorting using Comparable
/*import java.util.*;
class Student implements Comparable<Student>{
	int roll_no;
	String name;
	String dept;
	public Student(int r,String n,String d){
		this.roll_no=r;
		this.name=n;
		this.dept=d;
	}
	public void setRoll_no(int r){
		this.roll_no=r;
	}
	public int getRoll_no(){
		return roll_no;
	}
	public void setName(String n){
		this.name=n;
	}
	public String getName(){
		return name;
	}
	public void setDept(String d){
		this.dept=d;
	}
	public String getDept(){
		return dept;
	}
	public int compareTo(Student other){
		return Integer.compare(this.roll_no,other.roll_no);
	}
	public String toString(){
		return roll_no+" "+name+" "+dept;
	}
}
class Linker{
	public static void main(String args[]){
		ArrayList<Student> lst=new ArrayList<>();
		Student s1,s2,s3,s4;
		s1=new Student(2,"Raj","CSE");
		s2=new Student(1,"Sai","CSM");
		s3=new Student(4,"Joy","CSD");
		s4=new Student(3,"Mani","CSC");
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		Collections.sort(lst);
		System.out.println(lst);
		for(Student s:lst){
			System.out.println(s);
		}
		
	}
}*/
//ArrayList, Sorting using Comparator
import java.util.*;
class Student{
	int roll_no;
	String name;
	String dept;
	public Student(int r,String n,String d){
		this.roll_no=r;
		this.name=n;
		this.dept=d;
	}
	public void setRoll_no(int r){
		this.roll_no=r;
	}
	public int getRoll_no(){
		return roll_no;
	}
	public void setName(String n){
		this.name=n;
	}
	public String getName(){
		return name;
	}
	public void setDept(String d){
		this.dept=d;
	}
	public String getDept(){
		return dept;
	}
	public static Comparator<Student> StuNameComp=new Comparator<Student>(){
		public int compare(Student s1,Student s2){
			String n1=s1.getName();
			String n2=s2.getName();
			return n1.compareTo(n2);
		}
	};
	public String toString(){
		return roll_no+" "+name+" "+dept;
	}
}
class Linker{
	public static void main(String args[]){
		ArrayList<Student> lst=new ArrayList<>();
		Student s1,s2,s3,s4;
		s1=new Student(2,"Raj","CSE");
		s2=new Student(1,"Sai","CSM");
		s3=new Student(4,"Joy","CSD");
		s4=new Student(3,"Mani","CSC");
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		Collections.sort(lst,Student.StuNameComp);
		System.out.println(lst);
		for(Student s:lst){
			System.out.println(s);
		}
		
	}
}