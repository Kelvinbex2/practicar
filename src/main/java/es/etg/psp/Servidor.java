package es.etg.psp;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Entrada {

    public static void main(String[] args) throws RuntimeException {

        try (ServerSocket server = new ServerSocket(PUERTO)) {
            System.out.println("Servidor escuchando en el servidor " + server.getLocalPort());

       
                Socket cliente = server.accept();
                Thread tr = new Thread(new ServidorHilo(cliente));
                tr.start();

                tr.join();
            

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
