package jvm;
import java.util.*;

public class MemoryEater {

	public static void main(String[] args) {
		if (Locale.getDefault().getLanguage().equals("ja")){
			System.out.println("ƒƒ‚ƒŠ‚ğÁ”ï‚µ‚Ä‚¢‚Ü‚·");
		}else {
			System.out.println("eating memory...");
		}
		
		long[] larray = new long[128000];
		for (int i = 0; i < larray.length; i++) {
			larray[i] = i;
		}
		
		// TODO Auto-generated method stub

	}

}
