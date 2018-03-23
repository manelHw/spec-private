
public class Etiquetage extends Thread{
	Bocal _mybocal;

	public 	Etiquetage(Bocal mybocal) {

		_mybocal=mybocal;
	}
	@Override
	public void run() {
		
		
		System.out.println("Étiquetage Commencement : " + _mybocal.get_index() + _mybocal.get_type());
		System.out.println("Étiquetage Fini : " + _mybocal.get_index() + _mybocal.get_type());
				
	}
}
