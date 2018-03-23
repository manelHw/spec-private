import java.util.ArrayList;


public class Confiturerie {
	private static String[] Type = {"a", "b"};
	private static int N = 2;
	private static ArrayList<Bocal> _bocaux = new ArrayList<Bocal>();
	public static void main(String[] args){
	for (int n = 0; n < N; n++) {
		for (String type : Type) {
		   
			Bocal bocal = new Bocal(type, n);
			Valve valve =new Valve(false,false,bocal);
			Etiquetage etiquetage =new Etiquetage(bocal);

			_bocaux.add(bocal);
			Bocal bocalelem=_bocaux.get(n);
			// Augmenter la priorite des Bocaux "a"
			bocalelem.setPriority(type == "a" ? 2 : 1);		
			bocal.run();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			valve.start();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			etiquetage.start();


		} 
	}

}
}