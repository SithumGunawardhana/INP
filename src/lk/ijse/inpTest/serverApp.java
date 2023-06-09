package lk.ijse.inpTest;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class serverApp {
    public static void main(String[] args) throws IOException {

       // මුලින්ම port එකක් හදාගන්න ඒකෙන් තමයි අදාල server එකේ හෝ client ගෙ අදාල port එක.

        // අදාල  socket එකේ object එකෙන් references එකක් හදා ගන්න.

        ServerSocket serverSocket = new ServerSocket(8000);

        // serversocket එක access කරන්න.
        Socket localSocket = serverSocket.accept();

        //  DataOutputStream  Object එකෙන් referencess  එකක් අරගෙන ඒකට  serversocket එක access කරපු එකේ references name එකට getOutputStram එක දෙන්න.

        DataOutputStream dataOutputStream = new DataOutputStream(localSocket.getOutputStream());

        DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());


        // BufferReadar Object එකෙන් referencess  එකක් අරගෙන ඒකට  InputStreamReader එකේ referencess  එකකට access කරලා එකෙ ඇතුලෙ system.in යොදන්න.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String massage="", reply="";


        while (!massage.equals("final")){
            massage=dataInputStream.readUTF();
            System.out.println(massage);
            reply= bufferedReader.readLine();
            dataOutputStream.writeUTF(reply);
            dataOutputStream.flush();

        }

        dataInputStream.close();
        dataOutputStream.close();
        bufferedReader.close();


//            final int PORT = 8000;
//
//        ServerSocket serverSocket = new ServerSocket(PORT);
//
//        System.out.println("Server is running in port : " + PORT);
//            Socket localSocket = serverSocket.accept();
//            System.out.println("Client acepted.");
//
//            DataOutputStream dataOutputStream = new DataOutputStream(localSocket.getOutputStream());
//            DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String message = "";
//            String reply = "";
//
//            while (!message.equals("finish")) {
//                message = dataInputStream.readUTF();
//                System.out.println(message);
//                reply = bufferedReader.readLine();
//                dataOutputStream.writeUTF(reply);
//                dataOutputStream.flush();
//
//            }
//
//            dataInputStream.close();
//            dataOutputStream.close();
//            bufferedReader.close();
//



            //port එකට massage එකක් යැවීමට.
            //        System.out.println("Port"+localSocket.getPort());
//        System.out.println("IP"+localSocket.getInetAddress());

//        InputStreamReader inputStreamReader = new InputStreamReader(localSocket.getInputStream());
//
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String ClientMsg = bufferedReader.readLine();
//
//        System.out.println("Client Masage :"+ClientMsg);
    }
}
