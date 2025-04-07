/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuvar2;

import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author patri
 */
public class Fuvar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       List<Fuvar> fuvarok = Fuvar.LoadDatas("fuvar.csv");
       
        System.out.println("3.Feladat: " + fuvarok.size() + " Fuvar");
    }
    
}
