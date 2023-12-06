/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package log_neg;

import acceso_datos.ProyectoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Proyecto;

/**
 *
 * @author chris
 */
@Stateless
@LocalBean
public class LNProyecto {

    @EJB
    private ProyectoFacade proyectoFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void registrar(Proyecto pf){
        proyectoFacade.create(pf);
    }
    
    public List<Proyecto> proyectos(){
        return proyectoFacade.findAll();
    }
    
}
