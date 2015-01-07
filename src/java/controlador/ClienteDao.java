package controlador;
import modelo.Cliente;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClienteDao {
    private Session session;
    public Cliente verificarDatos(Cliente cliente) throws Exception{
      Cliente us =null;
      try{
          session=HibernateUtil.getSessionFactory().openSession();
          String hql ="FROM Cliente WHERE Nombre_cliente='"+cliente.getNombreCliente()+"' "
                  +"and Id_Cliente= '"+cliente.getIdCliente() +" '";
          Query query = session.createQuery(hql);
          if(!query.list().isEmpty()){
              us = (Cliente) query.list().get(0);
          }
     }catch(Exception e){
        throw e;
    }
    return us;
}
    
}