package dev;

import java.util.ArrayList;

public class Bocal extends Thread {
	
	private static  String _type;
	private  static Integer _noEtiqueteuse;
	private  static Integer nombreDeValve;
	private static  Integer _noValve;
	private static Integer _index;
	public static Boolean stockepuisé = false;
	public static Boolean enAttenteDeRemplissage = true;
	public static Boolean estplein = false;
	public static Boolean estetiquete = false;
	private static Integer index_valve;
	private static ArrayList<Valve> _listevalves;

	public Bocal(String type, Integer index,ArrayList<Valve>valves ) {
		_type = type;
		_index = index;
		_listevalves=valves;
		
	}

	@Override
	public void run() {
		
		Bocal.commencer();	
	
	}
	
	public static void commencer() 
	{
		System.out.println("debut : " + _index + _type );
		requetteValve(_listevalves);
        controleEtiquetage();
	}
	

	public static void requetteValve(ArrayList<Valve>v) {
		v=_listevalves;

		//passer la liste des valves
			System.out.println("requete Valve pour bocal : " + _index +" "+ _type +  " à la valve " + _noValve);

		//chercher parmis la liste des valves une valve disponible
			//cette méthode boucle et ne prend pas en concidération le nombre maximum des valves
		_noValve=TrouverValveDisponible(_listevalves);
		}
	
	private static Integer TrouverValveDisponible(ArrayList<Valve>v) {
		v=_listevalves;
		int nombreValve = v.size();
		int valve=0 ;
		
			if(_listevalves.get(valve)._estDisponible){
				index_valve=valve;
				_listevalves.get(valve)._estDisponible=false;
				return index_valve;
			}
						
		return index_valve=index_valve+1;	
		}
			
			
	
	private static void controleEtiquetage() {
		//Ajouter condition si etiqueteuse disponible et bocal plein
		commenceEtiquetage();
		//sinon attendre jusqu'a ce qu'une étiqueteuse soit libérer
	}
	
	static void commncerRemplissage() {
			ouvreValve();
			RempliBocal();
			fermeValve();
	}

	public static void RempliBocal() 
	{
		if(stockepuisé){
			ravitaillement();
			remplissage();
		}
		remplissage();
		finRemplissage();	
	}
	
	public static void ouvreValve() {
		System.out.println("ouvre valve pour bocal : " + _index +" "+ _type + " à la valve " + _noValve);
		try {
			Bocal.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void remplissage() {
		System.out.println("Remplit bocal : " + _index +" "+ _type + " à la valve " + _noValve);
		try {
			Bocal.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void ravitaillement() {
		System.out.println("ravitaillement pour bocal : " + _index +" "+ _type + " à la valve " + _noValve);
		try {
			Bocal.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void finRemplissage() {
		System.out.println("fin de remplissage de bocal : " + _index +" "+ _type + " à la valve " + _noValve);
	}

	public static void fermeValve() {
		System.out.println("ferme valve pour bocal : " + _index +" "+ _type);
		estplein=true;
		try {
			Bocal.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void commenceEtiquetage() {
		
			System.out.println("commencement de l'étiquetage de bocal : " + _index +" "+ _type + " à l'étiqueteuse " + _noEtiqueteuse);
			etiquetage();
			finEtiquetage();
		}
		
	
	
	public static void etiquetage() {
		System.out.println("Étiquetage du bocal : " + _index +" "+ _type + " à l'étiqueteuse " + _noEtiqueteuse);
		try {
			Bocal.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void finEtiquetage() {
		System.out.println("fin de l'étiquetage de bocal : " + _index +" "+ _type + " à l'étiqueteuse " + _noEtiqueteuse);
	}

	public synchronized String get_type() {
		return _type;
	}
	public synchronized void set_type(String _type) {
		this._type = _type;
	}
	public synchronized Integer get_index() {
		return _index;
	}
	public synchronized void set_index(int _index) {
		this._index = _index;
	}
	public synchronized Integer get_novalve() {
		return _noValve;
	}
	public synchronized void set_novalve(int _index) {
		this._noValve = _noValve;
	}
}
