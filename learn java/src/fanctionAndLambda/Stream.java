package fanctionAndLambda;
import java.util.*;
import java.util.stream.Collectors;

import basicOfInstance.Account;

public class Stream {
	//stream()�Ƃ�for�����g�킸�Ɋe�v�f���񂵂Č��ʂ��o�������
	
//						�n���ׂ��֐�			�߂�l			����
//	allMatch(�֐�)		Predicate<T>		boolean			�S�Ă̗v�f��true�ɂȂ邩
//	
//	anyMatch(�֐�)		Predicate<T>		boolean			���Ȃ��Ƃ�1�̗v�f��true�ƂȂ邩
//	
//	noneMatch(�֐�)		Predicate<T>		boolean			�S�Ă̗v�f��false�ɂȂ邩
//	
//	forEach(�֐�)		Consumer<T>			void			�e�v�f�Ɋ֐���K������
//	
//	findFirst()			�Ȃ�					Optional<T>		�ŏ��̗v�f��Ԃ�
//	
//	findAny()			�Ȃ�					Optional<T>		�����ꂩ�̗v�f��Ԃ�
//	
//	count()				�Ȃ�					long			�v�f����Ԃ�
//	
//	max(�֐�)			Comparator<T>		Optional<T>		�召�֌W���֐��ŕ]�����A�ő�̗v�f��Ԃ�
//	
//	min(�֐�)			Comparator<T>		Optional<T>		�召�֌W���֐��ŕ]�����A�ŏ��̗v�f��Ԃ�

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		Account a1 = new Account();
		a1.setZandaka(1000);
		Account a2 = new Account();
		a2.setZandaka(10000);
		Account a3 = new Account();
		a3.setZandaka(10);
		Account a4 = new Account();
		a4.setZandaka(9999);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		//�`Match�͂ЂƂЂƂ̗v�f��true��false�Ŕ��肵�܂�
		boolean anyoneKnockOut = list.stream().anyMatch(a -> a.getZandaka() >= 100);	//for�����g�킸�Ɏc����100�ȏ�̃A�J�E���g��T���o����true�ɂ���
		System.out.println(anyoneKnockOut);
		
		//forEach�͊e�v�f�Ɍ��ʂ�Ԃ��Ȃ��֐���K�����邽�߂̃��\�b�h
		//list�ɓ����Ă���v�f���񂵂ďo����
		list.stream().forEach(a -> {
			System.out.println("�c����" + a.getZandaka() + "�~�ł�");
		});
		
		//stream�����̂���v�f�����o�����\�b�h���AfindFirst(),findAny()�̓��
		//�v�f��������Ȃ��ꍇ������̂Ŗ߂�l��Optional�N���X���w�肳��Ă���
		//get()�Ŏ��o��
		Optional<Account> hopt = list.stream().findFirst();
		if (hopt.isPresent()) {
			System.out.println("�擪�̃A�J�E���g�̎c����" + hopt.get().getZandaka() + "�~�ł�");
		}
		
		//
		Optional<Account> num = list.stream().max((x, y) -> x.getZandaka() - y.getZandaka());
		if (num.isPresent()) {
			System.out.println("��Ԃ̒����z��" + num.get().getZandaka() + "�~�ł�" );
		}
		
		//���X�glist���X�g���[���ɂ��āAList�Ƃ��Ď��o��
		List<Account> Alist = list.stream().collect(Collectors.toList());
		
		//�z��ArrayList���X�g���[���ɂ���List�Ƃ��Ď��o��
		//List<Account> ArrayList = Arrays.stream(Array).collect(Collectors.toList());
		
//						����					�Ӗ�
//		distinct()		�Ȃ�					�d�������X�g���[����Ԃ�
//		
//		filter()		Predicate<T>		Predicate��K���������ʂ�true�ł���v�f�̃X�g���[����Ԃ�
//		
//		limit()			long				�擪����w�肳�ꂽ�v�f���܂ł̃X�g���[����Ԃ�
//		
//		sorted()		Comparator<T>		Comparator�𗦂��ĕ��ѕς����X�g���[����Ԃ�
//		
//		map()			Function<T,R>		Function��K�������߂�l��v�f�Ƃ���R�^�̃X�g���[����Ԃ�
						
		//Account�̐��𐔂���
		long all = list.stream().count();
		System.out.println("�o�^����Ă���A�J�E���g����" + all + "�ł�");
		
		//�c�����P�O�O�~�𒴂��Ă���A�J�E���g�𐔂���
		long rich = list.stream().filter(a -> a.getZandaka() >= 100).count();
		System.out.println("�c�����P�O�O�~�����Ă���A�J�E���g��" + rich + "�ł�");
		
		//�c�����P�O�O�~�𒴂��Ă���A�J�E���g���ő�2�l���o��
		List<Integer> richMan = list.stream()
				.filter(a -> a.getZandaka() >= 100)		//�c����100�ȏ�̃A�J�E���g�����o��
				.limit(2)								//�ő�Q�܂łɌ��肵
				.map(a -> a.getZandaka())				//Account����zandaka���擾����
				.collect(Collectors.toList());			//���X�g�Ƃ��Ď��o��
		System.out.println(richMan);
		
		// TODO Auto-generated method stub

	}

}
