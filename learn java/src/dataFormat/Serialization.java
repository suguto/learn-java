package dataFormat;
import java.io.*;

public class Serialization {
	//����C���X�^���X�̓��e���ۂ��ƃo�C�g��ɕϊ�������A���̋t�Ƀo�C�g����C���X�^���X�ɖ߂����Ƃ��o����
	//����𒼗񉻁iserialization�j�Ƃ���
	//���񉻂����N���X�̒��ɕʃN���X�̃C���X�^���X������ꍇ�͂������ɂ�serializable���p������

	public static void main(String[] args) {
		//���񉻂��邽�߂ɂ͂��̃C���X�^���X�̃N���X��serializable���p�����Ă����K�v������
		Hero h = new Hero();
		h.setName("�~�P");
		h.setHp(32);
		h.setMp(10);
		//�C���X�^���X�̒��񉻂ƕۑ�
		try(
				FileOutputStream fos = new FileOutputStream("Instance.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(h);			//�C���X�^���X -> �o�C�g��
			oos.flush();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//�t�@�C������C���X�^���X�𕜌�
		try(
				FileInputStream fis = new FileInputStream("Instance.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
		){
			Hero h1 = (Hero)ois.readObject();		//�o�C�g��@-> �C���X�^���X
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
