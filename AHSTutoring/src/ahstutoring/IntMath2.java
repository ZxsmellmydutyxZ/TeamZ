package ahstutoring;

import java.awt.*;
//Logan Coon
//Period 6 CS3
import javax.swing.*;
import java.awt.event.*;
public class IntMath2 extends JApplet {

	protected JFrame frame;
	protected JPanel panel;
	protected JLabel num;
	protected int number;
	protected JButton add, sub;

	public IntMath2(){
		number = 50;
		add = new JButton("Add");
		sub = new JButton("Sub");
		add.addActionListener(new ButtonListenerAdd());
		sub.addActionListener(new ButtonListenerSub());
		num = new JLabel("Number: " + number);
		
		Container cp = getContentPane();
		cp.setBackground(Color.orange);
		cp.setLayout(new FlowLayout());
		cp.add(num);
		cp.add(add);
		cp.add(sub);
	}
	
	private class ButtonListenerAdd implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			number++;
			num.setText("Number: " + number);
			repaint();
		}
	}
	
	private class ButtonListenerSub implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			number--;
			num.setText("Number: " + number);
			repaint();
		}
	}
}
