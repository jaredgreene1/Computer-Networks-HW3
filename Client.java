import java.io.*;
import java.net.*;

public class Client {
  	public static void main(String[] args) throws IOException 
     {
     		if (args.length != 2) {
           System.err.println(
             "Please use the following form: Client <host_name> <port_number>");
         System.exit(1);}
         
    		String hostName = args[0];
     	int portNumber = Integer.parseInt(args[1]);

		try(
      	Socket chatSocket = new Socket(hostName, portNumber);
      	PrintWriter out =
               new PrintWriter(chatSocket.getOutputStream(), true);
           BufferedReader in =
               new BufferedReader(
                   new InputStreamReader(chatSocket.getInputStream()));
           BufferedReader stdIn =
               new BufferedReader(
                    new InputStreamReader(System.in)));
           String serverMess;
     		  String userInput;
     			while ((serverMsg = in.readLine()) != null) {
                out.println(serverMsg);
                System.out.println(in.readLine()); //Is this necessary? One off on the readline?
            }
     			userInput = stdIn.readLine();
     			out.write
     		
     
   }
}