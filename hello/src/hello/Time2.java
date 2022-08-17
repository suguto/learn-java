package hello;
import java.time.*;


public class Time2 {

	public static void main(String[] args) {
		//Instantの生成
		Instant i1 = Instant.now();
		
		//Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		//ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		//InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		//ZonedDateTimeの利用法
		System.out.println("東京:" + z2.getYear() + z2.getMonth() + " " + z2.getDayOfMonth() + "日 " + z2.getHour() + "時です");
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + " " + z3.getDayOfMonth() + "日 " + z3.getHour() + "時です");
		if (z2.isEqual(z3)) {
			System.out.println("同じ時間です");
		}
		
		//タイムゾーン情報は格納しない LocalDateTimeクラス
		//LocalDateTimeの生成
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2022, 1, 1, 5, 6, 0, 0);
		System.out.println(l1);
		System.out.println(l2);
		
		//LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime zone1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime local1 = zone1.toLocalDateTime();
		System.out.println(zone1);
		System.out.println(local1);
		
		
		// TODO Auto-generated method stub

	}

}
