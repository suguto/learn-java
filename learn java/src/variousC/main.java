package variousC;
import static variousC.AccountType.*;

import java.util.*;

import basicOfInstance.Account;



public class main {
//	文字列sを文字cで挟んで装飾するメソッド
//	文字列sがnullまたは長さ0の場合は、nullを返す
//	戻り値は「nullの可能性がある」事を明示するために、単なるStringではなくOptional<String>とする
	
	public static Optional<String> decorate (String s, char c){		//Optional<String>で戻り値にnullの可能性がある事を認識される
		String r;
		if (s == null || s.length() == 0) {
			r = null;
		}else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}

	public static void main(String[] args) {
		Optional<String> Os = decorate("", '*');
		System.out.println(Os.orElse("nullの為処理できません"));		//nullを考慮した処理を書く
		
		Jenerics<String> j = new Jenerics<>();	//インスタンスを生成する時に<>の中に型を指定する
		j.put("データ");
		String s = j.getData();
		System.out.println(s);
		
		//import static variousC.AccountType.*;としておくことでAccountType.TENKIとする必要がなくなる
		Kouza k = new Kouza("1234", TENKI);
		System.out.println(k.getAccountNo() + " " + k.getAccountType());
		
		Outer.Inner1 i1 = new Outer.Inner1();		//無関係なクラスからは外部クラス名.メンバクラス名で利用
		
		//匿名クラスの使い方（その場限りの使い捨て）
//		Collections.sort(null, new Comparator<Account>() {
//			public compare(Account x, Account y) {
//				return (x.getZandaka() - y.getZandaka());
//			}
//		});		こんな感じで使うと余計にクラスを作らずに済む
		

		
		// TODO Auto-generated method stub
	}

}
