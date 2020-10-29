package day1029.thumbnail;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MyPanel2 extends JPanel{
	Image img;
	String path;
	public MyPanel2() {
	}
	
	public void setPath(String path) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		img = kit.getImage(path);
		img = img.getScaledInstance(700, 630, Image.SCALE_SMOOTH);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}

}
