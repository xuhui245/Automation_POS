package automation;

import automation.Util;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingTest extends JFrame implements ActionListener {
	
	
	JPanel jpTitle,jpManagerId,jpManagerPw,jpCrewId,jpCrewPw,jpTax1,jpTax2,jpSales,jpButtons1,jpButtons2;
	JPanel jpCheckBox1,jpCheckBox2,jpCheckBox3,jpCheckBox4;
	JButton jbSave,jbCancel,jbStart,jbExit;
	JLabel jlBuffer1,jlBuffer2,jlBuffer3,jlBuffer4;
	JLabel jlTitle,jlManagerId,jlManagerPw,jlCrewId,jlCrewPw,jlTax1,jlTax2,jlSales;
	JTextField jtManagerId,jtManagerPw,jtCrewId,jtCrewPw,jtTax1,jtTax2,jtSales;
	JCheckBox jcbFast,jcbCYT,jcbKiosk,jcbPromotion,jcbMFY,jcbReport,jcbOrderNumber,jcbReceipt;
	JCheckBox jcbOrderTaking,jcbStressTest,jcbDT_KVS,jcbFC_KVS;
	public String InputPath = "E:\\Automation\\Input_Variable.txt";
    public String faString = "E:\\Automation\\Start_FC.bat";
	public String dtString = "E:\\Automation\\Start_DT.bat";
	public void display(){
  
		Util util = new Util();
		util.ReadXml();
   //Panels
		jpTitle = new JPanel();
		jpManagerId = new JPanel();
		jpManagerPw = new JPanel();
		jpCrewId = new JPanel();
		jpCrewPw = new JPanel();
		jpTax1 = new JPanel();
		jpTax2 = new JPanel();
		jpSales = new JPanel();
		jpButtons1 = new JPanel();
		jpButtons2 = new JPanel();
		jpCheckBox1 = new JPanel();
		jpCheckBox2 = new JPanel();
		jpCheckBox3 = new JPanel();
		jpCheckBox4 = new JPanel();
   //TextField	
		jtManagerId = new JTextField(10);
		jtManagerPw = new JTextField(10);
		jtCrewId = new JTextField(10);
		jtCrewPw = new JTextField(10);
		jtTax1 = new JTextField(10);
		jtTax2 = new JTextField(10);
		jtSales = new JTextField(10);
		
		jtManagerId.setText(util.Manager_id);
		jtManagerPw.setText(util.Manager_Password);
		jtCrewId.setText(util.Crew_id);
		jtCrewPw.setText(util.Crew_Password);
		jtTax1.setText(util.Tax1);
		jtTax2.setText(util.Tax2);
		jtSales.setText(util.Sales_Tax_Seq);
   //Button	
		jbSave = new JButton(" Save ");
		jbCancel = new JButton("Cancel");
		jbStart = new JButton( " Start ");
		jbExit = new JButton("  Exit  ");
		
		jbSave.addActionListener(this);
		jbCancel.addActionListener(this);
		jbStart.addActionListener(this);
		jbExit.addActionListener(this);
		
		jbSave.setActionCommand("save");
		jbCancel.setActionCommand("cancel");
		jbStart.setActionCommand("start");
		jbExit.setActionCommand("exit");
   //Label	
		jlTitle = new JLabel("                                  RDI Automation Test");
		jlManagerId = new JLabel("          Manager ID:                 "); //12
		jlManagerPw = new JLabel("          Manager Password: "); //18
		jlCrewId = new JLabel("          Crew ID:                       ");  //9
		jlCrewPw = new JLabel("          Crew Password:       ");  //15
		jlTax1 = new JLabel("          Tax1:                            "); //6
		jlTax2 = new JLabel("          Tax2:                            "); //6
		jlSales = new JLabel("          Sales Tax Seq:          ");  //15
		jlBuffer1 = new JLabel("                      ");
		jlBuffer2 = new JLabel("           ");
		jlBuffer3 = new JLabel("                      ");
		jlBuffer4 = new JLabel("           ");
   //CheckBox		
		jcbFast = new JCheckBox("Fast Fail       ");
		jcbCYT = new JCheckBox("CYT            ");
		jcbKiosk = new JCheckBox("Kiosk           ");
		jcbPromotion = new JCheckBox("Promotion");
		jcbMFY = new JCheckBox("MFY              ");
		jcbReport = new JCheckBox("Report      ");
		jcbOrderNumber = new JCheckBox("Order_Number");
		jcbReceipt = new JCheckBox("Receipt     ");
		jcbOrderTaking = new JCheckBox("Order Taking");
		jcbStressTest = new JCheckBox("Stress Test");
		jcbDT_KVS = new JCheckBox("DT_KVS Routing");
		jcbFC_KVS = new JCheckBox("FC_KVS Routing");
		
		jpTitle.add(jlTitle);
		
		jpManagerId.add(jlManagerId);
		jpManagerId.add(jtManagerId);
		jpManagerPw.add(jlManagerPw);
		jpManagerPw.add(jtManagerPw);
		
		jpCrewId.add(jlCrewId);
		jpCrewId.add(jtCrewId);
		jpCrewPw.add(jlCrewPw);
		jpCrewPw.add(jtCrewPw);
		
		jpTax1.add(jlTax1);
		jpTax1.add(jtTax1);
		jpTax2.add(jlTax2);
		jpTax2.add(jtTax2);
		
		jpSales.add(jlSales);
		jpSales.add(jtSales);
		
	    jpButtons1.add(jlBuffer1);
		jpButtons1.add(jbSave);
		jpButtons1.add(jlBuffer2);
		jpButtons1.add(jbCancel);
		
		jpButtons2.add(jlBuffer3);
		jpButtons2.add(jbStart);
		jpButtons2.add(jlBuffer4);
		jpButtons2.add(jbExit);
		
		jpCheckBox1.add(jcbFast);
		jpCheckBox1.add(jcbCYT);
		jpCheckBox1.add(jcbOrderNumber);
		jpCheckBox2.add(jcbMFY);
		jpCheckBox2.add(jcbPromotion);
		jpCheckBox2.add(jcbOrderTaking);
		jpCheckBox3.add(jcbKiosk);
		jpCheckBox3.add(jcbReceipt);
		jpCheckBox3.add(jcbFC_KVS);
		jpCheckBox4.add(jcbStressTest);
		jpCheckBox4.add(jcbReport);
		jpCheckBox4.add(jcbDT_KVS);
		
		add(jpTitle);
		add(jpManagerId);
		add(jpManagerPw);
		add(jpCrewId);
		add(jpCrewPw);
		add(jpTax1);
		add(jpTax2);
		add(jpSales);
		add(jpButtons1);
		add(jpCheckBox1);
		add(jpCheckBox2);
		add(jpCheckBox3);
		add(jpCheckBox4);
		add(jpButtons2);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setTitle("RDI Automation");
        setSize(350, 600);
        setLocation(50, 50);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("save")){
			
			System.out.println(InputPath);
				String ManagerId = jtManagerId.getText();				
				String ManagerPw = jtManagerPw.getText();
				String CrewId = jtCrewId.getText();
				String CrewPw = jtCrewPw.getText();
				String Tax1 = jtTax1.getText();
				String Tax2 = jtTax2.getText();
				String Sales = jtSales.getText();
				
				try {
					FileWriter fileWriter = new FileWriter(InputPath, false);
					PrintWriter printWriter = new PrintWriter(fileWriter, false);
					printWriter.flush();
					printWriter.close();
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				writeTxt("Manager id:" + ManagerId);
				writeTxt("Manager Password:" + ManagerPw);
				writeTxt("Crew id:" + CrewId);
				writeTxt("Crew Password:" + CrewPw);
				writeTxt("Tax1:" + Tax1);
				writeTxt("Tax2:" + Tax2);
				writeTxt("Sales Tax Seq:" + Sales);
			
		}else if(e.getActionCommand().equals("cancel")){
			
			jtManagerId.setText("0");
			jtManagerPw.setText("0");
			jtCrewId.setText("0");
			jtCrewPw.setText("0");
			jtTax1.setText("0.00");
			jtTax2.setText("0.00");
			jtSales.setText("S/P");
			
		}else if(e.getActionCommand().equals("start")){
			
			if(jcbFast.isSelected()){
				System.out.println("Fast_Fail");
				try {
					Runtime.getRuntime().exec("cmd /k start " + faString);
					
					try {
						Thread.sleep(720000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			if(jcbCYT.isSelected()){
				System.out.println("CYT");
			}
			if(jcbOrderNumber.isSelected()){
				System.out.println("OrderNumber");
			}
			if(jcbMFY.isSelected()){
				
			}
			if(jcbPromotion.isSelected()){
				
			}
			if(jcbOrderTaking.isSelected()){
				
			}
			if(jcbKiosk.isSelected()){
				
			}
			if(jcbReceipt.isSelected()){
				
			}
			if(jcbFC_KVS.isSelected()){
				
			}
			if(jcbStressTest.isSelected()){
				
			}
			if(jcbReport.isSelected()){
				
			}
			if(jcbDT_KVS.isSelected()){
				System.out.println("Drive Through");
				try {
					Runtime.getRuntime().exec("cmd /k start " + dtString);
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}else if(e.getActionCommand().equals("exit")){
			System.exit(0);
		}
	}
	
     public void writeTxt(String input){
    	
    	try {
			FileWriter fileWriter = new FileWriter(InputPath, true);
			fileWriter.write(input + "\r\n");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public static void main(String[] args){
		
		new SwingTest().display();
		
	}
	
} 