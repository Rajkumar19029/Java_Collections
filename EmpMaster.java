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
class EmpMaster{
	public static void main(String args[]){
		Employee e1,e2,e3;
		e1=new Employee(101,"Raj",35000);
		e2=new Employee(201,"Ram",45000);
		e3=new Employee(301,"Roy",55000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		float tot=0.0f;
		tot=e1.getEsal()+e2.getEsal()+e3.getEsal();
		System.out.println("Total: "+tot);
		System.out.println("After Changing sal");
		e1.setEsal(36000.0f);
		e2.setEsal(46000.0f);
		e3.setEsal(56000.0f);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
