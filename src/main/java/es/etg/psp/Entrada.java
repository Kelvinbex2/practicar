package es.etg.psp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Entrada {
    public final static int PUERTO = 2222;
    public static final String MSG_SERVER = "Servidor esperado peticiones en el: ";
    public static final String HOST = "localhost";

    public void mandar(Socket cliente, String msg) throws IOException {
        OutputStream aux = cliente.getOutputStream();
        DataOutputStream output = new DataOutputStream(aux);
        output.writeUTF(msg);
    }

    public void mandar(Socket cliente) throws IOException {
        InputStream aux = cliente.getInputStream();
        DataInputStream input = new DataInputStream(aux);
        String msg = input.readUTF();
        System.out.println(msg);
    }
}
