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
import javax.swing.plaf.InsetsUIResource;

import com.admin.SuggestText;

public class ClientInfo extends JPanel {

	JPanel PanelWest=new JPanel();
	JPanel PanelCenter=new JPanel();

	JPanel PanelWestNorth=new JPanel();
	JPanel PanelWestCenter=new JPanel();
	JPanel PanelWestSouth=new JPanel();
	JPanel PanelWestEast=new JPanel();

	BorderLayout border=new BorderLayout();

	Border outer1=BorderFactory.createEmptyBorder(5,5,5,5);
	Border inner1=BorderFactory.createLoweredBevelBorder();
	CompoundBorder cmp=new CompoundBorder(outer1,inner1);

	JTextField txtBlank=new JTextField(30);	
	JButton btnSearch=new JButton("Search",new ImageIcon("img/filefind.png"));

	JLabel lblClientID=new JLabel("Client ID");
	JLabel lblName=new JLabel("Name");
	JLabel lblGender=new JLabel("Gender");
	JLabel lblFatherName=new JLabel("Father's Name");
	JLabel lblMotherName=new JLabel("Mother's Name");
	JLabel lblReligion=new JLabel("Religion");
	JLabel lblDOB=new JLabel("Date of Birth");
	JLabel lblDOJ=new JLabel("Date of Join");
	JLabel lblMbNO=new JLabel("Mobile no");
	JLabel lblAdds=new JLabel("Address");
	JLabel lblEmail=new JLabel("Email");
	JLabel lblNationalID=new JLabel("NationalID");
	JLabel lblNationality=new JLabel("Nationality");
	JLabel lblUserName=new JLabel("User Name");
	JLabel lblReferenceBy=new JLabel("ReferenceBy");

	JTextField txtClientID=new JTextField(20);
	JTextField txtName=new JTextField(20);
	SuggestText cmbGender=new SuggestText();
	JTextField txtFatherName=new JTextField(20);
	JTextField txtMotherName=new JTextField(20);
	JTextField txtReligion=new JTextField(20);
	JTextField txtDOB=new JTextField(20);
	JTextField txtDOJ=new JTextField(20);
	JTextField txtMbNo=new JTextField(20);
	JTextField txtMobileNo=new JTextField(20);
	JTextField txtAdds=new JTextField(20);
	JTextField txtEmail=new JTextField(20);
	JTextField txtNationalID=new JTextField(20);
	JTextField txtNationality=new JTextField(20);
	JTextField txtUserName=new JTextField(20);
	SuggestText cmbReferenceBy=new SuggestText();
	
	GridBagLayout gridbag=new GridBagLayout();
	GridBagConstraints c=new GridBagConstraints();

	JLabel lblBlank=new JLabel();
	JButton btnupload=new JButton("Upload",new ImageIcon("img/Upload.png"));
	JButton btnAdd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnEdit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btnDelete=new JButton("Delete",new ImageIcon("img/delete1.png"));
	
	public ClientInfo()
	{
		setPreferredSize(new Dimension(1150,735));
		cmp();
	}
	private void cmp() 
	{
		setLayout(new GridLayout(1,2,3,3));
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
		PanelWestSouth.setPreferredSize(new Dimension(0,75));
		PanelWestSouth.setLayout(new FlowLayout());	
		PanelWestSouth.add(btnAdd);
		PanelWestSouth.add(btnEdit);
		PanelWestSouth.add(btnRefresh);
		btnRefresh.setPreferredSize(new Dimension(100,45));
		PanelWestSouth.add(btnDelete);
	}
	private void PanelWestCenterWork()
	{
		PanelWestCenter.setLayout(gridbag);
		
		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblClientID, c);
		
		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtClientID, c);
	
		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblName, c);
		
		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtName, c);
	
		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblGender, c);
		
		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(cmbGender.cmbSuggest, c);
	
		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblFatherName, c);
		
		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtFatherName, c);
	
		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblMotherName, c);
		
		c.gridx=1;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtMotherName, c);
	
		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblReligion, c);
		
		c.gridx=1;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtReligion, c);
	
		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblDOB, c);
		
		c.gridx=1;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtDOB, c);
	
		c.gridx=0;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblDOJ, c);
		
		c.gridx=1;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtDOJ, c);
		
		c.gridx=0;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblMbNO, c);
		
		c.gridx=1;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtMbNo, c);
	
		c.gridx=0;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblAdds, c);
		
		c.gridx=1;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtAdds, c);
		txtAdds.setPreferredSize(new Dimension(0,70));
	
		c.gridx=0;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblEmail, c);
		
		c.gridx=1;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtEmail, c);
		
		c.gridx=0;
		c.gridy=11;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblNationalID, c);
		
		c.gridx=1;
		c.gridy=11;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtNationalID, c);
	
		c.gridx=0;
		c.gridy=12;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblNationality, c);
		
		c.gridx=1;
		c.gridy=12;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtNationality, c);
			
		c.gridx=0;
		c.gridy=13;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblUserName, c);
		
		c.gridx=1;
		c.gridy=13;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelWestCenter.add(txtUserName, c);
			
		c.gridx=0;
		c.gridy=14;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblReferenceBy, c);
		
		c.gridx=1;
		c.gridy=14;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(cmbReferenceBy.cmbSuggest, c);
	}
	private void PanelWestEastWork()
	{
		FlowLayout flow=new FlowLayout();
		PanelWestEast.setPreferredSize(new Dimension(170,0));
		PanelWestEast.setLayout(flow);
		PanelWestEast.add(lblBlank);
		lblBlank.setPreferredSize(new Dimension(130,160));
		lblBlank.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelWestEast.add(btnupload);
	}
	private void PanelWestNorthWork() 
	{
		PanelWestNorth.setPreferredSize(new Dimension(0,60));
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
