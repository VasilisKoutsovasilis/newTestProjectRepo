package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TopPanel extends JPanel{
	JButton quitBtn;
	JButton startGameBtn;
	JButton doneBtn;
	
	public TopPanel() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setBorder(new LineBorder(Color.gray, 1));
		this.setPreferredSize(new Dimension(MainWindow.WIDTH, MainWindow.TOP_HEIGHT));
		
		this.doneBtn = new JButton("Done");
		this.doneBtn.setPreferredSize(new Dimension(100, 40));
		this.doneBtn.setEnabled(false);
		this.add(doneBtn);
		
		this.quitBtn = new JButton("Quit");
		this.quitBtn.setPreferredSize(new Dimension(100, 40));
		this.quitBtn.addActionListener((evt)->{
			System.exit(0);
		});
		this.add(quitBtn);
		
		this.startGameBtn = new JButton("Start Game");
		this.setPreferredSize(new Dimension(100, 40));
		this.setEnabled(false);
		this.add(startGameBtn);
	}

}
