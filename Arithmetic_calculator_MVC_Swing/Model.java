
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Model {
	public String fonction () {
		    try {
      ServerSocket ss = new ServerSocket(2003);
      while(true) {
      Socket s = ss.accept();
      
  
      DataInputStream dis=new DataInputStream(s.getInputStream());

      textField.setText(textField.getText() + dis.readUTF());

      }
      } catch (IOException ie) {
        ie.printStackTrace();
      }
	}
 
	public String fonction1 (){
      try {
      ServerSocket s2 = new ServerSocket(2003);
      while(true) {
      Socket s1 = s2.accept();
      
  
      DataInputStream dis=new DataInputStream(s1.getInputStream());

      textField1.setText(textField1.getText() + dis.readUTF());

      }
      } catch (IOException ie) {
        ie.printStackTrace();
      }
		return dis.readUTF();
	}
		
		
//	try {
//        ServerSocket ss = new ServerSocket(56);
//        while(true) {
//        Socket s = ss.accept();
//        DataInputStream dis=new DataInputStream(s.getInputStream());
//        System.out.print(dis.readUTF());
//        }
//        } catch (IOException ie) {
//          ie.printStackTrace();
//          return "erreur";
//        }
//	

	}
}
