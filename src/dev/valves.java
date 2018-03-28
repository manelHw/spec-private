package dev;

import java.util.ArrayList;

public class valves {
	private ArrayList<Valve> _valves = new ArrayList<Valve>();

	private Integer V;
	public valves(Integer nValves)
	{
		this.V = nValves;							

		// Créer V valves
		for (Integer i = 0; i < V; i++)
		{									
			Valve valve = new Valve(i);										
			
			_valves.add(valve);									
		}				
		
	}	
	
}