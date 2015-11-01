/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techlog.calculator;

import java.util.List;

/**
 *
 * @author SoRa1
 */
public class Factorial implements ExecutableCommand
{
    public Factorial (){
        Calculator.registerCommand(this);
    }
    
    @Override
    public String identifier() 
    {
        return "n!";
    }

    @Override
    public boolean execCommand(List<Float> x) 
    {
        float result;
        result=factorial(x.get(0));
        System.out.println("Result:"+result);
        return false;
    }
    
    public float factorial(float x)
    {
        if(x==0)
        {
            return 1;
        }
        else
        {
            return x*factorial(x-1);   
        }
    }
    
}
