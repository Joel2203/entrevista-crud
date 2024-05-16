package com.api.CrudInterview.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column
    private String nombreDeUsuario;

    @Column
    private  String apellidoDeUsuario;

    @Column
    private  Long edad;

    @Column
    private  Long documentoDeIdentidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getApellidoDeUsuario() {
        return apellidoDeUsuario;
    }

    public void setApellidoDeUsuario(String apellidoDeUsuario) {
        this.apellidoDeUsuario = apellidoDeUsuario;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public Long getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(Long documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }
}
