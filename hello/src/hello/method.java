package hello;

public class method {

	public static void main(String[] args) {
		//introduceOneself("�{�ԏ䑾�Y", 67, 163.5);
		double x = 3.2;
		double y = 6.6;
		double resultOfTriangle = calcTriangleArea(x, y);
		System.out.println("���� " + x + "cm ,��ӂ̒����� " + y + "cm �̎O�p�`�̖ʐς�" + resultOfTriangle + "�ł��B");
		// TODO Auto-generated method stub

	}
	
	public static void introduceOneself(String name, int age, double height){
		System.out.println("����" + name + "�ƌ����܂��B" + age + "�˂ŁA" + "�g����" + height + "�ł��B");
	}
	
	public static double calcTriangleArea(double height, double bottom){
		double ans = bottom * height / 2;
		return ans;		
	}

}
