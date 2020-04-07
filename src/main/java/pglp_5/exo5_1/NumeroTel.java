package pglp_5.exo5_1;

import java.io.Serializable;

public class NumeroTel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String descriptif;
	private final String numero;
	
	public NumeroTel(final String descriptif, final String numero) {
		this.descriptif=descriptif;
		this.numero=numero;
	}

	public String getDescriptif() {
		return descriptif;
	}
		//recuperer le numero de telephone
	public String getNumero() {
		return numero;
	}
	//recuperer le descriptif et le numero
	public String toString(){
		return this.getDescriptif()+":"+this.getNumero();
	}
}