package es.etg.psp;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Entrada {
    

    
    public static void main(String[] args) throws RuntimeException {
       try (ServerSocket serverSocket = new ServerSocket(PUERTO) ) {
        System.out.println("Servidor escuchando en " + PUERTO);

        while (true) {
            Socket cliente = serverSocket.accept();
            Thread tr = new Thread(new ServidorHilo(cliente));
            tr.start();
        }
       } catch (Exception e) {
        System.out.println("Error:" + e.getMessage());
        throw new RuntimeException(e.getMessage());
       }
    }
  
}
