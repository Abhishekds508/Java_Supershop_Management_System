package com.example.menu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class NewUser extends JPanel {
	JPanel PanelWest=new JPanel();
	JPanel PanelCenter=new JPanel();

	JPanel PanelWestNorth=new JPanel();
	JPanel PanelWestCenter=new JPanel();
	JPanel PanelWestSouth=new JPanel();
	JPanel PanelWestEast=new JPanel();
	
	JPanel PanelWestEastNorth=new JPanel();
	JPanel PanelWestEastSouth=new JPanel();

	Border outer1=BorderFactory.createEmptyBorder(5,5,5,5);
	Border inner1=BorderFactory.createLoweredBevelBorder();
	CompoundBorder cmp=new CompoundBorder(outer1,inner1);

	JTextField txtBlank=new JTextField(30);	
	JButton btnSearch=new JButton("Search",new ImageIcon("img/filefind.png"));

	JLabel lblUserID=new JLabel("User ID");
	JLabel lblName=new JLabel("Name");
	JLabel lblUserName=new JLabel("User Name");
	JLabel lblDesignation=new JLabel("Designation");
	JLabel lblPassword=new JLabel("Password");
	JLabel lblDOJ=new JLabel("Date Of Join");
	JLabel lblActivation=new JLabel("Activation(Y for Yes,N for No");
	JLabel lblEmailAdds=new JLabel("Email Address");
	JLabel lblNationalID=new JLabel("National ID");
	JLabel lblAdds=new JLabel("Address");
	JLabel lblMobile=new JLabel("Mobile");

	JTextField txtUserID=new JTextField(15);
	JTextField txtName=new JTextField(15);
	JTextField txtUserName=new JTextField(15);
	JTextField txtDesignation=new JTextField(15);
	JTextField txtPassword=new JTextField(15);
	JTextField txtDOJ=new JTextField(15);
	JTextField txtActivation=new JTextField(15);
	JTextField txtEmailAdds=new JTextField(15);
	JTextField txtAdds=new JTextField(15);
	JTextField txtNationalID=new JTextField(15);
	JTextField txtMobile=new JTextField(15);

	GridBagLayout gridbag=new GridBagLayout();
	GridBagConstraints c=new GridBagConstraints();

	JLabel lblBlank=new JLabel();
	JButton btnupload=new JButton("Upload",new ImageIcon("img/Upload.png"));
	JButton btnAdd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnEdit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btnDelete=new JButton("Delete",new ImageIcon("img/delete1.png"));
	BorderLayout border=new BorderLayout();

	public NewUser()
	{
		setPreferredSize(new Dimension(1150,735));
		//setBackground(Color.LIGHT_GRAY);
		cmp();
	}
	private void cmp() 
	{
		setLayout(new GridLayout(1,2,5,5));
		add(PanelWest);
		PanelWestWork();
		add(PanelCenter);
		PanelCenterWork();	
	}
	private void PanelCenterWork() {
		PanelCenter.setBorder(BorderFactory.createRaisedSoftBevelBorder());
	}
	private void PanelWestWork() {
		PanelWest.setLayout(border);
		PanelWest.add(PanelWestNorth,BorderLayout.NORTH);
		PanelWestNorthWork();
		PanelWest.add(PanelWestSouth,BorderLayout.SOUTH);
		PanelWestSouthWork();
		PanelWest.add(PanelWestEast,BorderLayout.EAST);
		PanelWestEastWork();
		PanelWest.add(PanelWestCenter,BorderLayout.CENTER);
		PanelWestCenterWork();
	}
	private void PanelWestSouthWork() 
	{
		//PanelWestSouth.setBorder(BorderFactory.createRaisedBevelBorder());
		PanelWestSouth.setPreferredSize(new Dimension(0,130));
		FlowLayout flow=new FlowLayout();
		PanelWestSouth.setLayout(flow);
		flow.setVgap(50);
		PanelWestSouth.add(btnAdd);
		PanelWestSouth.add(btnEdit);
		PanelWestSouth.add(btnRefresh);
		btnRefresh.setPreferredSize(new Dimension(100,42));
		PanelWestSouth.add(btnDelete);		
	}
	private void PanelWestCenterWork()
	{	
		PanelWestCenter.setLayout(gridbag);
		//PanelWestCenter.setBorder(BorderFactory.createRaisedBevelBorder());
		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblUserID, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtUserID, c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblName, c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtName, c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblUserName, c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtUserName, c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblDesignation, c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtDesignation, c);

		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblPassword, c);

		c.gridx=1;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtPassword, c);

		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblDOJ, c);

		c.gridx=1;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtDOJ, c);

		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblActivation, c);

		c.gridx=1;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtActivation, c);

		c.gridx=0;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblEmailAdds, c);

		c.gridx=1;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtEmailAdds, c);

		c.gridx=0;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblNationalID, c);

		c.gridx=1;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtNationalID, c);

		c.gridx=0;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblAdds, c);

		c.gridx=1;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtAdds, c);
		txtAdds.setPreferredSize(new Dimension(0,70));

		c.gridx=0;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblMobile, c);

		c.gridx=1;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtMobile, c);
	}
	private void PanelWestEastWork()
	{
		//PanelWestEast.setBorder(BorderFactory.createRaisedBevelBorder());
		FlowLayout flow=new FlowLayout();
		PanelWestEast.setPreferredSize(new Dimension(150,0));
		PanelWestEast.setLayout(flow);
		flow.setVgap(20);
		PanelWestEast.add(lblBlank);
		lblBlank.setPreferredSize(new Dimension(130,160));
		lblBlank.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelWestEast.add(btnupload);
	}
	private void PanelWestNorthWork() 
	{
		//PanelWestNorth.setBorder(BorderFactory.createRaisedBevelBorder());
		PanelWestNorth.setPreferredSize(new Dimension(0,120));
		PanelWestNorth.setLayout(new GridBagLayout());

		c.gridx=0;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(5,5,5,5);
		PanelWestNorth.add(txtBlank,c);
		txtBlank.setPreferredSize(new Dimension(0,40));

		c.gridx=1;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(5,5,5,5);
		PanelWestNorth.add(btnSearch,c);
	}

}

