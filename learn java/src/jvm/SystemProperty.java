package jvm;

import java.util.Iterator;
import java.util.Properties;

public class SystemProperty {

	public static void main(String[] args) {
//		//���炩�̃f�[�^��ǂݍ��ޏ���
//		boolean isError = true;
//		if (isError) {
//			System.out.println("�f�[�^�����Ă��邽�߈ُ�I�����܂�");
//			System.exit(1);		//������JVM���ُ�I������
//		}
//		System.out.println("����I�����܂���");
		
//		System.out.println("�v�Z���J�n���܂�");
//		//���炩�̌v�Z����
//		System.out.println("�v�Z�����B���ʂ��������ŕ\�����܂�");
//		ProcessBuilder pb = new ProcessBuilder(		//ProcessBuilder�N���X���g�����ƂŌv�Z���ʂ��N�������������ɕ\�������鎖���o����
//		"c:\\windows\\system32\\notepad.exe",		//�������̎��s�t�@�C��
//		"calcreport.txt"
//		);
//		pb.start();		//�N��
		
		//�V�X�e���v���p�e�B
		System.out.println("���p����Java�o�[�W����");
		System.out.println(System.getProperty("java.version"));
		System.out.println("���p����Java�C���X�g�[����̃f�B���N�g��");
		System.out.println(System.getProperty("java.home"));
		System.out.println("���쒆��OS�̖��O");
		System.out.println(System.getProperty("os.name"));
		System.out.println("���쒆��OS�̉��s�R�[�h");
		System.out.println(System.getProperty("line.separator"));
		System.out.println("���s�������[�U�[�̖��O");
		System.out.println(System.getProperty("user.name"));
		System.out.println("");
		
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("�V�X�e���v���p�e�B�ꗗ");
		while (i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
		System.out.println("");
		
		//�V�X�e���v���p�e�B�͎擾���邾���łȂ��ǉ���ύX�����鎖���o����
//		String ver = System.getProperty("rpg.version");
//		String author = System.getProperty("rpg.author");
//		System.out.println("RPG: �X�b�L�����������@ver" + ver);
//		System.out.println("Developed by " + author);
		
		// TODO Auto-generated method stub

	}

}
