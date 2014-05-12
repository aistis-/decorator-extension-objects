package psi.iv.ii.decorator;

import java.util.Map;

public class MurininkasDecorator extends DarbininkasDecorator {
	public MurininkasDecorator (DarbininkasInterface dekoruojamasDarbininkas) {
        super(dekoruojamasDarbininkas);
    }
	
	public void dirbti(Map<String, Object> darbai) {
		maisytiGlaista();
		murytiSienas();
		
		super.dirbti(darbai);
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
	
	public void ijungtiSignalizacija() {
		System.out.println("Signalizacija ijungta");
	}
}
