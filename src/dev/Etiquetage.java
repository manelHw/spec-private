
public class Etiquetage extends Thread{
	Bocal _mybocal;

	public 	Etiquetage(Bocal mybocal) {

		_mybocal=mybocal;
	}
	@Override
	public void run() {
		
		System.out.println("Requete �tiquetage : " + _mybocal.get_index() + _mybocal.get_type());
		System.out.println("�tiquetage Commencement : " + _mybocal.get_index() + _mybocal.get_type());
		System.out.println("�tiquetage : " + _mybocal.get_index() + _mybocal.get_type());
		System.out.println("�tiquetage Termine : " + _mybocal.get_index() + _mybocal.get_type());
				
	}
}
