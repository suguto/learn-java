package hello;

public class calculation {

	public static void main(String[] args) {
		System.out.println("ようこそおみくじボックスへ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		//int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(5);
		System.out.println(name + "さん(" + ageString + ")の運勢は・・・？");
		String[] omikuji = {"大吉", "中吉", "吉", "凶", "大凶"};
		System.out.println(omikuji[fortune] + "です！");
		
		
		// TODO Auto-generated method stub

	}

}
