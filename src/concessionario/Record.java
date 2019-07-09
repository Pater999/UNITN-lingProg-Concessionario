/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionario;

import java.util.Objects;


public abstract class Record {
    String field1;
    String field2;
    int field3;
    
    public Record(String F1, String F2, int F3)
    {
        field1 = F1;
        field2 = F2;
        field3 = F3;
    }

    @Override
    public int hashCode() {
        return field1.hashCode()+field2.hashCode()+field3;
    }
    
    @Override
    public boolean equals(Object var)
    {
        if(var==null) 
            return false;
        return (field1.equals(((Record)var).field1) && field2.equals(((Record)var).field2) && field3 == ((Record)var).field3);
    }
    
    @Override
    public String toString()
    {
        return field1 + "\t" + field2 + "\t" + Integer.toString(field3) + "\n";
    }
}
