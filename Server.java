import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
  	public static void main(String[] args){
     try(
       	FileReader lI = new FileReader("/user_pass.txt");
       	BufferedReader loginText = new BufferedReader(lI);
       	HashMap<String, String> loginMap = new HashMap();
       	String pwd;
       	String uName = "test";
       	while((cred = loginText.nextLine()) != null)
       		loginMap.put(uName, pwd);){}
     
     catch(FileIOException e){
       System.out.print("Login file not found");
       System.exit(1);
     }
         
           
           
         }
   }