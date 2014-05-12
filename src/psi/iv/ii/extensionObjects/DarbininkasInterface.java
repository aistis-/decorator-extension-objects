package psi.iv.ii.extensionObjects;

import java.util.HashMap;
import java.util.Map;

public interface DarbininkasInterface {
	public static Map<String, DarbininkasExtender> objects = new HashMap<String, DarbininkasExtender>();
	
	public float dirbti(Map<String, Object> darbai, float likoValandu);
	public String kaMoka();
    public void pridetiDarba(String darbas);
    
	public DarbininkasExtender gautiExtension(String role);
	public void pridetiExtension(DarbininkasExtender ext);
	public void pasalintiExtension(String role);
}
