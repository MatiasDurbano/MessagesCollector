package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.StreamFlow.StreamFlow;
import com.message.MessagesCollector;
import com.message.MessagesCollectorImpl;

class test1 {

	@Test
	void objectsInvalid() {
		List<Object> objs = new ArrayList<Object>();
		objs.add("invalido");
		objs.add(1);
		
		MessagesCollector collector = new MessagesCollectorImpl();
		assertTrue(collector.getMessages(objs).size() == 0);
	}
	
	@Test
	void messagesFiltered() {
		List<String> msgs = new ArrayList<String>();
		msgs.add("empanada de humita");
		msgs.add("dasdsadsadadsa");
		msgs.add("empanada de choclo");
		msgs.add("emppppp aaaadddddddd");
		
		Stream<String> msgStream= msgs.stream();
			
		StreamFlow streamFlow =new StreamFlow();
		List<String> filtered = streamFlow.process(msgStream);
		assertTrue(filtered.size()==2);
		
		assertEquals("empanada de humita", filtered.get(0));
		assertEquals("empanada de choclo", filtered.get(1));
			
		
		
	}

}
