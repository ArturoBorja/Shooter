public class Enemigo {
	public int pvida=3;
	public boolean vivo=true;
	void RecibirDanio (int d, int tipo) {
		if(vivo) {
			pvida-=d;
			if(pvida<=0) {
				Morir();
			}
			System.out.println(pvida);
		}else {
			System.out.println("Splash");
			System.out.println(pvida);
		}	
	}
	void Morir() {
		pvida=0;
		vivo=false;
		TextoMuerte();
	}
	void TextoMuerte() {
		System.out.println("Hay me muero!!!!!");
	}
}
