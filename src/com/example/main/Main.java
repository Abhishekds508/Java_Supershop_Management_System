package com.example.main;
import javax.swing.JFrame;
import javax.swing.UIManager;

import com.example.Author.DbCon;
import com.example.Author.Login;

public class Main extends JFrame {
	public static void main(String args[])
	{
		try 
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Login log=new Login();
		DbCon.connection();
	}
}
