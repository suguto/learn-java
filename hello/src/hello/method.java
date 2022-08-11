package hello;

public class method {

	public static void main(String[] args) {
		//introduceOneself("本間丈太郎", 67, 163.5);
		double x = 3.2;
		double y = 6.6;
		double resultOfTriangle = calcTriangleArea(x, y);
		System.out.println("高さ " + x + "cm ,底辺の長さが " + y + "cm の三角形の面積は" + resultOfTriangle + "です。");
		// TODO Auto-generated method stub

	}
	
	public static void introduceOneself(String name, int age, double height){
		System.out.println("私は" + name + "と言います。" + age + "才で、" + "身長は" + height + "です。");
	}
	
	public static double calcTriangleArea(double height, double bottom){
		double ans = bottom * height / 2;
		return ans;		
	}

}
