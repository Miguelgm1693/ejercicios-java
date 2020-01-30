
package ejercicio02;

import java.util.ArrayList;

public class Ejercicio02 {

    public static void main(String[] args) {
       
        ArrayList<Integer> numero = new ArrayList<Integer>();
        
        int num = (int) Math.random() * 10;
        
        for (int i = 0; i < num; i++) {
            numero.add((int) (Math.random()*100));
                      
        }
                
    }
    
}
