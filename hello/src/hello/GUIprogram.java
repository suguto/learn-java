package hello;
import java.awt.FlowLayout;
import javax.swing.*;

//GUI�Ƃ̓}�E�X���g���đ��삪�o���āALayout����邱�Ƃ��o����
public class GUIprogram {

	public static void main(String[] args) {
		JFrame frame = new JFrame("���߂Ă�GUI");
		JLabel label = new JLabel("Hello World");
		JButton button = new JButton("����");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		// TODO Auto-generated method stub

	}

}
