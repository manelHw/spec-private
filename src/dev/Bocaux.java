package dev;

import java.util.ArrayList;
public class Bocaux {
	
	String type = "a";
	Integer N;
	Integer NEt;
	Integer Nv;
	

		
	private ArrayList<Bocal> _bocaux = new ArrayList<Bocal>();

	public Bocaux(Integer nBocaux, Integer nValves, 
			Integer nEtiqueteuses)
	{
		this.N = nBocaux;							
		
		// Créer N Bocaux
		for (Integer i = 0; i < N; i++)
		{									
			Bocal bocal = new Bocal(type, i,NEt,Nv);										
			
			_bocaux.add(bocal);									
		}									
	}	
	// Lancer le thread Bocal à partir de son index
	public void LancerBocal(int index)
	{	
		this._bocaux.get(index).start();
	}
	
	

}
