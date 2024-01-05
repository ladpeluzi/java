import br.com.alura.desafio.Cachorro;
import br.com.alura.desafio.Carro;

public class PrincipalDesafio {
    public static void main(String[] args) {

        //1.
        Carro car = new Carro();
        car.getModelo(2023);
        car.getModelo(2000);
        //2.
        Cachorro cao = new Cachorro();
        cao.emitirSom();
    }

}
