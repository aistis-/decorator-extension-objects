package psi.iv.ii.extensionObjects;

import java.util.Map;

public abstract class DarbininkasExtender {
    protected DarbininkasInterface pleciamasDarbininkas;
    
    public void dirbti(Map<String, Object> darbai) {
    	pleciamasDarbininkas.dirbti(darbai);
    }
    
    public String kaMoka() {
    	return pleciamasDarbininkas.kaMoka();
    }
    
    public void pridetiDarba(String darbas) {
    	pleciamasDarbininkas.pridetiDarba(darbas);
    }
}