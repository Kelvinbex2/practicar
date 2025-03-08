package es.etg.psp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente extends Entrada {

    public static void main(String[] args) throws UnknownHostException, IOException {
        new Cliente().conectar();

    }

    public void conectar() throws UnknownHostException, IOException {

      
        while (true) {
            Socket cliente = new Socket(HOST, PUERTO);
            mandarMensaje(sc, cliente);
            recibir(cliente);
        
        }

    }

    public void mandarMensaje(Scanner sc, Socket socket) throws IOException {

        System.out.println("Escribe Mensaje al cliente: ");
        String msg = "Cliente: " + sc.nextLine();

        mandar(socket, msg);
    }

}