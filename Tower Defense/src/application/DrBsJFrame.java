package application;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Panel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class DrBsJFrame extends JFrame {
	private DrBsMousePanel panel;
	private JLabel lblLives;
	private JLabel lblMoney;
	public DrBsJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(687, 448));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.startGame();
			}
		});
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart.gridx = 0;
		gbc_btnStart.gridy = 0;
		getContentPane().add(btnStart, gbc_btnStart);
		
		FileReader();
		panel.setForeground(Color.GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.weightx = 0.05;
		gbc_panel.gridheight = 15;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		
		JButton btnPause = new JButton("Pause");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.pauseGame();
			}
		});
		GridBagConstraints gbc_btnPause = new GridBagConstraints();
		gbc_btnPause.fill = GridBagConstraints.BOTH;
		gbc_btnPause.insets = new Insets(0, 0, 5, 5);
		gbc_btnPause.gridx = 0;
		gbc_btnPause.gridy = 1;
		getContentPane().add(btnPause, gbc_btnPause);
		
		lblLives = new JLabel("Lives: 100");
		GridBagConstraints gbc_lblLives = new GridBagConstraints();
		gbc_lblLives.insets = new Insets(0, 0, 5, 5);
		gbc_lblLives.gridx = 0;
		gbc_lblLives.gridy = 2;
		getContentPane().add(lblLives, gbc_lblLives);
		
		lblMoney = new JLabel("$50");
		GridBagConstraints gbc_lblMoney = new GridBagConstraints();
		gbc_lblMoney.insets = new Insets(0, 0, 5, 5);
		gbc_lblMoney.gridx = 0;
		gbc_lblMoney.gridy = 3;
		getContentPane().add(lblMoney, gbc_lblMoney);
		
		JLabel lblNewLabel_2 = new JLabel("Map 1");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Level 1");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setIcon(new ImageIcon("F:\\1400W\u00F6rkspace\\Tower Defense\\barker_nathan.jpg"));
		btnNewButton_2.setSelectedIcon(new ImageIcon("F:\\1400W\u00F6rkspace\\Tower Defense\\barker_nathan.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setShowTheCircle(true,1);
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 6;
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.setIcon(new ImageIcon("F:\\1400W\u00F6rkspace\\Tower Defense\\Eviler_barker_nathan.jpg"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setShowTheCircle(true,2);
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 7;
		getContentPane().add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton();
		btnNewButton_4.setIcon(new ImageIcon("F:\\1400W\u00F6rkspace\\Tower Defense\\Evilest_barker_nathan.jpg"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setShowTheCircle(true,3);
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 8;
		getContentPane().add(btnNewButton_4, gbc_btnNewButton_4);

		
		
		setVisible(true);
	}
	
	public void FileReader(){
		try {
		int numRows = 0;
		int numCols = 0;
		//Do Not Make Any Changes Above This Line
		String x="map.txt";
		//Here is where you need to ask the user to enter the name of the maze file, or just hard code it in
		//Use the first 2 integers in the file to make the following method call work
		Scanner file = new Scanner(new File(x));
		
		numRows=file.nextInt();
		numCols=file.nextInt();
		String s="";
		panel= new DrBsMousePanel(50, 50, 50, this, numRows, numCols);
		//Now the hard part.  Figure out what picture should be printed at each position
		//Using a Scanner you can read in ints and doubles, and Strings
		//Note: loops are very good for this type of exercise
		//The following method call adds picture A at position 0 0
		for(int i=0; i<numRows; i++) {
			for(int j=0; j<numCols; j++) {
				s=file.next();
				panel.addPicture(i, j, s);
			}
		}
		
		

		
		
		//You can change the size of the Frame if you want
		this.setSize(600, 600);

		//Do Not Make Any Changes Below This Line
		if (panel != null){
			getContentPane().add(panel);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		} catch (FileNotFoundException e) {
			System.out.println("That is not a valid file.");
		}
	}
	
	public void setTheTextOfTheLivesLabel(String newText) {
		lblLives.setText(newText);
	}
	public void setTheTextOfTheMoneyLabel(String newText) {
		lblMoney.setText(newText);
	}

	public static void main(String[] args) {
		DrBsJFrame f = new DrBsJFrame();
		
	}

}
