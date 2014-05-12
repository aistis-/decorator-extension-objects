package psi.iv.ii.extensionObjects;

import java.util.Map;

public class MurininkasExtension extends DarbininkasExtender {
	public MurininkasExtension (DarbininkasInterface pleciamasDarbininkas) {
		this.pleciamasDarbininkas = pleciamasDarbininkas;
    }
	
	public void dirbti(Map<String, Object> darbai) {
		super.pridetiDarba("maisyti glaista");
		super.pridetiDarba("muryti sienas");
		
		super.dirbti(darbai);
    }
	
	public String kaMoka() {
		return super.kaMoka() + ", maisyti glaista, muryti sienas";
	}
}
