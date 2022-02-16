/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Joabp
 */
public class Matriz {

    Object fam[][][];
    public int x;
    public int y;

    public Matriz(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void llenaMatriz(int a, int b, int c, Object obj) {
        if (fam == null) {
            fam = new Object[x][y][1];
            fam[0][0][0] = obj;
        }
        else {
            Object[][][] aux = new Object[x][y][fam[x - 1][y - 1].length + 1];
            for (int i = 0; i < aux.length; i++) {
                for (int j = 0; j < aux[i].length; j++) {
                    for (int k = 0; k < aux[i][j].length; k++) {
                        try {
                            if (fam[i][j][k] != null) {
                                aux[i][j][k] = fam[i][j][k];
                            }
                        } catch (Exception e) {
                        }
                    }
                }
            }
            aux[a][b][c] = obj;
            fam = aux;
        }
    }

    public Object regresarObjeto(int a, int b, int c) {
        try {
            return fam[a][b][c];

        } catch (Exception e) {
            return null;
        }
    }
    
    public int lengthZ(int a, int b){
        try {
            return fam[a][b].length;
        } catch (Exception e) {
            return 0;
        }
    }

}
