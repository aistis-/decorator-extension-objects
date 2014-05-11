package psi.iv.ii.decorator;

import java.util.Map;

public class MurininkasDecorator extends DarbininkasDecorator {
	public MurininkasDecorator (DarbininkasInterface dekoruojamasDarbininkas) {
        super(dekoruojamasDarbininkas);
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
