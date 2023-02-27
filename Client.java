import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args){
        int portaServer = 2000; //porta del server
        InetAddress IPServer = InetAddress.getByName("localhost");

        byte[] bufferOUT = new byte[1024]; //buffer di spedizione e ricezione
        byte[] bufferIN = new byte[1024];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        DatagramSocket clientSocket = new DatagramSocket(); //creazione del socket
        System.out.println("Client pronto - inserisci un dato da inviare: ");

            String daSpedire = input.readLine(); //preparazione del messaggio da spedire
            bufferOUT = daSpedire.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(bufferOUT, bufferOUT.length, IPServer, portaServer); //trasmissione del dato al server
        clientSocket.send(sendPacket);

        DatagramPacket receivePacket = new DatagramPacket(bufferIN, bufferIN.length); //ricezzione del dato dal server
        clientSocket.receive(receivePacket);
        String ricevuto = new String(receivePacket.getData());
    }
}