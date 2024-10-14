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

public class OpeningStock extends JPanel{

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

	JLabel lblStockID=new JLabel("Stock ID");
	JLabel lblCategory=new JLabel("Category");
	JLabel lblSubCategory=new JLabel("Sub Category");
	JLabel lblProductID=new JLabel("Product ID");
	JLabel lblUnit=new JLabel("Unit");
	JLabel lblStockQ=new JLabel("Stock Quantity");
	JLabel lblExDate=new JLabel("Expire Date");
	JLabel lblStockDate=new JLabel("Stock Date");
	JLabel lblSupplierName=new JLabel("Supplier Name");
	JLabel lblUserName=new JLabel("User Name");

	JTextField txtStockID=new JTextField(20);
	SuggestText cmbCategory=new SuggestText();
	SuggestText cmbSubCategory=new SuggestText ();
	SuggestText  cmbProductID=new SuggestText ();
	JTextField txtUnit=new JTextField(20);
	JTextField txtStockQ=new JTextField(20);
	JTextField txtExDate=new JTextField(20);
	JTextField txtStockDate=new JTextField(20);
	SuggestText cmbSupplierName=new SuggestText();
	JTextField txtUserName=new JTextField(20);

	JLabel lblBlank=new JLabel();
	JButton btnupload=new JButton("Upload",new ImageIcon("img/Upload.png"));
	JButton btnAdd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnEdit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btnDelete=new JButton("Delete",new ImageIcon("img/delete1.png"));

	public OpeningStock()
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
		PanelWestCenter.add(lblStockID, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelWestCenter.add(txtStockID, c);

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
		PanelWestCenter.add(lblProductID, c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(cmbProductID.cmbSuggest, c);

		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblUnit, c);

		c.gridx=1;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtUnit, c);

		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblStockQ, c);

		c.gridx=1;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtStockQ, c);

		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblExDate, c);

		c.gridx=1;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtExDate, c);

		c.gridx=0;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblStockDate, c);

		c.gridx=1;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtStockDate, c);

		c.gridx=0;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblSupplierName, c);

		c.gridx=1;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(cmbSupplierName.cmbSuggest, c);

		c.gridx=0;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblUserName, c);

		c.gridx=1;
		c.gridy=9;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtUserName, c);

	}
	private void PanelWestNorthWork() {
		//PanelWestNorth.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		PanelWestNorth.setPreferredSize(new Dimension(0, 170));
		PanelWestNorth.setLayout(gridbag);

		c.gridx=0;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(45,20,15,10);
		PanelWestNorth.add(txtBlank,c);
		txtBlank.setPreferredSize(new Dimension(0,40));

		c.gridx=1;
		c.gridy=0;
		c.fill=c.gridx+c.gridy;
		c.insets=new Insets(43,10,15,10);
		PanelWestNorth.add(btnSearch,c);
		btnSearch.setPreferredSize(new Dimension(105,8));

	}
}
