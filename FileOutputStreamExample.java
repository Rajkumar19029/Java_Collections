import java.io.*;
class FileOutputStreamExample{
	public static void main(String args[]){
		String path="example1.txt";
		try{
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(65);
			fos.write(66);
			fos.close();
			System.out.println("Written into the file");
			FileInputStream fis=new FileInputStream(path);
			int ele;
			while((ele=fis.read())!=-1){
				System.out.println(ele);
			}
			fis.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}