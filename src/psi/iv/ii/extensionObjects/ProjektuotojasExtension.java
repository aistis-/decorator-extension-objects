package psi.iv.ii.extensionObjects;

import java.util.Map;

public class ProjektuotojasExtension extends DarbininkasExtender {
	public ProjektuotojasExtension (DarbininkasInterface pleciamasDarbininkas) {
		this.pleciamasDarbininkas = pleciamasDarbininkas;
    }
	
	public void dirbti(Map<String, Object> darbai) {
		super.pridetiDarba("suprojektuoti siena");
		
		super.dirbti(darbai);
    }
	
	public String kaMoka() {
		return super.kaMoka() + ", suprojektuoti siena";
	}
}
