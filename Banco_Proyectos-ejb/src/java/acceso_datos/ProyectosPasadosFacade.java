/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso_datos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.ProyectosPasados;

/**
 *
 * @author angel
 */
@Stateless
public class ProyectosPasadosFacade extends AbstractFacade<ProyectosPasados> {

    @PersistenceContext(unitName = "Banco_Proyectos-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProyectosPasadosFacade() {
        super(ProyectosPasados.class);
    }
    
}
