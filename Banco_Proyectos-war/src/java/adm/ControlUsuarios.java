/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adm;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import log_neg.LNUsuario;
import modelo.Usuario;

/**
 *
 * @author chris
 */
@Named(value = "control_usuarios")
@SessionScoped
public class ControlUsuarios implements Serializable {

    @EJB
    private LNUsuario lNUsuario;

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void registrar() {
        lNUsuario.registrar(usuario);
    }

    public List<Usuario> getListar() {
        return lNUsuario.usuarios();
    }

    public ControlUsuarios() {
        usuario = new Usuario();
    }

    public String log() {
        String us = usuario.getNombreUsuario();
        String pass = usuario.getContrasenia();
        FacesMessage mensaje;
        if (lNUsuario.usuarioLog(us, pass) != null) {
            return "index";
        }
        mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuario no encontrado");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
        return "login";

    }
    
     public void validarU(FacesContext context, UIComponent toValidate, Object value) {
        String usuario = (String) value;
        FacesMessage mensaje;
        if (usuario.length() == 0) {
            mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "info", "Ingrese un usuario valido");
            context.addMessage(toValidate.getClientId(context), mensaje);
            ((UIInput) toValidate).setValid(false);
            return;
        }
    }

    public void validarP(FacesContext context, UIComponent toValidate, Object value) {
        String pass = (String) value;
        FacesMessage mensaje;
        if (pass.length() < 5) {
            mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "info", "Ingrese una contraseña valida");
            context.addMessage(toValidate.getClientId(context), mensaje);
            ((UIInput) toValidate).setValid(false);
        }
    }
}
