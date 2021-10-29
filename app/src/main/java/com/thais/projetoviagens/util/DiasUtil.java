package com.thais.projetoviagens.util;

import androidx.annotation.NonNull;

import com.thais.projetoviagens.model.Pacote;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    @NonNull
    public static String formataDiasEmTexto(int quantidadeDeDias) {
        if (quantidadeDeDias > 1 ) {
            return quantidadeDeDias + PLURAL;
        }
        return quantidadeDeDias + SINGULAR;
    }

}
