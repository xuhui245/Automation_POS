package automation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.Region;
import automation.Util;
import automation.Logging;

public class Main {

	public static String myFC01 = "D:\\Automation\\KVS_fastfail\\KVS31_01.png";
	public static String myFC02 = "D:\\Automation\\KVS_fastfail\\KVS31_02.png";
	public static String myFC03 = "D:\\Automation\\KVS_fastfail\\KVS31_03.png";
	public static String myFC04 = "D:\\Automation\\KVS_fastfail\\KVS31_04.png";
	public static String myFC05 = "D:\\Automation\\KVS_fastfail\\KVS31_05.png";
	public static String myFC06 = "D:\\Automation\\KVS_fastfail\\KVS31_06.png";
	public static String myFC07 = "D:\\Automation\\KVS_fastfail\\KVS31_07.png";
	public static String myFC08 = "D:\\Automation\\KVS_fastfail\\KVS31_08.png";
	public static String myFC09 = "D:\\Automation\\KVS_fastfail\\KVS31_09.png";
	public static String myFC10 = "D:\\Automation\\KVS_fastfail\\KVS31_10.png";
	public static String myFC11 = "D:\\Automation\\KVS_fastfail\\KVS31_11.png";
	public static String myFC12 = "D:\\Automation\\KVS_fastfail\\KVS31_12.png";
	public static String myFC13 = "D:\\Automation\\KVS_fastfail\\KVS31_13.png";
	public static String myFC14 = "D:\\Automation\\KVS_fastfail\\KVS31_14.png";
	public static String myFC15 = "D:\\Automation\\KVS_fastfail\\KVS31_15.png";
	public static String myFC16 = "D:\\Automation\\KVS_fastfail\\KVS31_16.png";
	public static String myFC17 = "D:\\Automation\\KVS_fastfail\\KVS31_17.png";
	public static int timePause = 30000;
	public static int observeTime = 25;
	public static int count = 0;
	
//	public static String tmpsavePath = "\\\\10.0.0.25\\E\\Automation\\Fast_Fail\\KVS_ScreenShot";
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
		FrontCounter11();
		FrontCounter12();
		FrontCounter13();
		FrontCounter14();
		FrontCounter15();
		FrontCounter16();
		FrontCounter17();
	}
	
	public static void FrontCounter01(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC01);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("01");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder1.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot1 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot1 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot1 not found");
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
		r1.onAppear(myFC02);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("02");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder2.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot2 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot2 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot2 not found");
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
		r3.onAppear(myFC03);
		boolean flag3 = r3.observe(20);
		if(flag3){
			Util.getScreenShot("03");
		//	r3.saveScreenCapture(tmpsavePath,"tmpOrder3.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot3 is detected");
			r3.stopObserver();
			System.out.println("KVS_ScreenShot3 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot3 not found");
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
		r1.onAppear(myFC04);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("04");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder4.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot4 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot4 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot4 not found");
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
	r5.onAppear(myFC05);
	boolean flag5 = r5.observe(20);
	if(flag5){
		Util.getScreenShot("05");
	//	r5.saveScreenCapture(tmpsavePath,"tmpOrder5.png");
		lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot5 is detected");
		r5.stopObserver();
		System.out.println("KVS_ScreenShot5 is found");
	}else{
		lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot5 not found");
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
		r1.onAppear(myFC06);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("06");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder6.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot6 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot6 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot6 not found");
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
		r1.onAppear(myFC07);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("07");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder7.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot7 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot7 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot7 not found");
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
		r1.onAppear(myFC08);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("08");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder8.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot8 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot8 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot8 not found");
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
		r1.onAppear(myFC09);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("09");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder9.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot9 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot9 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot9 not found");
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
		r1.onAppear(myFC10);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("10");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder10.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot10 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot10 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot10 not found");
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

    public static void FrontCounter11(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC11);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("11");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder11.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot11 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot11 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot11 not found");
			System.out.println("ScreenShot11 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot("11");
		}
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public static void FrontCounter12(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC12);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("12");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder12.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot12 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot12 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot12 not found");
			System.out.println("ScreenShot12 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot("12");
		}
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public static void FrontCounter13(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC13);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("13");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder13.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot13 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot13 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot13 not found");
			System.out.println("ScreenShot13 not found");
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

    public static void FrontCounter14(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC14);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("14");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder14.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot14 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot14 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot14 not found");
			System.out.println("ScreenShot14 not found");
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

    public static void FrontCounter15(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC15);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("15");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder15.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot15 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot15 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot15 not found");
			System.out.println("ScreenShot15 not found");
			count++;
			if(count == 3){
				System.exit(0);
			}
		//	Util.getScreenShot(Util.getorderId());
		}
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public static void FrontCounter16(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC16);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("16");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder16.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot16 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot16 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot16 not found");
			System.out.println("ScreenShot16 not found");
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

    public static void FrontCounter17(){
		
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Result.txt");
		Region r1 = new Region(0,0,1016,740);
		r1.onAppear(myFC17);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot("17");
		//	r1.saveScreenCapture(tmpsavePath,"tmpOrder17.png");
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot17 is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot17 is found");
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot17 not found");
			System.out.println("ScreenShot17 not found");
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
