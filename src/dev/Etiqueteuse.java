package dev;

import java.util.ArrayList;

public class Etiqueteuse {
	Integer _index;
	 static int E ;
	 Boolean _estDisponible=true;

	public static ArrayList<Etiqueteuse> _etiquteuses = new ArrayList<Etiqueteuse>();


	public 	Etiqueteuse(Integer index,Boolean estDisponible) {

		this._index=index;
		this._estDisponible = estDisponible;
	}
	

	
	public static ArrayList<Etiqueteuse> getListeValves(){

		for (int e = 0; e < E; e++) {
			Etiqueteuse etiquteuse = new Etiqueteuse(e, true);

			_etiquteuses.add(etiquteuse);

		}
		return _etiquteuses;
	}
	
}
