package dataFormat;
import java.io.*;
import org.apache.commons.*;

public class CSV {
//	�����̃f�[�^���J���}�ŋ�؂��ď��Ɋi�[����f�[�^�t�H�[�}�b�g�̌`���̎���CSV�iComma-Separated Values�j�Ƃ���
//	�f�[�^����؂邽�߂Ɏg�������̓f���~�^�ƌĂ΂�A�X�y�[�X��^�u�������g�����������
	

	public static void main(String[] args) {
		//������������������
		String s = "��{,����,�~�P";
		String[] st = s.split(",");
		for (String t : st) {
			System.out.println(t);
		}
		
		//commons-csv�̗��p��
//		try(
//				FileReader fr = new FileReader("java.txt");
//				Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
//		){		
//			for (CSVRecord r : records) {
//				String name = r.get(0);
//				String hp = r.get(1);
//				String mp = r.get(2);
//				System.out.println(name + "/" + hp + "/" + mp);
//			}
//		}catch (Exception e) {
//			System.out.println(e.getCause());
//		}

		// TODO Auto-generated method stub

	}

}
