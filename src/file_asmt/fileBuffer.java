package file_asmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileBuffer {

	public static void main(String[] args) throws IOException {
//		bufferWriterOprn();
		bufferReaderOprn();
	}
	public static void bufferWriterOprn() throws IOException {
		File f=new File("sample2.txt");
		if(f.exists()) {
			System.out.println("The file exists");
		}
		else {
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("The content is written using buffered writer");
			bw.close();
			fw.close();
			System.out.println("Successfully wrote");
		}
	}
	public static void bufferReaderOprn() throws IOException {
		File f=new File("sample2.txt");
		FileReader fr=new FileReader(f);
		
		BufferedReader br=new BufferedReader(fr);
		
		int x;
		while((x=br.read())!=-1) {
			System.out.println(x);
		}
		
		br.close();
		fr.close();
		
	}

}
