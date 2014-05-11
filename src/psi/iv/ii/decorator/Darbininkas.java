package psi.iv.ii.decorator;

abstract public class Darbininkas implements DarbininkasInterface {
    float minimalusDienosIkainis = 45;



    public float darboDienosIkainis() {
        return minimalusDienosIkainis;
    }
}
