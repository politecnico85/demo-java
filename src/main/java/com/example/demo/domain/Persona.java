package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CL_PERSONAS")
public class Persona {
    private Integer IdPersona;
    private String Apellido1;
    private String Apellido2;
    private String Nombres;
    private String NombreCompleto;
    private String Identificacion;
    private String TipoPersona;
    private String Estado;
    private Date FechaInactivo;
    private Date FechaInscripcion;
    private String IdIdentificacion;
    private String IdClasePersona;
    private String SeparacionBien;
    private Integer GrupoEmpresarial;

    public Persona(){

    }

    @Id
    @Column(name="ID_PERSONA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(Integer idPersona) {
        IdPersona = idPersona;
    }

    @Column(name="APELLIDO1")
    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    @Column(name="APELLIDO2")
    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    @Column(name="NOMBRES")
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    @Column(name="NOMBRE_COMPLETO")
    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    @Column(name="IDENTIFICACION")
    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    @Column(name="TIPO_PERSONA")
    public String getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        TipoPersona = tipoPersona;
    }

    @Column(name="ESTADO")
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Column(name="FECHA_INACTIVO")
    public Date getFechaInactivo() {
        return FechaInactivo;
    }

    public void setFechaInactivo(Date fechaInactivo) {
        FechaInactivo = fechaInactivo;
    }

    @Column(name="FECHA_INSCRIPCION")
    public Date getFechaInscripcion() {
        return FechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        FechaInscripcion = fechaInscripcion;
    }

    @Column(name="ID_IDENTIFICACION")
    public String getIdIdentificacion() {
        return IdIdentificacion;
    }

    public void setIdIdentificacion(String idIdentificacion) {
        IdIdentificacion = idIdentificacion;
    }

    @Column(name="ID_CLASE_PERSONA")
    public String getIdClasePersona() {
        return IdClasePersona;
    }

    public void setIdClasePersona(String idClasePersona) {
        IdClasePersona = idClasePersona;
    }

    @Column(name="SEPARACION_BIEN")
    public String getSeparacionBien() {
        return SeparacionBien;
    }

    public void setSeparacionBien(String separacionBien) {
        SeparacionBien = separacionBien;
    }

    @Column(name="GRUPO_EMPRESARIAL")
    public Integer getGrupoEmpresarial() {
        return GrupoEmpresarial;
    }

    public void setGrupoEmpresarial(Integer grupoEmpresarial) {
        GrupoEmpresarial = grupoEmpresarial;
    }
}
