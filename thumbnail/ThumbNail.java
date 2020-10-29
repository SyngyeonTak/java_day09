package day1029.thumbnail;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThumbNail extends JFrame{
	JPanel p_north, p_main,p_south, p_west;
	String dir = "C:/공부/ETC/학원/workspace/java_workspace/SeProject/res/travel2/";
	String[] path = {
			"aa.jpg","ab.jpg","ax.jpg","bm.jpg","et.jpg","kg.jpg","mx.jpg"
	};
	MyPanel[] thumbs = new MyPanel[7];
	MyPanel2 p_center;
	JButton bt_prev, bt_next;
	JLabel la_path;
	public ThumbNail() {
		p_north = new JPanel();
		p_center = new MyPanel2();
		p_south = new JPanel();
		p_west = new JPanel();
		p_main = new JPanel();
		for (int i = 0; i < thumbs.length; i++) {
			thumbs[i] = new MyPanel(dir+path[i], p_center);
			thumbs[i].setPreferredSize(new Dimension(100, 100));
			p_west.add(thumbs[i]);
		}
		la_path = new JLabel(dir+path[0]);
		
		bt_prev = new JButton("◀");
		bt_next = new JButton("▶");
		
		p_main.setLayout(new BorderLayout());
		
		add(p_west, BorderLayout.WEST);
		add(p_main);
		
		p_main.add(p_north, BorderLayout.NORTH);
		p_main.add(p_center);
		p_main.add(p_south, BorderLayout.SOUTH);
		
		p_north.add(la_path);
		p_south.add(bt_prev);
		p_south.add(bt_next);
		
		p_north.setBackground(Color.blue);
		p_center.setBackground(Color.GREEN);
		p_south.setBackground(Color.magenta);
		p_west.setBackground(Color.gray);
		
		p_west.setPreferredSize(new Dimension(100, 770));
		p_north.setPreferredSize(new Dimension(700, 60));
		la_path.setForeground(Color.WHITE);
		
		setSize(800, 770);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ThumbNail();
	}

	
}









