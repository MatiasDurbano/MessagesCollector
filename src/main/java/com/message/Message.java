package com.message;
import java.util.ArrayList;
import java.util.List;

import com.Interfaces.Network;


public class Message {
		
	public Message() {}
	
	public List<String> getMessage(List<Network> networks){
		List<String> messages = new ArrayList<String>();
		System.out.println("Cantidad de redes a consultar: "+ networks.size());
		for(Network network : networks) {
			messages.addAll(network.get());
		}
		return messages;		
	}

}
