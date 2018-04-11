package automation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logging {
	
	public String folderPath = "";
	String folderParentPath = "\\\\10.0.0.25\\E\\Automation\\FC";
//	String folderParentPath = "C:\\Users\\xjiang\\Desktop\\Automation\\Fast_Fail";  //path for folder of logs

	public void createFolder(String folderName){	
		
		
		File directory = new File(folderParentPath);
		if(!directory.exists() && !directory.isDirectory()){
			directory.mkdirs();
		}
		String path = folderParentPath + "\\" + folderName;
		folderPath = path;
		File folder = new File(path);
		if(!folder.exists() && !folder.isDirectory()){
			folder.mkdir();
		}else{
		}
}
	
	public void createFile(String fileName){
    
	File file = new File(folderPath, fileName);
	if(file.exists()){
	//	Log.info("file is existing");
	}else{
		file.getParentFile().mkdirs();
		 try {
			file.createNewFile();
		//	Log.info("creat a file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	Log.info("something wrong");
			e.printStackTrace();
		}
	}
	}

	public void writeLog(String fileName,String log){
			
		String filepath = folderPath + "\\" + fileName;
		try {
			FileWriter fileWriter = new FileWriter(filepath, true);
			fileWriter.write(log+"\r\n");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clearLog(){
		File resultFolder = new File(folderParentPath);
		if(!resultFolder.exists() && !resultFolder.isDirectory()){
		    resultFolder.mkdir();  
		}
		System.out.println(resultFolder.getAbsolutePath());
		File[] singleFolder = resultFolder.listFiles();
		if(singleFolder.length > 0){
			for(int i = 0; i < singleFolder.length; i++){
				if(singleFolder[i].getName().equals("Log")
				||singleFolder[i].getName().equals("out")
				||singleFolder[i].getName().equals("KVS_ScreenShot")
				||singleFolder[i].getName().equals("FC_ScreenShot")){
				deleteFile(singleFolder[i]);
				}
			}
		}
	}
	
	private static void deleteFile(File file){
	    if(file.isDirectory()){
	        File[] files = file.listFiles();
	        for(int i=0; i<files.length; i++){
	            deleteFile(files[i]);
	        }
	    }
	    file.delete();
	}
}
