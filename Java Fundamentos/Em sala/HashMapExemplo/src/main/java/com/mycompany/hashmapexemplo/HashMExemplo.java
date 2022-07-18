
package com.mycompany.hashmapexemplo;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class HashMExemplo {

    public static void main(String[] args) {
        HashMap<Integer, String> HM = new HashMap<>();
        HM.put(5, "Lucas");
        HM.put(1, "João");
        JOptionPane.showMessageDialog(null,HM.get(1) );
        
        
        
        
    }
}
