package com.portfolio.jma.Interface;

import com.portfolio.jma.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List <Persona> getPersona();
    
    //guardar un objeto de la clase persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
