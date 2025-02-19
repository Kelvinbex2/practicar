package es.etg.psp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Entrada {
    public final static int PUERTO = 2222;
    public static final String MSG_SERVER = "Servidor esperado peticiones en el: ";
    public static final String HOST = "localhost";
    public static final Scanner sc = new Scanner(System.in);
    public static final int NUM_HOJAS = 10;
    public static final String MSG_OK = "OK";
    public static final String MSG_KO = "KO";

    public void mandar(Socket cliente, String msg) throws IOException {
        OutputStream aux = cliente.getOutputStream();
        DataOutputStream output = new DataOutputStream(aux);
        output.writeUTF(msg);
    }

    public String recibir(Socket cliente) throws IOException {
        InputStream aux = cliente.getInputStream();
        DataInputStream input = new DataInputStream(aux);
        String msg = input.readUTF();
        System.out.println(msg);
        return msg;
    }
}
