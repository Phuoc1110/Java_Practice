package com.NoVC_End;

import java.io.*;

public class Lesson32_File_Read_Write {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		
		Customer[] customers = getCustomers();
		
		PrintWriter printWriter = createFile("/home/phuoclake/eclipse-workspace/NoVibeCoding/src/com/NoVC_End/customers.txt");
		
		for (Customer customer : customers) {
			createCustomer(customer, printWriter);
		}
		
		printWriter.close();
		
		getFileInfo();
	}
	
	private static class Customer{
		
		public String firstName, lastName;
		public int custAge;
		
		public Customer(String firstName, String lastName, int custAge) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.custAge = custAge;
		}
		
		
	}
	
	private static Customer[] getCustomers() {
		Customer[] customers = new Customer[5];
		for (int i = 0; i < 5; i++) {
			customers[i] = new Customer("First Name " + i, "Last Name " + i, i);
		}
		return  customers;
	}
	
	private static PrintWriter createFile(String file) {
		
		try {
			File listOfNames = new File(file);
			
			PrintWriter infoToWrite = 
					new PrintWriter(
							new BufferedWriter(
									new FileWriter(listOfNames)));
			
			return infoToWrite;
		}
		catch (IOException e) {
		    e.printStackTrace();
		    return null;
		}
	}
	
	private static void createCustomer(Customer customer, PrintWriter printWriter) {
		String custInfo = customer.firstName + " " + customer.lastName;
		custInfo += Integer.toString(customer.custAge);
		
		printWriter.println(custInfo);
		
	}
	
	private static void getFileInfo() {
		
		System.out.println("File information]n");
		
		File listOfNames = new File("/home/phuoclake/eclipse-workspace/NoVibeCoding/src/com/NoVC_End/customers.txt");
		
		try {
			
			BufferedReader getInfo = new BufferedReader(
					new FileReader(listOfNames));
			
			String custInfo = getInfo.readLine();
			
			while (custInfo != null) {
				System.out.println(custInfo);
				custInfo = getInfo.readLine();
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}