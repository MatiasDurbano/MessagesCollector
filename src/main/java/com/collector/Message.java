package com.collector;
import java.util.ArrayList;
import java.util.List;

import com.interfaces.Network;


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
