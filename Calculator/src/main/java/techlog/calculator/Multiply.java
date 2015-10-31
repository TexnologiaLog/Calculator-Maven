/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calc;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SoRa1
 */
public class Multiply implements ExecutableCommand{
    
    public Multiply (){
        Calculator.registerCommand(this);
    }

    @Override
    public String identifier() {
        return "*";
    }

    @Override
    public boolean execCommand(List<Float> x) {
        float result;
        Iterator it=x.iterator();
        result=(Float)it.next();
        while(it.hasNext()) 
        {
            result*=(Float)it.next();
        }
        System.out.println("Result:"+result);
        return false;
    }
     
}