package es.etg.psp;

import java.io.IOException;
import java.net.Socket;

public class Hojas extends Entrada {

    private int numHojas;

    public Hojas() {
        this.numHojas = NUM_HOJAS;
    }

    public int getNumHojas() {
        return numHojas;
    }

    public void setNumHojas(int numHojas) {
        this.numHojas = numHojas;
    }

    public synchronized int procesar(int hojas, Socket socket) throws IOException {
        if (hojas <= numHojas) {
            this.numHojas -= hojas;
            mandar(socket, MSG_OK);
        } else {
            mandar(socket, MSG_KO);
        }
        return numHojas;
    }
}
