import java.io.*;
import java.lang.*;

class Test {

 public static void main(String[] args) throws IOException {
 removeComment();
 }

 static void removeComment() throws IOException {
  try {
      BufferedReader br = new BufferedReader(new FileReader("D:\\dell\\111.txt"));
      String line;
      boolean comment = false;
      while ((line = br.readLine()) != null) {
      if (line.contains("/*")) {
          comment = true;
          System.out.println(line);
          //continue;
      }
      if(line.contains("*/")){
          comment = false;
          System.out.println(line);
          //continue;
      }
      if(!line.contains("*")){
          
          System.out.println(line);
          //continue;
      }
      if(line.contains("//")){
    	  System.out.println(line);
          continue;
      }
      
    }
    br.close();
 }

 catch (IOException e) {
    System.out.println("OOPS! File could not read!");
  }
 }
}