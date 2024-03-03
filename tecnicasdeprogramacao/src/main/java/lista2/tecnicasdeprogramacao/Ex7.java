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
 * @brief Class Ex7
 */

import java.util.*;

public class Ex7 {

    public static void main(String[] args) {

	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Definir variáveis A e B como inteiro
        int A, B;

	// Ler os valoers A e B digitados pelo usuário
        System.out.println("Informe o primeiro valor: ");
        A = ler.nextInt();
        System.out.println("Informe o segundo valor: ");
        B = ler.nextInt();

	// Se A for maior que B, mostre os dois valores digitados e o maior, que seria A
        if (A > B) {
            System.out.println("Valor de A:" + A);
            System.out.println("Valor de B:" + B);
            System.out.println("Maior:" + A);
	// Caso contrário, mostre os valores digitados e o maior, que seria B
        } else {
            System.out.println("Valor de A:" + A);
            System.out.println("Valor de B:" + B);
            System.out.println("Maior:" + B);
        }
    }

}
