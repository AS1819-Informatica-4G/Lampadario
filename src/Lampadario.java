
public class Lampadario {

	private Lampadina[] lampadario;
	private int nLampadine;
		
	
	
	public Lampadario(int nLampadine, Lampadina.Colore c) {
		this.nLampadine = nLampadine;
		lampadario=new Lampadina[nLampadine];
		for (int i=0;i<lampadario.length; i++ ) {
			lampadario[i]=new Lampadina(c);
		}
	}


    public void AccendiSpegni() {
    	for (int i=0;i<lampadario.length; i++ ) {
			lampadario[i].switchOnOff();
		}
    }
    public void Stato() {
    	for (int i=0;i<lampadario.length; i++ ) {
		   System.out.println(lampadario[i].getStato());
		}
    }


	public static void main(String[] args) {
		
		Lampadario l=new Lampadario(5, Lampadina.Colore.rosso);
	
		l.AccendiSpegni();
		l.Stato();
			System.out.println("-------------------");
		l.AccendiSpegni();
		l.Stato();
		System.out.println("-------------------");
		l.AccendiSpegni();
		l.Stato();
		System.out.println("-------------------");
		l.AccendiSpegni();
		l.Stato();
		System.out.println("-------------------");
		l.AccendiSpegni();
		l.Stato();
		System.out.println("-------------------");
		l.AccendiSpegni();
		l.Stato();
		System.out.println("-------------------");
		l.AccendiSpegni();
		l.Stato();
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	

}
