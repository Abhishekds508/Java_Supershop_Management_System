package com.example.Author;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame 
{
	JPanel mainPanel=new JPanel();
	BorderLayout border=new BorderLayout();
	JPanel PanelNorth=new JPanel();
	JPanel PanelSouth=new JPanel();
	JPanel PanelWest=new JPanel();
	JPanel PanelCenter=new JPanel();
	JLabel lblWelcome=new JLabel("Welcome To LogIn Frame");
	
	JLabel lblUsername=new JLabel("Username");
	JLabel lblPassword=new JLabel("Password");
	JLabel lblUserType=new JLabel("UserType");
	
	JTextField txtUsername=new JTextField(15);
	JPasswordField txtPass=new JPasswordField(15);
	JComboBox cmbuserType=new JComboBox();
	ImageIcon img=new ImageIcon("img/user (2).png");
	JLabel lbl=new JLabel(img);
	
	JButton btnLogin=new JButton("Login");
	JButton btnCancel=new JButton("Cancel");
	GridBagLayout grid=new GridBagLayout();
	GridBagConstraints c=new GridBagConstraints();
	Dimension screen=getToolkit().getDefaultToolkit().getScreenSize();
	public Login()
	{
		init();
		cmp();
		btnAction();
	}
	private void btnAction()
	{
	btnLogin.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
		mainPanel.setVisible(false);
		WorkingPanel wp=new WorkingPanel();
		add(wp);
		wp.setVisible(true);
		setSize(screen);
		setLocationRelativeTo(null);
		setTitle("Wc To The Soft ");
	}
	});	
	btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Do you want to Exit");
			dispose();
		}
	});
	}
	private void cmp() 
	{
		add(mainPanel);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(PanelNorth,BorderLayout.NORTH);
		PanelNorthWork();
		mainPanel.add(PanelSouth,BorderLayout.SOUTH);
		PanelSouthWork();
		mainPanel.add(PanelWest,BorderLayout.WEST);
		PanelWestWork();
		mainPanel.add(PanelCenter,BorderLayout.CENTER);
		PanelCenterWork();
	}
	private void PanelCenterWork() 
	{		
	PanelCenter.setBorder(BorderFactory.createLoweredBevelBorder());
	PanelCenter.setLayout(grid);
	
	c.gridx=0;
	c.gridy=0;
	c.fill=GridBagConstraints.BOTH;
	c.insets=new Insets(5,0,5,5);
	PanelCenter.add(lblUsername,c);
	
	c.gridx=1;
	c.gridy=0;
	c.fill=GridBagConstraints.BOTH;
	c.insets=new Insets(5,0,5,5);
	PanelCenter.add(txtUsername,c);
	
	c.gridx=0;
	c.gridy=1;
	c.fill=GridBagConstraints.BOTH;
	c.insets=new Insets(5,0,5,5);
	PanelCenter.add(lblPassword, c);
	
	c.gridx=1;
	c.gridy=1;
	c.fill=GridBagConstraints.BOTH;
	c.insets=new Insets(5,0,5,5);
	PanelCenter.add(txtPass, c);
	
	c.gridx=0;
	c.gridy=2;
	c.fill=GridBagConstraints.BOTH;
	c.insets=new Insets(5,0,5,5);
	PanelCenter.add(lblUserType, c);
	
	c.gridx=1;
	c.gridy=2;
	c.fill=GridBagConstraints.BOTH;
	c.insets=new Insets(5,0,5,5);
	PanelCenter.add(cmbuserType, c);
	}
	private void PanelWestWork()
	{
		PanelWest.setBorder(BorderFactory.createMatteBorder(25,15,10,15,Color.white));
		PanelWest.setPreferredSize(new Dimension(120,0));
		PanelWest.add(lbl);	
		//lbl.setPreferredSize(new Dimension(110,115));
	}
	private void PanelSouthWork()
	{
		PanelSouth.setBorder(BorderFactory.createRaisedBevelBorder());		
		PanelSouth.setPreferredSize(new Dimension(0, 40));
		PanelSouth.add(btnLogin, PanelSouth);
		FlowLayout flow=new FlowLayout();
		flow.setHgap(5);
		PanelSouth.add(btnLogin);
		PanelSouth.add(btnCancel);
	}
	private void PanelNorthWork() 
	{
		FlowLayout flow=new FlowLayout();
		flow.setVgap(20);
		PanelNorth.setLayout(flow);
		PanelNorth.setBackground(Color.GRAY);
		PanelNorth.setBorder(BorderFactory.createRaisedBevelBorder());
		PanelNorth.setPreferredSize(new Dimension(0,60));
		PanelNorth.add(lblWelcome);
		lblWelcome.setForeground(Color.BLACK);
		lblWelcome.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC ,20));	
	}
	private void init() 
	{
		setSize(450,270);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setTitle("LogIn Frame");
	}
}
