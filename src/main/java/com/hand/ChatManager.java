package com.hand;

import java.util.Vector;

public class ChatManager {
	
	private ChatManager(){}
	
	private static final ChatManager cm = new ChatManager();
	public static ChatManager getChatManager(){
		return cm;
	}

	
	Vector<ChatSocket> vecter = new Vector<ChatSocket>();
	
	public void add(ChatSocket cs){
		vecter.add(cs);
		
	}
	
	public void publish(ChatSocket cs,String out){
		for (int i = 0; i < vecter.size(); i++) {
			ChatSocket csChatSocket = vecter.get(i);
			if(!cs.equals(csChatSocket)){
				csChatSocket.out(out);
			}
			
		}
		
	}
	
	
}
