package automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import automation.Logging;

public class Click_POS {
	
	public String Two_PK_Hash = "3809";
	public String Five_Gift_Cert = "937";
	public String Six_Nuggets = "60";
	public String Twenty_Nuggets = "61";
	public String Apple_Slices = "2794";
	public String BBQ_Sause = "900";
	public String BEC_Biscuit = "";
	public String Big_Mac = "5";
	public String Coke = "520";
	public String Dbl_Cheese = "4";
	public String Diet_Coke = "651";
	public String Egg_McMuffin = "46";
	public String Filet_O_Fish = "5926";
	public String Hamburger_Ham = "1";
	public String HotCake = "31";
	public String HotCake_Sauage = "32";
	public String Iced_Tea = "50";
	public String Orange_Hic = "620";
	public String Oreo = "3832";
	public String QTR_Ham = "6";
	public String Sprite = "720";
	public String Straw_Shake = "1511";
	public String Under_3Toy = "5323";
	public String USA_TODAY = "8072";
	public String Vanilla_Shake = "1598";
	public String BigMac_Meal = "8936";
	public String HappyMeal_Ham = "6975";
	public String Filet_O_Fish_Meal = "8944";
	public String Twenty_Nuggets_Meal = "8956";
	public String Cry_Ckn_Meal = "4780";
	public String Dbl_Cheese_Meal = "6243";
	public String Coupon_A = "123";
	public String Crew_Meal = "345";
	public String Manager_Meal = "567";
	public String CYT_Grilled_Ckn = "8994";
	public String Grill_Thriller = "5594";
	public String Hot_All_Over = "5597";
	public String Socal_Style = "2431";
	public String CYT_Burger = "9202";
	public String CYT_Crispy_Ckn = "8990";
	public String Grill_Thriller_Meal = "5595";
	public String CYT_Cripy_Ckn_Meal = "8767";
	public int observeTime = 2;
	
	Logging lg = new Logging();
	Screen screen = new Screen();
	public static String productcodes = "";
	
	public void function_0(){
		try {
			screen.click("images/manager_0.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 0 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			lg.writeLog("Log.txt", "[Error]" + "Function_0 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void function_1(){

		try {
			screen.click("images/manager_1.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 1 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_1 not found");
			e.printStackTrace();
			System.exit(0);
		}	
		
	}
	public void function_2(){

		try {
			screen.click("images/manager_2.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 2 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_2 not found");
			e.printStackTrace();
			System.exit(0);
		}	
		
	}	
	public void function_3(){

		try {
			screen.click("images/manager_3.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 3 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_3 not found");
			e.printStackTrace();
			System.exit(0);
		}	
		
	}	
	public void function_4(){

		try {
			screen.click("images/manager_4.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 4 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_4 not found");
			e.printStackTrace();
			System.exit(0);
		}	
		
	}	
	public void function_5(){

		try {
			screen.click("images/manager_5.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 5 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_5 not found");
			e.printStackTrace();
			System.exit(0);
		}	
		
	}
	public void function_6(){

		try {
			screen.click("images/manager_6.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 6 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_6 not found");
			e.printStackTrace();
			System.exit(0);
		}	
		
	}
    public void function_7(){

		try {
			screen.click("images/manager_7.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 7 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_7 not found");
			e.printStackTrace();
			System.exit(0);		}	
		
	}
	public void function_8(){

		try {
			screen.click("images/manager_8.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 8 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_8 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void function_9(){

		try {
			screen.click("images/manager_9.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Numeric 9 on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Function_9 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_0(){
		try {
			screen.click("images/Tag_0.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_0 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_0 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_1(){
		try {
			screen.click("images/Tag_1.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_1 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_1 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_2(){
		try {
			screen.click("images/Tag_2.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_2 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_2 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_3(){
		try {
			screen.click("images/Tag_3.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_3 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_3 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_4(){
		try {
			screen.click("images/Tag_4.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_4 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_4 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_5(){
		try {
			screen.click("images/Tag_5.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_5 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_5 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_6(){
		try {
			screen.click("images/Tag_6.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_6 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_6 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_7(){
		try {
			screen.click("images/Tag_7.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_7 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_7 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_8(){
		try {
			screen.click("images/Tag_8.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_8 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_8 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_9(){
		try {
			screen.click("images/Tag_9.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_9 is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_9 not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void no_Tax(){
		try {
			screen.click("images/No_Tax.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]No_Tax Button is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "No_Tax Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void billable_Sales(){
		try {
			screen.click("images/Billable_Sales.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Billable_Sales Button is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Billable_Sales Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_Clear(){
		try {
			screen.click("images/Tag_Clear.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_Clear Button is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_Clear Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
	public void tag_Enter(){
		try {
			screen.click("images/Tag_Enter.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Tag_Enter Button is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Tag_Enter Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
	}
    public void function_enter(){

    	try {
			screen.click("images/managere.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Enter Button on Manager Keypad is Clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Enter Button on Manager Keypad not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void manager_option(){
    	try {
			screen.click("images/manager.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Manager_ption Button is cliked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Manager_Option Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void specialFunction(){
    	try {
			screen.click("images/SpecialFunctions.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Special_Functions Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Special_Functions Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void overring(){
    	try {
			screen.click("images/Overring.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Overring Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Overring Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void crew_Meal(){
    	try {
			screen.click("images/CrewMeal.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Crew_Meal Button is clicked");
			productcodes += Crew_Meal;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Crew_Meal Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void manager_Meal(){
    	try {
			screen.click("images/Manager_Meal.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Manager_Meal Button is clicked");
		    productcodes += Manager_Meal;
		    productcodes += ";";
    	} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Manager_Meal Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void discount_Meal(){
    	try {
			screen.click("images/Discount_Menu.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Discount_Menu Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Discount_Menu Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void refund(){
    	try {
			screen.click("images/Refund.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Refund Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Refund Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void coupon_Menu(){
    	try {
			screen.click("images/Coupon_Menu.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Coupon_Menu Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Coupon_Menu Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void coupon_A(){
    	try {
			screen.click("images/Coupon_A.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Coupon_A is Selected");
			productcodes += Coupon_A;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Coupon_A Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void discount_10(){
    	try {
			screen.click("images/Discount_10.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Discount_10 is selected");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Discount_10 Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void coupon_Return(){
    	try {
			screen.click("images/Coupon_Return.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Coupon_Return Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Coupon_Return Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void discount_Return(){
    	try {
			screen.click("images/Discount_Return.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Discount_Return Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Discount_Return Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void overring_Yes(){
    	try {
			screen.click("images/Overring_Yes.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Overring_Yes Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Overring_Yes Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void logInCashierFC(){
    	try {
			screen.click("images/Log_In_CashierFC.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Logging In a Regisiter");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Log_In_CashierFC Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void logInEnter(){
    	try {
			screen.click("images/Log_In_Enter.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Log In Enter Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Enter in Log In Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void logInYes(){
    	try {
			screen.click("images/Log_In_Yes.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Log In Yes Button pressed");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Yes Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void specialFunctionReturn(){
    	try {
			screen.click("images/specialFuncreturn.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Return from Manager Menu");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Return Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void breakfastButton(){
    	try {
			screen.click("images/Breakfast.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Breakfast Button is selected");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Breakfast Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void breakfastButton_Selected(){
    	try {
    		screen.click("images/Breakfast_selected.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Breakfast2 Button is pressed");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Breakfast2 Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void lunchButton(){
    	try {
			screen.click("images/lunch.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Lunch Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Lunch Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void lunchButton_Selected(){
    	try {
			screen.click("images/lunch_Selected.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Lunch2 Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Lunch2 Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void dessert(){
    	try {
			screen.click("images/Dessert.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Dessert Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Dessert Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void happy_Meal(){
    	try {
			screen.click("images/Happy_Meal.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Happy_Meal Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Happy_Meal Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void drinks(){
    	try {
			screen.click("images/Drinks.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Drinks Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Drinks Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void condiment_Gifts(){
    	try {
			screen.click("images/Condiments_Gifts.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Condiments_Gifts Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Condiments_Gifts Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    } 
    public void condiment_Gifts_Selected(){
    	try {
			screen.click("images/Condiments_Gifts_Selected.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Condiments_Gifts2 Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Condiments_Gifts2 Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    } 
    public void eat_In_Total(){
    	try {
    		screen.click("images/eat_In_Total.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Eat_In_Total Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Eat_In_Total Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void take_Out_Total(){
    	try {
			screen.click("images/Take_Out_Total.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Take_Out_Total Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Take_Out_Total Button not found");
			e.printStackTrace();
			System.exit(0);
			System.exit(0);
		}
    }
    public void extract_Cash(){
    	try {
			screen.click("images/Extract_Cash.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Extract_Cash Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Extract_Cash Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void small_Button(){
    	try {
			screen.click("images/small_Button.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Small_Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Small_Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void medium_Button(){
    	try {
			screen.click("images/medium_Button.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Medium_Button is clicked");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Medium_Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void large_Button(){
    	try {
			screen.click("images/Large_Button.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Large_Button is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Large_Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void grill_Button(){
    	try {
			screen.click("images/Grill_Button.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Grill_Button is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Grill_Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void grill_Done(){
    	try {
			screen.click("images/Grill_Done.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Grill_Done Button is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Grill_Done Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void coke(){
    	try {
			screen.click("images/Coke.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Coke is seleced");
			productcodes += Coke;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Coke not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void diet_Coke(){
    	try {
			screen.click("images/Diet_Coke.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Diet_Coke is seleced");
			productcodes += Diet_Coke;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Diet_Coke not found");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void iced_Tea(){
    	try {
			screen.click("images/Iced_Tea.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Iced_Tea is seleced");
			productcodes += Iced_Tea;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Iced_Tea not found");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void sprite(){
    	try {
			screen.click("images/Sprite.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Sprite is seleced");
			productcodes += Sprite;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Sprite not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void orange_Hic(){
    	try {
			screen.click("images/Orange_Hic.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Orange juice is seleced");
			productcodes += Orange_Hic;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Orange Juice not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void Egg_McMuffin(){
    	try {
			screen.click("images/Egg_McMuffin.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Egg_Mcffin is seleced");
			productcodes += Egg_McMuffin;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Egg_McMuffin not found");
			e.printStackTrace();
			System.exit(0);
		}	
    	
    	
    }
    public void Big_Mac(){
    	try {
			screen.click("images/Big_Mac.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Big_Mac is seleced");
			productcodes += Big_Mac;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Big_Mac not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void Hamburger(){
    	try {
			screen.click("images/Hamburger.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Hamburger is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Hamburger not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void apple_Slices(){
    	try {
			screen.click("images/Apple_Slices.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Apple_Slices is seleced");
			productcodes += Apple_Slices;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Apple_Slices not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void grill_PageDown(){
    	try {
			screen.click("images/grill_PageDown.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Grill_PageDown is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Grill_PageDown Button not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void under_3_Toy(){
    	try {
			screen.click("images/Under_3_Toy.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Under_3_Toy is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Under_3_Toy not found");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void HotCakes_Sauage(){
    	try {
			screen.click("images/HotCakes&Sauage.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]HotCakes&Sauage is seleced");
			productcodes += HotCake_Sauage;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "HotCake&Sauage not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void Usa_Today(){
    	try {
			screen.click("images/USA_TODAY.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]USA_TODAY is seleced");
			productcodes += USA_TODAY;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]"+"USA_TODYA not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void Gift_Cert_5(){
    	try {
			screen.click("images/5_Gift_Cert.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]5_Gift_Cert is seleced");
			productcodes += Five_Gift_Cert;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "5_Gift_Cert not found");
			e.printStackTrace();
			System.exit(0);
		}		
    }
    public void QTR_Ham(){
    	try {
			screen.click("images/QTR_Ham.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]QTR_Ham is seleced");
			productcodes += QTR_Ham;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "QTR_Ham not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void BEC_Biscuit(){
    	try {
			screen.click("images/BEC_Biscuit.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]BEC_Biscuit is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "BEC_Bisuit not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void Ckn_Cpy(){
    	try {
			screen.click("images/Ckn_Cpy.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Ckn_Cpy is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Ckn_Cpy not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void hotCake(){
    	try {
			screen.click("images/HotCake.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]HotCake is seleced");
			productcodes += HotCake;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "HotCake not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void sE_Biscuit(){
    	try {
			screen.click("images/SE_Biscuit.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]SE_Biscuit is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "SE_Biscuit not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void two_Hash(){
    	try {
			screen.click("images/2_PK_Hash.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]2_PK_Hash is seleced");
			productcodes += Two_PK_Hash;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "2_PK_Hash not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void vanilla_Shake(){
    	try {
			screen.click("images/Vanilla_Shake.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Vanilla_Shake is seleced");
			productcodes += Vanilla_Shake;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Vanilla_Shake not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void hamburger_Ham(){
    	try {
			screen.click("images/Hamburger_Ham.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Hamburger_Ham is seleced");
			productcodes += Hamburger_Ham;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Hamburger_Ham not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    
    public void cyt_Button(){
    	try {
    		screen.onAppear("images/CYT_Menu.png");
    		if(screen.observe(observeTime)){
			screen.click("images/CYT_Menu.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]CYT_Menu Button is seleced");
			/*productcodes += Hamburger_Ham;
			productcodes += ";";*/
    		}
    		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "CYT_Menu not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void cytGrilledChicken(){
    	try {
			screen.click("images/CYT_Grilled_Chicken.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]CYT_Grilled_Chicken is seleced");
			productcodes += CYT_Grilled_Ckn;
			productcodes += ";";
    		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "CYT_Grilled_Chicken not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    
    public void panel_2(){
    	try {
			screen.click("images/Panel_2.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Panel_2 is seleced");
			/*productcodes += Hamburger_Ham;
			productcodes += ";";*/
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Panel_2 not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void hot_All_Over(){
    	try {
			screen.click("images/Hot_All_Over.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Hot_All_Over is seleced");
			productcodes += Hot_All_Over;
			productcodes += ";";
    		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Hot_All_Over not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void artisanRoll(){
    	try {
			screen.click("images/Artisan_Roll.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Artisan_Roll is seleced");
			/*productcodes += Hamburger_Ham;
			productcodes += ";";*/
    		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Artisan_Roll not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void seseamBun(){
    	try {
			screen.click("images/Sesame_Bun.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Sesame_Bun is seleced");
			/*productcodes += Hamburger_Ham;
			productcodes += ";";*/
    		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Sesame_Bun not found");
			e.printStackTrace();
			System.exit(0);
		}
    } 
    
    public void cyt_Done(){
    	try {
			screen.click("images/CYT_Done.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]CYT_Done is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "CYT_Done not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void cyt_Burger(){
    	try {
			screen.click("images/CYT_Burger.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]CYT_Burger is seleced");
			productcodes += CYT_Burger;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "CYT_Burger not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    
    public void soCal_Style(){
    	try {
			screen.click("images/SoCal_Style.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Socal_Style is seleced");
			productcodes += Socal_Style;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Socal_Style not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    
    public void grill_Tomato(){
    	try {
			screen.click("images/Grill_Tomato.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Grill_Tomato is seleced");
			/*productcodes += Hamburger_Ham;
			productcodes += ";";*/
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Grill_Tomato not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    
    public void guacamole(){
    	try {
			screen.click("images/Guacamole.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Guacamole is seleced");
			/*productcodes += Hamburger_Ham;
			productcodes += ";";*/
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Guacamole not found");
			e.printStackTrace();
			System.exit(0);
		}	
    } 
    public void grill_Thriller(){
    	try {
			screen.click("images/Grill_Thriller.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Grill_Thriller is seleced");
			productcodes += Grill_Thriller;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Grill_Thriller not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void spicy_Mayo(){
    	try {
			screen.click("images/Spicy_Mayo.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Spicy_Mayo is seleced");
			/*productcodes += Hamburger_Ham;
			productcodes += ";";*/
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Spicy_Mayo not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void filet_O_Fish(){
    	try {
			screen.click("images/Filet_O_Fish.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Filet_O_Fish is seleced");
			productcodes += Filet_O_Fish;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Filet_O_Fish not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void oreo(){
    	try {
			screen.click("images/Oreo.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Oreo is seleced");
			productcodes += Oreo;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Oreo not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void straw_Shake(){
    	try {
			screen.click("images/Straw_Shake.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Straw_Shake is seleced");
			productcodes += Straw_Shake;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Straw_Shake not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void cash(){
    	try {
			screen.click("images/Cash.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Cash Button is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Cash Button not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void Twenty_Nuggets(){
    	try {
			screen.click("images/20_Nuggets.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]20_Nuggets is seleced");
			productcodes += Twenty_Nuggets;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "20_Nuggets not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void Six_Nuggets(){
    	try {
			screen.click("images/6_Nuggets.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]6_Nuggets is seleced");
			productcodes += Six_Nuggets;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "6_Nuggets not found");
			e.printStackTrace();
			System.exit(0);
		}	
    }
    public void BBQ_Sause(){
    	try {
			screen.click("images/BBQ_Sause.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]BBQ_Sause is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "BBQ_Sause not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void dbl_Cheese(){
    	try {
			screen.click("images/Dbl_Cheese.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Dbl_Cheese is seleced");
			productcodes += Dbl_Cheese;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Dbl_Cheese not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void bigMac_Meal(){
    	try {
			screen.click("images/Lunch.png",0);
			waitOneSecond();
			screen.click("images/Medium_Button.png",0);
			screen.click("images/Big_Mac.png",0);
			waitOneSecond();
			screen.click("images/Coke.png",0);
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]BigMac_Meal is seleced");
			productcodes += BigMac_Meal;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in bigMac_Meal");
			e.printStackTrace();
			System.exit(0);
		} 	
    }
    public void Hamburger_HappyMeal(){
            try {
				screen.click("images/Happy_Meal.png");
				waitOneSecond();
				screen.click("images/Hamburger.png");
				waitOneSecond();
				screen.click("images/Apple_Slices.png");
				screen.click("images/Under_3_Toy.png");
				screen.click("images/Coke.png");
				lg.createFolder("Log");
				lg.createFile("Log.txt");
				lg.writeLog("Log.txt", "[Log]Happy_Meal Ham is seleced");
				productcodes += HappyMeal_Ham;
				productcodes += ";";
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Hamburger_HappyMeal");
				e.printStackTrace();
				System.exit(0);
			}    	
    }
    public void File_O_Fish_Meal(){
    	
    	try {
			screen.click("images/Lunch.png");
			waitOneSecond();
			screen.click("images/Medium_Button.png");
    	    screen.click("images/Filet_O_Fish.png");
    	    screen.click("images/Large_Button.png");
    	    screen.click("images/Orange_Hic.png");
    	    lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]File_O_Fish_Meal is seleced");
			productcodes += Filet_O_Fish_Meal;
			productcodes += ";";
    	} catch (FindFailed e) {
			// TODO Auto-generated catch block
    		lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in File_O_Fish_Meal");
			e.printStackTrace();
			System.exit(0);
		}
    }
    public void Twenty_Nuggets_Meal(){
    	
    	try {
			screen.click("images/Lunch.png");
			waitOneSecond();
			screen.click("images/Lunch_Selected.png");
			waitOneSecond();
			screen.click("images/Medium_Button.png");
			screen.click("images/20_Nuggets.png");
			screen.click("images/BBQ_Sause.png");
			screen.click("images/BBQ_Sause.png");
			screen.click("images/BBQ_Sause.png");
			screen.click("images/Large_Button.png");
			screen.click("images/Iced_Tea.png");
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]20_Nuggets Meal is seleced");
			productcodes += Twenty_Nuggets_Meal;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in 20_Nuggets Meal");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
    public void Cry_Ckn_Meal(){
    	
    	try {
			screen.click("images/Lunch.png");
			waitOneSecond();
			screen.click("images/Large_Button.png");
			screen.click("images/Ckn_Cpy.png");
			screen.click("images/Large_Button.png");
			screen.click("images/Diet_Coke.png");
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Cry_Ckn Meal is seleced");
			productcodes += Cry_Ckn_Meal;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Cry_Ckn Meal");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
  public void grill_Thriller_Meal(){
    	
    	try {
			screen.click("images/Lunch.png");
			screen.click("images/CYT_Menu.png");
			screen.click("images/Medium_Button.png");
			screen.click("images/Grill_Thriller.png");
			screen.click("images/Coke.png");
			productcodes += Grill_Thriller_Meal;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Grill_Thriller Meal");
			e.printStackTrace();
			System.exit(0);
		}
    }
  
  
  public void CYT_Cpy_Ckn_Meal(){
  	
  	try {
			screen.click("images/Lunch.png");
			screen.click("images/CYT_Menu.png");
			screen.click("images/Medium_Button.png");
			screen.click("images/CYT_Grilled_Chicken.png");
			screen.click("images/Diet_Coke.png");
			productcodes += CYT_Cripy_Ckn_Meal;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in CYT_Cpy_Ckn Meal");
			e.printStackTrace();
			System.exit(0);
		}
  }
    public void Dbl_Cheese_Meal(){
    	
    	try {
			screen.click("images/Lunch.png");
			waitOneSecond();
			screen.click("images/Large_Button.png");
			screen.click("images/Dbl_Cheese.png");
			screen.click("images/Large_Button.png");
			screen.click("images/Diet_Coke.png");
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Dbl_Cheese Meal is seleced");
			productcodes += Dbl_Cheese_Meal;
			productcodes += ";";
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Dbl_Cheese");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void Sever_KVS31_FC(){
    	
          try {
			screen.click("images/SpecialFunctions.png");
			screen.click("images/Soft_Bump_Bar.png");
			screen.click("images/Select_KVS.png");
			screen.click("images/Kitchen_Lunch_S1.png");
			screen.click("images/Select_KVS_OK.png");
			screen.click("images/Serve.png");
			
			screen.click("images/Select_KVS.png");
 			screen.click("images/Front_Counter.png");
 			screen.click("images/Select_KVS_OK.png");
 			screen.click("images/Serve.png");
 			screen.click("images/Serve_Return.png");
 			screen.click("images/Serve_Return.png");
			
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Bump Serve");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void waitOneSecond(){
    	
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void orderTaker_Cashier(){
    	
    	try {
			screen.click("images/OrderTaker_Cashier.png");
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]OrderTaker/Cashier is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Log]OrderTaker/Cashier not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void closeDrawer(){
    	
    	try {
			screen.click("images/CloseDrawer.png");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void cod_1(){
    	
    	try {
			screen.click("images/Cod_1.png");
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Cod 1 is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Log]Cod 1 not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void store(){
    	try {
			screen.click("images/Store.png");
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Store is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Log]Store not found");
			e.printStackTrace();
			System.exit(0);
		}
    }
    
    public void recall(){
    	
    	try {
			screen.click("images/recall.png");
			lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Recall is seleced");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Log]Recall not found");
			e.printStackTrace();
			System.exit(0);
		}
    }

    public void serveDT(){
    	
    	 try {
 			screen.click("images/SpecialFunctions.png");
 			screen.click("images/Soft_Bump_Bar.png");
 			
 			screen.click("images/Select_KVS.png");
			screen.click("images/Kitchen_Lunch_S1.png");
			screen.click("images/Select_KVS_OK.png");
			screen.click("images/Serve.png");
 			
 			screen.click("images/Select_KVS.png");
 			screen.click("images/DTE_HLZ.png");
 			screen.click("images/Select_KVS_OK.png");
 			screen.click("images/Runner_Serve.png");
 			
 			screen.click("images/Select_KVS.png");
  			screen.click("images/DTE_Present.png");
  			screen.click("images/Select_KVS_OK.png");
  			screen.click("images/Serve.png");
  			screen.click("images/Serve_Return.png");
  			screen.click("images/Serve_Return.png");
 			
 		} catch (FindFailed e) {
 			// TODO Auto-generated catch block
 			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Bump Serve");
 			e.printStackTrace();
 			System.exit(0);
 		}	
    }
    
public void log_Out(){
    	
    	try {
			screen.click("images/manager.png");
			screen.click("images/manager_3.png");
			screen.click("images/managere.png");
			screen.click("images/manager_3.png");
			screen.click("images/managere.png");
			waitOneSecond();
    	    screen.click("images/cash_out.png");
    	    screen.click("images/Log_In_Yes.png");
    	    screen.click("images/manager_return.png");
    	    lg.createFolder("Log");
			lg.createFile("Log.txt");
			lg.writeLog("Log.txt", "[Log]Cashier Log Out");
    	} catch (FindFailed e) {
			// TODO Auto-generated catch block
    		lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Log Out");
			e.printStackTrace();
			System.exit(0);
		}
    	
    }
}

