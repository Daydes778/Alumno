/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import dao.DocenteDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Docente;

/**
 *
 * @author docente
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocenteDao dao = new DocenteDao();
        Scanner sc = new Scanner(System.in);
        int n, exp; String nombre, dni, grado; 
        System.out.println("Docentes: ");
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Nombre:");
            nombre = sc.next();
            System.out.println("DNI:");
            dni = sc.next();
            System.out.println("Grado:");
            grado = sc.next();
            System.out.println("Experiencia:");
            exp = sc.nextInt();
            Docente d = new Docente(grado,exp, nombre, dni);
            dao.agregar(d);
        }
        List<Docente> lista = new ArrayList<>();
        lista = dao.getLista();
        for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i).getNombre());
        }
    }
    
}
