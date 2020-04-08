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
	
	/* @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
	        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
	        return result;
	    }*/
	   
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        NumeroTel other = (NumeroTel) obj;
	        if (descriptif == null) {
	            if (other.descriptif != null)
	                return false;
	        } else if (!descriptif.equals(other.descriptif))
	            return false;
	        if (numero == null) {
	            if (other.numero != null)
	                return false;
	        } else if (!numero.equals(other.numero))
	            return false;
	        return true;
	    }
}