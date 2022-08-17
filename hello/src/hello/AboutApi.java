package hello;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class AboutApi {

	public static void main(String[] args) {
		String s1 = "初めましてHello";
		String s2 = "Hello";
		String s3 = "hello";
		String s4 = "";
		String s5 = "Java and Javascript";
		String s6 = " わにゃ　";
		
		if (!s2.equals(s3)) {
			System.out.println("内容が同じではない");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("大文字小文字を区別しなければ同じ");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s4.isEmpty()) {
			System.out.println("s4は空文字です");
		}
		if (s5.contains("Java")) {
			System.out.println("s5にJavaが含まれています");
		}
		if (s5.endsWith("Java")) {
			System.out.println("s5の末尾にJavaがあります");
		}
		if (s5.startsWith("Java")) {
			System.out.println("s5の最初にJavaがあります");
		}
		System.out.println("s5で最初にJavaが登場するのは" + s5.indexOf("Java") + "番目");
		System.out.println("s5で最後にJavaが登場するのは" + s5.lastIndexOf("Java") + "番目");
		
		System.out.println("これは" + s5.charAt(0) + "です");//指定の1文字切り取ります
		System.out.println("これは" + s5.substring(9) + "です");//指定の場所から表示します
		System.out.println("これは" + s5.substring(5, 8) + "です");//指定の場所から指定の場所を切り取ります
		
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		System.out.println(s6.trim() + "わにゃ");//前後の空白を消しますが、全角スペースは消せません
		System.out.println(s5.replace("Java", "わにゃ"));//文字を入れ替えます
		
		StringBuilder sb = new StringBuilder();//StringBuilderクラスを使うと+演算子を使うよりも早く処理することが出来る
		for (int i = 0; i < 10; i++) {
			sb.append("Java");//appendを使う
		}
		String s = sb.toString();
		System.out.println(s);//連結するときのみに使う
		
		//チェックを行うメソッド
		if (s2.matches("Hello")) {//s2がHelloだったら
			System.out.println("true 1");
		}
		if (s2.matches("H.llo")) {//.は何でもいいので1文字が入ってれば良し
			System.out.println("true 2");
		}
		if ("Hellllllo".matches("Hel*o")) {//*は直前の文字が０回以上繰り返してもよい
			System.out.println("true 3");
		}
		if (s2.matches(".*")) {//何でもよい
			System.out.println("true 4");
		}
		//{} 指定回数の繰り返し
		//{n} n回の繰り返し
		//{n,} n回以上の繰り返し
		//{n,m} n回以上m回以下の繰り返し
		//? 直前の文字の0回か1回の繰り返し
		//+ 直前の文字の１回以上の繰り返し
		
		//[] 指定する文字
		//ex( s2.matches("[Heo]") Heoのどれか
		//[a-z]はa~zのどれか
		if (s3.matches("[a-z]{5}")) {//a-zのどれかで5文字が一致しているか　[]{}は間を開けない
			System.out.println("true 5");
		}
		// \\dは[0-9], \\wは[a-zA-Z_0-9]
		if ("7438".matches("\\d{4}")) {//0-9の4文字
			System.out.println("true 6");
		}
		if (s2.matches("^H.*o$")) {//^は先頭の文字（H）、*は末尾の文字（o）
			System.out.println("true 7");
		}
		
		String separate = "ABC,def, EFG";
		String[] s_array = separate.split("[,]");//，か:で区切って取り出す
		for (String sepa : s_array) {
			System.out.println(sepa + "");
		}
		
		String r = s5.replaceAll("[Ja]", "X");//"[Ja]"を"X"に変える
		System.out.println(r);
		
		//%(,3桁ごとにカンマを入れる、　0空き領域を０埋め、　-左詰め、　+符号を強制表示）（桁数）（d:整数　s:文字列　f:　小数　b:真偽）
		//例えば、%,d %-5sなど　最初の２つは省略できる 
		String n = "AB";
		String n1 = "ABCDE";
		int money = 1234567;
		final String FORMAT = "%-3s %-5s 所持金%-7d";
		String s_for = String.format(FORMAT, n, n1, money);
		System.out.println(s_for);
		

		
		
		// TODO Auto-generated method stub

	}

}
