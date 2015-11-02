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
    List<Float> x = new ArrayList<>();
    List<String> str = new ArrayList<>();
    
    private static List<ExecutableCommand> execCommands = new ArrayList<>();
    
    public Calculator(){
        Initializator.initializeCommands();
    }

    public void openCalculator(){
        boolean flag;
        boolean process = true;

        String inputId = null;
        do {
            {
                flag=true;
                x.clear();

                System.out.println("Give the numbers, type ; to chooce function or exit to end the program ");
                do {

                    String y = sc.next();
                    if (y.equals(";")) {
                        flag = false;
                    } else {
                        if (isInt(y)) {
                            x.add(Float.parseFloat(y));
                        } else if(y.equals("exit")) {
                            System.out.println("thank you for trying our calculator");
                            System.exit(0);
                        }





                    }
                } while (flag );

                flag = true;
                for (ExecutableCommand vLookUp : execCommands) {
                    if(!str.contains(vLookUp.identifier())) {
                        str.add(vLookUp.identifier());
                    }
                }

                do {
                    System.out.println("Give an operator from the following : ");
                    for (String vLookUp : str) {
                        System.out.println(vLookUp);
                    }

                    String y = sc.next();
                    if (str.contains(y)) {
                        inputId = y;
                        flag = false;
                    }
                } while (flag);

                flag = false;
                for (ExecutableCommand vLookUp : execCommands) {
                    if (vLookUp.identifier().equals(inputId)) {
                        flag = vLookUp.execCommand(x);
                    }
                }



            }
        } while (process);

    }

    private boolean isInt(String str){
        int i = 0;
        int z = 0;

        while( i < str.length()) {
            z = str.charAt(i++) - '0';
            if (z > 9) {
                return false;
            }
        }

        return true;
    }
    
    
    
    public static void registerCommand(ExecutableCommand newCommand) {
        execCommands.add(newCommand);
    }
}
