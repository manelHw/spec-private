package dev;

import java.util.ArrayList;
import java.util.Scanner;
public class Confiturerie {
	private static String[] Type = {"A", "B"};
	private static ArrayList<Bocal> _bocaux = new ArrayList<Bocal>();
	
	private static int N;
	private static int nv;
	private static int ne;
	Bocaux bocaux;
	// a voir comment inclure les ruptures ...
	//private static boolean rupture;
	
	public Confiturerie(Integer nBocaux, Integer nValves, 
			Integer nEtiqueteuses) 
	{										
		this.N = nBocaux;
		Confiturerie.nv = nValves;
		Confiturerie.ne = nEtiqueteuses;
		
		bocaux = new Bocaux(nBocaux, nValves, nEtiqueteuses);					
	}		
	public void start(){
				
			
		for (int n = 0; n < N; n++) {
			for (String type : Type) {
			   
				Bocal bocal = new Bocal(type, n,ne,nv);

				_bocaux.add(bocal);
		
				Bocal.commencer();								


			} 
		}
					
							
					
			
			
	}		
		}

