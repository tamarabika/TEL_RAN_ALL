import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Brackets {
    public static void main(String[]args){
        Stringline ="(line [ line())";
        brackets(line);
    }

    public static boolean brackets(String input){
        List allHoks = new ArrayList();
        char [] array = input.toCharArray();
Boolean flag = true;

        for (int i = 0; i<inputCh.length; i++){
            if (inputCh[i])=='[' || inputCh[i]=='{'
                    || inputCh[i]=='['|| inputCh[i]==')'
                    || inputCh[i]=='}'|| inputCh[i]==']'

    }allHoks.add(inputC[i]);
        Stack stack = new Stack();
        for (int j=0; j<allHoks.size();j++){
            if (allHoks.get(i)equals('[') || allHoks.get(i).equals('{') || allHoks.get(i).equals('['))
        stack.push(allHoks.get(i));
}
