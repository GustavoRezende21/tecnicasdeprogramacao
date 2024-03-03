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
 * @brief Class Ex15
 */

import java.util.*;

public class Ex15 {

    public static void main(String[] args) {

	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Informar o tamanho da matriz
        System.out.println("Informe o tamanho da matriz quadrada: ");
        int tam = ler.nextInt();

	// Definir variável da matriz
        int[][] matriz = new int[tam][tam];

	// Para o i(linha) iniciado em zero, i for menor que tam com incremento 1
        for (int i = 0; i < tam; i++) {
	// Para o j(coluna) iniciado em 0, j for menor que tam com incremento 1
            for (int j = 0; j < tam; j++) {
                System.out.println("Informe o elemento do número [" + i + "][" + j + "] da matriz.");
                matriz[i][j] = ler.nextInt();
            }
        }
        //Vai reproduzir a matriz e imprimir o valor quando i = j [1][1]
        System.out.println("A diagonal principal dessa matriz é: ");
        for (int i = 0; i < tam; i++) {
                System.out.println(matriz[i][i]);
            }
        }
    }
