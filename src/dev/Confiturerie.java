package dev;

import java.util.ArrayList;
public class Confiturerie {
	private static String[] Type = {"A", "B"};
	private static int N;
	private static int V;

	private Integer i;
	private static ArrayList<Bocal> _bocaux = new ArrayList<Bocal>();

	//Pour l'instant le programme ne prends pas ncore en considération nombre d'étiqueteuses
	
	public Confiturerie(Integer nBocaux, Integer nValves, 
			Integer nEtiqueteuses) 
	{										
		this.N = nBocaux;
		this.V=nValves;
	}		
	
	public void start(){
		//Générer la liste des valves
	GenererListeValves(V);
		//Générer les bocaux
	CreateBocaux(N);
	}
	private ArrayList<Valve> GenererListeValves(int nombreValve) {
		Valve.createValve(nombreValve);
		return Valve.GetListeValve();
	}

	void CreateBocaux(int nombreBocaux){
		for (int n = 0; n < N; n++) {
			for (String type : Type) {
				Bocal bocal = new Bocal(type, n,Valve.GetListeValve());

				_bocaux.add(bocal);
		
				Bocal.commencer();	
			} 

		}	
	}
	
	
	
	/*private int VerifiValveDisponible(Bocal b) {
		// TODO Auto-generated method stub
		int indexvalve = 0;

		   for(int j = 0;j< nv;j++ ){

			   if(valve._estDisponible){
					valve._estDisponible=true;
					indexvalve = j;
					valve._estDisponible=false;

			   }
			   else{
					valve._estDisponible=false;
					indexvalve = j+1;
			   }
		   }
		return indexvalve;
		
	}	
	*/
	
		}

