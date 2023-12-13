/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package adm;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import log_neg.LNProyectosPasados;
import modelo.ProyectosPasados;

/**
 *
 * @author angel
 */
@Named(value = "controlProyectosPasados")
@SessionScoped
public class ControlProyectosPasados implements Serializable {

    @EJB
    private LNProyectosPasados lNProyectosPasados;
    
    private ProyectosPasados proyectosPasados;

    public ProyectosPasados getProyectosPasados() {
        return proyectosPasados;
    }

    public void setProyectosPasados(ProyectosPasados proyectosPasados) {
        this.proyectosPasados = proyectosPasados;
    }
    
    public void registrar(){
        lNProyectosPasados.registrar(proyectosPasados);
    }
    
    public void eliminar(){
        lNProyectosPasados.eliminar(proyectosPasados);
    }
    
    public  List<ProyectosPasados> getLista(){
        return  lNProyectosPasados.proyectosPasadosLista();
    }
 
    /**
     * Creates a new instance of ControlProyectosPasados
     */
    public ControlProyectosPasados() {
        
        proyectosPasados = new ProyectosPasados();
    }
    
}
