import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args){
        DatagramSocket serverSocket = new DatagramSocket(2000);
        boolean attivo = true;  //per la ripetizione del servizio
        byte[] bufferIN = new byte[1024]; //buffer spedizione e ricezione
        byte[] bufferOUT = new byte[1024];

            System.out.println("SERVER attivo");
            while(attivo)

            DatagramPacket receivePacket = new DatagramPacket(bufferIN, bufferIN.lenght); //definizione del datagramma

            serverSocket.receive(reicevePacket); //attesa della ricezione dato dal client
            
    }
}