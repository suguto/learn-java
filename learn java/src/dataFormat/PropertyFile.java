package dataFormat;
import java.io.*;
import java.util.*;

public class PropertyFile {
	//プロパティファイル形式の主なルール
//	データは文字情報として保存する
//	各行には「キー」と「値」をペアとして、それらをペアデリミタで区切って記述する
//	ペアデリミタは　= or :　or　空白のいずれかの文字
//	# or ! で始まる行はコメントとして無視される
//	ファイルの拡張子には「.properties」を使う

	public static void main(String[] args) {
		try(
				FileWriter fw = new FileWriter("java.properties");		//上書きする為、trueは付けない
		){
			fw.write("heroName=坂本" + "\n");
			fw.write("heroHp=75" + "\n");
			fw.write("heroMp=20" + "\n");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//読み取り方
		try(
				Reader fr = new FileReader("java.properties");
		){
			Properties p = new Properties();
			p.load(fr);									//load()で読み取る
			String name = p.getProperty("heroName");
			String strHp = p.getProperty("heroHp");
			int hp = Integer.parseInt(strHp);			//Propertiesは全て文字列として扱うのでintegerParseIntなどを使う
			System.out.println("勇者の名前：　" + name);
			System.out.println("勇者のHP：　" + hp);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//書き込み方
		try(
				Writer FW = new FileWriter("Property.properties");
		){
			Properties P = new Properties();
			P.setProperty("heroName", "西郷");
			P.setProperty("heroHp", "64");
			P.setProperty("heroMp", "23");
			P.store(FW, "勇者の情報");				//ここで初めて保存される
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		ResourceBundle rb = ResourceBundle.getBundle("C:/Users/grpn7/Property");		//ファイルの.propertiesは要らない
		String heroName = rb.getString("heroName");
		System.out.println(heroName);
		
		// TODO Auto-generated method stub

	}

}
