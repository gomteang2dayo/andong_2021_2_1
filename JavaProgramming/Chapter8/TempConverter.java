package Chapter8;

import java.awt.*;
import javax.swing.*;


public class TempConverter extends JFrame{
	public TempConverter() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label1 = new JLabel("ȭ���µ�");
		JLabel label2= new JLabel("�����µ�");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("��ȯ");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		setSize(300, 150);
		setTitle("�µ���ȯ��");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		TempConverter t = new TempConverter();
	}
}
