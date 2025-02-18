package es.etg.psp;

public class Servidor {
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new ServidorHilo());
        t1.start();
    }
  
}
