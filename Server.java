import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server{
    public static void main(String[] args){
        DatagramSocket serverSocket = new DatagramSocket(2000);
        boolean attivo = true;  //per la ripetizione del servizio
        byte[] bufferIN = new byte[1024]; //buffer spedizione e ricezione
        byte[] bufferOUT = new byte[1024];

            System.out.println("SERVER attivo");
            while(attivo){

            DatagramPacket receivePacket = new DatagramPacket(bufferIN, bufferIN.length); //definizione del datagramma
            
            serverSocket.receive(receivePacket); //attesa della ricezione dato dal client

            String ricevuto = new String(receivePacket.getData()); //analisi del pacchetto ricevuto
            int numCaratteri = receivePacket.getLength();
            ricevuto = ricevuto.substring(0,numCaratteri); //elimina i caratteri in eccesso
            System.out.println("RICEVUTO" + ricevuto);
            }
    }
}