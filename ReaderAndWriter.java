import java.io.*;
class ReaderAndWriter{
	public static void main(String args[]){
		String path="example2.txt";
		try{
			FileWriter fw=new FileWriter(path);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Hello");
			bw.newLine();
			bw.write("Raj");
			bw.newLine();
			bw.flush();
			System.out.println("Written into the file "+path);
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}