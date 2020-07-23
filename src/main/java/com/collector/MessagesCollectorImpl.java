package com.collector;
import java.util.List;

public class MessagesCollectorImpl implements MessagesCollector{
	
	Messenger messenger;
	
	public MessagesCollectorImpl() {
		messenger = new Messenger();
	}
	
	public List<String> getMessages(List<Object> networks) {
		return messenger.getMessage(networks);
	}

	
	
}
