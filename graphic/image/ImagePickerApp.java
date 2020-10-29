package day1029.graphic.image;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePickerApp extends JFrame{
	Toolkit kit = Toolkit.getDefaultToolkit();
	
	ImageCanvas[] can_array = new ImageCanvas[7];
	Image[] img_array= new Image[can_array.length]; 
	String dir="C:/공부/ETC/학원/workspace/java_workspace/SeProject/res/travel2/";
	String[] src = {
			"aa.jpg", "ab.jpg", "ax.jpg", "bm.jpg", "et.jpg", "kg.jpg", "mx.jpg", "pk.jpg", "ub.jpg", "ya.jpg"
		};
	
	JPanel p_north;
	CenterPanel p_center;
	
	public ImagePickerApp() {
		p_north = new JPanel();
		p_center = new CenterPanel();
		for (int i = 0; i < img_array.length; i++) {
			img_array[i] = kit.getImage(dir+src[i]);
			img_array[i] = img_array[i].getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			can_array[i] = new ImageCanvas(p_center, img_array[i]);
			p_north.add(can_array[i]);
		}
		
		p_north.setBackground(Color.BLACK);
		
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		setSize(770, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ImagePickerApp();
	}
}
