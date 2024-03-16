import java.io.*;
class DataIOStream{
	public static void main(String args[]){
		String path="example2.txt";
		try{
			FileOutputStream fos=new FileOutputStream(path);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeInt(10);
			dos.writeDouble(13.5);
			dos.writeUTF("Hello");
			dos.writeBoolean(true);
			dos.close();
			System.out.println("Written primitive data into the file.");
			FileInputStream fis=new FileInputStream(path);
			DataInputStream dis=new DataInputStream(fis);
			int intValue=dis.readInt();
			System.out.println("Int Value: "+intValue);
			double doubleValue=dis.readDouble();
			System.out.println("Double Value: "+doubleValue);
			String stringValue=dis.readUTF();
			System.out.println("String Value: "+stringValue);
			boolean booleanValue=dis.readBoolean();
			System.out.println("Boolean Value: "+booleanValue);
			dis.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}