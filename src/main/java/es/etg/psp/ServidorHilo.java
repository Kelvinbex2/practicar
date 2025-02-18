package es.etg.psp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorHilo extends Entrada implements Runnable {
  

    public void conexionServer(Socket cliente) throws IOException {
        ServerSocket server = new ServerSocket(PUERTO);
        System.out.println("Servidor escuchando en " + PUERTO);
        cliente = server.accept();
        mandarMensaje(sc, cliente);
        recibir(cliente);
        
    }

   

    public void mandarMensaje(Scanner sc, Socket socket) throws IOException {

        System.out.println("Escribe Mensaje al cliente: ");
        String msg = "Servidor: " + sc.nextLine();

        mandar(socket, msg);
    }

    @Override
    public void run() throws RuntimeException{
        
       while (true) {
     
        try (Socket socket = new Socket()) {
            conexionServer(socket);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
           throw new RuntimeException(e.getMessage());
        }
           
        
    }
}

}
