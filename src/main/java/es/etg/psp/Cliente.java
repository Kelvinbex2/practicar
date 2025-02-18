package es.etg.psp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente extends Entrada {

    public static void main(String[] args) throws UnknownHostException, IOException {
        new Cliente().conectar();

    }

    public void conectar() throws UnknownHostException, IOException {

        Socket cliente = new Socket(HOST, PUERTO);

        recibir(cliente);
    }

   
}