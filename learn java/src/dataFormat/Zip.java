package dataFormat;
import java.util.zip.*;
import java.util.*;
import java.io.*;

public class Zip {

	public static void main(String[] args) {
		try(
				ZipFile file = new ZipFile("rpg.jar");  //jar�t�@�C�������̂�ZIP�t�@�C���Ȃ̂ŊJ�����Ƃ��ł���
		){
			for (ZipEntry e : Collections.list(file.entries())) {
				System.out.println(e.getName() + "size=" + e.getCompressedSize());
			}
		}catch (Exception e) {
			
		}
		
		// TODO Auto-generated method stub

	}

}
