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

//Authentication & Socket creation
     try(
      	Socket chatSocket = new Socket(hostName, portNumber);
      	PrintWriter out =
               new PrintWriter(chatSocket.getOutputStream(), true);
           BufferedReader in =
               new BufferedReader(
                   new InputStreamReader(chatSocket.getInputStream()));
           BufferedReader stdIn =
               new BufferedReader(
                    new InputStreamReader(System.in))
   		)
     {
				boolean loggedIn = false; //1 when logged in successfully
     
 	 	    	String serverMess;
     			String userInput;
				while ((serverMsg = in.readLine()) != null) //intro message for login info 
      	   	System.out.println(serverMsg); 
     			out.println(stdIn.readLine());
     			System.out.print(in.readLine());
     			out.println(stdIn.readLine());
      	 	loggedIn = (boolean)in.readLine();
     			while ((serverMsg = in.readLine()) != null) //message for repeated login info
      	   	System.out.println(in.readLine());
    	 while(!loggedIn) //if they never get the correct answer server will close connection - might have an error issue here
    	 {
     			out.println(stdIn.readLine());
     			System.out.print(in.readLine());
     			out.println(stdIn.readLine());
     		  	loggedIn = (boolean)in.readLine();
    	 }
     
     //Now you're logged in
     
     while((serverMsg = in.readLine() != null))
           System.out.println(serverMsg);
     }
           
     
     	catch(UnknownHostException e) {
        System.out.print("Cannot recognize specified host - system exiting...");
        System.exit(1);
      }
     		
  		catch(IOException e){
        System.out.print("Had trouble establishing an IO connection with " + hostName);
        System.exit(1);
      }   		
     
}
