package com.MultiThread;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Trigger {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\mahes\\OneDrive\\Documents\\Desktop\\Bank_Statement.pdf");

		Bank b = new Bank();
		b.start();
		
}
}