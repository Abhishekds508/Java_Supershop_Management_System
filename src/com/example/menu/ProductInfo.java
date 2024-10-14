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

public class ProductInfo extends JPanel{
	BorderLayout border=new BorderLayout();
	GridBagLayout gridbag=new GridBagLayout();
	GridBagConstraints c=new GridBagConstraints();
	JPanel PanelWest=new JPanel();
	JPanel PanelCenter=new JPanel();

	JPanel PanelWestNorth=new JPanel();
	JPanel PanelWestCenter=new JPanel();
	JPanel PanelWestSouth=new JPanel();
	
	JTextField txtBlank=new JTextField(30);	
	JButton btnSearch=new JButton("Search",new ImageIcon("img/filefind.png"));

	Border outer1=BorderFactory.createEmptyBorder(5,5,5,5);
	Border inner1=BorderFactory.createLoweredBevelBorder();
	CompoundBorder cmp=new CompoundBorder(outer1,inner1);

	JLabel lblProductID=new JLabel("Product ID");
	JLabel lblCategory=new JLabel("Category");
	JLabel lblSubCategory=new JLabel("Sub Category");
	JLabel lblProductName=new JLabel("Product");
	JLabel lblProductDes=new JLabel("Product Description");
	JLabel lblUnit=new JLabel("Unit");
	JLabel lblMPrice=new JLabel("M.R.P Price");
	JLabel lblNetPrice=new JLabel("Net Price");
	JLabel lblProfit=new JLabel("Profit Per Unit");
	JLabel lblSupplierName=new JLabel("Supplier Name");
	JLabel lblUserName=new JLabel("User Name");
		
	JTextField txtProductID=new JTextField(20);
	SuggestText cmbCategory=new SuggestText();
	SuggestText cmbSubCategory=new SuggestText();
	SuggestText cmbSupplierName=new SuggestText();
	JTextField txtProductName=new JTextField(20);
	JTextField txtProductDes=new JTextField(20);
	JTextField txtUnit=new JTextField(20);
	JTextField txtMPrice=new JTextField(20);
	JTextField txtNetPrice=new JTextField(20);
	JTextField txtProfit=new JTextField(20);
	JTextField txtUseName=new JTextField(20);
	
	JLabel lblBlank=new JLabel();
	JButton btnupload=new JButton("Upload",new ImageIcon("img/Upload.png"));
	JButton btnAdd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnEdit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btnDelete=new JButton("Delete",new ImageIcon("img/delete1.png"));
		
	public ProductInfo()
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
		//PanelWestSouth.setBorder(BorderFactory.createRaisedBevelBorder());	
		PanelWestSouth.setPreferredSize(new Dimension(0, 100));
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
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblProductID, c);
		
		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtProductID, c);
	
		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblCategory, c);
		
		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(cmbCategory.cmbSuggest, c);
	
		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblSubCategory, c);
		
		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(cmbSubCategory.cmbSuggest, c);
	
		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblProductName, c);
		
		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtProductName, c);
	
		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblProductDes, c);
		
		c.gridx=1;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtProductDes, c);
			
		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblUnit, c);
		
		c.gridx=1;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtUnit, c);

		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblMPrice, c);
		
		c.gridx=1;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtMPrice, c);
	
		c.gridx=0;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblNetPrice, c);
		
		c.gridx=1;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtNetPrice, c);
	
		c.gridx=0;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblProfit, c);
		
		c.gridx=1;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtProfit, c);
	
		c.gridx=0;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblSupplierName, c);
		
		c.gridx=1;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(cmbSupplierName.cmbSuggest, c);
	
		c.gridx=0;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblUserName, c);
		
		c.gridx=1;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtUseName, c);
	}
	private void PanelWestNorthWork() {
		//PanelWestNorth.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		PanelWestNorth.setPreferredSize(new Dimension(0, 190));
		PanelWestNorth.setLayout(gridbag);

		c.gridx=0;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(55,20,5,10);
		PanelWestNorth.add(txtBlank,c);
		txtBlank.setPreferredSize(new Dimension(0,40));

		c.gridx=1;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(53,10,5,10);
		PanelWestNorth.add(btnSearch,c);
		btnSearch.setPreferredSize(new Dimension(105,8));

	}
}



