import java.net.*;
import java.io.*;
public class Client{
	public static void main(String [] args){
		try{
			Socket s=new Socket("127.0.0.1",9500);
	        DataInputStream so=new DataInputStream(s.getInputStream());
	        System.out.println(so.readUTF());
	        FileOutputStream f=new FileOutputStream("./File/lx.mp3");
	  	    int p;
		    System.out.println("please wait........");
	        while((p=so.read())!=-1){
		           f.write(p);
	        }
	          s.close();
	          so.close();
	          f.flush();
	          f.close();
              System.out.println("complete!");
		}catch(IOException e){
			System.out.println("ÎÄ¼þÏÂÔØÊ§°Ü!");
		}
	}
}