package com.message;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.Interfaces.Network;
import com.StreamFlow.StreamFlow;


public class Messenger {
	
	private Message message;
	private Stream<String> messages;
	private StreamFlow streamFlow;
	
	public Messenger() {
		streamFlow = new StreamFlow();
		message = new Message();
		messages = new ArrayList<String>().stream();

	}
	
	public List<String> getMessage(List<Object> ObjNetworks){
		List<Network> networks = new ArrayList<Network>();
		for(Object obj: ObjNetworks) {
			if(obj instanceof Network) {
				Network network = (Network) obj;
				networks.add(network);
				messages = message.getMessage(networks).stream();
			}	
		}
		
		return streamFlow.process(messages);
	}
	
}
