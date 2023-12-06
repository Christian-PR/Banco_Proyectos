/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package log_neg;

import acceso_datos.EmpresaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Empresa;

/**
 *
 * @author chris
 */
@Stateless
@LocalBean
public class LNEmpresa {

    @EJB
    private EmpresaFacade empresaFacade;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void registrar(Empresa em){
        empresaFacade.create(em);
    }
    
    public List<Empresa> empresas(){
        return empresaFacade.findAll();
    }
}
