package dataFormat;
import java.io.*;

public class Serialization {
	//あるインスタンスの内容を丸ごとバイト列に変換したり、その逆にバイト列をインスタンスに戻すことが出来る
	//これを直列化（serialization）という
	//直列化したクラスの中に別クラスのインスタンスがある場合はそっちにもserializableを継承する

	public static void main(String[] args) {
		//直列化するためにはそのインスタンスのクラスでserializableを継承しておく必要がある
		Hero h = new Hero();
		h.setName("ミケ");
		h.setHp(32);
		h.setMp(10);
		//インスタンスの直列化と保存
		try(
				FileOutputStream fos = new FileOutputStream("Instance.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(h);			//インスタンス -> バイト列
			oos.flush();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//ファイルからインスタンスを復元
		try(
				FileInputStream fis = new FileInputStream("Instance.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
		){
			Hero h1 = (Hero)ois.readObject();		//バイト列　-> インスタンス
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
