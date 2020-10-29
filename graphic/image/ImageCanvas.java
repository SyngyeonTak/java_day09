package day1029.graphic.image;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImageCanvas extends Canvas implements MouseListener{
	Image img;
	CenterPanel p_center;
	public ImageCanvas(CenterPanel p_center, Image img) {
		this.p_center = p_center;
		this.img = img;
		this.setPreferredSize(new Dimension(100, 100));
		this.addMouseListener(this);
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(this.img, 0, 0, this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		p_center.setImg(this.img);
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
	
	
}
