// Client.java
import java.io.*;
import java.net.*;

class Practical27reciver {

  public static void main(String args[]) {
    int serverport = 6666;
    String address = "127.0.0.1";
    try {
      InetAddress ip = InetAddress.getByName(address);
      System.out.println("SERVER IP ADDRESS " + address);
      System.out.println("SERVER PORT " + serverport);
      Socket socket = new Socket(ip, serverport);
      InputStream sin = socket.getInputStream();
      OutputStream sout = socket.getOutputStream();
      DataInputStream in = new DataInputStream(sin);
      DataOutputStream out = new DataOutputStream(sout);

      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(is);
      String line = null;
      String msg = null;
      while (true) {
        line = br.readLine();
        if (line.equals("end")) {
          break;
        }
        out.writeUTF(line);
        out.flush();
        msg = in.readUTF();
        System.out.println("DATA RECEIVED FROM SERVER " + msg);
      }
    } catch (IOException e) {
      System.out.println("EXCEPTION OCCURRED………");
    }
  }
}