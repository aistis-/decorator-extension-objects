package psi.iv.ii.extensionObjects;

import java.util.Map;

public abstract class DarbininkasExtender {
    protected DarbininkasInterface pleciamasDarbininkas;
    
    public float dirbti(Map<String, Object> darbai, float likoValandu) {
    	return pleciamasDarbininkas.dirbti(darbai, likoValandu);
    }
    
    public String kaMoka() {
    	return pleciamasDarbininkas.kaMoka();
    }
    
    public void pridetiDarba(String darbas) {
    	pleciamasDarbininkas.pridetiDarba(darbas);
    }
}