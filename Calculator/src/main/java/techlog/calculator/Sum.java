package techlog.calculator;

import java.util.List;

/**
 *
 * @author NIKOS
 */

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
