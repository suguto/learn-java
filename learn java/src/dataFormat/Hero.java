package dataFormat;

import java.io.*;

import basicOfInstance.Sword;

//�����̃f�[�^���J���}�ŋ�؂��ď��Ɋi�[����f�[�^�t�H�[�}�b�g�̌`���̎���CSV�iComma-Separated Values�j�Ƃ���
//�f�[�^����؂邽�߂Ɏg�������̓f���~�^�ƌĂ΂�A�X�y�[�X��^�u�������g�����������

public class Hero implements Serializable {
	private String name;
	private int hp, mp;
	private Sword sword;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public Sword getSword() {
		return this.sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	
	public void saveHeroToFile(Hero h) {
		try (
				Writer bw =	new BufferedWriter(new FileWriter("java.txt"));
		){
			bw.write(h.name);
			bw.write(",");
			bw.write(h.hp);
			bw.write(",");
			bw.write(h.mp);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
