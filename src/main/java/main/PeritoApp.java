package main;

import telas.TelaLogin;

public class PeritoApp {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        });
    }
}