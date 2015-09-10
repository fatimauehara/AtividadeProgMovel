package com.example.fcg1400019345.horoscopo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.test.AndroidTestCase;

import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Created by rodrigo on 9/9/15.
 */
public class TestDB extends AndroidTestCase {
    void deleteTheDatabase() {
        mContext.deleteDatabase(HoroscopoDBHelper.NOME_BANCO);
    }

    public void setUp() {
        deleteTheDatabase();
    }

    public void testDB() throws Throwable {
        deleteTheDatabase();
        SQLiteOpenHelper dbHelper = new HoroscopoDBHelper(mContext);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        assertEquals(true, db.isOpen());

        long data = new Date().getTime();
        String signo = "Aconteceu hoje!";
        String previsao = "Mais uma coisa aconteceu hoje.";

        ContentValues entrada = new ContentValues();
        entrada.put(ContratoDB.Horoscopo.COLUNA_DATA, data);
        entrada.put(ContratoDB.Horoscopo.COLUNA_SIGNO, signo);
        entrada.put(ContratoDB.Horoscopo.COLUNA_PREVISAO, previsao);

        long idNoticia = db.insert(ContratoDB.Horoscopo.NOME_TABELA, null, entrada);

        assertTrue(idNoticia != -1);

        Cursor cursor = db.query(
                ContratoDB.Horoscopo.NOME_TABELA, // Tabela
                null, // colunas (todas)
                null, // colunas para o where
                null, // valores para o where
                null, // group by
                null, // having
                null  // sort by
        );

        assertTrue("Erro: nenhuma linha encontrada", cursor.moveToFirst());

        validateCurrentRecord("Erro nos dados encontrados", cursor, entrada);

        assertFalse( "Erro: mais de uma linha encontrada", cursor.moveToNext() );

        cursor.close();
        dbHelper.close();

    }

    static void validateCurrentRecord(String error, Cursor valueCursor, ContentValues expectedValues) {
        Set<Map.Entry<String, Object>> valueSet = expectedValues.valueSet();
        for (Map.Entry<String, Object> entry : valueSet) {
            String columnName = entry.getKey();
            int idx = valueCursor.getColumnIndex(columnName);
            assertFalse("Coluna '" + columnName + "' não encontrada. " + error, idx == -1);
            String expectedValue = entry.getValue().toString();
            assertEquals("Valor '" + entry.getValue().toString() +
                    "' não bate com o esperado '" +
                    expectedValue + "'. " + error, expectedValue, valueCursor.getString(idx));
        }
    }
}