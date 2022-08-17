package hello;
import java.time.*;


public class Time2 {

	public static void main(String[] args) {
		//Instant�̐���
		Instant i1 = Instant.now();
		
		//Instant��long�l�Ƃ̑��ݕϊ�
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		//ZonedDateTime�̐���
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		//Instant��ZonedDateTime�̑��ݕϊ�
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		//ZonedDateTime�̗��p�@
		System.out.println("����:" + z2.getYear() + z2.getMonth() + " " + z2.getDayOfMonth() + "�� " + z2.getHour() + "���ł�");
		System.out.println("�����h��:" + z3.getYear() + z3.getMonth() + " " + z3.getDayOfMonth() + "�� " + z3.getHour() + "���ł�");
		if (z2.isEqual(z3)) {
			System.out.println("�������Ԃł�");
		}
		
		//�^�C���]�[�����͊i�[���Ȃ� LocalDateTime�N���X
		//LocalDateTime�̐���
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2022, 1, 1, 5, 6, 0, 0);
		System.out.println(l1);
		System.out.println(l2);
		
		//LocalDateTime��ZonedDateTime�̑��ݕϊ�
		ZonedDateTime zone1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime local1 = zone1.toLocalDateTime();
		System.out.println(zone1);
		System.out.println(local1);
		
		
		// TODO Auto-generated method stub

	}

}
