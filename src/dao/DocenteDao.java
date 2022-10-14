/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Docente;

/**
 *
 * @author docente
 */
public class DocenteDao {
    private List<Docente> lista;

    public DocenteDao() {
        lista = new ArrayList<>();
    }
    
    public void agregar(Docente d){
            lista.add(d);
    }

    public List<Docente> getLista() {
        return lista;
    }
    
    
}
