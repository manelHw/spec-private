
public class Valve extends Thread {
	private Boolean _estOuverte;
	Bocal _mybocal;
	
	public 	Valve(Boolean estOuverte, Boolean estEnRupture,Bocal mybocal) {
		_estOuverte = estOuverte;
		_mybocal=mybocal;
	}	

	@Override
	public void run() {
			//this.ControleOrdre(bocal_index);
			System.out.println("RequeteValve : " + _mybocal.get_index() + _mybocal.get_type());
			System.out.println("OuvreValve : " + _mybocal.get_index() + _mybocal.get_type());
			System.out.println("RempliBocal: " + _mybocal.get_index() + _mybocal.get_type());
			System.out.println("FermeValve: " + _mybocal.get_index() + _mybocal.get_type());	
	}

	public Boolean get_estOuverte() {
		return _estOuverte;
	}

	public void set_estOuverte(Boolean _estOuverte) {
		this._estOuverte = _estOuverte;
	}


	
}
