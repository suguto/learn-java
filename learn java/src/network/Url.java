package network;
import java.io.*;
import java.net.URL;

public class Url {

	public static void main(String[] args) throws Exception{
		
				URL url = new URL("https://dokojava.jp");
				InputStream is = url.openStream();
				InputStreamReader isr = new InputStreamReader(is);
		
			int i = isr.read();
			while (i != -1) {
				System.out.println((char)i);
				i = isr.read();
			}
		
				
		// TODO Auto-generated method stub

	}

}
