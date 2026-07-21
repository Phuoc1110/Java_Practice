package com.NoVC_End;

import java.io.*;

public class Lesson33_Read_Write_Binary {
	
	public static void main(String[] args) {
		
		Customer[] customers = getCustomers();
		
		DataOutputStream custOutput = createFile("/home/phuoclake/eclipse-workspace/NoVibeCoding/src/com/NoVC_End/customer.dat");
		
		for (Customer person : customers) {
			
			createCustomers(person, custOutput);
			
		}
		
		try {
			custOutput.close();
		}
		catch(IOException e) {
			System.out.println("IO Error");
			System.exit(0);
		}
		
		getFileInfo();
		
	}
	
	private static class Customer{
		
		public String firstName, lastName;
		public int custAge;
		private double custDebt;
		private boolean oweMoney;
		private char custSex;
		
		public Customer(String firstName, String lastName, int custAge, double custDebt, boolean oweMoney, char custSex) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.custAge = custAge;
			this.custDebt = custDebt;
			this.oweMoney = oweMoney;
			this.custSex = custSex;
		}
		
		
	}
	
	private static void getFileInfo() {
		
		System.out.println("File Information\n");
		
		File listOfNames = new File("/home/phuoclake/eclipse-workspace/NoVibeCoding/src/com/NoVC_End/customer.dat");
		
		boolean eof = false;
		
		try {
			DataInputStream getInfo = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(listOfNames)));
			
			while (!eof) {
				
				String custName = getInfo.readUTF();
				int custAge = getInfo.readInt();
				double custDebt = getInfo.readDouble();
				boolean oweMoney = getInfo.readBoolean();
				char custSex = getInfo.readChar();
				
				System.out.println(custName);
				System.out.println(custAge);
				System.out.println(custDebt);
				System.out.println(oweMoney);
				System.out.println(custSex);
				
			}
		}
		catch (EOFException e) {
			eof = true;
		}
		catch (FileNotFoundException e) {
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void createCustomers(Customer customer, DataOutputStream custOutput) {
		
		try {
			
			//Write String
			custOutput.writeUTF(customer.firstName + customer.lastName);
			//Write Int,...
			custOutput.writeInt(customer.custAge);
			custOutput.writeDouble(customer.custDebt);
			custOutput.writeBoolean(customer.oweMoney);
			custOutput.writeChar(customer.custSex);
			
			
		}
		catch (IOException e) {
			// TODO: handle exception
			System.exit(0);
		}
		
	}
	
	private static DataOutputStream createFile(String fileName) {
		
		try {
			
			File listOfNames = new File(fileName);
			
			DataOutputStream infoToWrite = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(listOfNames)));
			
			return infoToWrite;
			
		}
		catch(IOException e) {
			System.exit(0);
		}
		return null;
	}
	
	private static Customer[] getCustomers() {
		Customer[] customers = new Customer[5];
		boolean owe;
		char sex;
		for (int i = 0; i < 5; i++) {
			if ((double)i * 1000.0 > 0)
				owe = true;
			else
				owe = false;
			if (i % 2 == 0)
				sex = 'm';
			else 
				sex = 'f';
			customers[i] = new Customer("First Name " + i, "Last Name " + i, i, (double)i * 1000.0, owe, sex);
		}
		return  customers;
	}
	
}