import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author
 *
 */
public class GuiDesign extends JFrame{

	private String pwd;
	private JLabel lbl;

	@SuppressWarnings("unused")
	public static void dialogBoxes(){
		String s = JOptionPane.showInputDialog("Please enter a number");
		int x = Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, "The number you entered is " + x);
		
	}
	
	public GuiDesign(){
		
		this.setSize(300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		DrBsActionListener l= new DrBsActionListener();
		
		this.setLayout(new FlowLayout());
		//JLabel
		JLabel lbl=new JLabel("Hello World");
		add(lbl);
		//JTextField of size 10, with text already inside - uneditable
		JTextField fld=new JTextField("Type Something", 10);
		fld.setEditable(false);
		add(fld);
		//JPassword Field
		JPasswordField pwd = new JPasswordField(10);
		add(pwd);
		//JButton with the text Click Me
		JButton btn = new JButton("Click plz");
		add(btn);
		//JCheckBox
		JCheckBox box=new JCheckBox("Click this box if you've ignored the IDEA survey.");
		this.setVisible(true);
		
		//MiceStroke m= new MiceStroke(50,0,0);
		//add(m, BorderLayout.CENTER);
	}

	private class DrBsActionListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("They Clicked the Button. Initiate Self Destruct");
			String s = pwd;
			lbl.setText(s);
		}
	}
	
	public static void main(String[] args) {
		
		//dialogBoxes();

		GuiDesign g = new GuiDesign();
		
	}

}
