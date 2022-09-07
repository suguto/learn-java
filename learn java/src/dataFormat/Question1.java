package dataFormat;
import java.io.*;
import java.util.*;


public class Question1 {

	public static void main(String[] args) {
		try(
				Writer fw = new FileWriter("pref.properties");
		){
			Properties p = new Properties();
			p.setProperty("tokyo.capital", "ìåãû");
			p.setProperty("tokyo.food", "éıéi");
			p.setProperty("aichi.capital", "ñºå√âÆ");
			p.setProperty("aichi.food", "ñ°ëXÉJÉc");
			p.store(fw, "ñºï®");
			
			String tokyo = p.getProperty("tokyo.capital");
			String tFood = p.getProperty("tokyo.food");
			String aichi = p.getProperty("aichi.capital");
			String aFood = p.getProperty("aichi.food");
			
			System.out.println(aichi + ": " + aFood);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
			ResourceBundle rb = ResourceBundle.getBundle("pref");
			System.out.println(rb.getString("aichi.capital") + ":" + rb.getString("aichi.food"));			
		
		Employee sakamoto = new Employee();
		sakamoto.setName("ç‚ñ{");
		sakamoto.setAge(30);
		Department bakumatsu = new Department();
		bakumatsu.setName("ñãññéuém");
		bakumatsu.setLeader(sakamoto);
		
		try(
				FileOutputStream fos = new FileOutputStream("bakumatsu.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(bakumatsu);
			oos.flush();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
				
		// TODO Auto-generated method stub

	}

}
