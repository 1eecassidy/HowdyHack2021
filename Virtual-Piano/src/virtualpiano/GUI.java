
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel; 
	
	public GUI() {
		
		frame = new JFrame();
		
		JButton button1 = new JButton("Harmonize");
		button1.addActionListener(this);
		
		JButton button2 = new JButton("Triad");
		button2.addActionListener(this);
		
		JButton button3 = new JButton("Random");
		button3.addActionListener(this);
		
		ImageIcon image = new ImageIcon("piano.jpg");

		label = new JLabel("Number of clicks: 0");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(label);
		frame.getContentPane().setBackground(Color.red);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		frame.setIconImage(image.getImage());
	}
	
	public static void main(String[] args) {
		new GUI();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}
	
}
