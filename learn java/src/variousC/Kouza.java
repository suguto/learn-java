package variousC;

public class Kouza {
	private String AccountNo;
	private int zandaka;
	private AccountType accountType;		//指定したい値以外を受け取らないようにする為にenumで宣言する
	
	//コンストラクタ
	public Kouza(String AccountNo, AccountType accountType) {
		this.AccountNo = AccountNo;
		this.accountType = accountType;
	}
	
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
	public AccountType getAccountType() {
		return this.accountType;
	}


}
