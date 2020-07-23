package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.collector.MessagesCollector;
import com.collector.MessagesCollectorImpl;
import com.streamflow.StreamFlow;

class test1 {
	
	@Test
	void test() {
		List<String> msgs = new ArrayList<String>();
		msgs.add("empanada de humita");
		msgs.add("nada que ver");
		msgs.add("empanada de choclo");
		msgs.add("zip");
		
		Stream<String> msgStream= msgs.stream();
			
		StreamFlow streamFlow =new StreamFlow();
		List<String> filtered = streamFlow.process(msgStream);
		assertTrue(filtered.size()==2);
		
		assertEquals("empanada de humita", filtered.get(0));
		assertEquals("empanada de choclo", filtered.get(1));
	}

}
