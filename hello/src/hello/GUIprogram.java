package hello;
import java.awt.FlowLayout;
import javax.swing.*;

//GUIとはマウスを使って操作が出来て、Layoutも作ることが出来る
public class GUIprogram {

	public static void main(String[] args) {
		JFrame frame = new JFrame("初めてのGUI");
		JLabel label = new JLabel("Hello World");
		JButton button = new JButton("押す");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		// TODO Auto-generated method stub

	}

}
