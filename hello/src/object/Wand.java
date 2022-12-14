package object;

//例外的状況の報告（例外を）投げる throw 例外インスタンス;
//一般的には　throw new 例外クラス名　（"エラーメッセージ"）;と使う
public class Wand {
	private String name;
	private double power;
	//アクセス修飾子で制限する為にgetterとsetterを用意します。
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		//名前は3文字以上にする
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖に設定されようとしている名前が異常です。");
		}
		this.name = name;
	}
	public double getPower() {
		return this.power;
	}
	//０．５以上１００以下にする
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です");
		}
		this.power = power;
	}
}
