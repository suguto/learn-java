package basicOfInstance;
import java.util.Objects;

public class Account implements Comparable<Account> {
	private String AccountNo;
	private int zandaka, number;
	
	public String getAccountNo() {
		return this.AccountNo;
	}
	public void setAccountNo(String accountNo) {
		this.AccountNo = accountNo;
	}
	public int getZandaka() {
		return this.zandaka;
	}
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	//equalsをオーバーライドする事によって正しく等価判定することができる
	public boolean equals(Object o) {	//因数はObject型にすること
		if (o == this) return true;		//①　自分自身が因数として渡されたら、無条件でtrueを返す
		if (o == null) return false;	//②　nullが因数として渡されたら、無条件でfalseを返す
		if (!(o instanceof Account)) return false;	//③　型が異なるなら、falseを返す  instanceofはインスタンスの型が一緒かどうか調べる
		Account r = (Account) o;					//同じなら④に備えて、比較出来るように適切にキャストする
		if (!this.AccountNo.trim().equals(r.AccountNo.trim())){
			return false;							//④　２つのインスタンスが持つ然るべきフィールド同士を比較して等価か判定しtureかfalseを返す
		}
		return true;
	}
	
	//hash系のコレクションクラスではhashCode()をオーバーライドして等価判定を行う
	//import java.util.Objects; を記述しておく
	public int hashCode() {
		return Objects.hash(this.AccountNo);	//fieldが複数ある時は return Objects.hash(this.name, this.hp);
		
	}
	
	//Comparableインターフェースを実装するとcompareTo()のオーバーライドが強制される
	public int compareTo(Account obj) {
		if (this.number < obj.number) {
			return -1;						//自分自身の方がobjよりも小さい場合・・・負の数
		}
		if (this.number > obj.number) {
			return 1;						//自分自身の方がobjよりも大きい場合・・・正の数
		}
		return 0;							//自分自身とobjが等しい場合・・・0	
	}

}
