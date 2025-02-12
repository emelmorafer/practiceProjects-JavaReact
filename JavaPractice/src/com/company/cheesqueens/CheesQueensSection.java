package com.company.cheesqueens;

public class CheesQueensSection {

    public void execute() {
        int n = 8;
        int board[][] = new int[n][n];
        //Creo la matriz con puros 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Calculando ");
        System.out.println();
        //Voy colocando 1 en la matriz que representan a las reinas, ibuco el primero en la posicion 0,0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = verificarPosicionValida(board, i, j);
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int verificarPosicionValida(int board[][], int fil, int col){
        int n = 8;

        for (int i = 0; i < n; i++) {
            if(board[i][col] == 1){
                return 0;
            }
        }

        for (int j = 0; j < n; j++) {
            if(board[fil][j] == 1){
                return 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j) == (fil+col)){
                    if(board[i][j] == 1){
                        return 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i-j) == (fil-col)) {
                    if (board[i][j] == 1) {
                        return 0;
                    }
                }
            }
        }

        return 1;
    }
}
