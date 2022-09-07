package dataFormat;
import javax.sound.midi.*;
import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Sound {

	public static void main(String[] args) {
		//MIDIでBGMを再生するシンセサイザ（シーケンサ）の準備
		try(
				Sequencer seq = MidiSystem.getSequencer();
		){
			seq.open();
			seq.setSequence(MidiSystem.getSequence(new File("xmas-bgm.mid")));
			seq.setLoopCount(-1);			//ループ再生を行わない指示
			seq.start();					//演奏開始
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//クリスマスベルの音をMAVから読み取る準備
		try(
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("xmas-bell.wav"));
		){
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			
			System.out.println("メリークリスマス");
			System.out.println("何か入力すると3回だけベルがなるよ");
			
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
