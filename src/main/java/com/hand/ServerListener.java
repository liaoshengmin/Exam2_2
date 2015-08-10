package com.hand;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

import com.hand.ChatSocket;

public class ServerListener extends Thread {
	
	@Override
	public void run() {
		
		try {
			//1-65535
			ServerSocket ssk = new ServerSocket(12345);
			
			//增添客户端的连接，阻塞的方法
			Socket sk=ssk.accept();
			//建立连接
			JOptionPane.showMessageDialog(null,"有客户端连接到了本机的12345端口");
			
			FileInputStream fis = new FileInputStream("SampleChapter1.pdf");
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
		    String line;
		    while((line = br.readLine())!=null){
			sk.getInputStream().read(line.getBytes("utf-8"));
			}
		    
		    ChatSocket cs = new ChatSocket(sk);
			cs.start();
			
			
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
