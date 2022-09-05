package dataFormat;
import java.io.*;
import org.apache.commons.*;

public class CSV {
//	複数のデータをカンマで区切って順に格納するデータフォーマットの形式の事をCSV（Comma-Separated Values）という
//	データを区切るために使う文字はデリミタと呼ばれ、スペースやタブ文字を使う亜種もある
	

	public static void main(String[] args) {
		//こういうやり方もある
		String s = "坂本,西郷,ミケ";
		String[] st = s.split(",");
		for (String t : st) {
			System.out.println(t);
		}
		
		//commons-csvの利用例
//		try(
//				FileReader fr = new FileReader("java.txt");
//				Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
//		){		
//			for (CSVRecord r : records) {
//				String name = r.get(0);
//				String hp = r.get(1);
//				String mp = r.get(2);
//				System.out.println(name + "/" + hp + "/" + mp);
//			}
//		}catch (Exception e) {
//			System.out.println(e.getCause());
//		}

		// TODO Auto-generated method stub

	}

}
