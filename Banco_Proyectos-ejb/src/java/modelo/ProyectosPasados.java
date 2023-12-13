/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "PROYECTOS_PASADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProyectosPasados.findAll", query = "SELECT p FROM ProyectosPasados p"),
    @NamedQuery(name = "ProyectosPasados.findByIdProyecto", query = "SELECT p FROM ProyectosPasados p WHERE p.idProyecto = :idProyecto"),
    @NamedQuery(name = "ProyectosPasados.findByNombreProyecto", query = "SELECT p FROM ProyectosPasados p WHERE p.nombreProyecto = :nombreProyecto"),
    @NamedQuery(name = "ProyectosPasados.findByEmpresa", query = "SELECT p FROM ProyectosPasados p WHERE p.empresa = :empresa"),
    @NamedQuery(name = "ProyectosPasados.findByTelefono", query = "SELECT p FROM ProyectosPasados p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "ProyectosPasados.findByCorreo", query = "SELECT p FROM ProyectosPasados p WHERE p.correo = :correo"),
    @NamedQuery(name = "ProyectosPasados.findByNumeroResidentes", query = "SELECT p FROM ProyectosPasados p WHERE p.numeroResidentes = :numeroResidentes"),
    @NamedQuery(name = "ProyectosPasados.findByNumeroControlAlumno", query = "SELECT p FROM ProyectosPasados p WHERE p.numeroControlAlumno = :numeroControlAlumno")})
public class ProyectosPasados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROYECTO")
    private Integer idProyecto;
    @Size(max = 50)
    @Column(name = "NOMBRE_PROYECTO")
    private String nombreProyecto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMPRESA")
    private String empresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CORREO")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_RESIDENTES")
    private int numeroResidentes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUMERO_CONTROL_ALUMNO")
    private String numeroControlAlumno;

    public ProyectosPasados() {
    }

    public ProyectosPasados(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public ProyectosPasados(Integer idProyecto, String empresa, String telefono, String correo, int numeroResidentes, String numeroControlAlumno) {
        this.idProyecto = idProyecto;
        this.empresa = empresa;
        this.telefono = telefono;
        this.correo = correo;
        this.numeroResidentes = numeroResidentes;
        this.numeroControlAlumno = numeroControlAlumno;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
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

    public int getNumeroResidentes() {
        return numeroResidentes;
    }

    public void setNumeroResidentes(int numeroResidentes) {
        this.numeroResidentes = numeroResidentes;
    }

    public String getNumeroControlAlumno() {
        return numeroControlAlumno;
    }

    public void setNumeroControlAlumno(String numeroControlAlumno) {
        this.numeroControlAlumno = numeroControlAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectosPasados)) {
            return false;
        }
        ProyectosPasados other = (ProyectosPasados) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ProyectosPasados[ idProyecto=" + idProyecto + " ]";
    }
    
}
