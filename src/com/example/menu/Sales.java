package com.example.menu;
import java.awt.BorderLayout;
import java.awt.Checkbox;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

import com.admin.SuggestText;

public class Sales extends JPanel{
	JPanel PanelNorth=new JPanel();
	JPanel PanelCenter=new JPanel();
	JPanel PanelSouth=new JPanel();

	JPanel PanelNorthWest=new JPanel();
	JPanel PanelNorthEast=new JPanel();
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

	JLabel lblClntID=new JLabel("Client ID");
	SuggestText cmbClntID=new SuggestText();
	JLabel lblUsername=new JLabel("User Name");
	JTextField txtUsername=new JTextField(18);
	JLabel lblDate=new JLabel("Date");
	JTextField txtDate=new JTextField(10);
	JLabel lblSalesNo=new JLabel("Sales No");
	JTextField txtSalesNo=new JTextField(20);

	JLabel lblCategory=new JLabel("Category");
	SuggestText cmbCategory=new SuggestText();
	JLabel lblSCategory=new JLabel("Sub Category");
	SuggestText cmbSCategory=new SuggestText();
	JLabel lblPID=new JLabel("Product ID");
	SuggestText cmbPID=new SuggestText();
	JLabel lblUnit=new JLabel("Unit");
	JTextField txtUnit=new JTextField(10);

	JLabel lblStock=new JLabel("Stock");
	JTextField txtStock=new JTextField(12);
	JLabel lblRate=new JLabel("Rate");
	JTextField txtRate=new JTextField(12);
	JLabel lblSNo=new JLabel("Sales No");
	JTextField txtSNo=new JTextField(12);
	JLabel lblRemarks=new JLabel("Remarks");
	JTextField txtRemarks=new JTextField(12);	

	JLabel lblTA=new JLabel("Total Amount");
	JTextField txtTA=new JTextField(12);

	JLabel lblFD=new JLabel("From Date");
	JTextField txtFD=new JTextField(7);
	JLabel lblTD=new JLabel("To Date");
	JTextField txtTD=new JTextField(7);

	JLabel lblTAmnt=new JLabel("Total Amount");
	JTextField txtTAmnt=new JTextField(10);
	JLabel lblTDue=new JLabel("Due");
	JTextField txtTdue=new JTextField(10);
	JLabel lblPayproto=new JLabel("Payment Protocol");
	SuggestText cmbPayproto=new SuggestText();


	JButton btnsubmit=new JButton("Submit",new ImageIcon("img/btnSubmit.png"));
	JButton btnedit=new JButton("Edit",new ImageIcon("img/edit-1282.png"));
	JButton btnrefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btndel=new JButton("Delete",new ImageIcon("img/delete216.png"));

	JButton btnconfirm=new JButton("Confirm",new ImageIcon("img/confirm.png"));
	JButton btndone=new JButton("Done",new ImageIcon("img/btnDone.png"));

	JButton btnFind=new JButton("Find");

	public Sales()
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

		PanelSouthSouth.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,3,30,2);
		PanelSouthSouth.add(lblTA,c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,5,30, 2);
		PanelSouthSouth.add(txtTA,c);
		txtTA.setPreferredSize(new Dimension(0,30));

		c.gridx=2;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,1,30,2);
		PanelSouthSouth.add(lblTDue,c);

		c.gridx=3;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,1,30, 2);
		PanelSouthSouth.add(txtTdue,c);

		c.gridx=4;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,1,30,2);
		PanelSouthSouth.add(lblPayproto,c);

		c.gridx=5;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,1,30, 2);
		PanelSouthSouth.add(cmbPayproto.cmbSuggest,c);
		cmbPayproto.cmbSuggest.setPreferredSize(new Dimension(250,0));

		c.gridx=6;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,1,30,2);
		PanelSouthSouth.add(btnconfirm,c);

		c.gridx=7;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(1,1,30, 2);
		PanelSouthSouth.add(btndone,c);
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
		//PanelCenterWest.setBackground(Color.cyan);
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
		//PanelCenterWestNorth.setBackground(Color.magenta);
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
		//PanelCenterCenter.setBackground(Color.magenta);
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
		//PanelCenterCenterNorth.setBackground(Color.orange);

		PanelCenterCenterNorth.setLayout(new GridLayout(1,2));
		PanelCenterCenterNorth.add(PanelCenterCenterNorthWest);
		PanelCenterCenterNorthWestWork();
		PanelCenterCenterNorth.add(PanelCenterCenterNorthCenter);
		PanelCenterCenterNorthCenterWork();
	}
	private void PanelCenterCenterNorthCenterWork() {
		//PanelCenterCenterNorthCenter.setBackground(Color.gray);
		PanelCenterCenterNorthCenter.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(lblStock, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(txtStock, c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(lblRate, c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(txtRate, c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(lblSNo, c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(txtSNo, c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(lblRemarks, c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,3,15);
		PanelCenterCenterNorthCenter.add(txtRemarks, c);
		txtRemarks.setPreferredSize(new Dimension(12, 35));
	}
	private void PanelCenterCenterNorthWestWork() {
		//	PanelCenterCenterNorthWest.setBackground(Color.CYAN);
		PanelCenterCenterNorthWest.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(lblCategory, c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(cmbCategory.cmbSuggest, c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(lblSCategory, c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(cmbSCategory.cmbSuggest, c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(lblPID, c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(cmbPID.cmbSuggest, c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(lblUnit, c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,15,3,5);
		PanelCenterCenterNorthWest.add(txtUnit, c);
		txtUnit.setPreferredSize(new Dimension(0,35));
	}
	private void PanelNorthWork() {
		PanelNorth.setPreferredSize(new Dimension(10,90));
		Border outer1=BorderFactory.createEmptyBorder(5,5,5,5);
		Border inner1=BorderFactory.createRaisedBevelBorder();
		CompoundBorder cmp=new CompoundBorder(outer1, inner1);
		PanelNorth.setBorder(cmp);	
		PanelNorth.setLayout(new BorderLayout());
		PanelNorth.add(PanelNorthWest, BorderLayout.WEST);
		PanelNorthWestWork();
		PanelNorth.add(PanelNorthCenter, BorderLayout.CENTER);
		PanelNorthCenterWork();
		PanelNorth.add(PanelNorthEast, BorderLayout.EAST);
		PanelNorthEastWork();
	}
		private void PanelNorthEastWork() {
			//PanelNorthEast.setBackground(Color.gray);
			PanelNorthEast.setPreferredSize(new Dimension(470, 0));
			PanelNorthEast.setLayout(new GridBagLayout());
			GridBagConstraints c=new GridBagConstraints();

			c.gridx=0;
			c.gridy=0;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(1, 5, 1, 5);
			PanelNorthEast.add(lblSalesNo, c);

			c.gridx=1;
			c.gridy=0;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(1,5,1, 160);
			PanelNorthEast.add(txtSalesNo, c);
			txtSalesNo.setPreferredSize(new Dimension(10, 27));

			c.gridx=0;
			c.gridy=1;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(1,5,1,5);
			PanelNorthEast.add(lblDate, c);

			c.gridx=1;
			c.gridy=1;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(1, 5,1,160);
			PanelNorthEast.add(txtDate, c);	
		}
		private void PanelNorthCenterWork() {
			PanelNorthCenter.setLayout(new GridBagLayout());
			GridBagConstraints c=new GridBagConstraints();
			//PanelNorthCenter.setBackground(Color.blue);

			c.gridx=0;
			c.gridy=0;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(5, 15, 5, 5);
			PanelNorthCenter.add(lblClntID, c);

			c.gridx=1;
			c.gridy=0;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(5,5,5, 5);
			PanelNorthCenter.add(cmbClntID.cmbSuggest, c);
		
			c.gridx=0;
			c.gridy=1;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(5,15,5,5);
			PanelNorthCenter.add(lblUsername, c);

			c.gridx=1;
			c.gridy=1;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(5, 5,5,5);
			PanelNorthCenter.add(txtUsername, c);	
		}
		private void PanelNorthWestWork() {
		//	PanelNorthWest.setBackground(Color.magenta);
			PanelNorthWest.setPreferredSize(new Dimension(320, 0));
			PanelNorthWest.setLayout(new GridBagLayout());
			GridBagConstraints c=new GridBagConstraints();
			
			JCheckBox chkRegister=new JCheckBox("Register Client");
			JCheckBox chkUnRegister=new JCheckBox("UnRegister Client");
			
			c.gridx=0;
			c.gridy=0;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(5, 35, 5, 5);
			PanelNorthWest.add(chkRegister, c);
			
			c.gridx=0;
			c.gridy=1;
			c.fill=GridBagConstraints.BOTH;
			c.insets=new Insets(5, 35, 5, 5);
			PanelNorthWest.add(chkUnRegister, c);
			}
	}

