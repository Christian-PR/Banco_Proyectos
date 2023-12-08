/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package log_neg;

import acceso_datos.UsuarioFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Usuario;

/**
 *
 * @author chris
 */
@Stateless
@LocalBean
public class LNUsuario {

    @EJB
    private UsuarioFacade usuarioFacade;

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void registrar(Usuario u){
        usuarioFacade.create(u);
    }
    
    public List<Usuario> usuarios(){
        return usuarioFacade.findAll();
    }
    
     public Usuario usuarioLog(String name, String pass){
        return usuarioFacade.usuario(name,pass);
    }
}
