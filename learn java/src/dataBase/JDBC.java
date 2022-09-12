package dataBase;
import java.sql.*;

public class JDBC {
	
//	DriverManager		DBMS�ւ̐ڑ������̂��߂Ɏg��
//	
//	Connection			DBMS�ւ̐ڑ���ؒf�̍ۂɎg��
//	
//	PreparedStatement	SQL���𑗐M����ۂɗ��p����
//	
//	ResultSet			DBMS���猟�����ʂ��󂯎��ۂɗ��p����

	public static void main(String[] args) {
		//STEP0	���O�����ijar�z�u���܂ށj
		try {
			Class.forName("org.h2.Driver");
			}catch (ClassNotFoundException e) {
				throw new IllegalStateException("�h���C�o�̃��[�h�Ɏ��s���܂���");
			}		//JDBC�h���C�oJAR��������Ȃ��ꍇ�̏���
		
		Connection con = null;
		try {
			//STEP1	�f�[�^�x�[�X�̐ڑ�
			con = DriverManager.getConnection("jdbc:h2:~/S-java");
			
			//STEP2 SQL���M����
			//SqlSentence�N���X���Q��
			
			}catch (SQLException e) {
				e.printStackTrace();		//�ڑ���SQL�����̎��s���̏���
			}finally{
				//STEP3 �f�[�^�x�[�X�ڑ��̐ؒf
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
