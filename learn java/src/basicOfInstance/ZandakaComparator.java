package basicOfInstance;
import java.util.Comparator;

//コンパレーターを使って任意の順番並び替えることができる
public class ZandakaComparator implements Comparator<Account>{
	public int compare(Account x, Account y) {
		return (x.getZandaka() - y.getZandaka());
	}

}
