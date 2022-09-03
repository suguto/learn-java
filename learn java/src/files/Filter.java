package files;

public class Filter {
	//フィルタとはストリームの途中で変換処理すること。　暗号化するなど
	//FilterReader、FilterWriter、FilterInputStream、FilterOutputStreamのいずれかのクラスを継承しています
	//フィルタはストリームに接続するための道具なのでフィルタ単独でnewすることはできません
	//すでに存在するストリームを接続先としてコンストラクタに指定します
	
//	STEP1
//	FileOutputStream fos = new FileOutputStream("Bainary.txt");
//	
//	STEP2
//	CipherOutputStream cos = new CipherOutputStream(fos, algo);
//	
//	STEP3　　暗号化されたうえでファイルに流れていく
//	cos.write(65);

	//そしてさらに連結出来る
//	STEP3    更に文字バイトを変換するストリームoswを接続
//	OutputstreamWriter osw = new OutputStreamWriter(cos);
//	
//	STEP4
//	osw.write("AB");
	
	
	//バッファリングフィルタとは変換しないがまとまった量になったところで一気に下流へ流す
	//文字情報用：　BufferedReader, BufferedWriter	
	//バイト情報用：　BufferedInputStream, BufferedOutputStream
	
//	FileReader fr = new FileReader("java.txt");
//	BufferedReader br = new BufferedReader(fr);
//	String line = null;
//	while((line = br.readLine()) ! = null) {		readLine()は改行までの1行分のデータをString型で返してくれる
//		//lineの処理をする
//	}
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}
