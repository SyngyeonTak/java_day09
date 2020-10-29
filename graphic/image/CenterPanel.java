package day1029.graphic.image;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class CenterPanel extends JPanel{
	Image img;

	public void setImg(Image img) {
		this.img = img;
		this.img = this.img.getScaledInstance(770, 330, Image.SCALE_SMOOTH);
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(this.img, 0, 0, this);
	}
}
