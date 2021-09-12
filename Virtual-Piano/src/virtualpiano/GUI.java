package virtualpiano;


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
	
	int button1count = 0;
	int button2count = 0;
	int button3count = 0;
	int button4count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel; 
	JButton button1 = new JButton("Major Triad");
	JButton button2 = new JButton("Minor Triad");
	JButton button3 = new JButton("Major 7th");
	JButton button4 = new JButton("Minor 7th");

	VirtualPiano orignalpiano = new VirtualPiano(-1); 
	
	public GUI() {
		
		frame = new JFrame();
		button1.setActionCommand("something");
		button1.addActionListener(this);
		button1.setOpaque(true);
		button1.setBackground(null);
		button2.addActionListener(this);
		button2.setActionCommand("nothing");
		button2.setOpaque(true);
		button2.setBackground(null);
		button3.addActionListener(this);
		button3.setActionCommand("everything");
		button3.setOpaque(true);
		button3.setBackground(null);
		button4.addActionListener(this);
		button4.setActionCommand("all");
		button4.setOpaque(true);
		button4.setBackground(null);
		
		
		ImageIcon image = new ImageIcon("piano.jpg");

		label = new JLabel("Howdy! Choose a chord");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		panel.setBackground(new Color(180, 213, 250));
		
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
		// count++;
		// label.setText("Number of clicks: " + count);
		// label.setText(""+e.getSource());
		if (e.getActionCommand() == "something")
		{
			button1count++;
			//label.setText(""+button1count);
			if (button1count%2 == 1)
			{
				button1.setBackground(Color.GRAY);
				if (button2.getBackground() == Color.GRAY)
				{
					button2count++;
					button2.setBackground(null);
				}
				else if (button3.getBackground() == Color.GRAY)
				{
					button3count++;
					button3.setBackground(null);
				}
				else if (button4.getBackground() == Color.GRAY)
				{
					button4count++;
					button4.setBackground(null);
				}
				this.getHarmonyChoice();
			}
			else
			{
				button1.setBackground(null);
				this.getHarmonyChoice();
			}
			this.getHarmonyChoice();
		}
		else if (e.getActionCommand() == "nothing")
		{
			button2count++;
			if (button2count%2 == 1)
			{
				button2.setBackground(Color.GRAY);
				if (button1.getBackground() == Color.GRAY)
				{
					button1count++;
					button1.setBackground(null);
				}
				else if (button3.getBackground() == Color.GRAY)
				{
					button3count++;
					button3.setBackground(null);
				}
				else if (button4.getBackground() == Color.GRAY)
				{
					button4count++;
					button4.setBackground(null);
				}
				this.getHarmonyChoice();
			}
			else
			{
				button2.setBackground(null);
				this.getHarmonyChoice();
			}
			this.getHarmonyChoice();
		}
		else if (e.getActionCommand() == "everything")
		{
			button3count++;
			if (button3count%2 == 1)
			{
				button3.setBackground(Color.GRAY);
				if (button1.getBackground() == Color.GRAY)
				{
					button1count++;
					button1.setBackground(null);
				}
				else if (button2.getBackground() == Color.GRAY)
				{
					button2count++;
					button2.setBackground(null);
				}
				else if (button4.getBackground() == Color.GRAY)
				{
					button4count++;
					button4.setBackground(null);
				}
				this.getHarmonyChoice();
			}
			else
			{
				button3.setBackground(null);
				this.getHarmonyChoice();
			}
			this.getHarmonyChoice();
		}
		else if (e.getActionCommand() == "all")
		{
			button4count++;
			if (button4count%2 == 1)
			{
				button4.setBackground(Color.GRAY);
				if (button1.getBackground() == Color.GRAY)
				{
					button1count++;
					button1.setBackground(null);
				}
				else if (button2.getBackground() == Color.GRAY)
				{
					button2count++;
					button2.setBackground(null);
				}
				else if (button3.getBackground() == Color.GRAY)
				{
					button3count++;
					button3.setBackground(null);
				}
				this.getHarmonyChoice();
			}
			else
			{
				button4.setBackground(null);
				this.getHarmonyChoice();
			}
			this.getHarmonyChoice();
		}
	}

	public void getHarmonyChoice()
	{
		if (button1.getBackground() == Color.GRAY)
		{
			orignalpiano.setChoice(0);
		}
		else if (button2.getBackground() == Color.GRAY)
		{
			orignalpiano.setChoice(1);
		}
		else if (button3.getBackground() == Color.GRAY)
		{
			orignalpiano.setChoice(2);
		}
		else if (button4.getBackground() == Color.GRAY)
		{
			orignalpiano.setChoice(3);
		}
		else
		{
			orignalpiano.setChoice(-1);
		}
	}
}
