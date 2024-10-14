package com.example.menu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class ChangePass extends JPanel {
	BorderLayout border=new BorderLayout();
	JPanel PanelWest=new JPanel();
	JPanel PanelCenter=new JPanel();
	JPanel PanelEast=new JPanel();

	JPanel PanelCenterNorth=new JPanel();
	JPanel PanelCenterCenter=new JPanel();
	JPanel PanelCenterSouth=new JPanel();

	JLabel lblUserName=new JLabel("User Name");
	JLabel lblOldPassword=new JLabel("Old Password");
	JLabel lblNewPassword=new JLabel("New Password");
	JLabel lblCPassword=new JLabel("Confirm Password");

	JTextField txtUserName=new JTextField(20);
	JTextField txtOldPassword=new JTextField(20);
	JTextField txtNewPass=new JTextField(20);
	JTextField txtCPass=new JTextField(20);

	JButton btnChange=new JButton("Change",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/refresh.png"));

	public ChangePass()
	{
		setPreferredSize(new Dimension(1150,735));
		cmp();
	}
	private void cmp()
	{
		setLayout(border);
		setBorder(BorderFactory.createEmptyBorder(5, 5, 40, 5));
		add(PanelWest,BorderLayout.WEST);
		PanelWestWork();
		add(PanelCenter,BorderLayout.CENTER);
		PanelCenterWork();
		add(PanelEast,BorderLayout.EAST);
		PanelEastWork();
	}
	private void PanelEastWork() {
		PanelEast.setPreferredSize(new Dimension(120,0));
		}
	private void PanelCenterWork() {
		//PanelCenter.setBorder(BorderFactory.createRaisedBevelBorder());
		PanelCenter.setBackground(Color.gray);
		//PanelCenter.setLayout(border);
		PanelCenter.add(PanelCenterNorth,BorderLayout.NORTH);
		PanelCenterNorthWork();
		PanelCenter.add(PanelCenterCenter,BorderLayout.CENTER);
		PanelCenterCenterWork();
		PanelCenter.add(PanelCenterSouth,BorderLayout.SOUTH);
		PanelCenterSouthWork();
	}
	private void PanelCenterSouthWork() {
		PanelCenterSouth.setPreferredSize(new Dimension(900, 300));
		PanelCenterSouth.setBackground(Color.gray);
	}
	private void PanelCenterCenterWork() {
		PanelCenterCenter.setPreferredSize(new Dimension(900,55));
		PanelCenterCenter.setLayout(new FlowLayout());
		PanelCenterCenter.setBackground(Color.gray);
		PanelCenterCenter.add(btnChange);
		PanelCenterCenter.add(btnRefresh);
	}
	private void PanelCenterNorthWork() {
		PanelCenterNorth.setPreferredSize(new Dimension(895,350));
		PanelCenterNorth.setBackground(Color.GRAY);
		PanelCenterNorth.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(140, 15, 5, 5);
		PanelCenterNorth.add(lblUserName, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(140, 15, 5, 5);
		PanelCenterNorth.add(txtUserName, c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(6, 15, 5, 5);
		PanelCenterNorth.add(lblOldPassword, c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(6, 15, 5, 5);
		PanelCenterNorth.add(txtOldPassword, c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(6, 15, 5, 5);
		PanelCenterNorth.add(lblNewPassword, c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(6, 15, 5, 5);
		PanelCenterNorth.add(txtNewPass, c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(6, 15, 5, 5);
		PanelCenterNorth.add(lblCPassword, c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(6, 15, 5, 5);
		PanelCenterNorth.add(txtCPass, c);
	}
	private void PanelWestWork() {
		PanelWest.setPreferredSize(new Dimension(120, 0));
	}
}
