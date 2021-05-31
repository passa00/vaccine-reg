import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;  
import java.text.*;
import javax.swing.table.*;
public class SwingDemo
{
	SwingDemo()
	{		
	
	
			JFrame menu= new JFrame("VACCINE REGISTRATION");
				JLabel background,heading;
				menu.setLayout(null);
				menu.setSize(1000,800);
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				background=new JLabel("");
				Image img=new ImageIcon(this.getClass().getResource("/mask1.png")).getImage();
				background.setIcon(new ImageIcon(img));
				 
				background.setBounds(500,300,500,500);
				
				heading=new JLabel("WELCOME TO VACCINE REGISTRATION PORTAL!!!");
				heading.setBounds(400,50,800,60);
				heading.setFont(new Font("monospaced",Font.BOLD+Font.ITALIC,30));
				heading.setForeground(Color.red);
		
		
			JButton b1=new JButton("CITIZEN REGISTRATION");
			JButton b2=new JButton("REGISTRATION STATUS");
			JButton b3=new JButton("ADMIN LOGIN/REPORT");
			
			b1.setBounds(250,250,200,30);
			b2.setBounds(650,250,200,30);
			b3.setBounds(1050,250,200,30);
	
		b1.addActionListener(new CITIZEN());
		b2.addActionListener(new status());
		b3.addActionListener(new Admin());
		
	menu.add(b1);menu.add(b2);menu.add(b3);menu.add(background);menu.add(heading);
		menu.setVisible(true);
	}
	
	
	static class CITIZEN implements ActionListener{

	 public void actionPerformed(ActionEvent e)
	{		
		String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    String years[]
        = { "1976",	"1977",	"1978",	"1979",	"1980",
			"1981",	"1982",	"1983",	"1984",
			"1985", "1986",	"1987",	"1988",
			"1989",	"1990",	"1991",	"1992",
			"1993",	"1994",
			"1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
			"2003"
			};
	JLabel adhar,name,sex,city,number,dob,address,heading,bg1;
		JTextField tadhar,tname,tcity,tnumber,taddress;
		JButton b1,b2;
		JComboBox tmm, tdd ,tyy;

				
				bg1=new JLabel("");
				Image img=new ImageIcon(this.getClass().getResource("/vacc2.png")).getImage();
				bg1.setIcon(new ImageIcon(img));
				 
				bg1.setBounds(900,50,800,800);
				


		
		JFrame f=new JFrame("VACCINE REGISTRATION");
		f.setSize(1650,1080);
		heading=new JLabel("FILL INFORMATION CAREDULLY..");
		heading.setBounds(190,30,500,60);
		heading.setFont(new Font("monospaced",Font.BOLD+Font.ITALIC,25));
		heading.setForeground(Color.red);
		
		adhar=new JLabel("Aadhar number :");
		adhar.setBounds(160,170,170,30);
		adhar.setFont(new Font("monospaced",Font.BOLD,16));
		
		tadhar=new JTextField();
		tadhar.setBounds(400,170,190,30);
		
		name=new JLabel("Full name :");
		name.setBounds(160,230,120,30);
		name.setFont(new Font("monospaced",Font.BOLD,17));
		
		tname=new JTextField();
		tname.setBounds(400,230,190,30);
		
		sex=new JLabel("Gender :");
		sex.setBounds(160,290,100,60);
		sex.setFont(new Font("monospaced",Font.BOLD,17));

		JRadioButton r1=new JRadioButton("A) Male");    
		JRadioButton r2=new JRadioButton("B) Female"); 
		r1.setFont(new Font("monospaced",Font.BOLD,14));
		r2.setFont(new Font("monospaced",Font.BOLD,14));	
		r1.setSelected(true);	
		r1.setBounds(400,300,100,30);    
		r2.setBounds(400,320,200,30);    
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);bg.add(r2); 


		city=new JLabel("Enter city :");
		city.setBounds(160,390,170,30);
		city.setFont(new Font("monospaced",Font.BOLD,17));
		
		tcity=new JTextField();
		tcity.setBounds(400,390,190,30);
		
		number=new JLabel("Enter mobile no:");
		number.setBounds(160,450,170,30);
		number.setFont(new Font("monospaced",Font.BOLD,17));
		
		tnumber=new JTextField();
		tnumber.setBounds(400,450,190,30);
		
		dob=new JLabel("Enter DOB :");
		dob.setBounds(160,510,170,30);
		dob.setFont(new Font("monospaced",Font.BOLD,17));
		
		tdd = new JComboBox(dates);
		tmm =new JComboBox(months);
		tyy=new JComboBox(years);
		tdd.setBounds(400,510,60,30);
		tmm.setBounds(470,510,60,30);
		tyy.setBounds(540,510,60,30);
		// tdob=new JTextField("dd-mm-yyyy");
		// tdob.setBounds(400,510,190,30);
		
		address=new JLabel("Enter Address :");
		address.setBounds(160,570,170,30);
		address.setFont(new Font("monospaced",Font.BOLD,17));
		
		taddress=new JTextField();
		taddress.setBounds(400,570,190,60);
		
		b1=new JButton("SUBMIT");
		b1.setBounds(450,650,80,30);
	
		f.add(r1);f.add(r2);f.add(b1);f.add(heading);f.add(bg1);f.add(tdd);f.add(tmm);f.add(tyy);
		f.add(adhar);f.add(name);f.add(sex);f.add(city);f.add(number);f.add(dob);f.add(address);
		f.add(tadhar);f.add(tname);f.add(tcity);f.add(tnumber);f.add(taddress);		
		f.setSize(1650,1080);
		f.setLayout(null);
		f.setVisible(true);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/qlOEOS9zzG","qlOEOS9zzG","9lZxkrrnbH");
		
		PreparedStatement pstmt = con.prepareStatement("insert into citizens values(?,?,?,?,?,?,?);");
		
		
		
		if(tadhar.getText().length()!=12)throw new Exception("please enter your valid adhar number");
		else{
			String adhar = tadhar.getText();
			for(int i=0;i<adhar.length();i++){
				if(adhar.charAt(i)<48 || adhar.charAt(i)>57){
					
					throw new Exception("Please enter valid aadhar number!");
				}
			}
		}
		if(tname.getText().length()==0)throw new Exception("please enter your name");
		
		String dob1 = (String)tyy.getSelectedItem()+"-"+(tmm.getSelectedIndex()+1)+"-"+(String)tdd.getSelectedItem();
		
		if(tnumber.getText().length()!=10)throw new Exception("please enter your valid mobile number");
		else{
			String mobi = tnumber.getText();
			for(int i=0;i<mobi.length();i++){
				if(mobi.charAt(i)<48 || mobi.charAt(i)>57){
					
					throw new Exception("Please enter valid mobile number!");
				}
			}
		}
		if(tcity.getText().length()==0)throw new Exception("please enter your city");
			
		if(taddress.getText().length()==0)throw new Exception("please enter your address");
		
		
		
		
		
		
		pstmt.setString(1,tname.getText());
		pstmt.setString(2,tadhar.getText());
		if(r1.isSelected())pstmt.setString(3,"male");
		if(r2.isSelected())pstmt.setString(3,"female");
		pstmt.setDate(4,java.sql.Date.valueOf(dob1));
		pstmt.setString(5,tnumber.getText());
		pstmt.setString(6,tcity.getText());
		pstmt.setString(7,taddress.getText());
		
		
		
		PreparedStatement pstmt2 = con.prepareStatement("insert into registrationStatus values(?,?,\"In Process\");");
		
		
		pstmt2.setString(1,tadhar.getText());
		pstmt2.setDate(2,java.sql.Date.valueOf(dob1));
		
		
		pstmt.executeUpdate();
		pstmt2.executeUpdate();
		con.close();
		JOptionPane.showMessageDialog(f,"Registered successfully.");
		}
		catch(Exception x){
			JOptionPane.showMessageDialog(f,x.getMessage());
		}
		
		}});
	}
	}
	
	
	
	
	
	
	
	
	static class status implements ActionListener{

	 public void actionPerformed(ActionEvent e)
	{
		
		
		
		String dates[]
        = { "01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    String years[]
        = { "1976",	"1977",	"1978",	"1979",	"1980",
			"1981",	"1982",	"1983",	"1984",
			"1985", "1986",	"1987",	"1988",
			"1989",	"1990",	"1991",	"1992",
			"1993",	"1994",
			"1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
			"2003"
			};
		
		
		
		
		
		
		JComboBox tmm, tdd ,tyy;
		
		JLabel bg2;
		
				bg2=new JLabel("");
				Image img=new ImageIcon(this.getClass().getResource("/status.png")).getImage();
				bg2.setIcon(new ImageIcon(img));
				 
				
				bg2.setBounds(850,0,800,800);
				
		
		
		JFrame f=new JFrame();
		JLabel l2=new JLabel("Aadhar number :");
		l2.setBounds(250,225,160,30);
		l2.setFont(new Font("monospaced",Font.BOLD,17));
		
		JTextField tf=new JTextField("");
		tf.setBounds(450,225,180,30);
		
		
	   
		JLabel l1=new JLabel("Password (DOB) :");    
        l1.setBounds(250,290, 180,30);
		l1.setFont(new Font("monospaced",Font.BOLD,17));		
		
		
		tdd = new JComboBox(dates);
		tmm =new JComboBox(months);
		tyy=new JComboBox(years);
		tdd.setBounds(450,290,60,30);
		tmm.setBounds(520,290,60,30);
		tyy.setBounds(590,290,60,30);
		
		
		
		
		 
		 JButton b1=new JButton("LOGIN");
		 b1.setBounds(450,370,120,30);
		 
		 
		 b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				
				
				
				
		try{

				if(tf.getText().length()!=12)throw new Exception("please enter your valid adhar number");
					else{
						String adhar = tf.getText();
						for(int i=0;i<adhar.length();i++){
							if(adhar.charAt(i)<48 || adhar.charAt(i)>57){
								
								throw new Exception("Please enter valid aadhar number!");
							}
						}
					}


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/qlOEOS9zzG","qlOEOS9zzG","9lZxkrrnbH");
		
		PreparedStatement pstmt = con.prepareStatement("select * from registrationStatus");
		ResultSet rs = pstmt.executeQuery();
		
		
		
		boolean isFound= false;
		while(rs.next()){
			if(rs.getString(1).equals(tf.getText())){
				isFound = true;
				String dob2 = (String)tyy.getSelectedItem()+"-"+(new DecimalFormat("00").format(tmm.getSelectedIndex()+1))+"-"+(String)tdd.getSelectedItem();
				if(rs.getString(2).equals(dob2)){
					
					JOptionPane.showMessageDialog(f,"Registration status is "+rs.getString(3));
					break;
					}
				
				else throw new Exception("Date of Birth mismatch!");
			}
		}
		if(!isFound)throw new Exception("First get registered for vaccination");
		con.close();
		}
		catch(Exception y){
			JOptionPane.showMessageDialog(f,y.getMessage());
		}		
		 }});
		 
        	f.add(l1); f.add(tf);f.add(l2);f.add(b1);f.add(bg2);f.add(tdd);f.add(tmm);f.add(tyy);
			f.setSize(1650,1080);
			f.setLayout(null);
			f.setVisible(true);
	}
	}
	
	
	
	
	
	
	
	
	
	
	static class Admin implements ActionListener{

	 public void actionPerformed(ActionEvent e)
	{	
		JFrame j=new JFrame();
		j.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JPanel f = new JPanel();
		

		JLabel bg3=new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/admin2.png")).getImage();
		bg3.setIcon(new ImageIcon(img));
		 
		bg3.setBounds(600,150,300,300);
		
		
		JLabel l2=new JLabel("Username: ");
		l2.setBounds(625,515,180,30);
		
		JTextField tf=new JTextField();
		tf.setBounds(700,515,180,30);
		
	   JPasswordField value = new JPasswordField();   
		JLabel l1=new JLabel("Password:");    
        l1.setBounds(625,560, 180,30);    
         value.setBounds(700,560,180,30); 
		 
		 JButton b1=new JButton("LOGIN");
		 b1.setBounds(725,610,120,30);
		 
            f.add(value);  f.add(l1); f.add(tf);f.add(l2);f.add(b1);f.add(bg3);
			f.setSize(1650,1080);
			f.setLayout(null);
			f.setVisible(true);
			j.add(f);
			j.setVisible(true);


			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
				try{
					if(!tf.getText().equals("passa") || !value.getText().equals("passa00")) throw new Exception("Username or passsword invalid!");
					JPanel t = new JPanel();
					// j.setVisible(false);
					

					t.setSize(1650,1080);
					t.setLayout(new GridLayout(1,1));



				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/qlOEOS9zzG","qlOEOS9zzG","9lZxkrrnbH");
		
				PreparedStatement pstmt = con.prepareStatement("select * from citizens");
				ResultSet rs = pstmt.executeQuery();
				//ResultSetMetaData rsmd=rs.getMetaData(); 
				//int a=rsmd.getColumnCount();
				//int b=rsmd.getRowCount();

				//String column[]={"FullName","AadharNumber","Gender","Date_of_Birth","MobileNumber","City","Address"};

			DefaultTableModel table = new DefaultTableModel(){
			public boolean isCellEditable(int row,int column){
			return false;
		}};
		table.addColumn("Name");
		table.addColumn("Aadhar Number");
		table.addColumn("Gender");
		table.addColumn("Date_of_Birth");
		table.addColumn("Mobile Number");
		table.addColumn("City");
		table.addColumn("Address");
	

				
				
			//	String data[][];
				while(rs.next()){
		table.insertRow(table.getRowCount(),new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getString(7)});
		}

		con.close();
				JTable jt=new JTable(table);    
				// jt.setBounds(30,40,1000,300);      naa iskaha dikhega kuchh to dooo    
				JScrollPane sp=new JScrollPane(jt);
				// sp.setSize(1000,1000);
				t.add(sp);          
				// f.setVisible(true);//click krne ke baaad false kia tha and last me fr true kia jiss se purana aaawala chala jae esa nai hoga kya????????iss pure code ko login button ke evem me daalusse usssi me padda hai

				
			
			t.setVisible(true);
			f.setVisible(false);
			j.add(t);
			// j.setVisible(true);
				}
				catch(Exception z){
					JOptionPane.showMessageDialog(j,z.getMessage());
				}


				}
			});
	
	}
	}
	
	
	
	
		
	
	
	
	public static void main(String a[])
	{
	  try {
		  
		  
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        new SwingDemo();
    } catch (Exception unused) {
       
    }
		
	}

}