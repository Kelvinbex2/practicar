package es.etg.psp;

import java.io.IOException;
import java.net.Socket;

public class ServidorHilo extends Entrada implements Runnable {

    private Socket cliente;
    private Hojas numHojas;

    public ServidorHilo(Socket cliente, Hojas numHojas) {
        this.cliente = cliente;
        this.numHojas = numHojas;
    }

    public int recibirDatos(Socket socket) throws IOException {
        int pas = Integer.parseInt(recibir(socket));

        return numHojas.procesar(pas, socket);

    }

    @Override
    public void run() throws RuntimeException {
        try {
            int hojasRestantes = recibirDatos(cliente);

            System.out.println("Queda: " + hojasRestantes);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
