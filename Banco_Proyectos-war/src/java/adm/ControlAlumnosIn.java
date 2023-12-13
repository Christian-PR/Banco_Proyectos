/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package adm;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import log_neg.LNAlumnoIn;
import modelo.AlumnoInteresado;


/**
 *
 * @author chris
 */
@Named(value = "control_alumnosIn")
@SessionScoped
public class ControlAlumnosIn implements Serializable {

    @EJB
    private LNAlumnoIn lNAlumnoIn;
    
    private AlumnoInteresado ai;

    public AlumnoInteresado getAi() {
        return ai;
    }

    public void setAi(AlumnoInteresado ai) {
        this.ai = ai;
    }

    public void registrar(){
        lNAlumnoIn.registrar(ai);
    }
    
    public void eliminar(AlumnoInteresado a){
        lNAlumnoIn.eliminar(a);
    }
    
    
    public List<AlumnoInteresado> getListar(){
        return lNAlumnoIn.alumnos();
    }
    
    /**
     * Creates a new instance of ControlAlumnosIn
     */
    public ControlAlumnosIn() {
        ai = new AlumnoInteresado();
    }
    
}
