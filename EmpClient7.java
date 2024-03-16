//Emp7.java
import java.util.*;
class Emp7{
	int eid;
	String ename;
	double sal;
	String desig;
	Emp7(){}
	Emp7(int a,String b,double c,String d){
		eid=a;
		ename=b;
		sal=c;
		desig=d;
		
	}
	public String toString(){
		return eid+" "+ename+" "+sal+" "+desig;
	}
	public boolean equals(Object o){
		Emp7 e=(Emp7)o;
		if(this.eid==e.eid && this.ename.equals(e.ename) && this.sal==e.sal && this.desig.equals(e.desig)){
			return true;
		}else{
			return false;
		}
	}
	public int hashCode(){
		return toString().hashCode();
	}
}

class EmpClient7{
	public static void main(String args[]){
		Emp7 e1=new Emp7(1,"ABC",50000.00,"Designer");
		Emp7 e2=new Emp7(2,"XYZ",50000.00,"Developer");
		Emp7 e3=new Emp7(1,"ABC",50000.00,"Designer");
		
		HashSet<Emp7> emps=new HashSet<Emp7>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		
		for(Emp7 e:emps){
			System.out.println(e);
		}
	}
}
