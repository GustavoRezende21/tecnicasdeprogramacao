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
 * @brief Class Ex6
 */

import java.util.*;

public class Ex6 {

    public static void main(String[] args) {

	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Definir a variável X1 e Y1 e solicitar ao variável que informe seus respectivos valores
        System.out.println("Qual o valor de X1: ");
        int X1 = ler.nextInt();
        System.out.println("Qual o valor de X1: ");
        int Y1 = ler.nextInt();

	// Definir a variável X2 e Y2 e solicitar ao variável que informe seus respectivos valores
        System.out.println("Qual o valor de X2: ");
        int X2 = ler.nextInt();
        System.out.println("Qual o valor de Y2: ");
        int Y2 = ler.nextInt();

	// Definir variável D para valores decimais
        double D;

	// Fazer o cálculo da variável D, Math.pow se refere ao cálculo de potencia de expoente 2
        D = Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2);

	// Apresentar o valor de D na tela
        System.out.println("A distância entre os pontos é: " + D);

    }
}