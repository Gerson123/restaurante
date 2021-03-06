package modelo;
// Generated 06/01/2015 02:52:24 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="cliente"
    ,catalog="restaurant"
)
public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private String nombreCliente;
     private Boolean apellidoCliente;
     private Float cuentaCliente;
     private Integer nroMesa;
     private String direccion;
     private Integer edadCliente;

    public Cliente() {
    }

	
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Cliente(int idCliente, String nombreCliente, Boolean apellidoCliente, Float cuentaCliente, Integer nroMesa, String direccion, Integer edadCliente) {
       this.idCliente = idCliente;
       this.nombreCliente = nombreCliente;
       this.apellidoCliente = apellidoCliente;
       this.cuentaCliente = cuentaCliente;
       this.nroMesa = nroMesa;
       this.direccion = direccion;
       this.edadCliente = edadCliente;
    }
   
     @Id 

    
    @Column(name="Id_Cliente", unique=true, nullable=false)
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    @Column(name="Nombre_cliente", length=20)
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    
    @Column(name="Apellido_cliente")
    public Boolean getApellidoCliente() {
        return this.apellidoCliente;
    }
    
    public void setApellidoCliente(Boolean apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    
    @Column(name="Cuenta_cliente", precision=12, scale=0)
    public Float getCuentaCliente() {
        return this.cuentaCliente;
    }
    
    public void setCuentaCliente(Float cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

    
    @Column(name="Nro_mesa")
    public Integer getNroMesa() {
        return this.nroMesa;
    }
    
    public void setNroMesa(Integer nroMesa) {
        this.nroMesa = nroMesa;
    }

    
    @Column(name="direccion", length=20)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="edad_cliente")
    public Integer getEdadCliente() {
        return this.edadCliente;
    }
    
    public void setEdadCliente(Integer edadCliente) {
        this.edadCliente = edadCliente;
    }




}


