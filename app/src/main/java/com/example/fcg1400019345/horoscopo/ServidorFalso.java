package com.example.fcg1400019345.horoscopo;

/**
 * Created by xubuntu-developer on 9/3/15.
 */

public class ServidorFalso {
    public String[] pegaDados() {
        String[] dados1 = {
                "Áres        - Tudo de bom",
                "Touro       - Tudo de bom",
                "Gêmeos      - Tudo de bom",
                "Câncer      - Tudo de bom",
                "Leão        - Tudo de bom",
                "Virgem      - Tudo de bom",
                "Libra       - Tudo de bom",
                "Escorpião   - Tudo de bom",
                "Sargitário  - Tudo de bom",
                "Capricórnio - Tudo de bom",
                "Aquário     - Tudo de bom",
                "Peixes      - Tudo de bom"

        };

        String[] dados2 = {
                "Áres        - Tudo Maravilhoso",
                "Touro       - Tudo Maravilhoso",
                "Gêmeos      - Tudo Maravilhoso",
                "Câncer      - Tudo Maravilhoso",
                "Leão        - Tudo Maravilhoso",
                "Virgem      - Tudo Maravilhoso",
                "Libra       - Tudo Maravilhoso",
                "Escorpião   - Tudo Maravilhoso",
                "Sargitário  - Tudo Maravilhoso",
                "Capricórnio - Tudo Maravilhoso",
                "Aquário     - Tudo Maravilhoso",
                "Peixes      - Tudo Maravilhoso"
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



