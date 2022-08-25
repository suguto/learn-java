package fanctionAndLambda;
import java.util.*;
import java.util.stream.Collectors;

import basicOfInstance.Account;

public class Stream {
	//stream()とはfor文を使わずに各要素を回して結果を出せるもの
	
//						渡すべき関数			戻り値			動作
//	allMatch(関数)		Predicate<T>		boolean			全ての要素でtrueになるか
//	
//	anyMatch(関数)		Predicate<T>		boolean			少なくとも1つの要素でtrueとなるか
//	
//	noneMatch(関数)		Predicate<T>		boolean			全ての要素でfalseになるか
//	
//	forEach(関数)		Consumer<T>			void			各要素に関数を適応する
//	
//	findFirst()			なし					Optional<T>		最初の要素を返す
//	
//	findAny()			なし					Optional<T>		いずれかの要素を返す
//	
//	count()				なし					long			要素数を返す
//	
//	max(関数)			Comparator<T>		Optional<T>		大小関係を関数で評価し、最大の要素を返す
//	
//	min(関数)			Comparator<T>		Optional<T>		大小関係を関数で評価し、最小の要素を返す

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		Account a1 = new Account();
		a1.setZandaka(1000);
		Account a2 = new Account();
		a2.setZandaka(10000);
		Account a3 = new Account();
		a3.setZandaka(10);
		Account a4 = new Account();
		a4.setZandaka(9999);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		//～Matchはひとつひとつの要素をtrueかfalseで判定します
		boolean anyoneKnockOut = list.stream().anyMatch(a -> a.getZandaka() >= 100);	//for文を使わずに残高が100以上のアカウントを探し出してtrueにする
		System.out.println(anyoneKnockOut);
		
		//forEachは各要素に結果を返さない関数を適応するためのメソッド
		//listに入っている要素を回して出せる
		list.stream().forEach(a -> {
			System.out.println("残高は" + a.getZandaka() + "円です");
		});
		
		//streamから一つのある要素を取り出すメソッドが、findFirst(),findAny()の二つ
		//要素が見つからない場合もあるので戻り値にOptionalクラスが指定されている
		//get()で取り出す
		Optional<Account> hopt = list.stream().findFirst();
		if (hopt.isPresent()) {
			System.out.println("先頭のアカウントの残高は" + hopt.get().getZandaka() + "円です");
		}
		
		//
		Optional<Account> num = list.stream().max((x, y) -> x.getZandaka() - y.getZandaka());
		if (num.isPresent()) {
			System.out.println("一番の貯金額は" + num.get().getZandaka() + "円です" );
		}
		
		//リストlistをストリームにして、Listとして取り出す
		List<Account> Alist = list.stream().collect(Collectors.toList());
		
		//配列ArrayListをストリームにしてListとして取り出す
		//List<Account> ArrayList = Arrays.stream(Array).collect(Collectors.toList());
		
//						引数					意味
//		distinct()		なし					重複したストリームを返す
//		
//		filter()		Predicate<T>		Predicateを適応した結果がtrueである要素のストリームを返す
//		
//		limit()			long				先頭から指定された要素数までのストリームを返す
//		
//		sorted()		Comparator<T>		Comparatorを率いて並び変えたストリームを返す
//		
//		map()			Function<T,R>		Functionを適応した戻り値を要素とするR型のストリームを返す
						
		//Accountの数を数える
		long all = list.stream().count();
		System.out.println("登録されているアカウント数は" + all + "つです");
		
		//残高が１００円を超えているアカウントを数える
		long rich = list.stream().filter(a -> a.getZandaka() >= 100).count();
		System.out.println("残高が１００円超えているアカウントは" + rich + "つです");
		
		//残高が１００円を超えているアカウントを最大2人取り出す
		List<Integer> richMan = list.stream()
				.filter(a -> a.getZandaka() >= 100)		//残高が100以上のアカウントを取り出し
				.limit(2)								//最大２つまでに限定し
				.map(a -> a.getZandaka())				//Accountからzandakaを取得して
				.collect(Collectors.toList());			//リストとして取り出す
		System.out.println(richMan);
		
		// TODO Auto-generated method stub

	}

}
