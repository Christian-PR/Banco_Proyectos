/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adm;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import log_neg.LNUsuario;
import modelo.Usuario;

/**
 *
 * @author chris
 */

@Named(value = "control_usuarios")
@SessionScoped
public class ControlUsuarios implements Serializable{

    @EJB
    private LNUsuario lNUsuario;

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void registrar(){
        lNUsuario.registrar(usuario);
    }
    
    public List<Usuario> getListar(){
        return lNUsuario.usuarios();
    }
    
    public ControlUsuarios() {
        usuario = new Usuario();
    }
    
    
    
}
