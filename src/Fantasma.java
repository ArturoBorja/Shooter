
public class Fantasma extends Enemigo{
	void RecibirDanio (int d,int tipo) {
		if (tipo==0) {
			System.out.println("WOOOOOOOOO");
			System.out.println(pvida);
		}else {
			super.RecibirDanio(d, tipo);
		}
		
	}
	void TextoMuerte() {
		System.out.println("WOOOOOOOOO");
	}
}
