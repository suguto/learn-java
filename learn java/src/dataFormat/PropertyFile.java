package dataFormat;
import java.io.*;
import java.util.*;

public class PropertyFile {
	//�v���p�e�B�t�@�C���`���̎�ȃ��[��
//	�f�[�^�͕������Ƃ��ĕۑ�����
//	�e�s�ɂ́u�L�[�v�Ɓu�l�v���y�A�Ƃ��āA�������y�A�f���~�^�ŋ�؂��ċL�q����
//	�y�A�f���~�^�́@= or :�@or�@�󔒂̂����ꂩ�̕���
//	# or ! �Ŏn�܂�s�̓R�����g�Ƃ��Ė��������
//	�t�@�C���̊g���q�ɂ́u.properties�v���g��

	public static void main(String[] args) {
		try(
				FileWriter fw = new FileWriter("java.properties");		//�㏑������ׁAtrue�͕t���Ȃ�
		){
			fw.write("heroName=��{" + "\n");
			fw.write("heroHp=75" + "\n");
			fw.write("heroMp=20" + "\n");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//�ǂݎ���
		try(
				Reader fr = new FileReader("java.properties");
		){
			Properties p = new Properties();
			p.load(fr);									//load()�œǂݎ��
			String name = p.getProperty("heroName");
			String strHp = p.getProperty("heroHp");
			int hp = Integer.parseInt(strHp);			//Properties�͑S�ĕ�����Ƃ��Ĉ����̂�integerParseInt�Ȃǂ��g��
			System.out.println("�E�҂̖��O�F�@" + name);
			System.out.println("�E�҂�HP�F�@" + hp);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//�������ݕ�
		try(
				Writer FW = new FileWriter("Property.properties");
		){
			Properties P = new Properties();
			P.setProperty("heroName", "����");
			P.setProperty("heroHp", "64");
			P.setProperty("heroMp", "23");
			P.store(FW, "�E�҂̏��");				//�����ŏ��߂ĕۑ������
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		ResourceBundle rb = ResourceBundle.getBundle("C:/Users/grpn7/Property");		//�t�@�C����.properties�͗v��Ȃ�
		String heroName = rb.getString("heroName");
		System.out.println(heroName);
		
		// TODO Auto-generated method stub

	}

}
