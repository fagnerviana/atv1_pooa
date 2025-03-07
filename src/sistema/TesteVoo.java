package sistema;

import questao5.Aviao;
import questao5.Passaro;
import questao5.Voador;

class TesteVoo {
    public static void main(String[] args) {
        Voador v1 = new Passaro();
        Voador v2 = new Aviao();
        v1.voar();  // Chama voar() do Passaro
        v2.voar();  // Chama voar() do Aviao
    }
}
