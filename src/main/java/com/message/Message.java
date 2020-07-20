package com.message;
import java.util.ArrayList;
import java.util.List;

import com.Interfaces.Network;


public class Message {
		
	public Message() {}
	
	public List<String> getMessage(List<Network> networks){
		List<String> messages = new ArrayList<String>();
		for(Network network : networks) {
			messages.addAll(network.get());
		}
		return messages;		
	}

}
