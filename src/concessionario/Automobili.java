/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionario;

import java.util.HashSet;


public class Automobili extends HashSet<Automobile> {
    public Automobili(){}
    
    public boolean Aggiungi(Automobile a)
    {
        return this.add(a);
    }
}
