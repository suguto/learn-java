package dataBase;
import java.sql.*;

public class JDBC {
	
//	DriverManager		DBMSへの接続準備のために使う
//	
//	Connection			DBMSへの接続や切断の際に使う
//	
//	PreparedStatement	SQL文を送信する際に利用する
//	
//	ResultSet			DBMSから検索結果を受け取る際に利用する

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
			
			//STEP2 SQL送信処理
			//SqlSentenceクラスを参照
			
			}catch (SQLException e) {
				e.printStackTrace();		//接続やSQL処理の失敗時の処理
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
