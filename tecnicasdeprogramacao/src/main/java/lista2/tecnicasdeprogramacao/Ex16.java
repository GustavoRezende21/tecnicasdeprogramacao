/*
 * Copyright (C) 2024 Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista2.tecnicasdeprogramacao;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 03/03/2024
 * @brief Class Ex16
 */

import java.util.*;

public class Ex16 {

    public static void main(String[] args) {

	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Informar o tamanho da matriz quadrada
        System.out.println("Informe o tamanho da matriz quadrada: ");
        int tam = ler.nextInt();

	// Declarar variável matriz
        int[][] matriz = new int[tam][tam];

        // Vai ficar repetindo até ocupar todos os espaços da matriz com os valores informados
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("Informe o elemento do número ["+i+"]["+j+"] da matriz.");
                matriz[i][j] = ler.nextInt();
            }
        }

        // Vai repetir do mesmo modo que a anterior, mas no final tem um "Se" onde verifica se o i + j é igual o tamanho da matriz - 1
        System.out.println("A diagonal secundaria dessa matriz é: ");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((i + j) == (tam - 1)){
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }   
}
