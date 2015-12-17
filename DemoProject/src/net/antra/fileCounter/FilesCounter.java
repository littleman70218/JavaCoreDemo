package net.antra.fileCounter;

import java.io.File;

public class FilesCounter {
	static int ecount =0;
	static int scount =0;
	static String firstpath;
	public static void main(String[] args) {
		Criteria criteria=new Criteria("C:/User/snavid/Desktop/Antra/java", ".docx", 1);
		firstpath=criteria.filepath;
		FilesCounter filecounter = new FilesCounter();
		filecounter.count(criteria);
		System.out.println("There are "+ ecount+ " file(s) and "+ scount+
				" folder(s) inside folder "+ firstpath+ " with extension "
				+ criteria.fextension);
	}

	public void count(Criteria criteria) {
		File f = new File(criteria.filepath);
		File[] files = f.listFiles();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				if (file.toString().endsWith(criteria.fextension)){
					System.out.println(file);
					ecount++;
				}
				if (file.isDirectory()) {   
		            System.out.println(file);
		            scount++;
		            if (criteria.sfolder==1){
		            	criteria.filepath=file.getAbsolutePath();
		            	this.count(criteria);
		            }
		        }
			}
		}
	}
}
