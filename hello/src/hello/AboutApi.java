package hello;

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
		
		// TODO Auto-generated method stub

	}

}
