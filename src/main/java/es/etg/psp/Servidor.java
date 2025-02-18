package es.etg.psp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Entrada {
    // Crea un servidor que esté escuchando en el puerto 8888 de tu máquina.
    // Comprueba que el servidor está esperando y listo para procesar peticiones.

    public void conexionServer(Socket  cliente) throws IOException {

        ServerSocket server = new ServerSocket(PUERTO);

        System.out.println("Servidor escuchando en " + PUERTO);

        cliente = server.accept();

        cliente.close();
    }

    public static void main(String[] args) throws IOException {
        Socket s = new Socket();
        new Servidor().conexionServer(s);
    }

}
