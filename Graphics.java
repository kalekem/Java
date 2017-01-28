package structures;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Graphics {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 600);
		frame.setVisible(true);
		frame.setTitle("Kenya");
		
		ImageIcon logoicon = new ImageIcon("kenya.png");
		Image logo = logoicon.getImage();
		frame.setIconImage(logo);
		
		frame.setResizable(false);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = frame.getSize().width;
		int h =frame.getSize().height;
		int x =(dim.width-w)/2;
		int y =(dim.height-h)/2;
		
		frame.setLocation(x, y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
