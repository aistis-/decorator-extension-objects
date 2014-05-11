package psi.iv.ii.decorator;

import java.util.Map;

public class ProjektuotojasDecorator extends DarbininkasDecorator {
	public ProjektuotojasDecorator (DarbininkasInterface dekoruojamasDarbininkas) {
        super(dekoruojamasDarbininkas);
    }
	
	public void dirbti(Map<String, Object> darbai) {
		super.pridetiDarba("suprojektuoti siena");
		
		super.dirbti(darbai);
    }
	
	public String kaMoka() {
		return super.kaMoka() + ", suprojektuoti siena";
	}
}
