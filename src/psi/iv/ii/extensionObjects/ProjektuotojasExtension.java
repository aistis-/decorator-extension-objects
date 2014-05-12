package psi.iv.ii.extensionObjects;

import java.util.Map;

public class ProjektuotojasExtension extends DarbininkasExtender {
	public ProjektuotojasExtension (DarbininkasInterface pleciamasDarbininkas) {
		this.pleciamasDarbininkas = pleciamasDarbininkas;
    }
	
	public float dirbti(Map<String, Object> darbai, float likoValandu) {
		projektuotiSiena();
		
		return super.dirbti(darbai, likoValandu);
    }
	
	public String kaMoka() {
		return super.kaMoka() + ", suprojektuoti siena";
	}
	
	private void projektuotiSiena() {
		super.pridetiDarba("suprojektuoti siena");
	}
}
