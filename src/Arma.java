
public class Arma {
	public int municiones=10;
	public int danio=2;
	public int tipo=0; //0=da�o fisico; 1=da�o magico
	String sonido="PUM!!!";
	public void Disparar() {
		System.out.println(sonido);
		municiones--;
	}
	public void Disparar(Enemigo e) {
		System.out.println(sonido);
		municiones--;
		e.RecibirDanio(danio,tipo);
	}
}
