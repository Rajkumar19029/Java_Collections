import java.util.*;
class Postfix{
	public static void main(String args[]){
		System.out.println("Enter Postfix Expression: ");
		Scanner sc=new Scanner(System.in);
		String exp=sc.nextLine();
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<exp.length();i++){
			char ch=exp.charAt(i);
			if (ch==' '){
				continue;
			}
			else if(Character.isDigit(ch)){
				int num=0;
				while(Character.isDigit(ch)){
					num=num*10+(ch-48);
					i++;
					ch=exp.charAt(i);
				}
				st.push(num);
			}
			else{
				int n1,n2,res=0;
				n2=st.pop();
				n1=st.pop();
				switch(ch){
					case '+':res=n1+n2; break;
					case '-':res=n1-n2; break;
					case '*':res=n1*n2; break;
					case '/':res=n1/n2; break;
				}
				st.push(res);
			}
		}
		System.out.println("Result= "+st.pop());
	}
}