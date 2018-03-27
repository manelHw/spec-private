package dev;
public class Valve  {
	private Boolean _estOuverte;
	Bocal _mybocal;
	
	public 	Valve(Boolean estOuverte, Boolean estEnRupture,Bocal mybocal) {
		_estOuverte = estOuverte;
		_mybocal=mybocal;
	}	


	public Boolean get_estOuverte() {
		return _estOuverte;
	}

	public void set_estOuverte(Boolean _estOuverte) {
		this._estOuverte = _estOuverte;
	}


	
}
