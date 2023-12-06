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
import log_neg.LNEmpresa;
import modelo.Empresa;

/**
 *
 * @author chris
 */

@Named(value = "control_empresas")
@SessionScoped
public class ControlEmpresas implements Serializable {

    @EJB
    private LNEmpresa lNEmpresa;

    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void registrar(){
        lNEmpresa.registrar(empresa);
    }
    
    public List<Empresa> getListar(){
        return lNEmpresa.empresas();
    }
    
    public ControlEmpresas() {
        empresa= new Empresa();
    }
 
    
    
}
