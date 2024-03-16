import java.util.*;
class Player{
	String name;
	int runs;
	Player(String name,int runs){
		this.name=name;
		this.runs=runs;
	}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public void setRuns(int r){
		runs=r;
	}
	public int getRuns(){
		return runs;
	}
	public String toString(){
		return name+" "+runs;
	}
}
class ArrangePlayers{
	public static void main(String args[]){
		Comparator<Player> runsComp = Comparator.comparing(Player::getRuns);
        TreeSet<Player> st = new TreeSet<>(runsComp);
		Player p1,p2,p3,p4,p5,p6;
		p1=new Player("Sachin",10000);
		p2=new Player("Rohit",8000);
		p3=new Player("Virat",9000);
		p4=new Player("Hardik",5000);
		p5=new Player("Dhoni",7000);
		p6=new Player("Rahul",7500);
		st.add(p1);
		st.add(p2);
		st.add(p3);
		st.add(p4);
		st.add(p5);
		st.add(p6);
		System.out.println(st);
		for(Player i:st){
			System.out.println(i);
		}
	}
}