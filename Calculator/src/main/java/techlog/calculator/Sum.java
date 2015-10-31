/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techlog.calculator;

import java.util.List;



public class Sum implements ExecutableCommand{
    
    public Sum (){
        Calculator.registerCommand(this);
    }

    @Override
    public String identifier() {
        return "+";
    }

    @Override
    public boolean execCommand(List<Float> x) {
        float y=0;
        for (float vLookUp:x) {
            y = vLookUp + y;
        }
        System.out.println(y);
        return false;
    }
     
}

