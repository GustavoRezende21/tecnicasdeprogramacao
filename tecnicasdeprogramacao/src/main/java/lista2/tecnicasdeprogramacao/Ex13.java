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
 * @brief Class Ex13
 */

import java.util.*;

public class Ex13 {

    public static void main(String[] args) {

	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Declarar variáveis X e Y do tipo inteiro
        int X, Y;

	// Solicitar ao usuário que informe os valores de X e Y
        System.out.println("Informe o valor de X: ");
        X = ler.nextInt();
        System.out.println("Informe o valor Y: ");
        Y = ler.nextInt();

	// Declarar variável result de valor 1
        int result = 1;

	// Para o contador i igual a 0, enquanto i for menor que Y, incrementar 1
        for (int i = 0; i < Y; i++) {
	// Produto de Result por X é armazenado na variável Result
            result = result * X;
        }
	// Apresentar resultado na tela
        System.out.println(result);

    }
}
