package hello;
import java.io.*;

public class AboutException {
	//��O�����ɂ���

	public static void main(String[] args) {
		
		//FileWriter���g���Ƃ���import java.io.*;�����Ă���
		//�ϐ��̃X�R�[�v�̊֌W��finally��fw����肭�g���Ȃ��Ȃ��Ă��܂����߃X�R�[�v�̊O�Œ�`����
		FileWriter fw  = null;								//null���Z�b�g����
		try {												//���C���̎��s��(try)
			fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		}catch(IOException e){								//����IoException�G���[��������������s����(catch)
			System.out.println("�G���[���������܂���");			//�����Ŏg���Ă���e�ɂ̓G���[�̏ڍ׏�񂪊i�[����Ă���	
		}													//e.getMessage()�ŃG���[���b�Z�[�W���擾���� e.printStackTrace()�ŃX�^�b�N�g���[�X�̓��e��\������
															//�X�^�b�N�g���[�X�Ƃ͂ǂ��ŗ�O���������������L�^�������
		finally {											//finally�Ƃ͗�O�������Ă��Ȃ��Ă����s���鏈�� ���ƕЕt�������Ȃ�
			if (fw != null) {								//�t�@�C���A�f�[�^�x�[�X�ڑ��A�l�b�g���[�N�ڑ��Ȃǂ̎��ɋL�q����
				try {
					fw.close();
				}catch(IOException e) {
					;
				}
			}
		}
		
		//���̒����������ȗ�����������
		try (FileWriter FW = new FileWriter("data.txt");){	//close�ɂ���Еt�����K�v�ȕϐ��̐錾
			FW.write("hey!");								//finally�����Ȃ��Ă������I��close�����
		}catch(Exception e) {
			System.out.println("���炩�̗�O���������܂���");
		}
		
		//��O�I�󋵂̕񍐁i��O���j������ throw ��O�C���X�^���X;
		//��ʓI�ɂ́@throw new ��O�N���X���@�i"�G���[���b�Z�[�W"�j;�Ǝg��
		//��F�@Object�p�b�P�[�W��Wand,Wizard�N���X���Q��
		
		try {
			String s = null;
			System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println("NullPointerException��O���@catch���܂���");
			System.out.println("�X�^�b�N�g���[�X�i��������j�@" );
			e.printStackTrace();
			System.out.println("�X�^�b�N�g���[�X�i�����܂Łj�@");
		}
		
		try {
			int i = Integer.parseInt("�O");
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException��O��catch���܂���");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
