package ServeurPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//la premier etape 
		try {
			//creation du serveur socket
			ServerSocket ss =new ServerSocket(1234);
			System.out.println("je suis le serveur en attend la connexion d'un clinet ");
			
			//accepter le requete venant du client
			Socket s =ss.accept();
			System.out.println("un client est connecté");
			
			//fermer socket
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();	
		}
		catch(IOException e) {
		e.printStackTrace();
		}

	}

}