package day1029.collection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCollection extends JFrame implements ActionListener{
	JPanel p_north, p_center;
	JButton bt1, bt2;
	ArrayList<JButton> btn_array = new ArrayList<JButton>();
	static int index =0;
	public ButtonCollection() {
		p_north = new JPanel();
		p_center = new JPanel();
		bt1 = new JButton("생성");
		bt2 = new JButton("배경색");
		
		
		p_north.add(bt1);
		p_north.add(bt2);
		
		
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		bt1.addActionListener(this);
		p_north.setBackground(Color.YELLOW);
		p_center.setBackground(Color.GREEN);
		
		
		setSize(500, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		index++;
		btn_array.add(new JButton("버튼"+index));
		for (int i = 0; i < btn_array.size(); i++) {
			p_center.add(btn_array.get(i));
			
		}
	}
	
	public static void main(String[] args) {
		new ButtonCollection();
	}

}
