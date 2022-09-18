package dataBase;
import java.sql.*;

public class Transaction {
	
	//トランザクションとは、プログラムからデータベースに送信する1つ以上のSQL文の要求を１つのグループとして扱う考え方
	//AがBにお金を振り込むときに、減らして増やす２つのUPDATEを行うのでこの２つが揃って初めて成り立つもの
	//なので途中で失敗した場合はそれまでの処理をなかったことにする

	public static void main(String[] args) {
		//STEP0	事前準備（jar配置を含む）
		try {
			Class.forName("org.h2.Driver");
			}catch (ClassNotFoundException e) {
				throw new IllegalStateException("ドライバのロードに失敗しました");
			}		//JDBCドライバJARが見つからない場合の処理
		
		Connection con = null;
		try {
			//STEP1	データベースの接続
			con = DriverManager.getConnection("jdbc:h2:~/S-java");
			con.setAutoCommit(false);		//手動コミットモードに切り替え
			
			//STEP2 SQL送信処理
			//SqlSentenceクラスを参照
			con.commit();					//コミット呼び出し以降に送られたすべてのSQL文の要求が1つのトランザクションとみなされる
			
			}catch (SQLException e) {
				try {
					con.rollback();				//何かしら異常があった場合はキャンセルをする
			}
				catch (SQLException e2) {
					e2.printStackTrace();		
				}	
			}finally{
				//STEP3 データベース接続の切断
				if(con != null) {
					try {
						con.close();
					}catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		
		// TODO Auto-generated method stub

	}

}
