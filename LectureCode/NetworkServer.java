import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author SUU
 *
 */
@SuppressWarnings("unused")
public class NetworkServer {

	public NetworkServer(){
		//Step 1
		//Create a ServerSocket on port 12345 with length 100

		//Step 2
		//Create a Socket called socket for the ServerSocket.accept() method
		//print the InetAddress - socket.getInetAddress()
		//print the HostName = socket.getInetAddress().getHostName();

		//Step 3
		//Get the ObjectInputStream from the socket - new ObjectInputStream(socket.getInputStream() );
		//Get the ObjectOutputStream from the socket - new ObjectOutputStream(socket.getOutputStream())

		//Step 4
		//Print the message from the ObjectInputStream using the readObject() method - throws and exception
		//Send a message back to the client using the writeObject method
		//flush the output so that the buffer actually sends

		//Step 5
		//The server automatically closes when the program exits

	}


	public static void main(String[] args) {
		new NetworkServer();

	}

}
