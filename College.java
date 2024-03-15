import java.util.*;
class Dept{
	int did;
	String dname;
	ArrayList<Employee> emplist;
	Dept(int did,String dname){
		this.did=did;
		this.dname=dname;
		emplist=new ArrayList<>();
	}
	public int getDid(){
		return did;
	}
	public void setDid(int did){
		this.did=did;
	}
	public String getDname(){
		return dname;
	}
	public void setDname(String dname){
		this.dname=dname;
	}
	public String toString(){
		return did+" "+dname+" "+emplist;
	}
	public void addEmployee(Employee e){
		emplist.add(e);
	}
	public void removeEmployee(int p){
		emplist.remove(p);
	}
}
class Employee {
    int eid;
    String ename;
    float esal;
    Employee(int eid,String ename,float esal){
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
    }
    public int getEid(){
        return eid;
    }
	public void setEid(int eid){
		this.eid=eid;
	}
	public String getEname(){
        return ename;
    }
	public void setEid(String ename){
		this.ename=ename;
	}
	public float getEsal(){
        return esal;
    }
	public void setEsal(float esal){
		this.esal=esal;
	}
	public String toString(){
		return eid+" "+ename+" "+esal;
	}
}
class College{
	public static void main(String args[]){
		Dept d=new Dept(66,"AIML");
		Employee e1,e2,e3,e4;
		e1=new Employee(101,"Ram",10000);
		e2=new Employee(201,"Raj",3000);
		e3=new Employee(301,"Roy",5000);
		e4=new Employee(401,"Joy",7000);
		d.addEmployee(e1);
		d.addEmployee(e2);
		d.addEmployee(e3);
		d.addEmployee(e4);
		System.out.println(d);
		System.out.println("After removing an Employee");
		d.removeEmployee(3);
		System.out.println(d);
		float tot=0.0f;
		for(Employee e: d.emplist){
			tot+=e.getEsal();
		}
		System.out.println("Total: "+tot);
	}
}