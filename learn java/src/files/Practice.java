package files;
import java.io.*;

public class Practice {

	public static void main(String[] args) {
		String inFile = args[0];
		String outFile = args[1];
		
		try(
				FileInputStream fis = new FileInputStream(inFile);
				FileOutputStream fos = new FileOutputStream(outFile);
		){
			int i = fis.read();
			while (i != -1) {
				fos.write(i);
				i = fis.read();
			}
			fos.flush();
			fos.close();
			fis.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		// TODO Auto-generated method stub

	}

}
