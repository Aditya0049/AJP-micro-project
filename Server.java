import java.net.*;
import java.io.*;
public class Server{
	public static void main(String args[]) throws Exception{
		ServerSocket ss = new ServerSocket(1010);
		Socket s = ss.accept();
		
		InputStream in = s.getInputStream();
		int ch;
		while((ch=in.read()) != -1){
			System.out.print((char)ch);
		}
		s.close();
	}
}