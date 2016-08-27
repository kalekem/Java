import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

//this program implements a simple shell interface in java
public class SimpleShell {
  public static void main(String[] args) throws java.io.IOException {
    String commandLine;
    BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
    while (true) {
      // read what the user entered
      System.out.print("shell>");
      commandLine = console.readLine(); {
      // loop again if the user entered a return
      if (commandLine.equals("")){
           continue;
      }
      else if(commandLine.equalsIgnoreCase("exit")){
        System.out.println("Goodbye");
        System.exit(0);
      }
      else if(commandLine.equalsIgnoreCase("quit"))  {
        System.out.println("Goodbye");
        System.exit(0);
      }

      // Splits the string into a String Array
      ArrayList<String> splitString = new ArrayList<String>();
      String[] lineSplit = commandLine.split(" ");
      int size = lineSplit.length;
      
      for (int i=0; i<size; i++)  {
        splitString.add(lineSplit[i]);
      }

      ProcessBuilder build = new ProcessBuilder(splitString);
      Process proc = build.start();
      
      //obtains the input stream
      InputStream stream = proc.getInputStream();
      InputStreamReader stream_Reader = new InputStreamReader(stream);
      BufferedReader br = new BufferedReader(stream_Reader);
      
      //reads what is returned by the command
      String line;
      while ( (line = br.readLine()) != null)
        System.out.println(line);
        br.close();
      }

    }

  }

}


