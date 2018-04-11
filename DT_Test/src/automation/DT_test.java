package automation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.Region;

public class DT_test {
    
	public static String myFC01 = "D:\\Automation\\DT_images\\FC_01.png";
	public static String myFC02 = "D:\\Automation\\DT_images\\FC_02.png";
	public static String myFC03 = "D:\\Automation\\DT_images\\FC_03.png";
	public static String myFC04 = "D:\\Automation\\DT_images\\FC_04.png";
	public static String myFC05 = "D:\\Automation\\DT_images\\FC_05.png";
	public static String myFC06 = "D:\\Automation\\DT_images\\FC_06.png";
	public static String myFC07 = "D:\\Automation\\DT_images\\FC_07.png";
	public static String myFC08 = "D:\\Automation\\DT_images\\FC_08.png";
	public static String myFC09 = "D:\\Automation\\DT_images\\FC_09.png";
	public static String myFC10 = "D:\\Automation\\DT_images\\FC_10.png";
	public static int timePause = 30000;
	public static int observeTime = 30;
	public static int count = 0;
//	public static String tmpsavePath = "\\\\10.0.0.25\\E\\Automation\\DriveThrough\\DT_ScreenShot";
	public static void main(String[] args){
		
		dt_Order01();
		dt_Order02();
		dt_Order03();
		dt_Order04();
		dt_Order05();
		dt_Order06();
		dt_Order07();
		dt_Order08();
		dt_Order09();
		dt_Order10();
	}
	
	public static void dt_Order01(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC01);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("01");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot1 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot1 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot1 not found");
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
	public static void dt_Order02(){
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC02);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("02");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot2 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot2 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot2 not found");
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
	public static void dt_Order03(){
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC03);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("03");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot3 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot3 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot3 not found");
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
    public static void dt_Order04(){
		
    	Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC04);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("04");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot4 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot4 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot4 not found");
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
    public static void dt_Order05(){
	
    	Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC04);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("01");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot5 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot5 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot5 not found");
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
    public static void dt_Order06(){
    	Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC06);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("06");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot6 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot6 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp()  + "[Fail] DT_ScreenShot6 not found");
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
    public static void dt_Order07(){
    	Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC07);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("07");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot7 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot7 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot7 not found");
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
    public static void dt_Order08(){
    	Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC08);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("08");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot8 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot8 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot8 not found");
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
    public static void dt_Order09(){
    	Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC09);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("09");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot9 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot9 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] DT_ScreenShot9 not found");
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
    public static void dt_Order10(){
	
    	Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(1016,0,1016,740);
		r1.onAppear(myFC10);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("10");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] DT_ScreenShot10 is detected ");
			r1.stopObserver();
			System.out.println("DT_ScreenShot10 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() +  "[Fail] DT_ScreenShot10 not found");
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
