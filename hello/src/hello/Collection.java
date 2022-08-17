package hello;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import object.Hero;

public class Collection {

	public static void main(String[] args) {
		//import java.util.ArrayList;���L�q���Ă���
		//ArrayList�͗v�f�̑}����폜�iadd(),remove()�j���x�����A�@�w��ʒu�̗v�f�̎擾�iget()�j������
		//LinekdList�͗v�f�̑}����폜�iadd(),remove()�j���������A�@�w��ʒu�̗v�f�̎擾�iget()�j���x��
		
		//Link<>�̌^�ɓ����̂����₷��
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);//add()�͑}��,set()�͏㏑��
		points.add(20);
		points.add(30);
		
//		ArrayList��LinkedList�͎g�����͓��������Ǘp�r���Ⴄ
//		LinkedList<Integer> point = new LinkedList<Integer>();
//		points.add(40);//add()�͑}��,set()�͏㏑��
//		points.add(50);
//		points.add(60);
		
		for (int i : points) {
			System.out.println(i);
		}		
//		for (int i = 0; i < points.size(); i++) {  length()�ł͂Ȃ�size�i�j���g��
//			System.out.println(points.get(i));      �\������Ƃ���get()
//		}
		System.out.println("");
		
		//�C�e���[�^���g�����J��Ԃ����� import java.util.*;�����Ă���
		Iterator<Integer> it = points.iterator();
		while (it.hasNext()) { //hasNext()���̗v�f�������邩���肷�郁�\�b�h�@���̗v�f��������Ȃ�J��Ԃ�
			int i = it.next(); //next()���̓��e�������A���̓��e�����o��
			System.out.println(i);
		}
		System.out.println("");
		
		//import java.util.HashSet; import java.util.Set; ���L�q���Ă���
		//Set�͗v�f�̏d�����o���Ȃ�
		//���Ԃ��Ȃ����ߎw�肵�Ď��o�����Ƃ��o���Ȃ�
		Set<String> colors = new HashSet<String>();
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");//�d�����Ă��邽�ߕۑ�����Ȃ�
		Iterator<String> itst = colors.iterator();
		while (itst.hasNext()) {
			String s = itst.next();
			System.out.println(s);
		}
		System.out.println("");
		
		//import java.util.treeSet; �����Ă���
		//TreeSet�Ɋi�[����Ǝ������Ɏ��o�����Ƃ��o����
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.println(s);
		}
		System.out.println("");
		
		//import java.util.*;�����Ă���
		//HashMap�̓y�A�Ŋi�[�������Ƃ��Ɏg��
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("���s�{", 255);//�ǉ���put���g��
		prefs.put("�����s", 1621);
		prefs.put("�F�{��", 181);
		int tokyo = prefs.get("�����s");
		System.out.println("�����s�̐l����" + tokyo + "�l");
		prefs.put("�F�{��", 183);//�L�[�����ɑ��݂���ꍇ�͏㏑�����܂�
		int kumamoto = prefs.get("�F�{��");
		System.out.println("�F�{���̐l����" + kumamoto + "�l");
		System.out.println("");
		
//		System.out.println("�l����m�肽���ꏊ�̓s���{������͂��Ă�������");
//		System.out.println("���݂́A�����s�A���s�{�A�F�{���̂ݑI�ׂ܂�");
//		String place = new java.util.Scanner(System.in).nextLine();
//		int get_place = prefs.get(place);
//		System.out.println(place + "�̐l����" + get_place + "�l�ł�");
//		System.out.println("");
		
		//�v�f��S�����o�����@
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "�̐l���́A" + value + "�l�ł�");
		}
		
		System.out.println("");
		Hero h1 = new Hero("����");
		Hero h2 = new Hero("����");
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
			System.out.println(h.getName() + "���|��������" + i + "�ł�");
		}
		
		// TODO Auto-generated method stub

	}

}
