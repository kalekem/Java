package kalekem;

import java.io.File;

public class AssemblyLanguage {
	public static void main(String[] args) {
		
		//String pwd = System.getProperty("user.dir");
       // System.out.println(pwd);
        
        File dir = new File(System.getProperty("user.dir"));
        String childs[] = dir.list();
        for(String child: childs){
            System.out.println(child);
        }
		/*
		int x = 0;
		int y = 0;
		int z = 10;
		
		while (x + y < z){
			//System.out.println(x +y);
			y ++;
			while (x + y < z) {
				System.out.println(x +y); //just for testing. Prints the output
				y ++;
		}
		

	}
	**/
	}


}
