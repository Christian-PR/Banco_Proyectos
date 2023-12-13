/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package log_neg;

import acceso_datos.AlumnoInteresadoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.AlumnoInteresado;

/**
 *
 * @author chris
 */
@Stateless
@LocalBean
public class LNAlumnoIn {

    @EJB
    private AlumnoInteresadoFacade alumnoInteresadoFacade;

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void registrar(AlumnoInteresado em){
        alumnoInteresadoFacade.create(em);
    }
    
    public List<AlumnoInteresado> alumnos(){
        return alumnoInteresadoFacade.findAll();
    }
    
    public void eliminar(AlumnoInteresado em){
        alumnoInteresadoFacade.remove(em);
    }
}
