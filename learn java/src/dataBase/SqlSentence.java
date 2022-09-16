package dataBase;
import java.sql.*;

public class SqlSentence {
	//更新系SQL文と検索系SQL文送信の違いはexecuteUpdate(), executeQuery()	

	public static void main(String[] args) {
		//更新系のSQL文
		//STEP1 送信すべきSQL文の雛形を準備
//		PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTER HERER HP <= ? OR NAME = ?");
//		
//		//STEP2 ひな形に値を流し込みSQL文を組み立てる
//		pstmt.setInt(1, 10);			//1番目の?に１０を流し込む
//		pstmt.setString(2, "坂本");		//2番目の?に"坂本"を流し込む
//		
//		//STEP3 組み立てたSQL文をDBMSに送信する
//		int r = pstmt.executeUpdate();
//		
//		//STEP4 処理結果を判定する
//		if (r != 0) {
//			System.out.println(r + "件のモンスターを削除しました");
//		}else {
//			System.out.println("該当するモンスターはありませんでした");
//		}
//		pstmt.close();
		
		//検索系のSQL文
//		STEP1　送信すべきSQL文の雛形を準備
//		PrepareStatement pstmt = con.prepareStatement("SELECT MONSTERS WHEHE HP >= ?");
//		
//		STEP2　ひな形に値を流し込みSQL文を組み立てる
//		pstmt.setInt(1,10);
//		
//		STEP3 組み立て終えたSQL文をDBMSに送信する
//		ResultSet rs = pstmt.executeQuery();
//		
//		STEP4 結果票を処理する
//		Resultクラスを参照
//		
//		rs.close();
//		pstmt.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
