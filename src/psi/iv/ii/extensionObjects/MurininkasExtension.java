package psi.iv.ii.extensionObjects;

import java.util.Map;

public class MurininkasExtension extends DarbininkasExtender {
	public MurininkasExtension (DarbininkasInterface pleciamasDarbininkas) {
		this.pleciamasDarbininkas = pleciamasDarbininkas;
    }
	
	public float dirbti(Map<String, Object> darbai, float likoValandu) {
		super.pridetiDarba("maisyti glaista");
		super.pridetiDarba("muryti sienas");
		
		return super.dirbti(darbai, likoValandu);
    }
	
	public String kaMoka() {
		return super.kaMoka() + ", maisyti glaista, muryti sienas";
	}
}
