package basicOfInstance;
import java.util.Comparator;

//�R���p���[�^�[���g���ĔC�ӂ̏��ԕ��ёւ��邱�Ƃ��ł���
public class ZandakaComparator implements Comparator<Account>{
	public int compare(Account x, Account y) {
		return (x.getZandaka() - y.getZandaka());
	}

}
