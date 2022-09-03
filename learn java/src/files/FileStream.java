package files;
import java.io.*;

public class FileStream {
	
	//StringReaderはファイルではなく、コンストラクタで指定された文字列に繋がっています

	public static void main(String[] args) {
		String msg = "今日は大胸筋を鍛えます";
		try(
				Reader sr = new StringReader(msg);
			)
		{
			int i = sr.read();	
			while (i != -1) {
				char c = (char)i;
				System.out.print(c);
				i = sr.read();
			}
		}catch (IOException e) {
			System.out.println("エラーが発生");
		}
		System.out.println("");
		
		//バイト配列に値を書き込む
		
		try(
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
		){
			baos.write(65);
			baos.write(66);
			byte[] data = baos.toByteArray();
			for (byte b : data) {
				System.out.println(b);
			}
		}catch (IOException e) {
			
		}
		
		// TODO Auto-generated method stub

	}

}
