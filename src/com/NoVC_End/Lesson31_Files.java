package com.NoVC_End;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.io.*;

public class Lesson31_Files extends JFrame {
	
	static String filepath, parentDirectory;
	
	static File randomDir, randomFile1, randomFile2;
	
	public static void main(String[] args) {
		
		randomDir = new File("/home/phuoclake/eclipse-workspace/NoVibeCoding/src/com/NoVC_End/TestDir");
		randomDir.mkdir();
		
		randomFile1 = new File("random1.txt");
		
		randomFile2 = new File("/home/phuoclake/eclipse-workspace/NoVibeCoding/src/com/NoVC_End/TestDir/random2.txt");
		
		try {
			randomFile1.createNewFile();
			randomFile2.createNewFile();
			
			filepath = randomFile1.getCanonicalPath();
		}
		catch (IOException e) {
			// TODO: handle exception
		}
		
		if (randomFile1.exists()) {
			System.out.println("File exist!");
			
			System.out.println("Location: " + filepath);
			
			System.out.println("Readable: " + randomFile1.canRead());
			
			System.out.println("Writable: " + randomFile1.canWrite());
			
			System.out.println("Name: " + randomFile1.getName());
			
			System.out.println("Writable: " + randomFile1.canWrite());
			
			System.out.println("Parent 1: " + randomFile1.getParent());
			System.out.println("Parent 2: " + randomFile2.getParent());
			
			System.out.println("Writable: " + randomFile1.canWrite());
			
			System.out.println("Is a Dir? " + randomDir.isDirectory());
			
			String[] filesInDir = randomDir.list();
			
			System.out.print("Files in Dir: ");
			
			for (String file : filesInDir) {
				System.out.println(file + ", ");
			}
			
			System.out.println("Is a file? " + randomFile1.isFile());
			
			System.out.println("Last changed: " + randomFile1.lastModified());
			
			System.out.println("Hidden: " + randomFile1.isHidden());
			
			System.out.println("File size: " + randomFile1.length());
			
//			System.out.println("First location: " + randomFile1.getPath());
//			randomFile1.renameTo(new File("/home/phuoclake/eclipse-workspace/NoVibeCoding/src/com/NoVC_End/TestDir/random3.txt"));
//			System.out.println("Second location: " + randomFile1.getPath());
			
			new Lesson31_Files();
			
		}
		else {
			System.out.println("Something went wrong");
		}
		
		if (randomFile1.delete()) {
			System.out.println("File Deleted");
		}
		File[] filesInDir = randomDir.listFiles();
		
		for (File file : filesInDir) {
			file.delete();
		}
		if (randomDir.delete()) {
			System.out.println("Dir deleted");
		}
		
	}
	
	public Lesson31_Files() {
		JFileChooser fileChooser = new JFileChooser(randomDir);
		fileChooser.showOpenDialog(this);
	}
	
}