package com.textcourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	
	public static void main(String[] args) {
		FileOutputDemo file = new FileOutputDemo();
		try {
			file.writeToFile(new File("C:\\Users\\Sreesruthi P K\\Desktop\\entho.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-ge  nerated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void writeToFile(File file) throws IOException,FileNotFoundException{
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write("Hello! I'm the new line :)".getBytes());
		fileOutputStream.close();
	}
}
