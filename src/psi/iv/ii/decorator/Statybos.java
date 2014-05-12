package psi.iv.ii.decorator;

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
    	architektasPetras = new ProjektuotojasDecorator(architektasPetras);
    	architektasPetras = new MurininkasDecorator(architektasPetras);
//    	architektasPetras = DarbininkasDecorator.pasalintiRole(architektasPetras, "MurininkasDecorator");
    	
    	ProjektuotojasDecorator projektuotojasDecorator = (ProjektuotojasDecorator) DarbininkasDecorator.surastiIrGauti(
			architektasPetras, "ProjektuotojasDecorator"
		);
    	
		if (projektuotojasDecorator != null) {
			projektuotojasDecorator.isjungtiSignalizacija();
		} else {
			System.out.println("Petras neturi teises isjunti signalizacijos");
		}
		
		MurininkasDecorator murininkasDecorator = (MurininkasDecorator) DarbininkasDecorator.surastiIrGauti(
			architektasPetras, "MurininkasDecorator"
		);
		
		if (murininkasDecorator != null) {
			murininkasDecorator.ijungtiSignalizacija();
		} else {
			System.out.println("Petras neturi teises ijunti signalizacijos");
		}
    	
    	System.out.println(architektasPetras.kaMoka() + "\n");
    	
    	for (int i = 1; i <= 10; i++) {
    		if (arDarbaiAtlikti(darbai)) {
    			break;
    		} else {
    			architektasPetras.dirbti(darbai);
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
