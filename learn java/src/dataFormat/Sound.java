package dataFormat;
import javax.sound.midi.*;
import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Sound {

	public static void main(String[] args) {
		//MIDI��BGM���Đ�����V���Z�T�C�U�i�V�[�P���T�j�̏���
		try(
				Sequencer seq = MidiSystem.getSequencer();
		){
			seq.open();
			seq.setSequence(MidiSystem.getSequence(new File("xmas-bgm.mid")));
			seq.setLoopCount(-1);			//���[�v�Đ����s��Ȃ��w��
			seq.start();					//���t�J�n
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//�N���X�}�X�x���̉���MAV����ǂݎ�鏀��
		try(
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("xmas-bell.wav"));
		){
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			
			System.out.println("�����[�N���X�}�X");
			System.out.println("�������͂����3�񂾂��x�����Ȃ��");
			
			for (int i = 0; i < 4; i++) {
				new Scanner(System.in).nextLine();
				clip.start();
				clip.setFramePosition(0);
				
				clip.stop();
				ais.close();
				
			}
		}catch (Exception e) {
			
		}
				
		// TODO Auto-generated method stub

	}

}
