package psi.iv.ii.decorator;

import java.util.Arrays;
import java.util.Map;

public class Darbininkas implements DarbininkasInterface {
    private String[] kaMoka = { "pasluoti", "rinkti siuksles" };

    public void dirbti(Map<String, Object> darbai) {
    	float darboValandu = 8;
    	
    	for (int i = 0; i < kaMoka.length; i++) {
    		darboValandu = skaiciuotiDarba(darbai, darboValandu, kaMoka[i]);
    	}
    }
    
    public String kaMoka() {
    	String darbai = "Darbininkas moka: ";
    	
    	for (int i = 0; i < kaMoka.length; i++) {
    		if (i > 0) {
    			darbai += ", ";
    		}
    		
    		darbai += kaMoka[i];
    	}
    	
    	return darbai;
    }
    
    public void pridetiDarba(String darbas) {
    	String[] naujas = Arrays.copyOf(kaMoka, kaMoka.length + 1);
    	naujas[kaMoka.length] = darbas;
    	
    	kaMoka = naujas;
    }
    
    private float skaiciuotiDarba(Map<String, Object> darbai, float darboValandu, String darboPavadinimas) {
    	if (darboValandu > 0 && darbai.containsKey(darboPavadinimas) && Float.parseFloat(darbai.get(darboPavadinimas).toString()) > 0) {
    		if (darboValandu > Float.parseFloat(darbai.get(darboPavadinimas).toString())) { // darbas atliktas
    			darboValandu -= Float.parseFloat(darbai.get(darboPavadinimas).toString());
    			
    			System.out.println(
					"Darbininkas turejo " + darboPavadinimas + " ir sugaiso tam "
					+ Float.parseFloat(darbai.get(darboPavadinimas).toString())
				);

    			darbai.put(darboPavadinimas, 0);
    		} else { // atlikome dali darbo, taciau isnaudojome darbo valandas
    			darbai.put(darboPavadinimas, (float)darbai.get(darboPavadinimas) - darboValandu); 
    			
    			System.out.println(
					"Darbininkas turejo " + darboPavadinimas + " ir sugaiso tam " + darboValandu
				);
    			
    			darboValandu = 0;
    		}
    	}
		
		return darboValandu;
    }
}
