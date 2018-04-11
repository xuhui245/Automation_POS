package automation;

import org.sikuli.script.Region;

public class DT_Main {
	
	public static String American_Cheese = "6063";
	public static String Grilled_Onion = "913";
	public static String Tomato = "3908";
	public static String receiptEatInLineText = "Eat-In Total";
	public static String receiptTakeOutLineText = "Take-Out Total";
	public static int timePause = 10000;

	public static void main(String[] args){
		
		new Util().ReadXml();
		new Logging().clearLog();
		
		
		LogInManager();
		LogInRegister();
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
		logOut();
		
	}
	
    public static void LogInManager(){
		
		Click_POS figure = new Click_POS();
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Log.txt");
		lg.writeLog("Log.txt", "********************"+"Logging in as Manager"+"********************");
		figure.manager_option();
		figure.function_3();
		figure.function_enter();
		figure.function_3();
		figure.function_enter();
		lg.writeLog("Log.txt", "********************"+"Logging in as Manager End"+"********************");
        lg.writeLog("Log.txt", "\n");
    }
	
	public static void LogInRegister(){
		 Click_POS figure = new Click_POS();
		    Logging lg = new Logging();
		    lg.createFolder("Log");
		    lg.createFile("Log.txt");
		    lg.writeLog("Log.txt", "********************"+"Logging in as Manager"+"********************");
		    figure.logInCashierFC();
		    figure.orderTaker_Cashier();
		    figure.function_3();
		    figure.function_enter();
		    figure.logInEnter();
		    figure.logInYes();
		    lg.writeLog("Log.txt", "********************"+"Logging in as Manager"+"********************");
		    lg.writeLog("Log.txt", "\n");
//		    figure.closeDrawer();
	}

    public static void dt_Order01(){
    	
    	Click_POS figure = new Click_POS();
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Log.txt");
		lg.writeLog("Log.txt", "********************"+"DT_Order01"+"********************");
		lg.createFile("Result.txt");
	    lg.writeLog("Result.txt", "********************" + "DT_Order01" + "********************");
		figure.productcodes = "";
		
		figure.cod_1();
		figure.HotCakes_Sauage();
	    figure.small_Button();
	    figure.orange_Hic();
	    figure.condiment_Gifts();
	    figure.condiment_Gifts_Selected();
	    figure.Usa_Today();
	    figure.take_Out_Total();
		figure.store();
	    figure.recall();
	    figure.extract_Cash();
//	    figure.closeDrawer();
	    
		lg.writeLog("Log.txt", "********************"+"DT_Order01 End"+"********************");
		lg.writeLog("Log.txt", "\n");
		System.out.println("This is what I want : " + figure.productcodes);
		
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Util util = new Util();
		figure.serveDT();
		String order1_Id = util.getOrderId();
		util.calculatePrice(figure.productcodes, "TO");
		String[] order1_strArr = util.calculateSalesTax().split(";");
		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
		
		lg.writeLog("Result.txt", "********************" + "DT_Order01 End" + "********************");
	    lg.writeLog("Result.txt", "\n");
	    
	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
    }
    
    public static void dt_Order02(){
    	
    	Click_POS figure = new Click_POS();
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Log.txt");
		lg.writeLog("Log.txt", "********************"+"DT_Order02"+"********************");
		lg.createFile("Result.txt");
	    lg.writeLog("Result.txt", "********************" + "DT_Order02" + "********************");
		figure.productcodes = "";
		
		figure.cod_1();
		figure.bigMac_Meal();
	     waitOneSecond();
		figure.grill_Button();
		Region r = new Region(560,500,70,70);
		try{
		    r.click();
		    lg.writeLog("Log.txt", "[Log]American Cheese is selected ");
		    Click_POS.productcodes = Click_POS.productcodes + American_Cheese +";";
		}catch (Exception e) {
			// TODO: handle exception
			lg.writeLog("Log.txt", "[Error]" + "American Cheese not found");
			e.printStackTrace();
			System.exit(0);
		}
		figure.grill_Done();
		waitOneSecond();
		figure.take_Out_Total();
		waitOneSecond();
		figure.store(); 
		figure.recall();
		figure.extract_Cash();
//		figure.closeDrawer();
		
		lg.writeLog("Log.txt", "********************"+"DT_Order02 End"+"********************");
		lg.writeLog("Log.txt", "\n");
		System.out.println("This is what I want : " + figure.productcodes);
		
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Util util = new Util();
		figure.serveDT();
		String order1_Id = util.getOrderId();
		util.calculatePrice(figure.productcodes, "TO");
		String[] order1_strArr = util.calculateSalesTax().split(";");
		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
		
		lg.writeLog("Result.txt", "********************" + "DT_Order02 End" + "********************");
	    lg.writeLog("Result.txt", "\n");
    	
	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
    }

    public static void dt_Order03(){
    	
    	Click_POS figure = new Click_POS();
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Log.txt");
		lg.writeLog("Log.txt", "********************"+"DT_Order03"+"********************");
		lg.createFile("Result.txt");
	    lg.writeLog("Result.txt", "********************" + "DT_Order03" + "********************");
		figure.productcodes = "";
		
		figure.cod_1();
		figure.Hamburger_HappyMeal();
		waitOneSecond();
		figure.grill_Button();
		waitOneSecond();
		figure.grill_PageDown();
		waitOneSecond();
		Region r1 = new Region(560,360,70,70);
		try{
		    r1.click();
		    lg.writeLog("Log.txt", "[Log]American Cheese is selected ");
		    Click_POS.productcodes = Click_POS.productcodes + American_Cheese +";";
		}catch (Exception e) {
			// TODO: handle exception
			lg.writeLog("Log.txt", "[Error]" + "American Cheese not found");
			e.printStackTrace();
			System.exit(0);
		}
		figure.grill_PageDown();
		 waitOneSecond();
		figure.grill_PageDown();
		waitOneSecond();
		Region r2 = new Region(560,290,70,70);
		try{
		    r2.click();
		    lg.writeLog("Log.txt", "[Log]Tomato is selected ");
		    Click_POS.productcodes = Click_POS.productcodes + Tomato +";";
		}catch (Exception e) {
			// TODO: handle exception
			lg.writeLog("Log.txt", "[Error]" + "Tomato not found");
			e.printStackTrace();
			System.exit(0);
		}
		figure.grill_Done();
		waitOneSecond();
		figure.take_Out_Total();
		waitOneSecond();
		figure.store(); 
		figure.recall();
		figure.extract_Cash();
	//	figure.closeDrawer();
		
		lg.writeLog("Log.txt", "********************"+"DT_Order03 End"+"********************");
		lg.writeLog("Log.txt", "\n");
		System.out.println("This is what I want : " + figure.productcodes);
		
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Util util = new Util();
		figure.serveDT();
		String order1_Id = util.getOrderId();
		util.calculatePrice(figure.productcodes, "TO");
		String[] order1_strArr = util.calculateSalesTax().split(";");
		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
		
		lg.writeLog("Result.txt", "********************" + "DT_Order03 End" + "********************");
	    lg.writeLog("Result.txt", "\n");
	    
	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
    }
    
    public static void dt_Order04(){
    	
    	Click_POS figure = new Click_POS();
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Log.txt");
		lg.writeLog("Log.txt", "********************"+"DT_Order04"+"********************");
		lg.createFile("Result.txt");
	    lg.writeLog("Result.txt", "********************" + "DT_Order04" + "********************");
		figure.productcodes = "";
		
		figure.cod_1();
		figure.orange_Hic();
		figure.Egg_McMuffin();
		figure.grill_Button();
		waitOneSecond();
		figure.grill_PageDown();
		waitOneSecond();
		figure.grill_PageDown();
		waitOneSecond();
		figure.grill_PageDown();
		waitOneSecond();
		Region region = new Region(560,220,70,70);
		try{
		    region.click();
		    lg.writeLog("Log.txt", "[Log]Grilled_Onion is selected ");
		    Click_POS.productcodes = Click_POS.productcodes + Grilled_Onion +";";
		}catch (Exception e) {
			// TODO: handle exception
			lg.writeLog("Log.txt", "[Error]" + "Grilled_Onion not found");
			e.printStackTrace();
			System.exit(0);
		}
		figure.grill_Done();
		waitOneSecond();
		figure.take_Out_Total();
		waitOneSecond();
		figure.store(); 
		figure.recall();
		figure.extract_Cash();
//		figure.closeDrawer();
		
		lg.writeLog("Log.txt", "********************"+"DT_Order04 End"+"********************");
		lg.writeLog("Log.txt", "\n");
		System.out.println("This is what I want : " + figure.productcodes);
		
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Util util = new Util();
		figure.serveDT();
		String order1_Id = util.getOrderId();
		util.calculatePrice(figure.productcodes, "TO");
		String[] order1_strArr = util.calculateSalesTax().split(";");
		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
		
		lg.writeLog("Result.txt", "********************" + "DT_Order04 End" + "********************");
	    lg.writeLog("Result.txt", "\n");
	    
	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
    }
    
    public static void dt_Order05(){
    	
    	Click_POS figure = new Click_POS();
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Log.txt");
		lg.writeLog("Log.txt", "********************"+"DT_Order05"+"********************");
		lg.createFile("Result.txt");
	    lg.writeLog("Result.txt", "********************" + "DT_Order05" + "********************");
		figure.productcodes = "";
		
		figure.cod_1();
		figure.lunchButton();
		figure.lunchButton_Selected();
		waitOneSecond();
		figure.QTR_Ham();
		figure.small_Button();
		figure.coke();
		waitOneSecond();
		figure.Hamburger_HappyMeal();
		figure.take_Out_Total();
		waitOneSecond();
		figure.store(); 
		figure.recall();
		figure.extract_Cash();
	//	figure.closeDrawer();
		
		lg.writeLog("Log.txt", "********************"+"DT_Order05 End"+"********************");
		lg.writeLog("Log.txt", "\n");
		System.out.println("This is what I want : " + figure.productcodes);
		
		try {
			Thread.sleep(timePause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Util util = new Util();
		figure.serveDT();
		String order1_Id = util.getOrderId();
		util.calculatePrice(figure.productcodes, "TO");
		String[] order1_strArr = util.calculateSalesTax().split(";");
		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
		
		lg.writeLog("Result.txt", "********************" + "DT_Order05 End" + "********************");
	    lg.writeLog("Result.txt", "\n");
	    
	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
    }
    
    public static void dt_Order06(){
     	
     	Click_POS figure = new Click_POS();
 		Logging lg = new Logging();
 		lg.createFolder("Log");
 		lg.createFile("Log.txt");
 		lg.writeLog("Log.txt", "********************"+"DT_Order06"+"********************");
 		lg.createFile("Result.txt");
 	    lg.writeLog("Result.txt", "********************" + "DT_Order06" + "********************");
 		figure.productcodes = "";
 		
 		figure.cod_1();
 		figure.bigMac_Meal();
 		waitOneSecond();
 		figure.grill_Button();
 		waitOneSecond();
 		Region r = new Region(560,500,70,70);
 		try{
 		    r.click();
 		    lg.writeLog("Log.txt", "[Log]American_Cheese is selected ");
 		    Click_POS.productcodes = Click_POS.productcodes + American_Cheese +";";
 		}catch (Exception e) {
 			// TODO: handle exception
 			lg.writeLog("Log.txt", "[Error]" + "American_Cheese not found");
 			e.printStackTrace();
 			System.exit(0);
 		}
 		figure.grill_Done();
 		waitOneSecond();
 		figure.condiment_Gifts();
 		figure.condiment_Gifts_Selected();
 		 waitOneSecond();
 		figure.Gift_Cert_5();
 		figure.Gift_Cert_5();
 		figure.take_Out_Total();
 		waitOneSecond();
 		figure.store(); 
 		figure.recall();
 		figure.extract_Cash();
 	//	figure.closeDrawer();
 		
 		lg.writeLog("Log.txt", "********************"+"DT_Order06 End"+"********************");
 		lg.writeLog("Log.txt", "\n");
 		System.out.println("This is what I want : " + figure.productcodes);
 		
 		try {
 			Thread.sleep(timePause);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 		Util util = new Util();
 		figure.serveDT();
 		String order1_Id = util.getOrderId();
 		util.calculatePrice(figure.productcodes, "TO");
 		String[] order1_strArr = util.calculateSalesTax().split(";");
 		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
 		
 		lg.writeLog("Result.txt", "********************" + "DT_Order06 End" + "********************");
 	    lg.writeLog("Result.txt", "\n");
 	    
 	   String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
     }
     
    public static void dt_Order07(){
     	
     	Click_POS figure = new Click_POS();
 		Logging lg = new Logging();
 		lg.createFolder("Log");
 		lg.createFile("Log.txt");
 		lg.writeLog("Log.txt", "********************"+"DT_Order07"+"********************");
 		lg.createFile("Result.txt");
 	    lg.writeLog("Result.txt", "********************" + "DT_Order07" + "********************");
 		figure.productcodes = "";
 		
 		figure.cod_1();
 		figure.bigMac_Meal();
  		figure.take_Out_Total();
  	//	figure.tag_8();
  	//	figure.tag_Enter();
  		waitOneSecond();
 		figure.store(); 
 		figure.recall();
 		figure.extract_Cash();
 	//	figure.closeDrawer();
 		
 		lg.writeLog("Log.txt", "********************"+"DT_Order07 End"+"********************");
 		lg.writeLog("Log.txt", "\n");
 		System.out.println("This is what I want : " + figure.productcodes);
 		
 		try {
 			Thread.sleep(timePause);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 		Util util = new Util();
 		figure.serveDT();
 		String order1_Id = util.getOrderId();
 		util.calculatePrice(figure.productcodes, "TO");
 		String[] order1_strArr = util.calculateSalesTax().split(";");
 		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
 		
 		lg.writeLog("Result.txt", "********************" + "DT_Order07 End" + "********************");
 	    lg.writeLog("Result.txt", "\n");
 	    
 	   String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
     }
     
    public static void dt_Order08(){
      	
      	Click_POS figure = new Click_POS();
  		Logging lg = new Logging();
  		lg.createFolder("Log");
  		lg.createFile("Log.txt");
  		lg.writeLog("Log.txt", "********************"+"DT_Order08"+"********************");
  		lg.createFile("Result.txt");
  	    lg.writeLog("Result.txt", "********************" + "DT_Order08" + "********************");
  		figure.productcodes = "";
  		
  		figure.cod_1();
  		figure.lunchButton();
  		figure.large_Button();
  		waitOneSecond();
  		figure.Ckn_Cpy();
  		figure.take_Out_Total();
  		waitOneSecond();
  		figure.diet_Coke();
  		Click_POS.productcodes = "";
  		Click_POS.productcodes += "4780";
  		Click_POS.productcodes += ";";
  	//	figure.tag_8();
  	//	figure.tag_Enter();
  		waitOneSecond();
  		figure.store(); 
  		figure.recall();
  		figure.extract_Cash();
 // 		figure.closeDrawer();
  		
  		lg.writeLog("Log.txt", "********************"+"DT_Order08 End"+"********************");
  		lg.writeLog("Log.txt", "\n");
  		System.out.println("This is what I want : " + figure.productcodes);
  		
  		try {
  			Thread.sleep(timePause);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		
  		Util util = new Util();
  		figure.serveDT();
  		String order1_Id = util.getOrderId();
  		util.calculatePrice(figure.productcodes, "TO");
  		String[] order1_strArr = util.calculateSalesTax().split(";");
  		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
  		
  		lg.writeLog("Result.txt", "********************" + "DT_Order08 End" + "********************");
  	    lg.writeLog("Result.txt", "\n");
  	    
  	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
      }
     
    public static void dt_Order09(){
      	
      	Click_POS figure = new Click_POS();
  		Logging lg = new Logging();
  		lg.createFolder("Log");
  		lg.createFile("Log.txt");
  		lg.writeLog("Log.txt", "********************"+"DT_Order09"+"********************");
  		lg.createFile("Result.txt");
  	    lg.writeLog("Result.txt", "********************" + "DT_Order09" + "********************");
  		figure.productcodes = "";
  		
  		figure.cod_1();
  		figure.Egg_McMuffin();
  		figure.orange_Hic();
  		figure.condiment_Gifts();
  		figure.condiment_Gifts_Selected();
  	    waitOneSecond();
  		figure.Gift_Cert_5();
  		figure.take_Out_Total();
  		waitOneSecond();
  		figure.store(); 
  		figure.recall();
  		figure.extract_Cash();
  //		figure.closeDrawer();
  		
  		lg.writeLog("Log.txt", "********************"+"DT_Order09 End"+"********************");
  		lg.writeLog("Log.txt", "\n");
  		System.out.println("This is what I want : " + figure.productcodes);
  		
  		try {
  			Thread.sleep(timePause);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		
  		Util util = new Util();
  		figure.serveDT();
  		String order1_Id = util.getOrderId();
  		util.calculatePrice(figure.productcodes, "TO");
  		String[] order1_strArr = util.calculateSalesTax().split(";");
  		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
  		
  		lg.writeLog("Result.txt", "********************" + "DT_Order09 End" + "********************");
  	    lg.writeLog("Result.txt", "\n");
  	    
  	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
      }
     
    public static void dt_Order10(){
      	
      	Click_POS figure = new Click_POS();
  		Logging lg = new Logging();
  		lg.createFolder("Log");
  		lg.createFile("Log.txt");
  		lg.writeLog("Log.txt", "********************"+"DT_Order10"+"********************");
  		lg.createFile("Result.txt");
  	    lg.writeLog("Result.txt", "********************" + "DT_Order10" + "********************");
  		figure.productcodes = "";
  		
  		figure.cod_1();
  		figure.hotCake();
  		figure.hotCake();
  		waitOneSecond();
  		figure.bigMac_Meal();
  		waitOneSecond();
  		figure.breakfastButton();
  		 waitOneSecond();
  		figure.two_Hash();
  		figure.take_Out_Total();
  		waitOneSecond();
  		figure.store(); 
  		figure.recall();
  		figure.extract_Cash();
//  	figure.closeDrawer();
  		
  		lg.writeLog("Log.txt", "********************"+"DT_Order10 End"+"********************");
  		lg.writeLog("Log.txt", "\n");
  		System.out.println("This is what I want : " + figure.productcodes);
  		
  		try {
  			Thread.sleep(timePause);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		
  		Util util = new Util();
  		figure.serveDT();
  		String order1_Id = util.getOrderId();
  		util.calculatePrice(figure.productcodes, "TO");
  		String[] order1_strArr = util.calculateSalesTax().split(";");
  		boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
  		
  		lg.writeLog("Result.txt", "********************" + "DT_Order10 End" + "********************");
  	    lg.writeLog("Result.txt", "\n");
      
  	    String receipt = util.copyReceipt(order1_Id);
	    System.out.println(receipt);
    }
    public static void logOut(){
    	
    	Click_POS figure = new Click_POS();
    	figure.log_Out();
    }
    public static void waitOneSecond(){
    	
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
