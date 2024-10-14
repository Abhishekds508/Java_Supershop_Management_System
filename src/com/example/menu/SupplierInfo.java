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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.plaf.InsetsUIResource;

public class SupplierInfo extends JPanel{	
	BorderLayout border=new BorderLayout();
	GridBagLayout gridbag=new GridBagLayout();
	GridBagConstraints c=new GridBagConstraints();
	JPanel PanelWest=new JPanel();
	JPanel PanelCenter=new JPanel();

	JPanel PanelWestNorth=new JPanel();
	JPanel PanelWestCenter=new JPanel();
	JPanel PanelWestSouth=new JPanel();
	JPanel PanelWestEast=new JPanel();

	JTextField txtBlank=new JTextField(32);	
	JButton btnSearch=new JButton("Search",new ImageIcon("img/filefind.png"));

	Border outer1=BorderFactory.createEmptyBorder(5,5,5,5);
	Border inner1=BorderFactory.createLoweredBevelBorder();
	CompoundBorder cmp=new CompoundBorder(outer1,inner1);


	JLabel lblSupplierId=new JLabel("Supplier ID");
	JLabel lblSupplierName=new JLabel("Supplier Name");
	JLabel lblMailAddress=new JLabel("Mail Address");
	JLabel lblPhoneNum=new JLabel("Phone Number");
	JLabel lblAddress=new JLabel("Address");
	JLabel lblUserName=new JLabel("User Name");

	JTextField txtSupplierID=new JTextField(20);
	JTextField txtSupplierName=new JTextField(20);
	JTextField txtMailAddress=new JTextField(20);
	JTextField txtPhoneNum=new JTextField(20);
	JTextField txtUserName=new JTextField(20);
	JTextField txtAddress=new JTextField(20);

	JLabel lblBlank=new JLabel();
	JButton btnupload=new JButton("Upload",new ImageIcon("img/Upload.png"));
	JButton btnAdd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnEdit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btnDelete=new JButton("Delete",new ImageIcon("img/delete1.png"));
	

	public SupplierInfo()
	{
		//setBackground(Color.lightGray);
		setPreferredSize(new Dimension(1150,735));
		cmp();
	}
	private void cmp() {
		setLayout(new GridLayout(1,2,5,5));
		setBorder(cmp);
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
		border.setVgap(0);
		PanelWest.add(PanelWestNorth, BorderLayout.NORTH);
		PanelWestNorthWork();
		PanelWest.add(PanelWestCenter, BorderLayout.CENTER);
		PanelWestCenterWork();
		PanelWest.add(PanelWestSouth, BorderLayout.SOUTH);
		PanelWestSouthWork();
		PanelWest.add(PanelWestEast, BorderLayout.EAST);
		PanelWestEastWork();
	}
	private void PanelWestEastWork() {
		PanelWestEast.setPreferredSize(new Dimension(150,0));
		FlowLayout flow=new FlowLayout();
		PanelWestEast.setLayout(flow);
		PanelWestEast.add(lblBlank);
		lblBlank.setPreferredSize(new Dimension(130,160));
		lblBlank.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelWestEast.add(btnupload);	
	}
	private void PanelWestSouthWork() {
	//	PanelWestSouth.setBorder(BorderFactory.createRaisedBevelBorder());	
		PanelWestSouth.setPreferredSize(new Dimension(0, 205));
		PanelWestSouth.setLayout(new FlowLayout());	
		PanelWestSouth.add(btnAdd);
		PanelWestSouth.add(btnEdit);
		PanelWestSouth.add(btnRefresh);
		btnRefresh.setPreferredSize(new Dimension(100,45));
		PanelWestSouth.add(btnDelete);
	
	}
	private void PanelWestCenterWork() {
		PanelWestCenter.setLayout(gridbag);	
		//PanelWestCenter.setBorder(BorderFactory.createRaisedBevelBorder());	

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblSupplierId, c);
		
		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtSupplierID, c);
	
		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblSupplierName, c);
		
		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtSupplierName, c);
	
		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblMailAddress, c);
		
		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtMailAddress, c);
	
		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblPhoneNum, c);
		
		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtPhoneNum, c);
	
		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblAddress, c);
		
		c.gridx=1;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtAddress, c);
		txtAddress.setPreferredSize(new Dimension(30, 70));
	
		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblUserName, c);
		
		c.gridx=1;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtUserName, c);
	}
	private void PanelWestNorthWork() {
		PanelWestNorth.setPreferredSize(new Dimension(0, 230));
		PanelWestNorth.setLayout(gridbag);

		c.gridx=0;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new InsetsUIResource(55,45,10,5);
		PanelWestNorth.add(txtBlank,c);
		txtBlank.setPreferredSize(new Dimension(0,40));

		c.gridx=1;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new InsetsUIResource(50,15,10,5);
		PanelWestNorth.add(btnSearch,c);
		btnSearch.setPreferredSize(new Dimension(105,20));
	}
}
