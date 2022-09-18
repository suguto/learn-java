package dataBase;
import java.util.*;
import java.io.*;
import java.sql.*;

public class ItemDAO {
	public static ArrayList<Item> findByMinimumPrice(int i){
		try {
			Class.forName("org.h2.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE PRICE > ?");
			pstmt.setInt(1, i);
			ResultSet rs = pstmt.executeQuery();
			
			//������Item�����Ă���ArrayList������
			ArrayList<Item> items = new ArrayList<>();
			while (rs.next()) {			//���ʕ\�̑S�s���P������
				Item item = new Item();
				item.setName(rs.getString("NAME"));
				item.setPrice(rs.getInt("PRICE"));
				item.setWeight(rs.getInt("WEIGHT"));
				items.add(item);
			}
			rs.close();
			pstmt.close();
			return items;			//�Ō��ArrayList��Ԃ�
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			if (con != null) {
				try {
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
