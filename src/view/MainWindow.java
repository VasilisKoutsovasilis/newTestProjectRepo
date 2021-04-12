package view;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends JFrame{
	public final static int WIDTH = 1200;
	public final static int HEIGHT = 800;
	public final static int TOP_HEIGHT = 80;
	public final static int PLAYER_WIDTH = 300;
	
	public MainWindow() {
		super("TIC-TAC-TOE");
		
		Container c = getContentPane();
		c.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MainWindow view = new MainWindow();
	}

}
