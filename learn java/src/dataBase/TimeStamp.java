package dataBase;
import java.sql.*;

public class TimeStamp {
	
//	Date型のような日時情報をデータベースに格納するには、TIMESTAMP型の列を準備する
//	DBの型		DBに対するJDBC型		Javaで主に利用する型
//	
//	DATE型		java.sql.Data		３つのint,java.time.LocalTime
//	
//	TIME型		java.sql.Time		４つのint,java,time.LocalTime
//	
//	TIMESTAMP型	java.sql.Timestamp	7つのint,java.util.Date,java.time.LocalDateなど

	public static void main(String[] args) {
		
//		java.util.Date d = new java.util.Date();
//		long l = d.getTime();					//一旦long値に変換する
//		Timestamp ts = new Timestamp(1);		//Timestamp型としてnewする
//		pstmt.setTimestamp(1, ts);
		
		
//		SELECT文の結果表に含まれるTIMESTAMP型の列の情報を取り出したいときは、ResultSetのgetTimestamp()を使う
	
//		Timestamp ts = rs.getTimestamp(1);
//		long l = ts.getTime();
//		java.util.Date d = new Date(1);			//Date型としてnewする
		// TODO Auto-generated method stub

	}

}
