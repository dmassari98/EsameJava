package Esame;

public abstract class Pacco {
	
	protected String mittente, dest;
	protected float costo;
	
	public Pacco(String mittente, String dest, float costo) {
		this.mittente=mittente;
		this.dest=dest;
		this.costo=costo;
	}
	
	public abstract String getInfo();
}
