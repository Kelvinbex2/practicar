package es.etg.psp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main extends Entrada {

    public static void main(String[] args) throws UnknownHostException, IOException {
        new Main().conectar();

    }

    public void conectar() throws UnknownHostException, IOException {

        Socket cliente = new Socket(HOST, PUERTO);
    }

   
}