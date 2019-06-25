package entidades;
// Generated 24/06/2019 10:14:04 AM by Hibernate Tools 4.3.1



/**
 * MascotaporclienteId NIL CARDENAS
 */
public class MascotaporclienteId  implements java.io.Serializable {


     private int idMascota;
     private int idCliente;

    public MascotaporclienteId() {
    }

    public MascotaporclienteId(int idMascota, int idCliente) {
       this.idMascota = idMascota;
       this.idCliente = idCliente;
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MascotaporclienteId) ) return false;
		 MascotaporclienteId castOther = ( MascotaporclienteId ) other; 
         
		 return (this.getIdMascota()==castOther.getIdMascota())
 && (this.getIdCliente()==castOther.getIdCliente());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdMascota();
         result = 37 * result + this.getIdCliente();
         return result;
   }   


}


