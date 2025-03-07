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

    public void recibirDatos() throws IOException {
        String msg = recibir(cliente);
        System.out.println("Numero recibido de cliente: " + msg);

        int pas = Integer.parseInt(msg);

        int hojasRestante = numHojas.procesar(pas, cliente);

        System.out.println(" Hojas restantes: " + hojasRestante);

    }

    @Override
    public void run() throws RuntimeException {
        try {
            while(true){
                recibirDatos();
            }
         

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }finally{
            try {
                cliente.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
