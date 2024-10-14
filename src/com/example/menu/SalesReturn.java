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
import javax.swing.border.TitledBorder;

import com.admin.SuggestText;

public class SalesReturn extends JPanel {
	JPanel PanelNorth=new JPanel();
	JPanel PanelCenter=new JPanel();
	JPanel PanelSouth=new JPanel();

	JPanel PanelNorthWest=new JPanel();
	JPanel PanelNorthCenter=new JPanel();

	JPanel PanelSouthNorth=new JPanel();
	JPanel PanelSouthSouth=new JPanel();
	JPanel PanelSouthSouthWest=new JPanel();
	JPanel PanelSouthSouthCenter=new JPanel();

	JPanel PanelCenterCenter=new JPanel();
	JPanel PanelCenterWest=new JPanel();
	JPanel PanelCenterWestNorth=new JPanel();
	JPanel PanelCenterWestSouth=new JPanel();

	JPanel PanelCenterCenterNorth=new JPanel();
	JPanel PanelCenterCenterNorthWest=new JPanel();
	JPanel PanelCenterCenterNorthCenter=new JPanel();
	JPanel PanelCenterCenterSouth=new JPanel();

	JLabel lblReturnNo=new JLabel("Sales Return No");
	JTextField txtReturnNo=new JTextField(10);
	JLabel lblUsername=new JLabel("User Name");
	JTextField txtUsername=new JTextField(10);
	JLabel lblDate=new JLabel("Date");
	JTextField txtDate=new JTextField(8);
	JLabel lblReturnDate=new JLabel("Return Date");
	JTextField txtReturnDate=new JTextField(8);

	JLabel lblCategory=new JLabel("Category");
	SuggestText cmbCategory=new SuggestText();
	JLabel lblSCategory=new JLabel("Sub Category");
	SuggestText cmbSCategory=new SuggestText();
	JLabel lblPID=new JLabel("Product ID");
	SuggestText cmbPID=new SuggestText();
	JLabel lblTStock=new JLabel("Total Stock");
	SuggestText txtTStock=new SuggestText();
	JLabel lblSQ=new JLabel("Sales Quantity");
	JTextField txtSQ=new JTextField(22);
	JLabel lblRQ=new JLabel("Return Quantity");
	JTextField txtRQ=new JTextField();
	JLabel lblRemarks=new JLabel("Remarks");
	JTextField txtRemarks=new JTextField(22);	

	JLabel lblTA=new JLabel("Total Amount");
	JTextField txtTA=new JTextField(20);

	JLabel lblFD=new JLabel("From Date");
	JTextField txtFD=new JTextField(7);
	JLabel lblTD=new JLabel("To Date");
	JTextField txtTD=new JTextField(7);

	JButton btnsubmit=new JButton("Submit",new ImageIcon("img/btnSubmit.png"));
	JButton btnedit=new JButton("Edit",new ImageIcon("img/edit-1282.png"));
	JButton btnrefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btndel=new JButton("Delete",new ImageIcon("img/delete216.png"));
	JButton btnconfirm=new JButton("Confirm",new ImageIcon("img/confirm.png"));
	JButton btndone=new JButton("Done",new ImageIcon("img/btnDone.png"));

	JButton btnFind=new JButton("Find");

	public SalesReturn()
	{
		setPreferredSize(new Dimension(1150,735));
		//setBackground(Color.lightGray);
		cmp();
	}
	private void cmp() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		add(PanelNorth,BorderLayout.NORTH);
		PanelNorthWork();
		add(PanelCenter,BorderLayout.CENTER);
		PanelCenterWork();
		add(PanelSouth,BorderLayout.SOUTH);
		PanelSouthWork();		
	}
	private void PanelSouthWork() {
		PanelSouth.setLayout(new BorderLayout());
		PanelSouth.setPreferredSize(new Dimension(0,350));
		PanelSouth.setBorder(BorderFactory.createRaisedBevelBorder());	
		PanelSouth.add(PanelSouthNorth,BorderLayout.NORTH);
		PanelSouthNorthWork();
		PanelSouth.add(PanelSouthSouth,BorderLayout.SOUTH);
		PanelSouthSouthWork();	
	}
	private void PanelSouthSouthWork() {
		PanelSouthSouth.setPreferredSize(new Dimension(0,70));
		PanelSouthSouth.setBorder(BorderFactory.createRaisedBevelBorder());
		PanelSouthSouth.setLayout(new GridLayout(1, 2));
		PanelSouthSouth.add(PanelSouthSouthWest);
		PanelSouthSouthWestWork();
		PanelSouthSouth.add(PanelSouthSouthCenter);
		PanelSouthSouthCenterWork();
	}
	private void PanelSouthSouthCenterWork() {
		PanelSouthSouthCenter.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1, 3, 30, 5);
		PanelSouthSouthCenter.add(lblTA,c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1, 5, 30, 5);
		PanelSouthSouthCenter.add(txtTA,c);
		txtTA.setPreferredSize(new Dimension(0,33));
	}
	private void PanelSouthSouthWestWork() {
		PanelSouthSouthWest.add(btnconfirm);
		PanelSouthSouthWest.add(btndone);
	}
	private void PanelSouthNorthWork() {

	}
	private void PanelCenterWork() {
		PanelCenter.setLayout(new GridLayout(1,2,5,5));
		PanelCenter.add(PanelCenterCenter,BorderLayout.CENTER);
		PanelCenterCenterWork();
		PanelCenter.add(PanelCenterWest,BorderLayout.WEST);
		PanelCenterWestWork();
	}
	private void PanelCenterWestWork() {
		PanelCenterWest.setPreferredSize(new Dimension(100,0));
		//PanelCenterWest.setBackground(Color.BLACK);
		PanelCenterWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(""),"Existing Invoice",TitledBorder.CENTER,TitledBorder.TOP));
		PanelCenterWest.setLayout(new BorderLayout());
		PanelCenterWest.add(PanelCenterWestNorth, BorderLayout.NORTH);
		PanelCenterWestNorthWork();
		PanelCenterWest.add(PanelCenterWestSouth, BorderLayout.SOUTH);
		PanelCenterWestSouthWork();
	}
	private void PanelCenterWestSouthWork() {

	}
	private void PanelCenterWestNorthWork() {
		PanelCenterWestNorth.setPreferredSize(new Dimension(0,50));
//		PanelCenterWestNorth.setBackground(Color.magenta);
		PanelCenterWestNorth.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 2, 5, 5);
		PanelCenterWestNorth.add(lblFD, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 3, 5, 15);
		PanelCenterWestNorth.add(txtFD, c);

		c.gridx=2;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 15, 5, 5);
		PanelCenterWestNorth.add(lblTD, c);

		c.gridx=3;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 5, 5, 5);
		PanelCenterWestNorth.add(txtTD, c);

		c.gridx=4;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 15, 5, 5);
		PanelCenterWestNorth.add(btnFind, c);

	}
	private void PanelCenterCenterWork() {
	
		PanelCenterCenter.setBorder(BorderFactory.createTitledBorder(""));
		PanelCenterCenter.setLayout(new BorderLayout());
		PanelCenterCenter.add(PanelCenterCenterNorth,BorderLayout.NORTH);
		PanelCenterCenterNorthWork();
		PanelCenterCenter.add(PanelCenterCenterSouth,BorderLayout.SOUTH);
		PanelCenterCenterSouthWork();
	}
	private void PanelCenterCenterSouthWork() {
		PanelCenterCenterSouth.setPreferredSize(new Dimension(0, 35));
		//PanelCenterCenterSouth.setBackground(Color.BLUE);
		FlowLayout flow=new FlowLayout();
		PanelCenterCenterSouth.setLayout(flow);
		flow.setVgap(0);
		PanelCenterCenterSouth.add(btnsubmit);
		btnsubmit.setPreferredSize(new Dimension(95, 35));
		PanelCenterCenterSouth.add(btnedit);
		btnedit.setPreferredSize(new Dimension(75, 35));
		PanelCenterCenterSouth.add(btnrefresh);
		btnrefresh.setPreferredSize(new Dimension(95, 35));
		PanelCenterCenterSouth.add(btndel);
		btndel.setPreferredSize(new Dimension(95, 35));
	}
	private void PanelCenterCenterNorthWork() {
		PanelCenterCenterNorth.setPreferredSize(new Dimension(0, 225));
	//	PanelCenterCenterNorth.setBackground(Color.orange);
		PanelCenterCenterNorth.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		
		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(0,5,2,5);
		PanelCenterCenterNorth.add(lblCategory, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(0,5,2,5);
		PanelCenterCenterNorth.add(cmbCategory.cmbSuggest, c);
		
		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(lblSCategory, c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(cmbSCategory.cmbSuggest, c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(lblPID, c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(cmbPID.cmbSuggest, c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(lblTStock, c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(txtTStock.cmbSuggest, c);

		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(lblSQ, c);

		c.gridx=1;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(txtSQ, c);

		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(lblRQ, c);

		c.gridx=1;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(txtRQ, c);
		
		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(lblRemarks, c);

		c.gridx=1;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,2,5);
		PanelCenterCenterNorth.add(txtRemarks, c);
		txtRemarks.setPreferredSize(new Dimension(0, 38));
	}
	private void PanelNorthWork() {
		PanelNorth.setPreferredSize(new Dimension(10,80));
		Border outer1=BorderFactory.createEmptyBorder(5,5,5,5);
		Border inner1=BorderFactory.createRaisedBevelBorder();
		CompoundBorder cmp=new CompoundBorder(outer1, inner1);
		PanelNorth.setBorder(cmp);	
		PanelNorth.setLayout(new BorderLayout());
		PanelNorth.add(PanelNorthWest,BorderLayout.WEST);
		PanelNorthWestWork();
		PanelNorth.add(PanelNorthCenter,BorderLayout.CENTER);
		PanelNorthCenterWork();
	}
	private void PanelNorthCenterWork() {
		PanelNorthCenter.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		//PanelNorthCenter.setBackground(Color.blue);
		PanelNorthCenter.setPreferredSize(new Dimension(420,0));

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 5, 5, 5);
		PanelNorthCenter.add(lblDate, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5, 35);
		PanelNorthCenter.add(txtDate, c);

		c.gridx=2;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelNorthCenter.add(lblReturnDate, c);

		c.gridx=3;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 5,5,185);
		PanelNorthCenter.add(txtReturnDate, c);

	}
	private void PanelNorthWestWork() {
		PanelNorthWest.setPreferredSize(new Dimension(570,0));
		//PanelNorthWest.setBackground(Color.magenta);

		PanelNorthWest.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 105, 5, 3);
		PanelNorthWest.add(lblReturnNo,c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5, 5);
		PanelNorthWest.add(txtReturnNo, c);

		c.gridx=2;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,3,5,3);
		PanelNorthWest.add(lblUsername, c);

		c.gridx=3;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 5,5,5);
		PanelNorthWest.add(txtUsername, c);
	}
}

