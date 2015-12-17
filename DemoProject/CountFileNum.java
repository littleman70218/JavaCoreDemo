package net.antra.daytwo;
import java.util.Scanner;
import java.io.*;

public class CountFileNum {
	static int fileCount = 0;
	static int folderCount = 0;
	public static void main (String[] arg) {
		
		Criteria criteria = new Criteria();
//		criteria.floderPath = "/Users/dsj/Documents/dsj";
//		criteria.includeSubFolder = true;
//		criteria.fileExtension = ".txt .jpg .java .docx";
		keybordInput(criteria);
		CountSubFolder(criteria);
		System.out.println("There are："+fileCount+"files and "+folderCount+"folders" );
	}
	public static void keybordInput (Criteria criteria) {
		try {
			Scanner scanner = new Scanner(System.in);
			criteria.fileExtension = "";
			System.out.println("input path");
			criteria.floderPath = scanner.next();
			System.out.println("include subfolder: Y/N ?");
			String S = scanner.next();
			if (S.equals("Y"))
				criteria.includeSubFolder = true;
			else criteria.includeSubFolder = false;
			System.out.println("input extension of files,enter 'q' to stop");
			while (!S.equals("q")) {
				S = scanner.next();
				criteria.fileExtension = criteria.fileExtension + " " + S;
			}
			scanner.close();
		}catch(Exception e) {
			System.out.println("error input");
		}
	}
		
	public static void CountSubFolder(Criteria criteria) {
		String path = criteria.floderPath;
		String[] fileExt = criteria.fileExtension.split(" ");
		
		File d = new File(path);
		File list[] = d.listFiles();
		for(int i = 0; i < list.length; i++) {
			if(list[i].isFile()){
				for (int j = 0;j<fileExt.length;j++) {
					if(list[i].getAbsolutePath().indexOf(fileExt[j])>0)
						fileCount++;
				}
			}else if(list[i].isDirectory()) {
				if(criteria.includeSubFolder == true) {
					folderCount++;
					criteria.floderPath = list[i].getAbsolutePath();
					CountSubFolder(criteria);
				}else {
					folderCount++;
				}
				
			}		
		}	
	}
	

	static class Criteria {
		String floderPath;
		Boolean includeSubFolder;
		String fileExtension;
	}

}