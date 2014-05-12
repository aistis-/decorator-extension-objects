package psi.iv.ii.extensionObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Statybos {

    public static void main(String[] args) {
    	Map<String, Object> darbai = new HashMap<String, Object>();
    	
    	darbai.put("suprojektuoti siena", 4f);
    	darbai.put("maisyti glaista", 6f);
    	darbai.put("muryti sienas", 12f);
    	darbai.put("pasluoti", 2f);
    	darbai.put("rinkti siuksles", 2f);
    	
    	DarbininkasInterface architektasPetras = new Darbininkas();
    	architektasPetras.pridetiExtension(new ProjektuotojasExtension(architektasPetras));
    	architektasPetras.pridetiExtension(new MurininkasExtension(architektasPetras));
//    	architektasPetras.pasalintiExtension("MurininkasDecorator");
    	
    	System.out.println(architektasPetras.kaMoka() + "\n");
    	
    	for (int i = 1; i <= 10; i++) {
    		if (arDarbaiAtlikti(darbai)) {
    			break;
    		} else {
    			architektasPetras.dirbti(darbai);
    			architektasPetras.gautiExtension("ProjektuotojasExtension").dirbti(darbai);
    			architektasPetras.gautiExtension("MurininkasExtension").dirbti(darbai);
    		}
    		
    		System.out.println("=======================");
    		
    		if (10 == i) {
    			System.out.println("Darbu neimanoma atlikti");
    		}
    	}
    }
    
    private static boolean arDarbaiAtlikti(Map<String, Object> darbai) {
    	for(Entry<String, Object> entry : darbai.entrySet()) {
    	    if (Float.parseFloat(entry.getValue().toString()) > 0) {
    	    	return false;
    	    }
    	}
    	
    	System.out.println("Darbai atlikti");
    	
    	return true;
    }
}
