package com.example.fcg1400019345.horoscopo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by xubuntu-developer on 9/10/15.
 */
public class HoroscopoDBHelper extends SQLiteOpenHelper {
    private static final int VERSAO = 1;

    public static final String NOME_BANCO = "horoscopo.db";

    public HoroscopoDBHelper(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE = "CREATE TABLE " + ContratoDB.Horoscopo.NOME_TABELA + " (" +
                ContratoDB.Horoscopo._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                ContratoDB.Horoscopo.COLUNA_DATA + " INTEGER NOT NULL, " +
                ContratoDB.Horoscopo.COLUNA_SIGNO + " TEXT NOT NULL, " +
                ContratoDB.Horoscopo.COLUNA_PREVISAO + " TEXT NOT NULL);";

        sqLiteDatabase.execSQL(SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ContratoDB.Horoscopo.NOME_TABELA);
        onCreate(sqLiteDatabase);
    }
}
