package dev;

import java.util.ArrayList;

public class Valve  {
	static int V ;
	Integer _index;
	Bocal _bocal;
	 Boolean _estDisponible=true;
	public static ArrayList<Valve> _valves = new ArrayList<Valve>();

 
//création des valves
	public 	Valve(Integer index ,Boolean estDisponible) {
		this._estDisponible=estDisponible;
		this._index=index;
		
		
		
	}
	
	public static void createValve(int nombreDeValve){
	V=nombreDeValve;
	for (int v = 0; v < V; v++) {
		Valve valve = new Valve(v, true);

		_valves.add(valve);

	}
}
	
	public static ArrayList<Valve> GetListeValve(){
		return _valves;
		
		
	}
}




