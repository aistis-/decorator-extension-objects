package psi.iv.ii.decorator;

import java.util.Map;

abstract class DarbininkasDecorator implements DarbininkasInterface {
    protected DarbininkasInterface dekoruojamasDarbininkas;
 
    public DarbininkasDecorator (DarbininkasInterface dekoruojamasDarbininkas) {
        this.dekoruojamasDarbininkas = dekoruojamasDarbininkas;
    }
    
    public void dirbti(Map<String, Object> darbai) {
    	dekoruojamasDarbininkas.dirbti(darbai);
    }
    
    public String kaMoka() {
    	return dekoruojamasDarbininkas.kaMoka();
    }
    
    public void pridetiDarba(String darbas) {
    	dekoruojamasDarbininkas.pridetiDarba(darbas);
    }
    
    public static DarbininkasInterface pasalintiRole(DarbininkasInterface darbininkas, String rolesKlasesPavadinimas) {
		try {
			if (rolesKlasesPavadinimas.equals(darbininkas.getClass().getSimpleName())) {
				return ((DarbininkasDecorator) darbininkas).dekoruojamasDarbininkas;
			} else {
				((DarbininkasDecorator) darbininkas).dekoruojamasDarbininkas = pasalintiRole(((DarbininkasDecorator) darbininkas).dekoruojamasDarbininkas, rolesKlasesPavadinimas);
				return darbininkas;
			}
		} catch (ClassCastException e) {
			return null;
		}
	}
    
	public static DarbininkasInterface surastiIrGauti(DarbininkasInterface darbininkas, String rolesKlasesPavadinimas) {
		if (rolesKlasesPavadinimas.equals(darbininkas.getClass().getSimpleName())) {
			return ((DarbininkasDecorator) darbininkas);
		} else {
			try {
				return surastiIrGauti(((DarbininkasDecorator) darbininkas).dekoruojamasDarbininkas, rolesKlasesPavadinimas);
			} catch (ClassCastException e) {
				return null;
			}
		}
	}
}