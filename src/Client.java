import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	public static void main(String[] args) throws IOException
	{
		Socket mulSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

		try{
			mulSocket = new Socket("DUKE-B36NXMUXT0", 685);
            out = new PrintWriter(mulSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                                        mulSocket.getInputStream()));
            
       

            
		}
		catch (UnknownHostException e) {
            System.err.println("Don't know about host: DUKE-B36NXMUXT0.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
                               + "the connection to: DUKE-B36NXMUXT0.");
            System.exit(1);
        }
		
		
 		
 		out.println("add 6 8");
 		System.out.println("x+y= " + in.readLine());
 		out.println("multiply 7 34");
 		System.out.println("x*y= " + in.readLine());
 		
 		
		
		out.close();
		in.close();
		mulSocket.close();
		
		
		
	}

}
