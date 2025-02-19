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
        Socket cliente = new Socket(HOST, PUERTO);

        do {
            System.out.print("> ");
            int msg = sc.nextInt();
            mandarMensaje(msg, cliente);
            recibir(cliente);
        } while (!recibir(cliente).equalsIgnoreCase("KO"));

        cliente.close();

    }

    public void mandarMensaje(int msg, Socket socket) throws IOException {

        mandar(socket, String.valueOf(msg));
    }

}