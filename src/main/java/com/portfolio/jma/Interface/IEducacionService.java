
package com.portfolio.jma.Interface;

import com.portfolio.jma.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    //traer una lista de objetos
    public List <Educacion> getEducacion();
    
    //guardar un objeto
    public void saveEducacion(Educacion educacion);
    
    //Eliminar un objeto
    public void deleteEducacion(Long id);
    
    //Buscar un objeto por id
    public Educacion findEducacion(Long id);
    
}
