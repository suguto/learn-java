package basicOfInstance;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("坂本");
		h.setHp(50);
		h.setMp(20);
		System.out.println(h.toString());
		
		Set<Account> list = new HashSet<>();
		Account a1 = new Account();
		a1.setAccountNo("1234");
		list.add(a1);
		System.out.println("要素数 = " + list.size());
		a1 = new Account();
		a1.setAccountNo("1234");
		list.remove(a1);
		System.out.println("要素数 = " + list.size());
		
		List<Account> list1 = new ArrayList<>();
		Account a2 = new Account();
		a2.setNumber(456);
		a2.setZandaka(10000);
		list1.add(a2);
		
		Account a3 = new Account();
		a3.setNumber(123);
		a3.setZandaka(10002);
		list1.add(a3);
		
		Account a4 = new Account();
		a4.setNumber(789);
		a4.setZandaka(10006);
		list1.add(a4);
		Collections.sort(list1);
		for (Account ac : list1) {
			System.out.println(ac.getNumber());
			System.out.println(ac.getZandaka());
		}
		System.out.println("");
		Collections.sort(list1, new ZandakaComparator());	//自分で設定した順番のクラスを指定する
		for (Account ac : list1) {
			System.out.println(ac.getNumber());
			System.out.println(ac.getZandaka());
		}
		
		Hero h1 = new Hero();
		Sword s = new Sword();
		s.setName("くすのきのぼう");
		h1.setName("西郷");
		h1.setHp(50);
		h1.setMp(20);
		h1.setSword(s);
		
		Hero clone = h1.clone();
		System.out.println(h1.toString());
		System.out.println(clone.toString());
		
		// TODO Auto-generated method stub

	}

}
