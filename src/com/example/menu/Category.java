package com.example.menu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.util.StringTokenizer;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.html.Option;

import com.admin.SuggestText;
import com.example.Author.DbCon;

public class Category extends  JPanel{

	BorderLayout border=new BorderLayout();

	JPanel PanelWest=new JPanel();
	JPanel PanelWestNorth=new JPanel();
	JPanel PanelWestCenter=new JPanel();
	JPanel PanelWestSouth=new JPanel();
	JPanel PanelWestSouthNorth=new JPanel();
	JPanel PanelWestSouthSouth=new JPanel();

	JPanel PanelCenter=new JPanel();
	JPanel PanelCenterNorth=new JPanel();
	JPanel PanelCenterCenter=new JPanel();
	JPanel PanelCenterSouth=new JPanel();
	JPanel PanelCenterSouthNorth=new JPanel();
	JPanel PanelCenterSouthSouth=new JPanel();

	SuggestText cmbSearchCatagory=new SuggestText();	
	JButton btnSearch=new JButton("Search",new ImageIcon("img/filefind.png"));	


	String col[]={"CategoryId","CategoryName","Username"};
	Object row[][]={};
	DefaultTableModel model=new DefaultTableModel(row,col);
	JTable tb=new JTable(model);
	JScrollPane scroll=new JScrollPane(tb,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	JLabel lblCategoryId =new JLabel("Category ID");
	JTextField txtCategoryId=new JTextField(20);
	JLabel lblCategoryName =new JLabel("Category Name");
	JTextField txtCategoryName=new JTextField(20);
	JLabel lblName =new JLabel("Name");
	JTextField txtName=new JTextField(20);

	JButton btnAdd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnEdit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnRefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btnDelete=new JButton("Delete",new ImageIcon("img/delete1.png"));

	JTextField txtEmpty=new JTextField(32);	
	JButton btnFind=new JButton("Search",new ImageIcon("img/filefind.png"));

	JLabel lblCtgyId =new JLabel("Category ID");
	SuggestText cmb=new SuggestText();
	JLabel lblSCtgyId=new JLabel("Sub Category ID");
	JTextField txtSCtgyId=new JTextField(20);
	JLabel lblSname =new JLabel("Sub Category Name");
	JTextField txtSname=new JTextField(20);
	JLabel lblname =new JLabel("Name");
	JTextField txtname=new JTextField(20);

	JButton btnadd=new JButton("Add",new ImageIcon("img/file_add.png"));
	JButton btnedit=new JButton("Edit",new ImageIcon("img/edit1.png"));
	JButton btnrefresh=new JButton("Refresh",new ImageIcon("img/btnRefresh.png"));
	JButton btndelete=new JButton("Delete",new ImageIcon("img/delete1.png"));

	String ColumnSubCat[]={"CategoryId","CategoryName","Username"};
	Object rowSubCat[][]={};
	DefaultTableModel modelSubCat=new DefaultTableModel(rowSubCat,ColumnSubCat);
	JTable tableSubCat=new JTable(modelSubCat);
	JScrollPane scrollSubCat=new JScrollPane(tableSubCat,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	public Category()
	{
		setPreferredSize(new Dimension(1150,735));
		//setBackground(Color.lightGray);
		cmp();
		btnAction();
	}
	public void btnAction() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkValidation()){
					if(isExistCategoryName()){
						if(checkConfirmation()){
							if (insertData()){
								JOptionPane.showMessageDialog(null,"All info saved succesfully");
								txtClear();
								autoid();
								TableDataLoadCategory();
								cmbCatagorySearchDataLoad();
							}
						}
					}
				}
			}
		});
		tb.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent arg0) {
				int row=tb.getSelectedRow();
				int col=0;
				String idName=model.getValueAt(row, col).toString();
				StringTokenizer token=new StringTokenizer(idName,"#");
				cmbFindCatagoryData(token.nextToken());
			}
		});
		cmbSearchCatagory.cmbSuggest.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(!cmbSearchCatagory.txtSuggest.getText().isEmpty()){
					String idName=cmbSearchCatagory.txtSuggest.getText();
					StringTokenizer token=new StringTokenizer(idName,"#");
					cmbFindCatagoryData(token.nextToken());
				}
				else{
					txtClear();
					autoid();
				}
			}
		});
	}
	private void cmbFindCatagoryData(String id){
		try{
			txtClear();
			String sql="select categoryId,categoryName,userName "
					+ "from tbCategoryInfo where categoryId='"+id+"'";
			DbCon.connection();
			ResultSet rs=DbCon.sta.executeQuery(sql);
			if(rs.next()){
				String Catid=rs.getString("categoryId");
				String CatName=rs.getString("categoryName");
				String userName=rs.getString("userName");
				
				txtCategoryId.setText(Catid);
				txtCategoryName.setText(CatName);
				txtName.setText(userName);
			}
		}
		catch(Exception exp){
			JOptionPane.showMessageDialog(null, exp);
		}
	}
	public void cmbCatagorySearchDataLoad(){
		try{
			cmbSearchCatagory.v.clear();
			cmbSearchCatagory.v.add("");
			
			String sql="select categoryId,categoryName from tbCategoryInfo "
					+ "order by categoryName";
			DbCon.connection();
			ResultSet rs=DbCon.sta.executeQuery(sql);
			while(rs.next()){
				String id=rs.getString("categoryId");
				String name=rs.getString("categoryName");
				String idName=id+"#"+name;
				cmbSearchCatagory.v.add(idName);
			}
		}
		catch(Exception exp){
			JOptionPane.showMessageDialog(null, exp);
		}
	}
	public void TableDataLoadCategory() {
		try{
			String sql="select CategoryId,categoryname,Username from tbcategoryinfo order by categoryId ";
			DbCon.connection();
			ResultSet rs=DbCon.sta.executeQuery(sql);
			while(rs.next())
			{
				model.addRow(new Object[]{rs.getString("CategoryID"),rs.getString("CategoryName"),rs.getString("Username")});
			}
		}
		catch(Exception exp)
		{
			JOptionPane.showMessageDialog(null, exp);
		}
	}
	private void txtClear() {
		txtCategoryId.setText("");
		txtCategoryName.setText("");
		txtName.setText("");
	}
	private boolean insertData() {
		try{
			String sql="insert into tbcategoryinfo(categoryid,categoryname,username,userIp,entrytime)values"
					+ "('"+txtCategoryId.getText().trim()+"','"+txtCategoryName.getText().trim()+"',"
					+ "'"+txtName.getText().trim()+"','',now())";
			DbCon.connection();
			DbCon.sta.executeUpdate(sql);
			DbCon.con.close();
			return true;
		}
		catch(Exception exp)
		{
			JOptionPane.showMessageDialog(null, exp);
		}
		return false;
	}

	private boolean checkConfirmation() {
		int a=JOptionPane.showConfirmDialog(null,"Sure To Save?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
		if(a==JOptionPane.YES_OPTION){
			return true;
		}
		return false;
	}

	private boolean isExistCategoryName() {
		try{
			String sql="Select * from tbcategoryinfo where"
					+ " CategoryName='"+txtCategoryName.getText().trim()+"'";
			DbCon.connection();
			ResultSet rs=DbCon.sta.executeQuery(sql);
			if(rs.next()){
				JOptionPane.showMessageDialog(null, "CategoryName already Exist");
				return false;
			}
		}
		catch(Exception exp)
		{
			JOptionPane.showMessageDialog(null, exp);
		}
		return true;
	}

	private boolean checkValidation() {
		if(!txtCategoryId.getText().trim().isEmpty()){
			if(!txtCategoryName.getText().trim().isEmpty()){
				if(!txtName.getText().trim().isEmpty()){
					return true;
				}
				else{
					JOptionPane.showMessageDialog(null, "Plz enter Name");
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "Plz enter CategoryName");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Plz enter CategoryId");
		}
		return false;
	}
	public void autoid(){
		try{
			String sql=("select ifnull(max(cast(substring(categoryid,locate('-',categoryid)+1,length(categoryid)-locate('-',categoryid))"
					+ "as UNSIGNED)),0)+1 id from tbcategoryinfo");
			DbCon.connection();
			ResultSet rs=DbCon.sta.executeQuery(sql);	
			if(rs.next()){
				String id=rs.getString("id");
				txtCategoryId.setText("Cat-"+ id);
			}
		}
		catch(Exception exp){
			JOptionPane.showMessageDialog(null, exp);
		}
	}
	private void cmp() {
		setLayout(new GridLayout(1,2,20,25));
		add(PanelWest);
		PanelWestWork();
		add(PanelCenter);
		PanelCenterWork();	
	}
	private void PanelCenterWork() {
		PanelCenter.setBorder(BorderFactory.createTitledBorder("Sub Category"));
		PanelCenter.setLayout(new BorderLayout());
		PanelCenter.add(PanelCenterNorth, BorderLayout.NORTH);
		PanelCenterNorthWork();
		PanelCenter.add(PanelCenterCenter, BorderLayout.CENTER);
		PanelCenterCenterWork();
		PanelCenter.add(PanelCenterSouth, BorderLayout.SOUTH);
		PanelCenterSouthWork();
	}
	private void PanelCenterSouthWork() {
		PanelCenterSouth.setLayout(new BorderLayout());
		//PanelCenterSouth.setBackground(Color.BLUE);
		PanelCenterSouth.add(PanelCenterSouthNorth,BorderLayout.NORTH);
		PanelCenterSouthNorthWork();
		PanelCenterSouth.add(PanelCenterSouthSouth,BorderLayout.SOUTH);
		PanelCenterSouthSouthWork();
	}
	private void PanelCenterSouthSouthWork() {
		PanelCenterSouthSouth.setPreferredSize(new Dimension(555,320));
		//PanelCenterSouthSouth.setBackground(Color.GRAY);	
		FlowLayout flow=new FlowLayout();
		PanelCenterSouthSouth.setLayout(flow);
		flow.setVgap(0);
		flow.setHgap(0);
		PanelCenterSouthSouth.add(scrollSubCat);
		scrollSubCat.setPreferredSize(new Dimension(535, 320));
	}
	private void PanelCenterSouthNorthWork() {
		PanelCenterSouthNorth.setPreferredSize(new Dimension(501,60));
		//PanelCenterSouthNorth.setBackground(Color.BLACK);
		FlowLayout flow=new FlowLayout();
		PanelCenterSouthNorth.setLayout(new FlowLayout());
		PanelCenterSouthNorth.add(btnadd);
		PanelCenterSouthNorth.add(btnedit);
		PanelCenterSouthNorth.add(btnrefresh);
		btnrefresh.setPreferredSize(new Dimension(101, 45));
		PanelCenterSouthNorth.add(btndelete);
	}
	private void PanelCenterCenterWork() {
		//PanelCenterCenter.setBackground(Color.blue);
		PanelCenterCenter.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(lblCtgyId,c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(cmb.cmbSuggest,c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(lblSCtgyId,c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(txtSCtgyId,c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(lblSname,c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(txtSname,c);

		c.gridx=0;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(lblname,c);

		c.gridx=1;
		c.gridy=3;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelCenterCenter.add(txtname,c);
	}
	private void PanelCenterNorthWork() {
		PanelCenterNorth.setBorder(BorderFactory.createTitledBorder(""));
		PanelCenterNorth.setPreferredSize(new Dimension(530,130));
		//PanelWestNorth.setBackground(Color.black);
		PanelCenterNorth.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(25,5,5,5);
		PanelCenterNorth.add(txtEmpty,c);
		txtEmpty.setPreferredSize(new Dimension(20, 45));

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(25,10,5,5);
		PanelCenterNorth.add(btnFind,c);
	}
	private void PanelWestWork() {
		//PanelWest.setLayout(border);
		PanelWest.setBorder(BorderFactory.createTitledBorder("Category"));
		PanelWest.add(PanelWestNorth, BorderLayout.NORTH);
		PanelWestNorthWork();
		PanelWest.add(PanelWestCenter, BorderLayout.CENTER);
		PanelWestCenterWork();
		PanelWest.add(PanelWestSouth,BorderLayout.SOUTH);
		PanelWestSouthWork();
	}
	private void PanelWestSouthWork() {
		//PanelWestSouth.setPreferredSize(new Dimension(70, 250));
		PanelWestSouth.setLayout(border);
		//	PanelWestSouth.setBackground(Color.BLACK);
		PanelWestSouth.add(PanelWestSouthNorth, BorderLayout.NORTH);
		PanelWestSouthNorthWork();
		PanelWestSouth.add(PanelWestSouthSouth, BorderLayout.SOUTH);
		PanelWestSouthSouthWork();
	}
	private void PanelWestSouthSouthWork() {
		PanelWestSouthSouth.setPreferredSize(new Dimension(550,400));
		//PanelWestSouthSouth.setBackground(Color.GRAY);
		FlowLayout flow=new FlowLayout();
		PanelWestSouthSouth.setLayout(flow);
		flow.setVgap(0);
		PanelWestSouthSouth.add(scroll);
		scroll.setPreferredSize(new Dimension(550,390));
	}
	private void PanelWestSouthNorthWork() {
		PanelWestSouthNorth.setPreferredSize(new Dimension(500,60));
		//PanelWestSouthNorth.setBackground(Color.BLACK);
		FlowLayout flow=new FlowLayout();
		PanelWestSouthNorth.setLayout(flow);
		PanelWestSouthNorth.add(btnAdd);
		PanelWestSouthNorth.add(btnEdit);
		PanelWestSouthNorth.add(btnRefresh);
		btnRefresh.setPreferredSize(new Dimension(100, 45));
		PanelWestSouthNorth.add(btnDelete);
	}
	private void PanelWestCenterWork() {
		PanelWestCenter.setPreferredSize(new Dimension(545, 170));
		//PanelWestCenter.setBackground(Color.blue);
		PanelWestCenter.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblCategoryId,c);

		c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtCategoryId,c);

		c.gridx=0;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblCategoryName,c);

		c.gridx=1;
		c.gridy=1;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtCategoryName,c);

		c.gridx=0;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(lblName,c);

		c.gridx=1;
		c.gridy=2;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5,5,5,5);
		PanelWestCenter.add(txtName,c);
	}
	private void PanelWestNorthWork() {
		PanelWestNorth.setBorder(BorderFactory.createTitledBorder(""));
		PanelWestNorth.setPreferredSize(new Dimension(535,130));
		//PanelWestNorth.setBackground(Color.black);
		PanelWestNorth.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();

		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(25,5,5,5);
		PanelWestNorth.add(cmbSearchCatagory.cmbSuggest,c);
		cmbSearchCatagory.cmbSuggest.setPreferredSize(new Dimension(300, 40));

		/*c.gridx=1;
		c.gridy=0;
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(25,10,5,5);
		PanelWestNorth.add(btnSearch,c);*/
	}
}
