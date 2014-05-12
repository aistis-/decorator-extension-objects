package psi.iv.ii.extensionObjects;

import java.util.Map;

public class MurininkasExtension extends DarbininkasExtender {
	public MurininkasExtension (DarbininkasInterface pleciamasDarbininkas) {
		this.pleciamasDarbininkas = pleciamasDarbininkas;
    }
	
	public float dirbti(Map<String, Object> darbai, float likoValandu) {
		maisytiGlaista();
		murytiSienas();
		
		return super.dirbti(darbai, likoValandu);
    }
	
	public String kaMoka() {
		return super.kaMoka() + ", maisyti glaista, muryti sienas";
	}
	
	private void maisytiGlaista() {
		super.pridetiDarba("maisyti glaista");
	}
	
	private void murytiSienas() {
		super.pridetiDarba("muryti sienas");
	}
}
