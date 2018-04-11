package automation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.Region;
import automation.Util;
import automation.Logging;

public class Main {

	public static String myDT01 = "D:\\Automation\\DT_images\\DT_Order01.png";
	public static String myDT02 = "D:\\Automation\\DT_images\\DT_Order02.png";
	public static String myDT03 = "D:\\Automation\\DT_images\\DT_Order03.png";
	public static String myDT04 = "D:\\Automation\\DT_images\\DT_Order04.png";
	public static String myDT05 = "D:\\Automation\\DT_images\\DT_Order05.png";
	public static String myDT06 = "D:\\Automation\\DT_images\\DT_Order06.png";
	public static String myDT07 = "D:\\Automation\\DT_images\\DT_Order07.png";
	public static String myDT08 = "D:\\Automation\\DT_images\\DT_Order08.png";
	public static String myDT09 = "D:\\Automation\\DT_images\\DT_Order09.png";
	public static String myDT10 = "D:\\Automation\\DT_images\\DT_Order10.png";
	
	public static int timePause = 30000;
	public static int observeTime = 30;
	public static int count = 0;
	
//	public static String tmpsavePath = "\\\\10.0.0.25\\E\\Automation\\Fast_Fail\\DT_Dual_ScreenShot";
	public static void main(String[] args){
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FrontCounter01();
		FrontCounter02();
		FrontCounter03();
		FrontCounter04();
		FrontCounter05();
		FrontCounter06();
		FrontCounter07();
		FrontCounter08();
		FrontCounter09();
		FrontCounter10();
	}
	
	public static void FrontCounter01(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT01);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("01");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot1 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot1 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot1 not found");
			System.out.println("ScreenShot1 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static void FrontCounter02(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT02);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("02");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder2.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot2 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot2 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot2 not found");
			System.out.println("ScreenShot2 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static void FrontCounter03(){
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r3 = new Region(0,0,1016,740);
		r3.onAppear(myDT03);
		boolean flag3 = r3.observe(20);
		if(flag3){
			Util.getScreenShot("03");
		//	r3.saveScreenCapture(tmpsavePath,"tmpOrder3.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot3 is detected");
			r3.stopObserver();
			System.out.println("DT_Dual_ScreenShot3 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot3 not found");
			System.out.println("ScreenShot3 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public static void FrontCounter04(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT04);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("04");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder4.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot4 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot4 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot4 not found");
			System.out.println("ScreenShot4 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public static void FrontCounter05(){
	
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Result.txt");
	Region r5 = new Region(0,0,1016,740);
	r5.onAppear(myDT05);
	boolean flag5 = r5.observe(20);
	if(flag5){
		Util.getScreenShot("05");
	//	r5.saveScreenCapture(tmpsavePath,"tmpOrder5.png");
		lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot5 is detected");
		r5.stopObserver();
		System.out.println("DT_Dual_ScreenShot5 is found");
	}else{
		lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot5 not found");
		System.out.println("ScreenShot5 not found");
		count++;
		if(count == 3){
			System.exit(0);
		}
	//	Util.getScreenShot(Util.getorderId());
	}
	try {
		Thread.sleep(timePause);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

    public static void FrontCounter06(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT06);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("06");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder6.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot6 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot6 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot6 not found");
			System.out.println("ScreenShot6 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public static void FrontCounter07(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT07);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("07");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder7.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot7 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot7 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot7 not found");
			System.out.println("ScreenShot7 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public static void FrontCounter08(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT08);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("08");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder8.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot8 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot8 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot8 not found");
			System.out.println("ScreenShot8 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public static void FrontCounter09(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT09);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("09");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder9.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot9 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot9 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot9 not found");
			System.out.println("ScreenShot9 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public static void FrontCounter10(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myDT10);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("10");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder10.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_Dual_ScreenShot10 is detected");
			r1.stopObserver();
			System.out.println("DT_Dual_ScreenShot10 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_Dual_ScreenShot10 not found");
			System.out.println("ScreenShot10 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static String getTimeStamp(){
	    SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        String timeStamp = sdf.format(new Date());
        return timeStamp;
    }
}
