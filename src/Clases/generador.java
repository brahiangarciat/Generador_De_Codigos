package Clases;

import java.util.Random;

public class generador {

    int intDigitos;
    Random aleatorio = new Random(System.currentTimeMillis());

    public generador(int intDigitos) {
        this.intDigitos = intDigitos;
    }

    public int GenerarNumero() {
        int intAleatorio = aleatorio.nextInt(10);
        return intAleatorio;
    }

    public char GenerarLetra() {
        int intTipo = aleatorio.nextInt(3) + 1;
        if (intTipo == 1) {
            char chaAleatorio = (char) (aleatorio.nextInt(26) + 97);
            return chaAleatorio;
        }else{
            char chaAleatorio = (char) (aleatorio.nextInt(26) + 65);
            return chaAleatorio;
        }
    }
    
    public String GenerarCodigo(){
        String strCodigo = "";
        for (int i = 0; i < intDigitos; i++) {
            int intAleatorio = aleatorio.nextInt(3) + 1;
            if (intAleatorio == 1) {
                strCodigo += GenerarNumero();
            }else{
                strCodigo += GenerarLetra();
            }
        }
        return strCodigo;
    }
}
