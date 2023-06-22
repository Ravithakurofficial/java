import java.io.*;
import java.net.*;
class Practical27server
{
    public static void main(String args[])
    {
        int port=6666;
        try
        {
            ServerSocket ss=new ServerSocket(port);
            System.out.println("WAITING FOR CLIENT ");
            Socket socket=ss.accept();
            System.out.println("GOT A CLIENT ");
            InputStream sin=socket.getInputStream();
            OutputStream sout=socket.getOutputStream();
            DataInputStream in=new DataInputStream(sin);
            DataOutputStream out=new DataOutputStream(sout);
            String line=null;
            while(true)
            {
                line=in.readUTF();
                System.out.println("LINE RECEIVED FROM CLIENT "+line);
                System.out.println("SENDING LINE BACK....");
                out.writeUTF(line);
                out.flush();
                System.out.println("WAITING FOR ANOTHER LINE");
            }
        }
        catch(IOException e)
        {
            System.out.println("EXCEPTION OCCURRED………");
        }
    }
}