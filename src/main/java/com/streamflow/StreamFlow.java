package com.streamflow;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.finder.FoodFinder;


public class StreamFlow {
	
	private FoodFinder foodFinder;
	
	public StreamFlow() {
		foodFinder= new FoodFinder();
	}
	
	public List<String> process(Stream<String> flow){

		return flow.filter( food -> foodFinder.filter(food)).collect(Collectors.toList()); 
	}
	
}
