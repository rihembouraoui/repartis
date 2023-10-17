package clientpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//la premier etape 
		try {
			//creation du serveur socket
			Socket ss =new Socket("localhost", 1234);
			System.out.println("je suis un clinet pas encore connecté ");
			
			//accepter le requete venant du client
			Socket s =ss;
			System.out.println("un client est connecté");
			
			//fermer socket
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();	
		}
		catch(IOException e) {
		e.printStackTrace();
		}

	}}
