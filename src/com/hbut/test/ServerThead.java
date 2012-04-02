package com.hbut.test;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThead extends Thread{

	  
	  private Socket s;
    
	  public ServerThead(Socket s){
		  this.s = s;
	  }
	  @Override
 	  public void run() {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new PrintStream(s.getOutputStream());
			for (int i = 1; i <= 20; i++) {
				
				File file = new File("E:/pic/" + i +".jpg");
				InputStream is = new FileInputStream(file);
				int buf ;
				while((buf = is.read())!= -1){
					os.write(buf);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
