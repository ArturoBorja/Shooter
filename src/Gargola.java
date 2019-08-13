
public class Gargola extends Enemigo{
	public Gargola() {
		pvida=25;
	}
	void RecibirDanio (int d,int tipo) {
		if (tipo==1) {
			System.out.println("HA HA HA");
			System.out.println(pvida);
		}else {
			d=d*(int) (Math.random() * 5) + 1;;
			super.RecibirDanio(d, tipo);
		}
		
	}
	void TextoMuerte() {
		System.out.println("BUM!!!!");
	}
}
