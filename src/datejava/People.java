/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class People {
    private String Name;
    private String Ubication;
    private String Description;
    private String Date;
    private String Time;

    public People(String Name, String Ubication, String Description, String Date, String Time) {
        this.Name = Name;
        this.Ubication = Ubication;
        this.Description = Description;
        this.Date = Date;
        this.Time = Time;
    }
    
    public People(){

    }

 
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUbication() {
        return Ubication;
    }

    public void setUbication(String Ubication) {
        this.Ubication = Ubication;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public People(String Time) {
        this.Time = Time;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    void Save(PrintWriter writes) {
        writes.println(Name);
        writes.println(Date);
        writes.println(Time);
        writes.println(Ubication);
        writes.println(Description);
    }

    

    public People cargar(BufferedReader store) throws IOException {
        String NAME;
        String DATE;
        String TIME;
        String UBICATION;
        String DESCRIPTION;
        try {
          NAME = store.readLine();
          System.out.println(NAME);
          DATE = store.readLine();
          TIME = store.readLine();
          UBICATION = store.readLine();
          DESCRIPTION = store.readLine();
          return new People(NAME, DATE, TIME, UBICATION, DESCRIPTION);          
        }catch (Exception e){
            return null;
        }   
        
    }
}
