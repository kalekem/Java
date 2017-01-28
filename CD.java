package kalekem;

import java.io.File;

public class CD {
	public static void main(String[] args){
		 if(args.length==1){
	            File dir = new File(args[0]);
	            if(dir.isDirectory()==true) {
	                System.setProperty("user.dir", dir.getAbsolutePath());
	            } else {
	                System.out.println(args[0] + "is not a directory.");
	            }
		 }
	}

}
