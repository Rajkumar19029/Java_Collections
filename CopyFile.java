import java.io.*;
class CopyFile
{
	public static void main(String args[])
	{
		String src="Postfix.java";
		String dest="xyz.java";
		try
		{
			FileReader fr=new FileReader(src);
			FileWriter fw=new FileWriter(dest);
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
			String line;
			int ctr=0;
			while((line=br.readLine())!=null)
			{
				bw.write(line);
				bw.newLine();
				bw.flush();
				ctr++;
			}
			br.close();
			bw.close();
			System.out.println("File Copied..");
			System.out.println("Number of Lines Copied: "+ctr);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}