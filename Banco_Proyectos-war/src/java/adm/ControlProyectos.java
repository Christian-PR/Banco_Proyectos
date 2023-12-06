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
import log_neg.LNProyecto;
import modelo.Proyecto;


/**
 *
 * @author chris
 */
@Named(value = "control_proyectos")
@SessionScoped
public class ControlProyectos implements Serializable{

    @EJB
    private LNProyecto lNProyecto;
    
    private Proyecto proyecto;

    
    
    private String nombre = "";
    private String empresa="";
    private String telefono="";
    private String correo="";
    private int residentes;
    
    private int minRes=1;
    private int maxRes=5;

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }


    public void registrar(){
        lNProyecto.registrar(proyecto);
    }
    
    public void eliminar(Proyecto p){
        lNProyecto.eliminar(p);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getResidentes() {
        return residentes;
    }

    public void setResidentes(int residentes) {
        this.residentes = residentes;
    }

    public int getMinRes() {
        return minRes;
    }

    

    public int getMaxRes() {
        return maxRes;
    }

    public List<Proyecto> getListar(){
        return lNProyecto.proyectos();
    }

    public ControlProyectos() {
        proyecto=new Proyecto();
    }

    
    
}
