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
	
	//equals���I�[�o�[���C�h���鎖�ɂ���Đ������������肷�邱�Ƃ��ł���
	public boolean equals(Object o) {	//������Object�^�ɂ��邱��
		if (o == this) return true;		//�@�@�������g�������Ƃ��ēn���ꂽ��A��������true��Ԃ�
		if (o == null) return false;	//�A�@null�������Ƃ��ēn���ꂽ��A��������false��Ԃ�
		if (!(o instanceof Account)) return false;	//�B�@�^���قȂ�Ȃ�Afalse��Ԃ�  instanceof�̓C���X�^���X�̌^���ꏏ���ǂ������ׂ�
		Account r = (Account) o;					//�����Ȃ�C�ɔ����āA��r�o����悤�ɓK�؂ɃL���X�g����
		if (!this.AccountNo.trim().equals(r.AccountNo.trim())){
			return false;							//�C�@�Q�̃C���X�^���X�����R��ׂ��t�B�[���h���m���r���ē��������肵ture��false��Ԃ�
		}
		return true;
	}
	
	//hash�n�̃R���N�V�����N���X�ł�hashCode()���I�[�o�[���C�h���ē���������s��
	//import java.util.Objects; ���L�q���Ă���
	public int hashCode() {
		return Objects.hash(this.AccountNo);	//field���������鎞�� return Objects.hash(this.name, this.hp);
		
	}
	
	//Comparable�C���^�[�t�F�[�X�����������compareTo()�̃I�[�o�[���C�h�����������
	public int compareTo(Account obj) {
		if (this.number < obj.number) {
			return -1;						//�������g�̕���obj�����������ꍇ�E�E�E���̐�
		}
		if (this.number > obj.number) {
			return 1;						//�������g�̕���obj�����傫���ꍇ�E�E�E���̐�
		}
		return 0;							//�������g��obj���������ꍇ�E�E�E0	
	}

}
