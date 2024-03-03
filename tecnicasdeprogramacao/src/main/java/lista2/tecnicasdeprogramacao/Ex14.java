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
 * @brief Class Ex14
 */

import java.util.*;

public class Ex14 {

    public static void main(String[] args) {

        // Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);
        
	// Declarar variável de total de números primeiros com valor 0
        int tPrimo = 0;

	// Contador se inicia com valor 2, enquanto i for menor 1000, utilizando incremento 1
        for (int i = 2; i <= 1000; i++) {

            // Se o valor primo retornar um numero primo
            if (primo(i)) {
                // Caso retorne um valor primo, incremente 1 em tPrimo e imprima o número primo
                tPrimo++;
                System.out.println(i + " ");
            }
        }

        // Vai imprimir o valor de tPrimo que resulta da quantidade de vezes que retornou um valor positivo dentro da expressão booleana ''primo''
        System.out.println("Quantidade de números primos de 1 a 1000: " + tPrimo);
    }

    // Função Boleana = retorna 1 ou 0 no caso verdadeiro ou falso
    // Função publica (Podendo ser chamada de qualquer lugar dentro do pacote/pasta para verificar se é primo ou não
    // Função recebe um valor inteiro que vai ser convertido para num para se encaixar dentro da função

    public static boolean primo(int num) { 
        // Se ele é igual a um, não é um numero primo
        if (num <= 1) {
            return false;
        }
        // Inicia i = 2 Já que foi descartado o número 1 na expressão anterior
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
