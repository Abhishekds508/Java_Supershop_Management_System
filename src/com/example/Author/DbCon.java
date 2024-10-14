package com.example.Author;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DbCon {
	public static Connection con=null;
	public static Statement sta=null;
	public static void connection(){
		try{
			File file=new File("src/Db.txt");
			Scanner scan=new Scanner(file);
			int a=1;
			String server="",port="",userName="",dbFile="",password="";
			while(scan.hasNextLine()){
				String S=scan.nextLine();
				StringTokenizer token=new StringTokenizer(S);
				token.nextToken();
				if(a==1){
					server=token.nextToken();
				}
				else if(a==2){
					port=token.nextToken();
				}
				else if(a==3){
					userName=token.nextToken();
				}
				else if(a==4){
					password=token.nextToken();
				}
				else if(a==5){
					dbFile=token.nextToken();
					break;
				}
				a++;		
			}
			String url="jdbc:mysql://"+server+":"+port+"/"+dbFile;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con=DriverManager.getConnection(url,userName,password);
			sta=con.createStatement();
			//System.out.println("Database Connection Established");
		}
		catch(Exception exp){
			System.out.println(exp);
		}
	}
	public static void main(String args[]){
		connection();
	}

}
