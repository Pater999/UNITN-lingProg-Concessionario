/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionario;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class Persone extends LinkedHashSet<Persona> {
    public Persone(){}
    
    
    public String toString()
    {
        String s = "";
        Iterator<Persona> i = this.iterator();
        while(i.hasNext()) {
            s += i.next().toString();
        }
        return s;
    }
}
