package hello;

public class roop {

	public static void main(String[] args) {
		System.out.println("数当てゲーム！");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i < 3; i++) {
			System.out.println("０〜９の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(ans == num) {
				System.out.println("当たり！");
				break;
			}else {
				System.out.println("は〜ずれ！");
			}
		}
		System.out.println("楽しかった？");
		
		
		// TODO Auto-generated method stub

	}

}
