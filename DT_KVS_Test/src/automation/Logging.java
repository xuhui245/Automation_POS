package automation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logging {
	
	public String folderPath = "";
    public String folderParentPath = "\\\\10.0.0.25\\E\\Automation\\DT";
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
		//	Log.info("The Log folder is created");
		}else{
		//	Log.info("The Log folder is existed");
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
		File[] singleFolder = resultFolder.listFiles();
		if(singleFolder.length > 0){
			for(int i = 0; i < singleFolder.length; i++){
				System.out.println(singleFolder[i]);
				deleteFile(singleFolder[i]);
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
