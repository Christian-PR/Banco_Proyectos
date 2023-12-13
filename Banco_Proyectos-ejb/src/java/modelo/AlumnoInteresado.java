/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "ALUMNO_INTERESADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlumnoInteresado.findAll", query = "SELECT a FROM AlumnoInteresado a"),
    @NamedQuery(name = "AlumnoInteresado.findById", query = "SELECT a FROM AlumnoInteresado a WHERE a.id = :id"),
    @NamedQuery(name = "AlumnoInteresado.findByNumeroControl", query = "SELECT a FROM AlumnoInteresado a WHERE a.numeroControl = :numeroControl"),
    @NamedQuery(name = "AlumnoInteresado.findByContrasena", query = "SELECT a FROM AlumnoInteresado a WHERE a.contrasena = :contrasena"),
    @NamedQuery(name = "AlumnoInteresado.findByNombre", query = "SELECT a FROM AlumnoInteresado a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "AlumnoInteresado.findBySemestre", query = "SELECT a FROM AlumnoInteresado a WHERE a.semestre = :semestre"),
    @NamedQuery(name = "AlumnoInteresado.findByIdProyecto", query = "SELECT a FROM AlumnoInteresado a WHERE a.idProyecto = :idProyecto")})
public class AlumnoInteresado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NUMERO_CONTROL")
    private String numeroControl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEMESTRE")
    private int semestre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PROYECTO")
    private int idProyecto;

    public AlumnoInteresado() {
    }

    public AlumnoInteresado(Integer id) {
        this.id = id;
    }

    public AlumnoInteresado(Integer id, String numeroControl, String contrasena, String nombre, int semestre, int idProyecto) {
        this.id = id;
        this.numeroControl = numeroControl;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.semestre = semestre;
        this.idProyecto = idProyecto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlumnoInteresado)) {
            return false;
        }
        AlumnoInteresado other = (AlumnoInteresado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AlumnoInteresado[ id=" + id + " ]";
    }
    
}
