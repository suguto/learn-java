package variousC;

//Innerクラスについて
public class Outer {
	int outerField;
	static int outerStaticField;
	static class Inner1 {				//メンバクラスの宣言
		void innerMethod() {			//staticがなしだと外部クラスを生成してからじゃないと使えない
			outerStaticField = 10;
		}
	}
	void outerMethod1() {
		Inner1 i1 = new Inner1();		//外部クラスからはクラス名のみで利用可能
	}
	
	void outerMethod2() {
		int a = 10;
		class Inner2 {					//ローカルクラスの宣言
			public void InnerMethod2() {
				System.out.println("Innermethod2です");
			}
		}
		Inner2 i2 = new Inner2();		//同じメソッド内ですぐに利用する
		i2.InnerMethod2();
	}
}
