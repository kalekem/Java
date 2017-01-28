package kalekem;

import java.io.File;

public class LS {
	public static void main(String[] args){
		File ls = new File(System.getProperty("user.dir"));
        String childs[] = ls.list();
        for(String child: childs){
            System.out.println(child);
        }
    }
}
