
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enemigo e01=new Fantasma();
		Enemigo e02=new Coco();
		Jugador j1=new Jugador("Arturo");
		j1.Disparar(e02);
		j1.Disparar(e02);
		j1.Disparar(e02);
		j1.AdquirirArma(new ArmaProtones());
		j1.Disparar(e01);
		j1.Disparar(e01);
		j1.Disparar(e01);
	}

}
