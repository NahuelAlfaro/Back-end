package com.portfolio.pf.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter @Setter
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
}
