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

import com.admin.SuggestText;

public class WastageBroken extends JPanel
{
	BorderLayout border=new BorderLayout();
	GridBagLayout gridbag=new GridBagLayout();
	GridBagConstraints c=new GridBagConstraints();
	JPanel PanelWest=new JPanel();
	JPanel PanelCenter=new JPanel();

	JPanel PanelWestNorth=new JPanel();
	JPanel PanelWestCenter=new JPanel();
	JPanel PanelWestSouth=new JPanel();

	Border outer1=BorderFactory.createEmptyBorder(5,5,5,5);
	Border inner1=BorderFactory.createLoweredBevelBorder();
	CompoundBorder cmp=new CompoundBorder(outer1,inner1);

	JTextField txtBlank=new JTextField(30);	
	JButton btnSearch=new JButton("Search",new ImageIcon("img/filefind.png"));

	JLabel lblWastageNo=new JLabel("Wastage No");
	JLabel lblProductType=new JLabel("ProductType");
	JLabel lblCategory=new JLabel("Category");
	JLabel lblSubCategory=new JLabel("Sub Category");
	JLabel lblProduct=new JLabel("Product");
	JLabel lblTotalStock=new JLabel("Total Stock");
	JLabel lblDate=new JLabel("Date");
	JLabel lblWastageQ=new JLabel("Wastage/Broken Quantity");
	JLabel lblRate=new JLabel("Rate");
	JLabel lblAmount=new JLabel("Amount");
	JLabel lblRemarks=new JLabel("Remarks");
	JLabel lblUserName=new JLabel("User Name");

	JTextField txtWastageNo=new JTextField(20);
	SuggestText cmbCategory=new SuggestText();
	SuggestText cmbSubCategory=new SuggestText();
	SuggestText cmbProducttype=new SuggestText();
	SuggestText cmbProduct=new SuggestText();
	JTextField txtTotalStock=new JTextField(20);
	JTextField txtDate=new JTextField(20);
	JTextField txtWastageQ=new JTextField(20);
	JTextField txtRate=new JTextField();
	JTextField txtAmount=new JTextField();
	JTextField txtRemarks=new JTextField();
	JTextField txtUserName=new JTextField(20);

	JLabel lblBlank=new JLabel();
	JButton btnupload=new JButton("Upload",new ImageIcon("img/Upload.png"));
	JButton btnAdd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnEdit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btnDelete=new JButton("Delete",new ImageIcon("img/delete1.png"));

	public WastageBroken()
	{
		//setBackground(Color.LIGHT_GRAY);
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
		PanelCenter.setBorder(BorderFactory.createRaisedBevelBorder());	
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
	}
	private void PanelWestSouthWork() {
		//	PanelWestSouth.setBorder(BorderFactory.createRaisedBevelBorder());	
		PanelWestSouth.setPreferredSize(new Dimension(0, 120));
		PanelWestSouth.setLayout(new FlowLayout());	
		PanelWestSouth.add(btnAdd);
		PanelWestSouth.add(btnEdit);
		PanelWestSouth.add(btnRefresh);
		btnRefresh.setPreferredSize(new Dimension(100,45));
		PanelWestSouth.add(btnDelete);
	}
	private void PanelWestCenterWork() {
		//PanelWestCenter.setBorder(BorderFactory.createRaisedBevelBorder());		
		PanelWestCenter.setLayout(gridbag);	

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblWastageNo, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtWastageNo, c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblProductType, c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(cmbProducttype.cmbSuggest, c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblCategory, c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(cmbCategory.cmbSuggest, c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblSubCategory, c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(cmbSubCategory.cmbSuggest, c);

		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblProduct, c);

		c.gridx=1;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(cmbProduct.cmbSuggest, c);

		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblTotalStock, c);

		c.gridx=1;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtTotalStock, c);

		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblDate, c);

		c.gridx=1;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtDate, c);

		c.gridx=0;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblWastageQ, c);

		c.gridx=1;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtWastageQ, c);

		c.gridx=0;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblRate, c);

		c.gridx=1;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtRate, c);

		c.gridx=0;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblAmount, c);

		c.gridx=1;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtAmount, c);	

		c.gridx=0;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblRemarks, c);
		
		c.gridx=1;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtRemarks, c);
		txtRemarks.setPreferredSize(new Dimension(0, 40));
		
		c.gridx=0;
		c.gridy=11;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(lblUserName, c);

		c.gridx=1;
		c.gridy=11;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtUserName, c);	
	}
	private void PanelWestNorthWork() {
		//PanelWestNorth.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		PanelWestNorth.setPreferredSize(new Dimension(0, 170));
		PanelWestNorth.setLayout(gridbag);

		c.gridx=0;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(55,45,10,5);
		PanelWestNorth.add(txtBlank,c);
		txtBlank.setPreferredSize(new Dimension(0,40));

		c.gridx=1;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(50,15,10,5);
		PanelWestNorth.add(btnSearch,c);
		btnSearch.setPreferredSize(new Dimension(105,8));
	}
}

