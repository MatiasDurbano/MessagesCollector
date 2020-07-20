package com.Finder;

import java.util.ArrayList;
import java.util.List;

public class FoodFinder implements Finder {
	
	private List<String> filters;
	
	public FoodFinder() {
		
		// se podria implementar para que levante un determindo filtro
		// de un archivo properties
		filters = new ArrayList<String>();
		filters.add("empanada");
	}

	public boolean filter(String food) {
		for(String filter : filters) {
			return food.contains(filter);
		}
		return false;
	
	}

}
