package file_asmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		File f=new File("output.txt");
		
		//Creating new file
		if(f.exists()) {
			System.out.println("The file exists");
		}
		else {
			f.createNewFile();
			System.out.println("File was created");
		}

		//Rename Method
		
		File f2=new File("output3.txt");
		if(f.renameTo(f2)) {
			System.out.println("The file was renamed");
		}
		else {
			System.out.println("The file cannot be renamed");
		}
		
		//Append Data to file
		FileWriter fw=new FileWriter(f2,true);
		BufferedWriter br = new BufferedWriter(fw);
		PrintWriter pr = new PrintWriter(br);
		pr.println("Hello,How r u   ?");
		pr.close();
		br.close();
		System.out.println("Appended Successfully");
		fw.close();
		
		//modifyDataInFile
		ArrayList<String> lines = new ArrayList<String>();
	    String line = null;
		 try
	        {
	            File f1 = new File("sample.txt");
	            FileReader fr = new FileReader(f1);
	            BufferedReader br1 = new BufferedReader(fr);
	            while ((line = br1.readLine()) != null)
	            {
	                if (line.contains("how"))
	                    line = line.replace("how", "who");
	                lines.add(line);
	            }
	            fr.close();
	            br1.close();
	            
	            FileWriter fw1 = new FileWriter(f1);
	            BufferedWriter out = new BufferedWriter(fw1);
	            for(String s : lines)
	                 out.write(s);
	            out.flush();
	            out.close();
	           
	            System.out.println("Successfully modified");
	        }
	        catch (Exception ex)
	        {
	            ex.printStackTrace();
	        }
		
		 // readDataFromFile
		 File f3 = new File("sample.txt");
		 FileReader fr2=new FileReader(f3);
		 BufferedReader br2=new BufferedReader(fr2);
		 
		 String data;
		 
		 while((data=br2.readLine())!=null) {
			 System.out.println(data);
		 }
		 
		 //deleteFile
		 
		 File f4=new File("sample4.txt");
		 f4.createNewFile();
		 if(f4.delete()) {
			 System.out.println("File deleted successfully");
		 }
		 else {
			 System.out.println("File doesn't exist");
		 }
		 
		 
		 //copyFile
		 
		 
		 
		 try {
			 	File f5 = new File("output3.txt");
			 	
	            FileReader fr = new FileReader(f5);
	            FileWriter rn = new FileWriter("copyfile.doc");
	            if(f5.exists()) {
	                int c;
	                while ((c = fr.read()) != -1) { 
	                       rn.write(c);  
	                      } 
	            }
	            else {
	            	System.out.println("File doesn't exists");
	            }
	            fr.close();
	            rn.close();
	            System.out.println("Successfully Copied");
			 
		 }
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
		 
		 
		 //Move File
		 
		 try {
	            Path temp = Files.move(Paths.get("output.txt"),Paths.get("output7.txt"));
	            if(temp != null) {
	                System.out.println("Successfully Moved");
	            }
	            else {
	                System.out.println("The file can't be moved");
	            }
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
