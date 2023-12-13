/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package log_neg;

import acceso_datos.ProyectosPasadosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.ProyectosPasados;

/**
 *
 * @author angel
 */
@Stateless
@LocalBean
public class LNProyectosPasados {

    @EJB
    private ProyectosPasadosFacade proyectosPasadosFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void registrar(ProyectosPasados pro){
        proyectosPasadosFacade.create(pro);
    }
    
    public void eliminar(ProyectosPasados pro){
        proyectosPasadosFacade.remove(pro);
    }
    
    public List<ProyectosPasados> proyectosPasadosLista(){
        return proyectosPasadosFacade.findAll();
    }
}
