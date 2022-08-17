package hello;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import object.Hero;

public class Collection {

	public static void main(String[] args) {
		//import java.util.ArrayList;を記述しておく
		//ArrayListは要素の挿入や削除（add(),remove()）が遅いが、　指定位置の要素の取得（get()）が早い
		//LinekdListは要素の挿入や削除（add(),remove()）が早いが、　指定位置の要素の取得（get()）が遅い
		
		//Link<>の型に入れるのがやりやすい
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);//add()は挿入,set()は上書き
		points.add(20);
		points.add(30);
		
//		ArrayListとLinkedListは使い方は同じだけど用途が違う
//		LinkedList<Integer> point = new LinkedList<Integer>();
//		points.add(40);//add()は挿入,set()は上書き
//		points.add(50);
//		points.add(60);
		
		for (int i : points) {
			System.out.println(i);
		}		
//		for (int i = 0; i < points.size(); i++) {  length()ではなくsize（）を使う
//			System.out.println(points.get(i));      表示するときはget()
//		}
		System.out.println("");
		
		//イテレータを使った繰り返し処理 import java.util.*;をしておく
		Iterator<Integer> it = points.iterator();
		while (it.hasNext()) { //hasNext()次の要素をさせるか判定するメソッド　次の要素をさせるなら繰り返す
			int i = it.next(); //next()次の内容を差し、その内容を取り出す
			System.out.println(i);
		}
		System.out.println("");
		
		//import java.util.HashSet; import java.util.Set; を記述しておく
		//Setは要素の重複が出来ない
		//順番がないため指定して取り出すことが出来ない
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");//重複しているため保存されない
		Iterator<String> itst = colors.iterator();
		while (itst.hasNext()) {
			String s = itst.next();
			System.out.println(s);
		}
		System.out.println("");
		
		//import java.util.treeSet; をしておく
		//TreeSetに格納すると辞書順に取り出すことが出来る
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.println(s);
		}
		System.out.println("");
		
		//import java.util.*;をしておく
		//HashMapはペアで格納したいときに使う
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);//追加はputを使う
		prefs.put("東京都", 1621);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は" + tokyo + "人");
		prefs.put("熊本県", 183);//キーが既に存在する場合は上書きします
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は" + kumamoto + "人");
		System.out.println("");
		
//		System.out.println("人口を知りたい場所の都道府県を入力してください");
//		System.out.println("現在は、東京都、京都府、熊本県のみ選べます");
//		String place = new java.util.Scanner(System.in).nextLine();
//		int get_place = prefs.get(place);
//		System.out.println(place + "の人口は" + get_place + "人です");
//		System.out.println("");
		
		//要素を全部取り出す方法
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value + "人です");
		}
		
		System.out.println("");
		Hero h1 = new Hero("かに");
		Hero h2 = new Hero("えび");
		List<Hero> hero = new ArrayList<>();
		hero.add(h1);
		hero.add(h2);
		Iterator<Hero> itH = hero.iterator();
		while(itH.hasNext()) {
			Hero h = itH.next();
			System.out.println(h.getName());
		}
		
		Map<Hero, Integer> hr = new HashMap<>();
		hr.put(h1, 5);
		hr.put(h2, 7);
		for (Hero h : hr.keySet()) {
			int i = hr.get(h);
			System.out.println(h.getName() + "が倒した数は" + i + "です");
		}
		
		// TODO Auto-generated method stub

	}

}
