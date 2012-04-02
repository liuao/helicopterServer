package com.hbut.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HelicopterServer  {

      public static void main(String[] args) {
         try {
			ServerSocket ss = new ServerSocket(9348);
			while(true)
			{
			Socket socket = ss.accept();
			new ServerThead(socket).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
}
