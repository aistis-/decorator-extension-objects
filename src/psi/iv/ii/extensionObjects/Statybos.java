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
//    	architektasPetras.pasalintiExtension("MurininkasExtension");
    	
    	float likoValandu;
    	
    	for (int i = 1; i <= 10; i++) {
    		if (arDarbaiAtlikti(darbai)) {
    			break;
    		} else {
    			likoValandu = 8;
    			
    			likoValandu = architektasPetras.dirbti(darbai, likoValandu);
    			likoValandu = architektasPetras.gautiExtension("ProjektuotojasExtension") == null ? likoValandu : architektasPetras.gautiExtension("ProjektuotojasExtension").dirbti(darbai, likoValandu);
    			likoValandu = architektasPetras.gautiExtension("MurininkasExtension") == null ? likoValandu : architektasPetras.gautiExtension("MurininkasExtension").dirbti(darbai, likoValandu);
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
