package com.example.fcg1400019345.horoscopo;

/**
 * Created by xubuntu-developer on 9/3/15.
 */

public class ServidorFalso {
    public String[][] pegaDados() {
        String[][] dados1 = {
                {"1442361600", "Áres        ", "Tudo de bom"},
                {"1442361600", "Touro       ", "Muito bom"},
                {"1442361600", "Câncer      ", "Sempre bem"},
                {"1442361600", "Leão        ", "Maravilhas"},
                {"1442361600", "Virgem      ", "Ótimo "},
                {"1442361600", "Libra       ", "Eternenamente feliz"
                },
                {"1442361600", "Escorpião   ", "Mara..."},
                {"1442361600", "Sargitário  ", "Bem Feliz"},
                {"1442361600", "Capricórnio ", "Só Love"},
                {"1442361600", "Aquário     ", "Lindo dia"},
                {"1442361600", "Peixes      ", "Marés de Amor"},
        };

        String[][] dados2 = {
                {"1442448000", "Áres        ", "Tudo de bom"},
                {"1442448000", "Touro       ", "Muito bom"},
                {"1442448000", "Câncer      ", "Sempre bem"},
                {"1442448000", "Leão        ", "Maravilhas"},
                {"1442448000", "Virgem      ", "Ótimo "},
                {"1442448000", "Libra       ", "Eternenamente feliz"
                },
                {"1442448000", "Escorpião   ", "Mara..."},
                {"1442448000", "Sargitário  ", "Bem Feliz"},
                {"1442448000", "Capricórnio ", "Só Love"},
                {"1442448000", "Aquário     ", "Lindo dia"},
                {"1442448000", "Peixes      ", "Marés de Amor"},
        };


        // Para não pegar sempre o mesmo...
        long time = System.currentTimeMillis() / 1000;
        if (time % 2 == 0) {
            return dados1;
        } else {
            return dados2;
        }
    }
}



