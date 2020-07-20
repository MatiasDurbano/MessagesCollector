package com.message;
import java.util.List;

public class MessageCollectorImpl implements MessageCollector{
	
	Messenger messenger;
	
	public MessageCollectorImpl() {
		messenger = new Messenger();
	}
	
	public List<String> getMessages(List<Object> networks) {
		return messenger.getMessage(networks);
	}

	
	
}
