/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuvar2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patri
 */
public class Fuvar {
    private int azonosito;
    public int getAzonosito(){
        return this.azonosito;
    }
    private LocalDateTime indulasido;
    public LocalDateTime getIndulasIdo(){
        return this.indulasido;
    }
    private int utazasido;
    public int getUtazasIdo(){
        return this.utazasido;
    }
    private double megtettTav;
    public double getMegtettTav(){
        return this.megtettTav;
    }
    private double viteldij;
    public double getViteldij(){
        return this.viteldij;
    }
    private double borravalo;
    public double getBorraValo(){
        return this.borravalo;
    }
    private String fizetesmod;
    public String getFizetesMod(){
        return this.fizetesmod;
    }
    
    
    //konstruktor
    
    public Fuvar(String sor){
        String[] db = sor.split(";");
        this.azonosito = Integer.parseInt(db[0]);
        this.indulasido = LocalDateTime.parse(db[1],DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.utazasido = Integer.parseInt(db[2]);
        this.megtettTav = Double.parseDouble(db[3].replace(",", "."));
        this.viteldij = Double.parseDouble(db[4].replace(",", "."));
        this.borravalo = Double.parseDouble(db[5].replace(",", "."));
        this.fizetesmod = db[6];
    }
    
    // Feltöltő osztályszintű metódus
    
    public static List<Fuvar>LoadDatas(String fajlneve) throws FileNotFoundException{
        List<Fuvar> Fuvarok = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fajlneve));
            String sor;
            String fejlec = reader.readLine();
            while((sor = reader.readLine()) != null){
                Fuvar f = new Fuvar(sor);
                Fuvarok.add(f);
            }
            reader.close();
            
        }
        catch(Exception err){
            System.out.println("Olvasási hiba" + err.getMessage()   );
        }
        return Fuvarok;
    }
}
