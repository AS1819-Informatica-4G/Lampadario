
public class Lampadina {
	public enum Stato { spento, acceso, rotto };
	public enum Colore { rosso, giallo, blu, bianco };
	
	private Stato stato;
	private Colore colore;
	private int numeroRottura;
	
	public Lampadina(Colore colore) {
		this.stato = Stato.spento;
		this.colore = colore;
		this.numeroRottura=(1+(int)(Math.random()*5));
	}
	
	public void switchOnOff( ) {
		switch (stato) {
		case acceso: 
			if (--this.numeroRottura <0) {
						stato=Stato.rotto;
			} else {
				stato=Stato.spento;
			}
			break;		
		case spento: 
			if (--this.numeroRottura <0) {
					stato=Stato.rotto;
			} else {
				stato=Stato.acceso;
			}
			break;
		case rotto:
			break;
		}
	}

	/**
	 * @return the stato
	 */
	public Stato getStato() {
		return stato;
	}

	/**
	 * @return the colore
	 */
	public Colore getColore() {
		return colore;
	}

	/**
	 * @return the numeroRottura
	 */
	public int getNumeroRottura() {
		return numeroRottura;
	}
	
	
	
}
