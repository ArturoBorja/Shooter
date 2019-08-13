import java.util.ArrayList;
import java.util.List;
public class Jugador {
	String nombre;
	int pvida;
	int dinero;
	List <Arma> armas;
	int armaseleccionada;
	public Jugador(String nombre) {
		this.nombre=nombre;
		pvida=100;
		dinero=0;
		armas=new ArrayList<Arma>();
		AdquirirArma(new Arma());
	}
	public void AdquirirArma(Arma a) {
		armas.add(a);
		armaseleccionada=armas.size()-1;
	}
	public void CambiarArma(int a) {
		a--;
		if (a< armas.size()) {
			armaseleccionada=a;
			System.out.println("Cambio de arma");
		}else {
			System.out.println("No tiene esa arma");
		}
	}
	public void Disparar(Enemigo e) {
		armas.get(armaseleccionada).Disparar(e);
	}
	
}
