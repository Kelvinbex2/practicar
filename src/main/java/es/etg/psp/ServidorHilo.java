package es.etg.psp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ServidorHilo extends Entrada implements Runnable {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void mandarMensaje(Scanner sc, Socket socket) throws IOException {

        System.out.println("Escribe Mensaje al cliente: ");
        String msg = "Servidor: " + sc.nextLine();

        mandar(socket, msg);
    }

    @Override
    public void run() throws RuntimeException {
        try {
            while (true) {
                mandarMensaje(sc, cliente);
                recibir(cliente);
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
