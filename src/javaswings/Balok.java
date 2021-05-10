package javaswings;

public class Balok{
	double luaspermukaan,volume,luas,keliling;

	public Balok(double p, double l, int t, double luas, double keliling){
		this.luaspermukaan = (2*p*l)+(2*l*t*1.0)+(2*t*1.0*p);
		this.volume = p * l * t; 
                this.luas = luas;
                this.keliling = keliling;
	}

}
