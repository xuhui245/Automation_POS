package automation;

import java.io.File;

import org.sikuli.basics.Settings;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Util {
  
	public static int regx = 1016;
	public static int regy = 0;
	public static int regw = 520;
	public static int regh = 200;
	public static String savePath = "\\\\10.0.0.25\\E\\Automation\\DT\\FC_ScreenShot";
	
	public String getorderId(){
		
		Region region = new Region(regx, regy, regw, regh);
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		String tmpRegion = region.text().replaceAll("R02-", "R02 -");
		System.out.println(tmpRegion);
		int index = tmpRegion.indexOf("R02 -");
		return tmpRegion.substring(index+5, index+7);
	}
	
	public static void getScreenShot(String orderId){
		
		File file = new File(savePath);
		if(!file.exists() && !file.isDirectory()){
			file.mkdirs();
		}else{
		}
		Screen screen = new Screen();
		ScreenImage image = screen.capture(regx, regy, regw, regh);
		String tmpPath = image.save(savePath);
		File tmpFile = new File(tmpPath);
	    String parentPath = tmpFile.getParent();
	    tmpFile.renameTo(new File(parentPath + "\\" + "order_" + orderId + ".png"));
		
	}
}
