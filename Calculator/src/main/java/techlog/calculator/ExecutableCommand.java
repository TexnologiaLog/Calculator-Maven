/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calc;

import java.util.List;


public interface ExecutableCommand {
    public String identifier();
    public boolean execCommand(List<Float> x);
}
