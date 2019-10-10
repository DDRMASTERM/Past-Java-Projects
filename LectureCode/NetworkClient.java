import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * 
 * @author
 *
 */
@SuppressWarnings("unused")
public class NetworkClient {

	public NetworkClient(){
		//Step 1
		//Create a Socket called client on your machine using InetAddress.getByName("127.0.0.1") and port 12345

		//Step 2
		//Get the ObjectOutputStream - new ObjectOutputStream (client.getOutputStream())
		//Get the ObjectInputStream - new ObjectInputStream(client.getInputStream())

		//Step 3
		//use the writeObject method to send a string to the server
		//flush the output to actually send the message and not just store it in the buffer
		//print what the server sent back using the readObject method - it throws an exception

		//Step 4
		//The client automatically closes when the program exits

	}

	public static void main(String[] args) {
		new NetworkClient();
	}

}
