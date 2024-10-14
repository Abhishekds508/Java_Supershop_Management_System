package com.example.Author;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECFieldF2m;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.example.menu.Category;
import com.example.menu.ChangePass;
import com.example.menu.ClientInfo;
import com.example.menu.Exit;
import com.example.menu.ItemReceipt;
import com.example.menu.LogOff;
import com.example.menu.MailSent;
import com.example.menu.NewUser;
import com.example.menu.OpeningStock;
import com.example.menu.ClientInfo;
import com.example.menu.ProductInfo;
import com.example.menu.ReceiptReturn;
import com.example.menu.Sales;
import com.example.menu.SalesReturn;
import com.example.menu.SetupReport;
import com.example.menu.SupplierInfo;
import com.example.menu.TaskReport;
import com.example.menu.WastageBroken;

public class WorkingPanel extends JPanel
{
	BorderLayout border=new BorderLayout();
	FlowLayout flow=new FlowLayout();
	JPanel PanelWest=new JPanel();
	JPanel PanelWestNorth=new JPanel();
	JPanel PanelWestCenter=new JPanel();
	JPanel PanelCenter=new JPanel();

	JButton btnSetup=new JButton("Setup");
	JButton btnSecurity=new JButton("Security");
	JButton btnTask=new JButton("Task");
	JButton btnReport=new JButton("Report");
	JButton btnOthers=new JButton("Others");

	JPanel PanelSetup=new JPanel();
	JPanel PanelSecurity=new JPanel();
	JPanel PanelTask=new JPanel();
	JPanel PanelReport=new JPanel();
	JPanel PanelOthers=new JPanel();

	JButton btnCategory=new JButton(new ImageIcon("img/rules64.png"));
	JButton btnSupplierInfo=new JButton(new ImageIcon("img/Man64.png"));
	JButton btnPartyInfo=new JButton(new ImageIcon("img/couple64.png"));
	JButton btnProductInfo=new JButton(new ImageIcon("img/Autocomplete64.png"));

	JLabel lblCatgory=new JLabel("Category");
	JLabel lblSupplierInfo=new JLabel("SupplierInfo");
	JLabel lblClientInfo=new JLabel("ClientInfo");
	JLabel lblProductInfo=new JLabel("ProductInfo");

	JButton btnNewUser=new JButton(new ImageIcon("img/My-Tickets164.png"));
	JButton btnChangePassword=new JButton(new ImageIcon("img/keys64.png"));

	JLabel lblNewUser=new JLabel("NewUser");
	JLabel lblCPass=new JLabel("ChangePassword");

	JButton btnOpeningStock=new JButton(new ImageIcon("img/addons64.png"));
	JButton btnItemReceipt=new JButton(new ImageIcon("img/Text-align-center64.png"));
	JButton btnReceiptReturn=new JButton(new ImageIcon("img/spellchecker64.png"));
	JButton btnSales=new JButton(new ImageIcon("img/wheel64.png"));
	JButton btnSalesReturn=new JButton(new ImageIcon("img/theory64.png"));
	JButton btnWastageBroken=new JButton(new ImageIcon("img/ruler64.png"));


	JLabel lblOpeningStock=new JLabel("OpeningStock");
	JLabel lblItemReceipt=new JLabel("ItemReceipt");
	JLabel lblReceiptReturn=new JLabel("ReceiptReturn");
	JLabel lblSales=new JLabel("Sales");
	JLabel lblSalesReturn=new JLabel("SalesReturn");
	JLabel lblWastageBroken=new JLabel("WastageBroken");

	JLabel lblSetupReport=new JLabel("SetupReport");
	JLabel lblTaskReport=new JLabel("TaskReport");

	JButton btnSetupReport=new JButton(new ImageIcon("img/Sales-report64.png"));
	JButton btnTaskReport=new JButton(new ImageIcon("img/application64.png"));

	JLabel lblMailSent=new JLabel("MailSent");
	JLabel lblLogoff=new JLabel("LogOff");
	JLabel lblExit=new JLabel("Exit");

	JButton btnMailSent=new JButton(new ImageIcon("img/message-already-read64.png"));
	JButton btnLogoff=new JButton(new ImageIcon("img/themes64.png"));
	JButton btnExit=new JButton(new ImageIcon("img/close64.png"));

	Category Category=new Category();
	SupplierInfo SuppInfo=new SupplierInfo();
	ClientInfo clntinfo=new ClientInfo();
	ProductInfo ProInfo=new ProductInfo();
	NewUser NwUser=new NewUser();
	ChangePass ChangePass=new ChangePass();
	OpeningStock OpStock=new OpeningStock();
	ItemReceipt ItemRcp=new ItemReceipt();
	ReceiptReturn RcptReturn=new ReceiptReturn();
	Sales Sls=new Sales();
	SalesReturn SlsReturn=new SalesReturn();
	WastageBroken WastBrkn=new WastageBroken();
	SetupReport SetReport=new SetupReport();
	TaskReport TskReport=new TaskReport();
	MailSent MSent=new MailSent();
	LogOff LOff=new LogOff();
	Exit Ext=new Exit();

	public WorkingPanel()
	{
		cmp();
		eventaction();
	}
	private void eventaction() {
		btnSetup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelFalse();
				PanelSetup.setVisible(true);	
			}
		});
		btnSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelFalse();
				PanelSecurity.setVisible(true);	
			}
		});
		btnTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelFalse();
				PanelTask.setVisible(true);	
			}
		});
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelFalse();
				PanelReport.setVisible(true);	
			}
		});
		btnOthers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelFalse();
				PanelOthers.setVisible(true);	
			}
		});
		btnCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				Category.setVisible(true);
				Category.autoid();
				Category.TableDataLoadCategory();
				Category.cmbCatagorySearchDataLoad();
			}
		});
		btnSupplierInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				SuppInfo.setVisible(true);
			}
		});
		btnPartyInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				clntinfo.setVisible(true);
			}
		});
		btnProductInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				ProInfo.setVisible(true);
			}
		});
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				NwUser.setVisible(true);
			}
		});
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				ChangePass.setVisible(true);
			}
		});
		btnOpeningStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				OpStock.setVisible(true);
			}
		});
		btnItemReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				ItemRcp.setVisible(true);
			}
		});
		btnReceiptReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				RcptReturn.setVisible(true);
			}
		});
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				Sls.setVisible(true);
			}
		});
		btnSalesReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				SlsReturn.setVisible(true);
			}
		});
		btnWastageBroken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				WastBrkn.setVisible(true);
			}
		});
		btnSetupReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				SetReport.setVisible(true);
			}
		});
		btnTaskReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				TskReport.setVisible(true);
			}
		});
		btnMailSent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				MSent.setVisible(true);
			}
		});
		btnLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				LOff.setVisible(true);
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SidePanelTrueFalse();
				Ext.setVisible(true);

			}
		});
	}
	private void cmp()
	{
		setLayout(new BorderLayout());
		add(PanelWest,BorderLayout.WEST);
		PanelWestWork();
		add(PanelCenter,BorderLayout.CENTER);
		PanelCenterWork();	
	}
	private void PanelCenterWork() {
		PanelCenter.setBorder(BorderFactory.createRaisedBevelBorder());	
		PanelCenter.setLayout(flow);
		flow.setVgap(0);
		//PanelCenter.setBackground(Color.yellow);
		GridBagConstraints c=new GridBagConstraints();

		PanelCenter.add(Category,c);
		PanelCenter.add(SuppInfo,c);
		PanelCenter.add(clntinfo,c);
		PanelCenter.add(ProInfo,c);
		PanelCenter.add(NwUser,c);
		PanelCenter.add(ChangePass,c);
		PanelCenter.add(OpStock,c);
		PanelCenter.add(ItemRcp,c);
		PanelCenter.add(RcptReturn,c);
		PanelCenter.add(Sls,c);
		PanelCenter.add(SlsReturn,c);
		PanelCenter.add(WastBrkn,c);
		PanelCenter.add(SetReport,c);
		PanelCenter.add(TskReport,c);
		PanelCenter.add(MSent,c);
		PanelCenter.add(LOff,c);
		PanelCenter.add(Ext,c);
		SidePanelTrueFalse();
	}
	private void SidePanelTrueFalse() {
		Category.setVisible(false);
		SuppInfo.setVisible(false);
		clntinfo.setVisible(false);
		ProInfo.setVisible(false);
		NwUser.setVisible(false);
		ChangePass.setVisible(false);
		OpStock.setVisible(false);
		ItemRcp.setVisible(false);
		RcptReturn.setVisible(false);
		Sls.setVisible(false);
		SlsReturn.setVisible(false);
		WastBrkn.setVisible(false);
		SetReport.setVisible(false);
		TskReport.setVisible(false);
		MSent.setVisible(false);
		LOff.setVisible(false);
		Ext.setVisible(false);
	}
	private void PanelWestWork() {
		PanelWest.setBorder(BorderFactory.createRaisedBevelBorder());
		PanelWest.setPreferredSize(new Dimension(200,0));
		PanelWest.setLayout(border);
		PanelWest.add(PanelWestNorth, BorderLayout.NORTH);
		PanelWestNorthWork();
		PanelWest.add(PanelWestCenter, BorderLayout.CENTER);
		PanelWestCenterWork();
	}
	private void PanelWestCenterWork() {
		FlowLayout flow=new FlowLayout();
		PanelWestCenter.setPreferredSize(new Dimension(200, 560));
		PanelWestCenter.setLayout(flow);
		flow.setVgap(0);
		PanelWestCenter.setBorder(BorderFactory.createRaisedBevelBorder());
		PanelWestCenter.add(PanelSetup);
		PanelSetupWork();
		PanelWestCenter.add(PanelSecurity);
		PanelSecurityWork();
		PanelWestCenter.add(PanelTask);
		PanelTaskWork();
		PanelWestCenter.add(PanelReport);
		PanelReportWork();
		PanelWestCenter.add(PanelOthers);
		PanelOthersWork();
		SidePanelFalse();
	}
	private void SidePanelFalse() {
		PanelSetup.setVisible(false);
		PanelSecurity.setVisible(false);
		PanelTask.setVisible(false);
		PanelReport.setVisible(false);
		PanelOthers.setVisible(false);
	}
	private void PanelOthersWork() {
		PanelOthers.setPreferredSize(new Dimension(200,570));
		PanelOthers.setBackground(Color.orange);
		PanelOthers.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelOthers.add(lblMailSent,c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,10,5);
		PanelOthers.add(btnMailSent,c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelOthers.add(lblLogoff,c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,10,5);
		PanelOthers.add(btnLogoff,c);

		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelOthers.add(lblExit,c);

		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,10,5);
		PanelOthers.add(btnExit,c);
	}
	private void PanelReportWork() {
		PanelReport.setPreferredSize(new Dimension(200,570));
		PanelReport.setBackground(Color.pink);	
		PanelReport.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(8,5,5,5);
		PanelReport.add(lblSetupReport,c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,30,5);
		PanelReport.add(btnSetupReport,c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(8,5,5,5);
		PanelReport.add(lblTaskReport,c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,50,5);
		PanelReport.add(btnTaskReport,c);
	}
	private void PanelTaskWork() {
		PanelTask.setPreferredSize(new Dimension(200,570));
		PanelTask.setBackground(Color.cyan);
		PanelTask.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelTask.add(lblOpeningStock,c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelTask.add(btnOpeningStock,c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelTask.add(lblItemReceipt,c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelTask.add(btnItemReceipt,c);

		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelTask.add(lblReceiptReturn,c);

		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelTask.add(btnReceiptReturn,c);

		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelTask.add(lblSales,c);

		c.gridx=0;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelTask.add(btnSales,c);

		c.gridx=0;
		c.gridy=8;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelTask.add(lblSalesReturn,c);		

		c.gridx=0;
		c.gridy=10;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelTask.add(btnSalesReturn,c);

		c.gridx=0;
		c.gridy=11;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(2,5,5,5);
		PanelTask.add(lblWastageBroken,c);

		c.gridx=0;
		c.gridy=12;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(3,5,5,5);
		PanelTask.add(btnWastageBroken,c);
	}
	private void PanelSecurityWork() {
		PanelSecurity.setPreferredSize(new Dimension(200,570));
		PanelSecurity.setBackground(Color.magenta);
		PanelSecurity.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(8,5,5,5);
		PanelSecurity.add(lblNewUser,c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,30,5);
		PanelSecurity.add(btnNewUser,c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(8,5,5,5);
		PanelSecurity.add(lblCPass,c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,50,5);
		PanelSecurity.add(btnChangePassword,c);

	}
	private void PanelSetupWork() {
		PanelSetup.setPreferredSize(new Dimension(200,570));
		PanelSetup.setBackground(Color.white);
		PanelSetup.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelSetup.add(lblCatgory,c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,10,5);
		PanelSetup.add(btnCategory,c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelSetup.add(lblSupplierInfo,c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,10,5);
		PanelSetup.add(btnSupplierInfo,c);

		c.gridx=0;
		c.gridy=4;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelSetup.add(lblClientInfo,c);

		c.gridx=0;
		c.gridy=5;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,10,5);
		PanelSetup.add(btnPartyInfo,c);

		c.gridx=0;
		c.gridy=6;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelSetup.add(lblProductInfo,c);

		c.gridx=0;
		c.gridy=7;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,10,5);
		PanelSetup.add(btnProductInfo,c);

	}
	private void PanelWestNorthWork() {
		PanelWestNorth.setBorder(BorderFactory.createRaisedBevelBorder());	
		PanelWestNorth.setPreferredSize(new Dimension(0,170));
		PanelWestNorth.setLayout(new GridLayout(5,0,1,5));
		PanelWestNorth.add(btnSetup);
		PanelWestNorth.add(btnSecurity);
		PanelWestNorth.add(btnTask);
		PanelWestNorth.add(btnReport);
		PanelWestNorth.add(btnOthers);
	}
}
