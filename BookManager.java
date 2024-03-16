import java.util.*;
class Book implements Comparable<Book>{
	String title;
	String author;
	int pubYear;
	Book(String t,String a,int p){
		this.title=t;
		this.author=a;
		this.pubYear=p;
	}
	public void setTitle(String t){
		this.title=t;
	}
	public String getTitle(){
		return title;
	}
	public void setAuthor(String a){
		this.author=a;
	}
	public String getAuthor(){
		return author;
	}
	public void setPubYear(int p){
		this.pubYear = p;
	}
	public int getPubYear(){
		return pubYear;
	}
	public int compareTo(Book otherBook){
		return this.title.compareTo(otherBook.title);
	}
	public String toString(){
		return "Title: "+title+" Author: "+author+" PubYear: "+pubYear;
	}
}
class BookManager{
	List<Book> lst;
	BookManager(){
		lst=new ArrayList<>();
	}
	public void addBook(Book book){
		lst.add(book);
	}
	public void removeBook(String criteria,String value){
		Iterator<Book> itr=lst.iterator();
		while(itr.hasNext()){
			Book book=itr.next();
			if (("title".equalsIgnoreCase(criteria) && book.getTitle().equalsIgnoreCase(value)) || ("author".equalsIgnoreCase(criteria) && book.getAuthor().equalsIgnoreCase(value))){
				itr.remove();
				System.out.println("Book "+criteria+"ed by "+value+" had been removed");
				return;
			}	
		}
		System.out.println("Book "+criteria+"ed by "+value+" not found ");
	}
	public void display(){
		for (Book b:lst){
			System.out.println(b);
		}
	}
	public void searchBook(String criteria,String value){
		for(Book book:lst){
			if (("title".equalsIgnoreCase(criteria) && book.getTitle().contains(value)) || ("author".equalsIgnoreCase(criteria) && book.getAuthor().contains(value))){
				System.out.println(book);
			}
			
		}
	}
	public void sortBooks(int choice){
		switch(choice){
			case 1:
				Collections.sort(lst);
				for(Book b:lst){
					System.out.println(b);
				}
			break;
			case 2:
				Collections.sort(lst,Comparator.comparing(Book::getAuthor));
			break;
			case 3:
				Collections.sort(lst,Comparator.comparingInt(Book::getPubYear));
			break;
			default:
				System.out.println("Entered Wrong Choice");
				return;
		}
		System.out.println("Sorted Books");
		for(Book b:lst){
			System.out.println(b);
		}
		
	}
	static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        System.out.println("1.Add a Book");
        System.out.println("2.Remove a Book");
        System.out.println("3.Display Books");
        System.out.println("4.Search for Books");
        System.out.println("5.Sort Books");
        System.out.println("6.Exit");
        int ch = sc.nextInt();
        return ch;
    }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BookManager bookManager=new BookManager();
		int ch=0;
		while (ch!=6){
			ch=menu();
			switch(ch){
				case 1:
					System.out.print("Title: ");
					String title=sc.nextLine();
					System.out.print("Author: ");
					String author=sc.nextLine();
					System.out.print("PubYear: ");
					int pubYear=sc.nextInt();
					bookManager.addBook(new Book(title,author,pubYear));
					System.out.print("Book Added");
					sc.nextLine();
				break;
				case 2:
					System.out.println("Enter whether you remove book by giving the name of title or author");
					String criteria=sc.nextLine();
					System.out.println("Enter "+criteria+" name");
					String value=sc.nextLine();
					bookManager.removeBook(criteria,value);
				break;
				case 3:
					bookManager.display();
				break;
				case 4:
					System.out.println("Enter whether you search book by giving the name of title or author");
					String criteria1=sc.nextLine();
					System.out.println("Enter "+criteria1+" name");
					String value1=sc.nextLine();
					bookManager.searchBook(criteria1,value1);
				break;
				case 5:
					System.out.println("Enter choice sort by: ");
					System.out.println("1.Title");
					System.out.println("2.Author");
					System.out.println("3.PubYear");
					int choice=sc.nextInt();
					sc.nextLine();
					bookManager.sortBooks(choice);
				break;
				case 6:
					System.out.println("Bye Bye!");
				break;
				default:
					System.out.println("Entered Wrong Choice");
			}
		}
	}

}