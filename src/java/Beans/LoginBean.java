package Beans;
import controlador.ClienteDao;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import modelo.Cliente;


@Named
@RequestScoped
public class LoginBean {
    @Inject
    private Cliente cliente;
 
    public LoginBean() {
    }
    public String verificarDatos()throws Exception{
        ClienteDao clienDAO= new ClienteDao();
        Cliente us;
       
    try{
            us= clienDAO.verificarDatos(this.cliente);
            if(us!=null){
                FacesContext.getCurrentInstance()
                    .getExternalContext().getSessionMap().put("cliente",us);
                return "/welcomePrimefaces?faces-redirect=true";
             }else{
                FacesContext context= FacesContext.getCurrentInstance();
                FacesMessage mensagem= new FacesMessage("Nombre_Cliente y/o id_cliente incorrectos!");
                mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
                context.addMessage(null, mensagem);
            }
         }catch(Exception e){
             throw e;
         }
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    

}