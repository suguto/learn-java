package variousC;

public class Kouza {
	private String AccountNo;
	private int zandaka;
	private AccountType accountType;		//�w�肵�����l�ȊO���󂯎��Ȃ��悤�ɂ���ׂ�enum�Ő錾����
	
	//�R���X�g���N�^
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
