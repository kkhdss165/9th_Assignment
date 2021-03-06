package Assignment_9th;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCounter extends JFrame implements ActionListener {
	private JLabel label, label1;
	private JButton button;
	private int count = 0;
	public MyCounter() {
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);
		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", 	// 레이블에 폰트를 설정한다. 
			Font.BOLD | Font.ITALIC, 100)); 
		panel.add(label1);
		button = new JButton("카운터 증가");
		panel.add(button);
		button.addActionListener(this);
		add(panel);
		setSize(300, 200);
		setTitle("My Counter");
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyCounter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		count++;
		label1.setText("" + count);
		label1.setFont(new Font("Serif", 	// 레이블에 폰트를 설정한다. 
			Font.BOLD | Font.ITALIC, 100));
	}
}

