package basicOfInstance;
import java.util.*;
import java.text.SimpleDateFormat;

public class main {

	public static void main(String[] args) throws Exception{
		Hero h = new Hero();
		h.setName("��{");
		h.setHp(50);
		h.setMp(20);
		System.out.println(h.toString());
		
		Set<Account> list = new HashSet<>();
		Account a1 = new Account();
		a1.setAccountNo("1234");
		list.add(a1);
		System.out.println("�v�f�� = " + list.size());
		a1 = new Account();
		a1.setAccountNo("1234");
		list.remove(a1);
		System.out.println("�v�f�� = " + list.size());
		
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
		Collections.sort(list1, new ZandakaComparator());	//�����Őݒ肵�����Ԃ̃N���X���w�肷��
		for (Account ac : list1) {
			System.out.println(ac.getNumber());
			System.out.println(ac.getZandaka());
		}
		
		Hero h1 = new Hero();
		Sword s = new Sword();
		s.setName("�����̂��̂ڂ�");
		h1.setName("����");
		h1.setHp(50);
		h1.setMp(20);
		h1.setSword(s);
		
		Hero clone = h1.clone();
		System.out.println(h1.toString());
		System.out.println(clone.toString());
		System.out.println("");
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		ArrayList<Book> books = new ArrayList<>();
		
		Book b1 = new Book();
		b1.setTitle("Java����");
		b1.setPublishDate(f.parse("2011/10/07"));
		b1.setComment("�X�b�L���킩��");
		books.add(b1);
		
		Book b2 = new Book();
		b2.setTitle("Python����");
		b2.setPublishDate(f.parse("2019/06/11"));
		b2.setComment("�͂ɂ�H");
		books.add(b2);
		
		Book b3 = new Book();
		b3.setTitle("C�������");
		b3.setPublishDate(f.parse("2018/06/21"));
		b3.setComment("���R����");
		books.add(b3);
		
		Collections.sort(books, new TitleComparator());
		
		for (Book b : books) {
			System.out.println(b.getTitle() + "" + f.format(b.getPublishDate()) + "" + b.getComment() );
		}
		
		// TODO Auto-generated method stub

	}

}
