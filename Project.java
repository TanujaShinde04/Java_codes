import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.Date;
import java.util.Vector;
import java.io.*;
import java.awt.Toolkit.*;
import java.awt.Dialog;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Project extends JFrame implements ActionListener
{
	
 JButton bankacc;
 JLabel accno,accname,branch,btot,date1;
 JTextField taccno,taccname,tbranch,tbtot,tdate1;
 int accountno=0,accounttotal=0;
 String accountname="",accbranch="",accdate="";
 String currdate3;
	
	
	
	int grandtotalvariable=0;
	int advancetotal2=0;
	int advancetotal3=0;
	int advancetotal1=0,advancetotal5=0,findgrandtotal=0;
	int pd=0,pd1=0,pd2=0;
	
	Panel p1,p2,p3,p4,p5,p6,p7,p44,p55,p66,p77;

	JLabel receiptno,date,name,devpfee,gymkhanafee,libraryfee,internetfee,annualsocialgath,cautionmoneydeposit,enrollnmentfee,
	answerbookfee,examinationfee,iste,dataprocessingfee,photocopy,verification,latefee,testing,servicetax,transcript,hostel,processingfee,equivalncefee,
	formfee,convocationfee,reassessmentfee,otherfee,totalamt,grandtotal,insurancefee,grand,tutionfee;

	JTextField treceiptno,tdate,tname,tdevpfee,tgymkhanafee,tlibraryfee,tinternetfee,tannualsocialgath,tcautionmoneydeposit,tenrollnmentfee,
	tanswerbookfee,tinsurancefee,tiste,tdataprocessingfee,tphotocopy,tverification,tlatefee,ttesing,tservicetax,ttranscript,thostel,tprocessingfee,
	tequivalncefee,tformfee,tconvocationfee,treassessmentfee,totherfee,ttotalamt,tgrandtotal,texaminationfee,tgrand,ttutionfee;

	JLabel advno,advamo,totalname,resun,grandtot,advancedate;

	JTextField t1,t2,t3,t5,t6;

	JLabel pdvrno,agadvno,advamt,totpdvr,diff,totpdvramt;

	JTextField tpdvrno,tagadvno,tadvamt,ttotpdvr,tdiff,ttotpdvramt;

	JButton b1,b2,b3,b4,reset,b5,reset2;
	
	JTextField s1,s2;
	JButton sbutton1,sbutton2;
	
	String currdate,currdate1;
	String advancecash1="";


	Choice cash;
	Choice advancecash;
	Choice direct;
	Choice give;
	JTextArea t4,ofreason;

	
	String na="";
	String ca="";
	int re=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,tot=0,y=0,z=0,tution=0;
	int ta=0,tno=0,tt=0;
	String tn="";
	String daa="";
	String tr="";
	String oth="";
	int da1=0;
	int pvn=0,padvno=0,pamt=0,totpv=0,pdiff=0,ptotpdvramt=0,pdiff1=0,pamt1=0,ptotpdvramt1=0;
	String dir="",pgt="";
	Connection con;
	JTabbedPane j1;
	
	
//	PreparedStatement ps;
	// Statement stat1;
	
	public Project() throws NullPointerException
	{
		
		super("welcome");
		setVisible(true);
		setSize(400,400);
		
		
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		p6=new Panel();
		p7=new Panel();
		
		p44=new Panel();
		p55=new Panel(new BorderLayout(5,5));
		p55.setPreferredSize(new Dimension(1200,700));
		p66=new Panel();
		p77=new Panel();
		
		
		receiptno=new JLabel("RECEIPT NO.");
		date=new JLabel("DATE");
		name=new JLabel("NAME");
		devpfee=new JLabel("DEVLOPMENT FEE");             
		gymkhanafee=new JLabel("GYMKHANA FEE");
		libraryfee=new JLabel("LIBRARY FEE");
		internetfee=new JLabel("INTERNET AND EMAIL");
		annualsocialgath=new JLabel("ANNUAL SOCIAL GATH");
		cautionmoneydeposit=new JLabel("CAUTION MONEY DEPOSIT");
		enrollnmentfee=new JLabel("ENROLLNMENT FEE");
		examinationfee=new JLabel("EXAMINATION FEE");
		answerbookfee=new JLabel("ANSWERBOOK FEE");
		insurancefee=new JLabel("INSURANCE FEE");
		iste=new JLabel("ISTE");
		dataprocessingfee=new JLabel("DATAPROCESSING FEE");
		photocopy=new JLabel("PHOTOCOPY");
		verification=new JLabel("VERIFICATION FEE");
		latefee=new JLabel("LATE FEE");
		testing=new JLabel("TESTING");
		servicetax=new JLabel("SERVICE TAX");
		transcript=new JLabel("TRANSCRIPT");
		hostel=new JLabel("HOSTEL");
		processingfee=new JLabel("PROCESSING FEE");
		equivalncefee=new JLabel("EQUVIVALNCE FEE");
		formfee=new JLabel("FORM FEE");
		convocationfee=new JLabel("CONVOCATION FEE");
		reassessmentfee=new JLabel("REASSESEMANT FEE");
		otherfee=new JLabel("OTHER FEE");
		totalamt=new JLabel("TOTAL AMOUNT");
		grandtotal=new JLabel("TODAYS GRAND TOTAL");
		grand=new JLabel("GRAND TOTAL");
		tutionfee=new JLabel("TUTION FEE");	
		
		treceiptno=new JTextField(12);
		tdate=new JTextField(12);
		tname=new JTextField(30);
		tdevpfee=new JTextField("0",6);
		tgymkhanafee=new JTextField("0",6);
		tlibraryfee=new JTextField("0",6);
		tinternetfee=new JTextField("0",6);
		tannualsocialgath=new JTextField("0",6);
		tcautionmoneydeposit=new JTextField("0",6);
		tenrollnmentfee=new JTextField("0",6);
		texaminationfee=new JTextField("0",6);
		tanswerbookfee=new JTextField("0",6);
		tinsurancefee=new JTextField("0",6);
		tiste=new JTextField("0",12);
		tdataprocessingfee=new JTextField("0",12);
		tphotocopy=new JTextField("0",6);
		tverification=new JTextField("0",6);               
		tlatefee=new JTextField("0",6);
		ttesing=new JTextField("0",6);
		tservicetax=new JTextField("0",6);
		ttranscript=new JTextField("0",6);
		thostel=new JTextField("0",6);
		tprocessingfee=new JTextField("0",6);
		tequivalncefee=new JTextField("0",6);
		tformfee=new JTextField("0",6);
		tconvocationfee=new JTextField("0",6);
		treassessmentfee=new JTextField("0",6);
		totherfee=new JTextField("0",6);
		ttotalamt=new JTextField("0",10);
		tgrandtotal=new JTextField("0",12);
		tgrand=new JTextField("0",12);
		ttutionfee=new JTextField("0",12);
		ofreason=new JTextArea("0",8,5);
		cash=new Choice();
		cash.add("BY CASH");
		cash.add("BY CHEQUE");
		
		b1=new JButton("SUBMIT");
		reset=new JButton("RESET");
		
		
		
		p1.add(ofreason);
		p1.add(tutionfee);
		p1.add(ttutionfee);
		p1.add(receiptno);
		p1.add(treceiptno);
		p1.add(date);
		p1.add(tdate);
		p1.add(name); 
		p1.add(tname);
		p1.add(devpfee);
		p1.add(tdevpfee);
		p1.add(gymkhanafee);
		p1.add(tgymkhanafee);
		p1.add(libraryfee);
		p1.add(tlibraryfee);
		p1.add(internetfee);
		p1.add(tinternetfee);
		p1.add(annualsocialgath);
		p1.add(tannualsocialgath);
		p1.add(cautionmoneydeposit);
		p1.add(tcautionmoneydeposit);
		p1.add(enrollnmentfee);
		p1.add(tenrollnmentfee);
		p1.add(examinationfee);
		p1.add(texaminationfee);
		p1.add(answerbookfee);
		p1.add(tanswerbookfee);
		p1.add(insurancefee);
		p1.add(tinsurancefee);
		p1.add(iste);
		p1.add(tiste);
		p1.add(dataprocessingfee);
		p1.add(tdataprocessingfee);
		p1.add(photocopy);
		p1.add(tphotocopy);
		p1.add(verification);
		p1.add(tverification);
		p1.add(latefee);
		p1.add(tlatefee);
		p1.add(testing);
		p1.add(ttesing);
		p1.add(servicetax);
		p1.add(tservicetax);
		p1.add(transcript);
		p1.add(ttranscript);
		p1.add(hostel);
		p1.add(thostel);
		p1.add(processingfee);
		p1.add(tprocessingfee);
		p1.add(equivalncefee);
		p1.add(tequivalncefee);
		p1.add(formfee);
		p1.add(tformfee);
		p1.add(convocationfee);
		p1.add(tconvocationfee);
		p1.add(reassessmentfee);
		p1.add(treassessmentfee);						
		p1.add(otherfee);
		p1.add(totherfee);
		p1.add(totalamt);
		p1.add(ttotalamt);
		p1.add(grandtotal);
		p1.add(tgrandtotal);  
		p1.add(b1);
		p1.add(cash);
		p1.add(grand);
		p1.add(tgrand);
		p1.add(reset);
		
				Date d1=new Date();
				java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy-MM-dd");
				currdate=sdf.format(d1);
				tdate.setText(currdate);
				
				

		p1.setLayout(null);
		receiptno.setBounds(100,30,80,20);
		treceiptno.setBounds(200,30,120,20);
		date.setBounds(800,30,60,20);
		tdate.setBounds(900,30,180,20);
		name.setBounds(100,70,70,20);													
		tname.setBounds(170,70,250,20);
		devpfee.setBounds(100,100,120,20);
		tdevpfee.setBounds(250,100,120,20);
		gymkhanafee.setBounds(450,100,120,20);
		tgymkhanafee.setBounds(600,100,120,20);
		libraryfee.setBounds(800,100,120,20);
		tlibraryfee.setBounds(970,100,120,20);
		annualsocialgath.setBounds(100,140,180,20);
		tannualsocialgath.setBounds(250,140,120,20);
		internetfee.setBounds(450,140,180,20);
		tinternetfee.setBounds(600,140,120,20);
		cautionmoneydeposit.setBounds(800,140,180,20);
		tcautionmoneydeposit.setBounds(970,140,120,20);
		enrollnmentfee.setBounds(100,180,160,20);
		tenrollnmentfee.setBounds(250,180,120,20);
		examinationfee.setBounds(450,180,160,20);
		texaminationfee.setBounds(600,180,120,20);
		answerbookfee.setBounds(800,180,160,20);
		tanswerbookfee.setBounds(970,180,120,20);
		insurancefee.setBounds(100,220,160,20);
		tinsurancefee.setBounds(250,220,120,20);
		iste.setBounds(450,220,160,20);
		tiste.setBounds(600,220,120,20);
		dataprocessingfee.setBounds(800,220,180,20);
		tdataprocessingfee.setBounds(970,220,120,20);
		photocopy.setBounds(100,260,160,20);
		tphotocopy.setBounds(250,260,120,20);
		verification.setBounds(450,260,160,20);
		tverification.setBounds(600,260,120,20);
		latefee.setBounds(800,260,160,20);
		tlatefee.setBounds(970,260,120,20);
		testing.setBounds(100,300,180,20);
		ttesing.setBounds(250,300,120,20);
		servicetax.setBounds(450,300,160,20);
		tservicetax.setBounds(600,300,120,20);
		transcript.setBounds(800,300,160,20);
		ttranscript.setBounds(970,300,120,20);
		hostel.setBounds(100,340,160,20);
		thostel.setBounds(250,340,120,20);
		processingfee.setBounds(450,340,160,20);
		tprocessingfee.setBounds(600,340,120,20);
		equivalncefee.setBounds(800,340,160,20);
		tequivalncefee.setBounds(970,340,120,20);
		formfee.setBounds(100,380,160,20);
		tformfee.setBounds(250,380,120,20);
		convocationfee.setBounds(450,380,160,20);
		tconvocationfee.setBounds(600,380,120,20);
		reassessmentfee.setBounds(800,380,140,20);
		treassessmentfee.setBounds(970,380,120,20);
		totalamt.setBounds(100,530,160,20);
		ttotalamt.setBounds(250,530,120,20);
		grandtotal.setBounds(970,560,160,20);
		tgrandtotal.setBounds(1120,560,120,20);
		b1.setBounds(550,530,100,30);
		reset.setBounds(650,530,100,30);
		cash.setBounds(870,430,150,20);
		grand.setBounds(970,600,160,20);
		tgrand.setBounds(1120,600,120,20);
		otherfee.setBounds(100,430,140,20);
		totherfee.setBounds(250,430,120,20);
		ofreason.setBounds(250,460,120,30);
		tutionfee.setBounds(450,430,160,20);
		ttutionfee.setBounds(600,430,120,20);
		
		
		
		advno=new JLabel("Advance number");
		totalname=new JLabel("Name");
		advamo= new JLabel("Advance amount");
		resun= new JLabel("Reason");
		grandtot= new JLabel("Grand Total");
		advancedate=new JLabel("Date");
		b2=new JButton("SUBMIT");
		b5=new JButton("RESET");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField(10);
		t4=new JTextArea(8,5);
		t5=new JTextField(10);
		t6=new JTextField(10);
		advancecash=new Choice();
		advancecash.add("BY CASH");
		advancecash.add("BY CHEQUE");
		
	p2.add(advno);
	p2.add(t1);
	p2.add(advamo);
	p2.add(t2);
	p2.add(totalname);
	p2.add(t3);
	p2.add(resun);
	p2.add(t4);
	p2.add(grandtot);
	p2.add(t5);
	p2.add(b2);
	p2.add(b5);
	p2.add(advancedate);
	p2.add(t6);
	p2.add(advancecash);
				Date d2=new Date();
				java.text.SimpleDateFormat sdf1=new java.text.SimpleDateFormat("yyyy-MM-dd");
				currdate1=sdf1.format(d2);
				t6.setText(currdate1);

	p2.setLayout(null);
	advno.setBounds(100,100,160,20);
	t1.setBounds(230,100,120,20);
	advamo.setBounds(100,150,160,20);
	t2.setBounds(230,150,120,20);
	totalname.setBounds(700,100,160,20);
	t3.setBounds(850,100,120,20);
	resun.setBounds(700,150,160,20);
	t4.setBounds(850,150,120,50);
	grandtot.setBounds(900,500,160,20);
	t5.setBounds(1020,500,120,20);
	b2.setBounds(450,270,120,30);
	b5.setBounds(580,270,120,30);
	advancedate.setBounds(100,200,160,20);
	t6.setBounds(230,200,120,20);
	advancecash.setBounds(750,220,150,50);
	
	pdvrno=new JLabel("PAID VOUCHER NO.");
	agadvno=new JLabel("AGAINST ADVANCE NO.");
	advamt= new JLabel("ADVANCE AMOUNT");
	totpdvr=new JLabel("TOTAL PAID VOUCHER");
	diff=new JLabel("DIFFERENCE");
	totpdvramt=new JLabel("TOTAL PAID VOUCHER AMOUNT");
	tpdvrno=new JTextField(16);
	tagadvno=new JTextField(16);
	tadvamt=new JTextField(16);
	ttotpdvr=new JTextField(16);
	tdiff=new JTextField(16);
	ttotpdvramt=new JTextField(16);
	b3=new JButton("SUBMIT");
	direct=new Choice();
	direct.add("DIRECT");
	direct.add("ADVANCED");
	give=new Choice();
	give.add("GIVE");
	give.add("TAKE");
	reset2=new JButton("RESET");
	
	p3.add(pdvrno);
	p3.add(agadvno);
	p3.add(direct);
	p3.add(give);
	p3.add(advamt);
	p3.add(totpdvr);
	p3.add(diff);
	p3.add(totpdvramt);
	p3.add(tpdvrno);
	p3.add(tagadvno);
	p3.add(reset2);

	p3.add(tadvamt);
	p3.add(ttotpdvr);
	p3.add(tdiff);
	p3.add(ttotpdvramt);
	p3.add(b3);
	p3.setLayout(null);
	pdvrno.setBounds(100,100,160,20);
	tpdvrno.setBounds(250,100,120,20);
	agadvno.setBounds(100,160,160,20);
	tagadvno.setBounds(250,160,120,20);
	advamt.setBounds(100,210,160,20);
	tadvamt.setBounds(250,210,120,20);
	totpdvr.setBounds(400,210,160,20);
	ttotpdvr.setBounds(600,210,120,20);
	diff.setBounds(750,210,120,20);
	tdiff.setBounds(850,210,120,20);
	totpdvramt.setBounds(800,500,180,20);
	ttotpdvramt.setBounds(1000,500,120,20);
	b3.setBounds(500,330,110,30);
	reset2.setBounds(620,330,110,30);
	direct.setBounds(400,160,100,40);
	give.setBounds(990,210,100,40);
	
	
	
 
 
 
  

	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
			
				
			PreparedStatement pss=null;
			ResultSet rcc= null;
			Statement statt= conn.createStatement();
			ResultSet rcc1= null;
			Statement statt1= conn.createStatement();
			ResultSet rcc2= null;
			Statement statt2= conn.createStatement();
			ResultSet rcc4= null;
			Statement statt4= conn.createStatement();
			
			
			
				rcc= statt.executeQuery("select sum(TOTALAMOUNT) from gppcash");
				while(rcc.next())
				{
					advancetotal2=rcc.getInt(1);
				}
					tgrand.setText(Integer.toString(advancetotal2));
					
					
				rcc1= statt1.executeQuery("select sum(TOTALAMOUNT) from gppcash where DATE(RDATE)=CURDATE()");
				while(rcc1.next())
				{
					advancetotal3=rcc1.getInt(1);
				}
					tgrandtotal.setText(Integer.toString(advancetotal3));
					
				rcc2= statt2.executeQuery("select sum(advanceamount) from advance");
				while(rcc2.next())
				{
					advancetotal1=rcc2.getInt(1);
				}
						t5.setText(Integer.toString(advancetotal1));
				
				rcc4= statt4.executeQuery("select sum(TOTALPAIDVOUCHER) from paidvoucher");
				while(rcc4.next())
				{
					advancetotal5=rcc4.getInt(1);
				}
						ttotpdvramt.setText(Integer.toString(advancetotal5));	



				
				
				
						
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	
	
		
		j1=new JTabbedPane();
		//j1.setPreferredSize(this.getSize());
		j1.addTab("RECEIPT DATA",p1);
		j1.addTab("TOTAL ADVANCE",p2);
		j1.addTab("PAID VOUCHER",p3);
		j1.addTab("TODAYS RECEIPTS",new Form3());
		j1.addTab(" ALL RECEIPTS",new Form());
		j1.addTab("ADVANCE TABLE",new Form1());
		j1.addTab("PAID VOUCHER TABLE",new Form2());
		
		
		
		j1.addChangeListener(new ChangeListener() { //add the Listener

        public void stateChanged(ChangeEvent e) {

            System.out.println(""+j1.getSelectedIndex());

            if(j1.getSelectedIndex()==4) //Index starts at 0, so Index 2 = Tab3
            {
               new Form();
            }
        }
    });
		
		
		add(j1);
		
		b1.addActionListener(this);
		reset.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b5.addActionListener(this);
		
		reset2.addActionListener(this);
		
		tagadvno.addFocusListener(new FocusAdapter()
		{
			public void focusLost(FocusEvent ae)
			{			
				try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
				ResultSet rcc3= null;
				Statement statt3= conn.createStatement();
				String load="select advanceamount from advance where advanceno="+tagadvno.getText().trim();
				rcc3= statt3.executeQuery(load);
				while(rcc3.next())
				{
				tadvamt.setText(Integer.toString(rcc3.getInt(1)));
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		
		ttotpdvr.addFocusListener(new FocusAdapter()
		{
			public void focusLost(FocusEvent ae)
			{	
				pd=Integer.parseInt(tadvamt.getText());
				pd1=Integer.parseInt(ttotpdvr.getText());
				pd2=pd-pd1;
				tdiff.setText(Integer.toString(pd2));
			}
		});	
		
		
		
	}
	
		
	
	
	public void actionPerformed(ActionEvent ae)
	{
		
		 
		if(ae.getSource()==b1)
		{
			try
			{
				

				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
				PreparedStatement ps,ps1=null;
				ResultSet rc2 = null;
				Statement stat2 = con.createStatement();
				ResultSet rc3=null;
				ResultSet rc4=null;
				Statement stat3=con.createStatement();
				Statement stat4=null;

				ca=cash.getSelectedItem();
				na=tname.getText();
				
				re=Integer.parseInt(treceiptno.getText());
				
					a=Integer.parseInt(tdevpfee.getText());
					b=Integer.parseInt(tgymkhanafee.getText());
					c=Integer.parseInt(tlibraryfee.getText());
					d=Integer.parseInt(tinternetfee.getText());
					e=Integer.parseInt(tannualsocialgath.getText());
					f=Integer.parseInt(tcautionmoneydeposit.getText());
					g=Integer.parseInt(tenrollnmentfee.getText());
					h=Integer.parseInt(texaminationfee.getText());
					i=Integer.parseInt(tanswerbookfee.getText());
					j=Integer.parseInt(tinsurancefee.getText());
					k=Integer.parseInt(tiste.getText());
					l=Integer.parseInt(tdataprocessingfee.getText());
					m=Integer.parseInt(tphotocopy.getText());
					n=Integer.parseInt(tverification.getText());
					o=Integer.parseInt(tlatefee.getText());
					p=Integer.parseInt(ttesing.getText());
					q=Integer.parseInt(ttranscript.getText());
					r=Integer.parseInt(thostel.getText());
					s=Integer.parseInt(tprocessingfee.getText());
					t=Integer.parseInt(tequivalncefee.getText());
					u=Integer.parseInt(tformfee.getText());
					v=Integer.parseInt(tconvocationfee.getText());
					w=Integer.parseInt(treassessmentfee.getText());
					x=Integer.parseInt(totherfee.getText());
					z=Integer.parseInt(tservicetax.getText());
					tution=Integer.parseInt(ttutionfee.getText());
					tot=a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+z+tution;
					oth=ofreason.getText();
					String str1=Integer.toString(tot);
					ttotalamt.setText(str1);
					
					
					ps=con.prepareStatement("insert into gppcash values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					ps.setInt(1,re);
					ps.setString(2,currdate);
					ps.setString(3,na);
					ps.setInt(4,a);
					ps.setInt(5,b);
					ps.setInt(6,c);
					ps.setInt(7,d);
					ps.setInt(8,e);
					ps.setInt(9,f);
					ps.setInt(10,g);
					ps.setInt(11,h);
					ps.setInt(12,i);
					ps.setInt(13,j);
					ps.setInt(14,k);
					ps.setInt(15,l);
					ps.setInt(16,m);
					ps.setInt(17,n);
					ps.setInt(18,o);
					ps.setInt(19,p);
					ps.setInt(20,z);
					ps.setInt(21,q);
					ps.setInt(22,r);
					ps.setInt(23,s);
					ps.setInt(24,t);
					ps.setInt(25,u);
					ps.setInt(26,v);
					ps.setInt(27,w);
					ps.setInt(28,tution);
					ps.setInt(29,x);
					ps.setString(30,oth);
					ps.setString(31,ca);
					ps.setInt(32,tot);
					
				
					
					int i=ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(Project.this,"RECORD SUCCESSFULLY SAVED.","A plain message",JOptionPane.PLAIN_MESSAGE);
					}
					rc2 = stat2.executeQuery("select sum(TOTALAMOUNT) from gppcash");
				while(rc2.next())
				{
					advancetotal2=rc2.getInt(1);
				}
					tgrand.setText(Integer.toString(advancetotal2));
					
					
				rc3= stat3.executeQuery("select sum(TOTALAMOUNT) from gppcash where DATE(RDATE)=CURDATE()");
				while(rc3.next())
				{
					advancetotal3=rc3.getInt(1);
				}
					tgrandtotal.setText(Integer.toString(advancetotal3));
					
				
					
					
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
				//StackTraceElement(e);
				
			}
			catch(SQLException e1){
				System.out.println(e1);
			}
			catch(Exception e2){
				System.out.println(e2);
			}
			
					
		}
		
		if(ae.getSource()==reset)
		{
			treceiptno.setText("");
			tname.setText("");
			tdevpfee.setText("0");
			tgymkhanafee.setText("0");
			tlibraryfee.setText("0");
			tinternetfee.setText("0");
			tannualsocialgath.setText("0");
			tcautionmoneydeposit.setText("0");
			tenrollnmentfee.setText("0");
			texaminationfee.setText("0");
			tanswerbookfee.setText("0");
			tinsurancefee.setText("0");
			tiste.setText("0");
			tdataprocessingfee.setText("0");
			tphotocopy.setText("0");
			tverification.setText("0");
			tlatefee.setText("0");
			ttesing.setText("0");
			tservicetax.setText("0");
			ttranscript.setText("0");
			thostel.setText("0");
			tprocessingfee.setText("0");
			tequivalncefee.setText("0");
			tformfee.setText("0");
			tconvocationfee.setText("0");
			treassessmentfee.setText("0");
			totherfee.setText("0");
			ttotalamt.setText("0");
			ttutionfee.setText("0");
			ofreason.setText("0");
			
			
			
		}
		if(ae.getSource()==b2)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
				PreparedStatement ps1;
				
				tno=Integer.parseInt(t1.getText());
				ta=Integer.parseInt(t2.getText());
				tn=t3.getText();
				tr=t4.getText();
				advancecash1=advancecash.getSelectedItem();
				
				ResultSet rc1 = null;
				Statement stat = con1.createStatement();
				
				
				
				ps1=con1.prepareStatement("insert into advance values(?,?,?,?,?,?)");
				ps1.setInt(1,tno);
				ps1.setInt(2,ta);
				ps1.setString(3,tn);
				ps1.setString(4,currdate1);
				ps1.setString(5,advancecash1);
				ps1.setString(6,tr);
				int ii=ps1.executeUpdate();
			
					if(ii>0)
					{
						JOptionPane.showMessageDialog(Project.this,"RECORD SUCCESSFULLY SAVED.","A plain message",JOptionPane.PLAIN_MESSAGE);
					}
				rc1 = stat.executeQuery("select sum(advanceamount) from advance");
				while(rc1.next())
				{
					advancetotal1=rc1.getInt(1);
				}
				t5.setText(Integer.toString(advancetotal1));
				advancetotal2=advancetotal2-ta;
				tgrand.setText(Integer.toString(advancetotal2));
				
				
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}
		if(ae.getSource()==b3)
		{
			try
			{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con5=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
			PreparedStatement ps5,ps7;
			
			ResultSet rs7=null;
			Statement stat7 = con5.createStatement();
			
			ResultSet rs9=null;
			Statement stat9 = con5.createStatement();
			
			pvn=Integer.parseInt(tpdvrno.getText());
			padvno=Integer.parseInt(tagadvno.getText());
			pamt=Integer.parseInt(tadvamt.getText());
			totpv=Integer.parseInt(ttotpdvr.getText());
			pdiff=Integer.parseInt(tdiff.getText());
			dir=direct.getSelectedItem();
			pgt=give.getSelectedItem();
			
			
			ps5=con5.prepareStatement("insert into paidvoucher values(?,?,?,?,?,?,?)");
				ps5.setInt(1,pvn);
				ps5.setInt(2,padvno);
				ps5.setInt(3,pamt);
				ps5.setString(4,dir);
				ps5.setInt(5,totpv);
				ps5.setInt(6,pdiff);
				ps5.setString(7,pgt);
				int i3=ps5.executeUpdate();		
				if(i3>0)
					{
						JOptionPane.showMessageDialog(Project.this,"RECORD SUCCESSFULLY SAVED.","A plain message",JOptionPane.PLAIN_MESSAGE);
					}
					
					
			rs7= stat7.executeQuery("select sum(TOTALPAIDVOUCHER) from paidvoucher");
				while(rs7.next())
				{
					advancetotal5=rs7.getInt(1);
				}
						ttotpdvramt.setText(Integer.toString(advancetotal5));	
			ps7=con5.prepareStatement("delete from advance where advanceno="+tagadvno.getText().trim());
			int i4=ps7.executeUpdate();	

				rs9= stat9.executeQuery("select sum(advanceamount) from advance");
				while(rs9.next())
				{
					advancetotal1=rs9.getInt(1);
				}
						t5.setText(Integer.toString(advancetotal1));
			
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
				
				
				
				
				
				
			
		}
		
		if(ae.getSource()==reset2)
		{
			tpdvrno.setText("0");
			tagadvno.setText("0");
			tadvamt.setText("0");
			ttotpdvr.setText("0");
			tdiff.setText("0");
		}
		if(ae.getSource()==b5)
		{
			t1.setText("0");
			t2.setText("0");
			t3.setText("");
			t4.setText("");
		} 
		
		
		
	
	}
	
	
	public static void main(String args[])  throws Exception
	{
		/*Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcash","root","");
		
		java.util.Scanner sc=new java.util.Scanner(System.in);*/
		Project p1=new Project();
		
		 
		 
	}
	
	
}


class Form extends JPanel
{
		//setLayout(new BorderLayout());
		ResultSet rs;
		Connection con = null;
		Statement st=null;
		Form()
		{
			final Vector columnNames = new Vector();
			final Vector data = new Vector();
			JButton button=new JButton("Export");
			//JPanel panel=new JPanel();
			
			//JPanel panel1=new JPanel(new BorderLayout(5,5));
			//panel1.setPreferredSize(new Dimension(1200,700));
			//panel1.setBackground(Color.GREEN);
			//JPanel panel2=new JPanel();
			//panel2.setBackground(Color.RED);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
				st = con.createStatement();
				System.out.println("Inside form");
				rs= st.executeQuery("Select * from gppcash");
				ResultSetMetaData md = rs.getMetaData();
				int columns=md.getColumnCount();
				for (int i =1;i<=columns;i++)
				{
					columnNames.addElement(md.getColumnName(i));
				}
				while (rs.next())
				{
					Vector row = new Vector(columns);
					for (int i=1;i<=columns;i++)
					{
						row.addElement(rs.getObject(i));
					}
					data.addElement(row);
				}
				
							
con.close();
st.close();
rs.close();
System.out.println("Everything deleted");
			}
			catch(Exception e){
				System.out.println(e);
			}	
			
			JTable table=new JTable(data,columnNames);
			//table.setModel(model);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getColumnModel().getColumn(0).setPreferredWidth(100);
			table.getColumnModel().getColumn(1).setPreferredWidth(100);
			table.getColumnModel().getColumn(2).setPreferredWidth(100);
			table.getColumnModel().getColumn(3).setPreferredWidth(100);
			table.getColumnModel().getColumn(4).setPreferredWidth(100);
			table.getColumnModel().getColumn(5).setPreferredWidth(100);
			table.getColumnModel().getColumn(6).setPreferredWidth(100);
			table.getColumnModel().getColumn(7).setPreferredWidth(100);
			table.getColumnModel().getColumn(8).setPreferredWidth(100);
			table.getColumnModel().getColumn(9).setPreferredWidth(100);
			table.getColumnModel().getColumn(10).setPreferredWidth(100);
			table.getColumnModel().getColumn(11).setPreferredWidth(100);
			table.getColumnModel().getColumn(12).setPreferredWidth(100);
			table.getColumnModel().getColumn(13).setPreferredWidth(100);
			table.getColumnModel().getColumn(14).setPreferredWidth(100);
			table.getColumnModel().getColumn(15).setPreferredWidth(100);
			table.getColumnModel().getColumn(16).setPreferredWidth(100);
			table.getColumnModel().getColumn(17).setPreferredWidth(100);
			table.getColumnModel().getColumn(18).setPreferredWidth(100);
			table.getColumnModel().getColumn(19).setPreferredWidth(100);
			table.getColumnModel().getColumn(20).setPreferredWidth(100);
			table.getColumnModel().getColumn(21).setPreferredWidth(100);
			table.getColumnModel().getColumn(22).setPreferredWidth(100);
			table.getColumnModel().getColumn(23).setPreferredWidth(100);
			table.getColumnModel().getColumn(24).setPreferredWidth(100);
			table.getColumnModel().getColumn(25).setPreferredWidth(100);
			table.getColumnModel().getColumn(26).setPreferredWidth(100);
			table.getColumnModel().getColumn(27).setPreferredWidth(100);
			table.getColumnModel().getColumn(28).setPreferredWidth(100);
			table.getColumnModel().getColumn(29).setPreferredWidth(100);
			table.getColumnModel().getColumn(30).setPreferredWidth(100);
			table.getColumnModel().getColumn(31).setPreferredWidth(100);
			
			//table.SetFillsViewportHeight(true);
			
			int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
			int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
			JScrollPane scrollPane=new JScrollPane(table,v,h);
			 scrollPane.setPreferredSize(new Dimension(1200, 620));
			add(scrollPane);
			//panel1.add(scrollPane);
			add(button);
			button.setBounds(700,1000,120,20);
			//button.setBounds(700,150,120,20);
			//panel.add(panel1);
			//panel.add(panel2);
			
			//add(panel);



button.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent ev){
try{
Connection con1= null;
Class.forName("com.mysql.jdbc.Driver");
con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
Statement stat = con1.createStatement();
rs= stat.executeQuery("Select * from gppcash");
HSSFWorkbook wb = new HSSFWorkbook();
HSSFSheet sheet = wb.createSheet("Excel Sheet");
HSSFRow rowhead = sheet.createRow((short)0);
rowhead.createCell((short) 0).setCellValue("receipt no.");
rowhead.createCell((short) 1).setCellValue("date");
rowhead.createCell((short) 2).setCellValue("student name");
rowhead.createCell((short) 3).setCellValue("devlopment");
rowhead.createCell((short) 4).setCellValue("gymkhna");
rowhead.createCell((short) 5).setCellValue("library");
rowhead.createCell((short) 6).setCellValue("internet & email");
rowhead.createCell((short) 7).setCellValue("annual social gathring");
rowhead.createCell((short) 8).setCellValue("caution money deposit");
rowhead.createCell((short) 9).setCellValue("enrollnment");
rowhead.createCell((short) 10).setCellValue("examination");
rowhead.createCell((short) 11).setCellValue("answer book");
rowhead.createCell((short) 12).setCellValue("insurance");
rowhead.createCell((short) 13).setCellValue("iste");
rowhead.createCell((short) 14).setCellValue("data processing");
rowhead.createCell((short) 15).setCellValue("photocopy");
rowhead.createCell((short) 16).setCellValue("verification");
rowhead.createCell((short) 17).setCellValue("late fee");
rowhead.createCell((short) 18).setCellValue("testing");
rowhead.createCell((short) 19).setCellValue("service tax");
rowhead.createCell((short) 20).setCellValue("transcript");
rowhead.createCell((short) 21).setCellValue("hostel");
rowhead.createCell((short) 22).setCellValue("processing");
rowhead.createCell((short) 23).setCellValue("eqvivalne");
rowhead.createCell((short) 24).setCellValue("form");
rowhead.createCell((short) 25).setCellValue("convocation");
rowhead.createCell((short) 26).setCellValue("reassessment");
rowhead.createCell((short) 27).setCellValue("tution fee");
rowhead.createCell((short) 28).setCellValue("other fee");
rowhead.createCell((short) 29).setCellValue("reason");
rowhead.createCell((short) 30).setCellValue("by cash/by cheque");
rowhead.createCell((short) 31).setCellValue("total amount");

int index=1;
while(rs.next()){
HSSFRow row = sheet.createRow((short)index);
row.createCell((short) 0).setCellValue(rs.getInt(1));
row.createCell((short) 1).setCellValue(rs.getDate(2));
row.createCell((short) 2).setCellValue(rs.getString(3));
row.createCell((short) 3).setCellValue(rs.getInt(4));
row.createCell((short) 4).setCellValue(rs.getInt(5));
row.createCell((short) 5).setCellValue(rs.getInt(6));
row.createCell((short) 6).setCellValue(rs.getInt(7));
row.createCell((short) 7).setCellValue(rs.getInt(8));
row.createCell((short) 8).setCellValue(rs.getInt(9));
row.createCell((short) 9).setCellValue(rs.getInt(10));
row.createCell((short) 10).setCellValue(rs.getInt(11));
row.createCell((short) 11).setCellValue(rs.getInt(12));
row.createCell((short) 12).setCellValue(rs.getInt(13));
row.createCell((short) 13).setCellValue(rs.getInt(14));
row.createCell((short) 14).setCellValue(rs.getInt(15));
row.createCell((short) 15).setCellValue(rs.getInt(16));
row.createCell((short) 16).setCellValue(rs.getInt(17));
row.createCell((short) 17).setCellValue(rs.getInt(18));
row.createCell((short) 18).setCellValue(rs.getInt(19));
row.createCell((short) 19).setCellValue(rs.getInt(20));
row.createCell((short) 20).setCellValue(rs.getInt(21));
row.createCell((short) 21).setCellValue(rs.getInt(22));
row.createCell((short) 22).setCellValue(rs.getInt(23));
row.createCell((short) 23).setCellValue(rs.getInt(24));
row.createCell((short) 24).setCellValue(rs.getInt(25));
row.createCell((short) 25).setCellValue(rs.getInt(26));
row.createCell((short) 26).setCellValue(rs.getInt(27));
row.createCell((short) 27).setCellValue(rs.getInt(28));
row.createCell((short) 28).setCellValue(rs.getInt(29));
row.createCell((short) 29).setCellValue(rs.getString(30));
row.createCell((short) 30).setCellValue(rs.getString(31));
row.createCell((short) 31).setCellValue(rs.getInt(32));


index++;
}
FileOutputStream fileOut = new FileOutputStream(new File("A:\\Hello.xls"));
wb.write(fileOut);
fileOut.close();
Runtime rt = Runtime.getRuntime();

rt.exec("cmd.exe /C start A:\\Hello.xls");
}
catch(Exception e){
	System.out.println(e);
}
}
});
}
}
 



class Form1 extends JPanel
{
		//setLayout(new BorderLayout());
		ResultSet rs;
		static int count=0;
		Form1()
		{
			final Vector columnNames = new Vector();
			final Vector data = new Vector();
			JButton button=new JButton("Export");
			//JPanel panel=new JPanel();
			
			//JPanel panel1=new JPanel(new BorderLayout(5,5));
			//panel1.setPreferredSize(new Dimension(1200,700));
			//panel1.setBackground(Color.GREEN);
			//JPanel panel2=new JPanel();
			//panel2.setBackground(Color.RED);
			try
			{
				Connection con = null;
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
				Statement st = con.createStatement();
				rs= st.executeQuery("Select * from advance");
				ResultSetMetaData md = rs.getMetaData();
				int columns=md.getColumnCount();
				for (int i =1;i<=columns;i++)
				{
					columnNames.addElement(md.getColumnName(i));
				}
				while (rs.next())
				{
					Vector row = new Vector(columns);
					for (int i=1;i<=columns;i++)
					{
						row.addElement(rs.getObject(i));
					}
					data.addElement(row);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}	
			
			JTable table=new JTable(data,columnNames);
			//table.setModel(model);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getColumnModel().getColumn(0).setPreferredWidth(100);
			table.getColumnModel().getColumn(1).setPreferredWidth(100);
			table.getColumnModel().getColumn(2).setPreferredWidth(100);
			table.getColumnModel().getColumn(3).setPreferredWidth(100);
			table.getColumnModel().getColumn(4).setPreferredWidth(100);
			table.getColumnModel().getColumn(5).setPreferredWidth(130);
			
			//table.SetFillsViewportHeight(true);
			
			int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
			int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
			JScrollPane scrollPane=new JScrollPane(table,v,h);
			 scrollPane.setPreferredSize(new Dimension(650, 620));
			add(scrollPane);
			//panel1.add(scrollPane);
			add(button);
			button.setBounds(700,1000,120,20);
			//button.setBounds(700,150,120,20);
			//panel.add(panel1);
			//panel.add(panel2);
			
			//add(panel);
			
		

button.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent ev){
try{
Connection con1= null;
Class.forName("com.mysql.jdbc.Driver");
con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
Statement stat = con1.createStatement();
rs= stat.executeQuery("Select * from advance");
HSSFWorkbook wb = new HSSFWorkbook();
HSSFSheet sheet = wb.createSheet("Excel Sheet");
HSSFRow rowhead = sheet.createRow((short)0);
rowhead.createCell((short) 0).setCellValue("ADVANCE NO");
rowhead.createCell((short) 1).setCellValue("ADVANCE AMOUNT");
rowhead.createCell((short) 2).setCellValue("FACULTY NAME");
rowhead.createCell((short) 3).setCellValue("DATE");
rowhead.createCell((short) 4).setCellValue("BY CASH/BY CHEQUE");
rowhead.createCell((short) 5).setCellValue("REASON");


int index=1;
while(rs.next()){
HSSFRow row = sheet.createRow((short)index);
row.createCell((short) 0).setCellValue(rs.getInt(1));
row.createCell((short) 1).setCellValue(rs.getInt(2));
row.createCell((short) 2).setCellValue(rs.getString(3));
row.createCell((short) 3).setCellValue(rs.getDate(4));
row.createCell((short) 4).setCellValue(rs.getString(5));
row.createCell((short) 5).setCellValue(rs.getString(6));



index++;
}
FileOutputStream fileOut = new FileOutputStream(new File("A:\\Hello.xls"));
wb.write(fileOut);
fileOut.close();
Runtime rt = Runtime.getRuntime();

rt.exec("cmd.exe /C start A:\\Hello.xls");
}
catch(Exception e){
	System.out.println(e);
}
}
});
}
}


class Form2 extends JPanel
{
		//setLayout(new BorderLayout());
		ResultSet rs;
		Form2()
		{
			final Vector columnNames = new Vector();
			final Vector data = new Vector();
			JButton button=new JButton("Export");
			//JPanel panel=new JPanel();
			
			//JPanel panel1=new JPanel(new BorderLayout(5,5));
			//panel1.setPreferredSize(new Dimension(1200,700));
			//panel1.setBackground(Color.GREEN);
			//JPanel panel2=new JPanel();
			//panel2.setBackground(Color.RED);
			try
			{
				Connection con = null;
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
				Statement st = con.createStatement();
				rs= st.executeQuery("Select * from paidvoucher");
				ResultSetMetaData md = rs.getMetaData();
				int columns=md.getColumnCount();
				for (int i =1;i<=columns;i++)
				{
					columnNames.addElement(md.getColumnName(i));
				}
				while (rs.next())
				{
					Vector row = new Vector(columns);
					for (int i=1;i<=columns;i++)
					{
						row.addElement(rs.getObject(i));
					}
					data.addElement(row);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}	
			
			JTable table=new JTable(data,columnNames);
			//table.setModel(model);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getColumnModel().getColumn(0).setPreferredWidth(100);
			table.getColumnModel().getColumn(1).setPreferredWidth(100);
			table.getColumnModel().getColumn(2).setPreferredWidth(100);
			table.getColumnModel().getColumn(3).setPreferredWidth(100);
			table.getColumnModel().getColumn(4).setPreferredWidth(100);
			table.getColumnModel().getColumn(5).setPreferredWidth(130);
			table.getColumnModel().getColumn(6).setPreferredWidth(100);
			
			//table.SetFillsViewportHeight(true);
			
			int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
			int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
			JScrollPane scrollPane=new JScrollPane(table,v,h);
			 scrollPane.setPreferredSize(new Dimension(750, 620));
			add(scrollPane);
			//panel1.add(scrollPane);
			add(button);
			button.setBounds(700,1000,120,20);
			//button.setBounds(700,150,120,20);
			//panel.add(panel1);
			//panel.add(panel2);
			
			//add(panel);
			



button.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent ev){
try{
Connection con1= null;
Class.forName("com.mysql.jdbc.Driver");
con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
Statement stat = con1.createStatement();
rs= stat.executeQuery("Select * from paidvoucher");
HSSFWorkbook wb = new HSSFWorkbook();
HSSFSheet sheet = wb.createSheet("Excel Sheet");
HSSFRow rowhead = sheet.createRow((short)0);
rowhead.createCell((short) 0).setCellValue("PAID VOUCHER NO");
rowhead.createCell((short) 1).setCellValue("AGAINST ADVANCE NO");
rowhead.createCell((short) 2).setCellValue("ADVANCE AMOUNT");
rowhead.createCell((short) 3).setCellValue("DIRECT/ADVANCE");
rowhead.createCell((short) 4).setCellValue("TOTAL PAID VOUCHER");
rowhead.createCell((short) 5).setCellValue("DIFFERENCE");
rowhead.createCell((short) 6).setCellValue("GIVE/TAKE");


int index=1;
while(rs.next()){
HSSFRow row = sheet.createRow((short)index);
row.createCell((short) 0).setCellValue(rs.getInt(1));
row.createCell((short) 1).setCellValue(rs.getInt(2));
row.createCell((short) 2).setCellValue(rs.getInt(3));
row.createCell((short) 3).setCellValue(rs.getString(4));
row.createCell((short) 4).setCellValue(rs.getInt(5));
row.createCell((short) 5).setCellValue(rs.getInt(6));
row.createCell((short) 6).setCellValue(rs.getString(7));


index++;
}
FileOutputStream fileOut = new FileOutputStream(new File("A:\\Hello.xls"));
wb.write(fileOut);
fileOut.close();
Runtime rt = Runtime.getRuntime();

rt.exec("cmd.exe /C start A:\\Hello.xls");
}
catch(Exception e){
	System.out.println(e);
}
}
});
}
}



class Form3 extends JPanel
{
		//setLayout(new BorderLayout());
		ResultSet rs;
		Form3()
		{
			final Vector columnNames = new Vector();
			final Vector data = new Vector();
			JButton button=new JButton("Export");
			//JPanel panel=new JPanel();
			
			//JPanel panel1=new JPanel(new BorderLayout(5,5));
			//panel1.setPreferredSize(new Dimension(1200,700));
			//panel1.setBackground(Color.GREEN);
			//JPanel panel2=new JPanel();
			//panel2.setBackground(Color.RED);
			try
			{
				Connection con = null;
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
				Statement st = con.createStatement();
				rs= st.executeQuery("select * from gppcash where DATE(RDATE)=CURDATE()");
				ResultSetMetaData md = rs.getMetaData();
				int columns=md.getColumnCount();
				for (int i =1;i<=columns;i++)
				{
					columnNames.addElement(md.getColumnName(i));
				}
				while (rs.next())
				{
					Vector row = new Vector(columns);
					for (int i=1;i<=columns;i++)
					{
						row.addElement(rs.getObject(i));
					}
					data.addElement(row);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}	
			
			JTable table=new JTable(data,columnNames);
			//table.setModel(model);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getColumnModel().getColumn(0).setPreferredWidth(100);
			table.getColumnModel().getColumn(1).setPreferredWidth(100);
			table.getColumnModel().getColumn(2).setPreferredWidth(100);
			table.getColumnModel().getColumn(3).setPreferredWidth(100);
			table.getColumnModel().getColumn(4).setPreferredWidth(100);
			table.getColumnModel().getColumn(5).setPreferredWidth(100);
			table.getColumnModel().getColumn(6).setPreferredWidth(100);
			table.getColumnModel().getColumn(7).setPreferredWidth(100);
			table.getColumnModel().getColumn(8).setPreferredWidth(100);
			table.getColumnModel().getColumn(9).setPreferredWidth(100);
			table.getColumnModel().getColumn(10).setPreferredWidth(100);
			table.getColumnModel().getColumn(11).setPreferredWidth(100);
			table.getColumnModel().getColumn(12).setPreferredWidth(100);
			table.getColumnModel().getColumn(13).setPreferredWidth(100);
			table.getColumnModel().getColumn(14).setPreferredWidth(100);
			table.getColumnModel().getColumn(15).setPreferredWidth(100);
			table.getColumnModel().getColumn(16).setPreferredWidth(100);
			table.getColumnModel().getColumn(17).setPreferredWidth(100);
			table.getColumnModel().getColumn(18).setPreferredWidth(100);
			table.getColumnModel().getColumn(19).setPreferredWidth(100);
			table.getColumnModel().getColumn(20).setPreferredWidth(100);
			table.getColumnModel().getColumn(21).setPreferredWidth(100);
			table.getColumnModel().getColumn(22).setPreferredWidth(100);
			table.getColumnModel().getColumn(23).setPreferredWidth(100);
			table.getColumnModel().getColumn(24).setPreferredWidth(100);
			table.getColumnModel().getColumn(25).setPreferredWidth(100);
			table.getColumnModel().getColumn(26).setPreferredWidth(100);
			table.getColumnModel().getColumn(27).setPreferredWidth(100);
			table.getColumnModel().getColumn(28).setPreferredWidth(100);
			table.getColumnModel().getColumn(29).setPreferredWidth(100);
			table.getColumnModel().getColumn(30).setPreferredWidth(100);
			table.getColumnModel().getColumn(31).setPreferredWidth(100);
			
			//table.SetFillsViewportHeight(true);
			
			int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
			int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
			JScrollPane scrollPane=new JScrollPane(table,v,h);
			 scrollPane.setPreferredSize(new Dimension(1200, 620));
			add(scrollPane);
			//panel1.add(scrollPane);
			add(button);
			button.setBounds(700,1000,120,20);
			//button.setBounds(700,150,120,20);
			//panel.add(panel1);
			//panel.add(panel2);
			
			//add(panel);
			



button.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent ev){
try{
Connection con1= null;
Class.forName("com.mysql.jdbc.Driver");
con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/gppcashsystem","root","");
Statement stat = con1.createStatement();
rs= stat.executeQuery("select * from gppcash where DATE(RDATE)=CURDATE()");
HSSFWorkbook wb = new HSSFWorkbook();
HSSFSheet sheet = wb.createSheet("Excel Sheet");
HSSFRow rowhead = sheet.createRow((short)0);
rowhead.createCell((short) 0).setCellValue("receipt no.");
rowhead.createCell((short) 1).setCellValue("date");
rowhead.createCell((short) 2).setCellValue("student name");
rowhead.createCell((short) 3).setCellValue("devlopment");
rowhead.createCell((short) 4).setCellValue("gymkhna");
rowhead.createCell((short) 5).setCellValue("library");
rowhead.createCell((short) 6).setCellValue("internet & email");
rowhead.createCell((short) 7).setCellValue("annual social gathring");
rowhead.createCell((short) 8).setCellValue("caution money deposit");
rowhead.createCell((short) 9).setCellValue("enrollnment");
rowhead.createCell((short) 10).setCellValue("examination");
rowhead.createCell((short) 11).setCellValue("answer book");
rowhead.createCell((short) 12).setCellValue("insurance");
rowhead.createCell((short) 13).setCellValue("iste");
rowhead.createCell((short) 14).setCellValue("data processing");
rowhead.createCell((short) 15).setCellValue("photocopy");
rowhead.createCell((short) 16).setCellValue("verification");
rowhead.createCell((short) 17).setCellValue("late fee");
rowhead.createCell((short) 18).setCellValue("testing");
rowhead.createCell((short) 19).setCellValue("service tax");
rowhead.createCell((short) 20).setCellValue("transcript");
rowhead.createCell((short) 21).setCellValue("hostel");
rowhead.createCell((short) 22).setCellValue("processing");
rowhead.createCell((short) 23).setCellValue("eqvivalne");
rowhead.createCell((short) 24).setCellValue("form");
rowhead.createCell((short) 25).setCellValue("convocation");
rowhead.createCell((short) 26).setCellValue("reassessment");
rowhead.createCell((short) 27).setCellValue("tution fee");
rowhead.createCell((short) 28).setCellValue("other fee");
rowhead.createCell((short) 29).setCellValue("reason");
rowhead.createCell((short) 30).setCellValue("by cash/by cheque");
rowhead.createCell((short) 31).setCellValue("total amount");

int index=1;
while(rs.next()){
HSSFRow row = sheet.createRow((short)index);
row.createCell((short) 0).setCellValue(rs.getInt(1));
row.createCell((short) 1).setCellValue(rs.getDate(2));
row.createCell((short) 2).setCellValue(rs.getString(3));
row.createCell((short) 3).setCellValue(rs.getInt(4));
row.createCell((short) 4).setCellValue(rs.getInt(5));
row.createCell((short) 5).setCellValue(rs.getInt(6));
row.createCell((short) 6).setCellValue(rs.getInt(7));
row.createCell((short) 7).setCellValue(rs.getInt(8));
row.createCell((short) 8).setCellValue(rs.getInt(9));
row.createCell((short) 9).setCellValue(rs.getInt(10));
row.createCell((short) 10).setCellValue(rs.getInt(11));
row.createCell((short) 11).setCellValue(rs.getInt(12));
row.createCell((short) 12).setCellValue(rs.getInt(13));
row.createCell((short) 13).setCellValue(rs.getInt(14));
row.createCell((short) 14).setCellValue(rs.getInt(15));
row.createCell((short) 15).setCellValue(rs.getInt(16));
row.createCell((short) 16).setCellValue(rs.getInt(17));
row.createCell((short) 17).setCellValue(rs.getInt(18));
row.createCell((short) 18).setCellValue(rs.getInt(19));
row.createCell((short) 19).setCellValue(rs.getInt(20));
row.createCell((short) 20).setCellValue(rs.getInt(21));
row.createCell((short) 21).setCellValue(rs.getInt(22));
row.createCell((short) 22).setCellValue(rs.getInt(23));
row.createCell((short) 23).setCellValue(rs.getInt(24));
row.createCell((short) 24).setCellValue(rs.getInt(25));
row.createCell((short) 25).setCellValue(rs.getInt(26));
row.createCell((short) 26).setCellValue(rs.getInt(27));
row.createCell((short) 27).setCellValue(rs.getInt(28));
row.createCell((short) 28).setCellValue(rs.getInt(29));
row.createCell((short) 29).setCellValue(rs.getString(30));
row.createCell((short) 30).setCellValue(rs.getString(31));
row.createCell((short) 31).setCellValue(rs.getInt(32));


index++;
}
FileOutputStream fileOut = new FileOutputStream(new File("A:\\Hello.xls"));
wb.write(fileOut);
fileOut.close();
Runtime rt = Runtime.getRuntime();

rt.exec("cmd.exe /C start A:\\Hello.xls");
}
catch(Exception e){
	System.out.println(e);
}
}
});
}
}
 

