package dev;


public class Bocal extends Thread {
	
	private static  String _type;
	private  static Integer _noEtiqueteuse;
	private static  Integer _noValve;

	private static Integer _index;

	public static Boolean stockepuisé = false;
	public static Boolean enAttenteDeRemplissage = true;

	public static Boolean estplein = false;
	public static Boolean estetiquete = false;


	public Bocal(String type, Integer index ,Integer noEtiqueteuse, Integer noValve ) {
		_type = type;
		_index = index;
		_noEtiqueteuse=noEtiqueteuse;
		_noValve=noValve;
	}

	@Override
	public void run() {
		
		Bocal.commencer();	
	}
	
	public static void commencer() 
	{
		System.out.println("debut : " + _index + _type );
		requetteValve();
        controleValve(_type);
        controleEtiquetage();
	}
	

	public static void requetteValve() {
		System.out.println("requete Valve pour bocal : " + _index +" "+ _type +  " à la valve " + _noValve);
	}
	private static void controleValve(String _type2) {
		if (_type =="A" ){
			commncerRemplissage();
			enAttenteDeRemplissage=false;
		}
		enAttenteDeRemplissage=true;
		
	}
	private static void controleEtiquetage() {
		commenceEtiquetage();
	}

	private static void commncerRemplissage() {
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
		if(estplein==true){
			System.out.println("commencement de l'étiquetage de bocal : " + _index +" "+ _type + " à l'étiqueteuse " + _noEtiqueteuse);
			etiquetage();
			finEtiquetage();
		}
		
		estetiquete=true;
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
}
