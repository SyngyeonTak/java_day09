package day1029.thumbnail;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener{
	String path;
	Image img;
	MyPanel2 p_center;
	public MyPanel(String path, MyPanel2 p_center) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		img = kit.getImage(path);
		img = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		this.addMouseListener(this);
		this.p_center = p_center;
		this.path = path;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		p_center.setPath(path);
		p_center.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
}
