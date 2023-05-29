package com.portfolio.pf.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Id;





@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "valor muy corto o muy largo")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "valor muy corto o muy largo")
    private String apellido;
    
    @Size(min = 1, max = 50, message = "valor muy corto o muy largo")
    private String img;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
    
}
