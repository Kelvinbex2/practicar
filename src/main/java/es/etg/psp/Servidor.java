package es.etg.psp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor extends Entrada {
    // Se pide crear un servidor que envíe un mensaje y un cliente que reciba y
    // muestre ese mensaje.
    // Se pide modificar el ejemplo anterior para que el cliente envíe un mensaje y
    // el servidor lo muestre en consola.

    public void conexionServer(Socket cliente) throws IOException {

        ServerSocket server = new ServerSocket(PUERTO);

        System.out.println("Servidor escuchando en " + PUERTO);

        cliente = server.accept();

        mandarMensaje(sc, cliente);
        recibir(cliente);

        cliente.close();
    }

    public static void main(String[] args) throws IOException {
        Socket s = new Socket();
        new Servidor().conexionServer(s);
    }

    public void mandarMensaje(Scanner sc, Socket socket) throws IOException {

        System.out.println("Escribe Mensaje al cliente: ");
        String msg = "Servidor: " + sc.nextLine();

        mandar(socket, msg);
    }

}
