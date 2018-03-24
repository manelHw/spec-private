import java.util.ArrayList;
import java.util.Scanner;


public class Confiturerie {
	private static String[] Type = {"a", "b"};
	private static ArrayList<Bocal> _bocaux = new ArrayList<Bocal>();
	
	private static int N;
	private static int V;
	private static int E;
	// a voir comment inclure les ruptures ...
	//private static boolean rupture;
	
	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args){
		
		//Décision du nombre de bocaux de chaque type donc nbBocaux de chaques type
		System.out.println ("Entrer le nombre de Bocaux de chaque type : ");
		N = reader.nextInt();
		
		//Décision du nombre de valves de la manufacture
		System.out.println ("Entrer le nombre de valves : ");
		V = reader.nextInt();
		
		//Décision du nombre d'etiqueteusse de la manufacture
		System.out.println ("Entrer le nombre d'étiqueteuses : ");
		E = reader.nextInt();

		System.out.println ("Manufacture avec : " + N + " Bocaux de chaque types, " + V + " Valves et " + E + " Etiqueteusses.");
	
		
	for (int n = 0; n < N; n++) {
		for (String type : Type) {
		   
			Bocal bocal = new Bocal(type, n);
			Valve valve =new Valve(false,false,bocal);
			Etiquetage etiquetage =new Etiquetage(bocal);

			_bocaux.add(bocal);
			Bocal bocalelem=_bocaux.get(n);
			// Augmenter la priorite des Bocaux "a"
			bocalelem.setPriority(type == "a" ? 2 : 1);
			synchronized(bocal){

			bocal.run();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			synchronized(valve){
			valve.start();
			
			}
			
			synchronized(etiquetage){
			try {
			valve.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			etiquetage.start();
			} 

		} 
	}

}
}