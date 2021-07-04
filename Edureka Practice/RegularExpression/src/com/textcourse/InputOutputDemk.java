package com.textcourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

public class InputOutputDemk {

	
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("C:\\Users\\Sreesruthi P K\\Desktop\\entho.txt");
		InputOutputDemk demo = new InputOutputDemk();
		demo.writeToFile(file);
		demo.readFile(file);
	}
	
	public void writeToFile(File file) {
		PrintWriter employeeInfoWriter = null;
		try {
			employeeInfoWriter = new PrintWriter(file);
			employeeInfoWriter .println("Sreesruthi");
			employeeInfoWriter.println("B Tech");
		}
		catch(FileNotFoundException e){
			System.out.println(file.getName()+" not found");
			throw new RuntimeException(e);
		}
		finally {
			employeeInfoWriter.close();
		}
	}
	
	public void readFile(File file) throws FileNotFoundException {
		Scanner s = new Scanner(file);
		while(s.hasNext()) {
			
			System.out.println(s.nextLine());
		}
		s.close();
		
		
		
	}
}
