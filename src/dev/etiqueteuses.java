package dev;

import java.util.ArrayList;

public class etiqueteuses {
	private ArrayList<Etiquetage> _etiqueteuses = new ArrayList<Etiquetage>();

	private Integer E;
	public etiqueteuses(Integer nEtiqueuses)
	{
		this.E = nEtiqueuses;							

		// Créer E Etiqueteuses
		for (Integer i = 0; i < E; i++)
		{									
			Etiquetage etiquetage = new Etiquetage(i);										
			
			_etiqueteuses.add(etiquetage);									
		}				
		
	}	
	
}
