package dataFormat;
import java.util.zip.*;
import java.util.*;
import java.io.*;

public class Zip {

	public static void main(String[] args) {
		try(
				ZipFile file = new ZipFile("rpg.jar");  //jarファイルも実体はZIPファイルなので開くことができる
		){
			for (ZipEntry e : Collections.list(file.entries())) {
				System.out.println(e.getName() + "size=" + e.getCompressedSize());
			}
		}catch (Exception e) {
			
		}
		
		// TODO Auto-generated method stub

	}

}
