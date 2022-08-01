/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jma.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Jose Amaya
 */
public class dtoSkills {
	@NotBlank
    private String nombreS;
    @NotBlank
    private int porcentajeS;
    
    //Constructores

    public dtoSkills() {
    }

    public dtoSkills(String nombreS, int porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }
    
    //Getters y Setters

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }

    public void setDescripcionS(int descripcionS) {
        this.porcentajeS = descripcionS;
    }
    
}
