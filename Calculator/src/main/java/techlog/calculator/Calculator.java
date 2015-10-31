/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techlog.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Calculator {
    Scanner sc = new Scanner(System.in);
    List<Float> x = new ArrayList();
    List<String> str = new ArrayList();
    
    private static List<ExecutableCommand> execCommands = new ArrayList();
    
    public Calculator(){
        Initializator.initializeCommands();
    }
    
    
    
    public static void registerCommand(ExecutableCommand newCommand) {
        execCommands.add(newCommand);
    }
}
