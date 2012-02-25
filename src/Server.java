import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String[] args) throws IOException
	{
		ServerSocket listener = null;
		PrintWriter out = null;
		BufferedReader in = null;
		Registry myRegistry = new Registry();
		
		try {
			listener = new ServerSocket(685);
					
//			out = new PrintWriter(listener.getOutputStream(), true);
//            in = new BufferedReader(new InputStreamReader(
//                                        listener.getInputStream()));
				
		} catch (IOException e) {
			System.out.println
		    ("Could not listen on port: 685");
			System.exit(-1);
		}
		
		Socket clientSocket = null;
		try {
			clientSocket = listener.accept();
			System.out.println("Socket Bound: " +clientSocket.isBound());

		} 
		catch (IOException e) {
		System.out.println("Accept failed: 685");
		System.exit(-1);
		}
		
		
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		String input = in.readLine();
		
		Operation o = myRegistry.parse(input);
		int z = o.perform();
		out.print(z);
		
		
		
		out.close();
		in.close();
		clientSocket.close();
		listener.close();
		System.out.println("Server finished");
		
	}
	

}
