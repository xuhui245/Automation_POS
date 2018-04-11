package automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

	public String Manager_id = "";
	public String Manager_Password = "";
	public String Crew_id = "";
	public String Crew_Password = "";
	public String Tax1 = "";
	public String Tax2 = "";
	public String Sales_Tax_Seq = ""; 
	public String InputPath = "E:\\Automation\\Input_Variable.txt";

    public void ReadXml(){
    	
    	File file = new File(InputPath);
    	InputStreamReader iReader = null;
    	
    	try {
			iReader = new InputStreamReader(new FileInputStream(file));
			BufferedReader bReader = new BufferedReader(iReader);
			String line = bReader.readLine();
			while(line != null){
				String[] split = line.split(":");
				if(split.length == 2 && split[1] != ""){

					if(split[0].equals("Manager id")){
						Manager_id = split[1];
					}
					if(split[0].equals("Manager Password")){
						Manager_Password = split[1];
					}
					if(split[0].equals("Crew id")){
						Crew_id = split[1];
					}
					if(split[0].equals("Crew Password")){
						Crew_Password = split[1];
					}
					if(split[0].equals("Tax1")){
						Tax1 = split[1];
					}
					if(split[0].equals("Tax2")){
						Tax2 = split[1];
					}
					if(split[0].equals("Sales Tax Seq")){
						Sales_Tax_Seq = split[1];
					}
				}
				line = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    }
}
