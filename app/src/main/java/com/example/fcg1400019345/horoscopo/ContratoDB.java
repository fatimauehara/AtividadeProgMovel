package com.example.fcg1400019345.horoscopo;

import android.provider.BaseColumns;

public class ContratoDB {
    public static final class Horoscopo implements BaseColumns {

        public static final String NOME_TABELA = "horoscopo";

        public static final String COLUNA_DATA = "data";
        public static final String COLUNA_SIGNO = "signo";
        public static final String COLUNA_PREVISAO = "previsao";
    }
}