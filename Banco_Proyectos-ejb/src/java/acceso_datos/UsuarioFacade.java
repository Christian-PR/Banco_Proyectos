/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso_datos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import modelo.Usuario;

/**
 *
 * @author chris
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "Banco_Proyectos-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario usuario(String usuario, String contrasenia){
        try{
         TypedQuery<Usuario> consulta = em.createQuery(
                 "SELECT u FROM Usuario u WHERE u.nombreUsuario = :user and u.contrasenia = :contrasenia", Usuario.class);
         consulta.setParameter("user", usuario);
         consulta.setParameter("contrasenia",contrasenia);
            return consulta.getSingleResult();
        }catch(NoResultException e){
            return null;
        }
    }
}
