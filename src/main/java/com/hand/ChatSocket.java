package com.hand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;



public class ChatSocket extends Thread {
	Socket socket;
	public ChatSocket(Socket s) {
		this.socket=s;
	}
	
	public void out(String out){
		try {
			 socket.getOutputStream().write(out.getBytes("utf-8"));
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void run() {
		
//		int count = 0;
//		while(true){
//			count++;
//			out("loop+"+count);
//			try {
//				sleep(500);
//				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		
//		try {
//			BufferedReader br = new BufferedReader(
//					new InputStreamReader(socket.getInputStream(), "utf-8"));
//			String line = null;
//			while((line = br.readLine())!=null){
//				ChatManager.getChatManager().publish(this,line);
//			}
//			br.close();
//			
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}

}

