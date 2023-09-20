public class Primo {
    public int numero;
    public boolean TestePrimo(int numero) {
        this.numero = numero;
        if (numero == 1) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
