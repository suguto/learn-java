package dataBase;
import java.sql.*;

public class Transaction {
	
	//�g�����U�N�V�����Ƃ́A�v���O��������f�[�^�x�[�X�ɑ��M����1�ȏ��SQL���̗v�����P�̃O���[�v�Ƃ��Ĉ����l����
	//A��B�ɂ�����U�荞�ނƂ��ɁA���炵�đ��₷�Q��UPDATE���s���̂ł��̂Q�������ď��߂Đ��藧����
	//�Ȃ̂œr���Ŏ��s�����ꍇ�͂���܂ł̏������Ȃ��������Ƃɂ���

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
			con.setAutoCommit(false);		//�蓮�R�~�b�g���[�h�ɐ؂�ւ�
			
			//STEP2 SQL���M����
			//SqlSentence�N���X���Q��
			con.commit();					//�R�~�b�g�Ăяo���ȍ~�ɑ���ꂽ���ׂĂ�SQL���̗v����1�̃g�����U�N�V�����Ƃ݂Ȃ����
			
			}catch (SQLException e) {
				try {
					con.rollback();				//��������ُ킪�������ꍇ�̓L�����Z��������
			}
				catch (SQLException e2) {
					e2.printStackTrace();		
				}	
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
