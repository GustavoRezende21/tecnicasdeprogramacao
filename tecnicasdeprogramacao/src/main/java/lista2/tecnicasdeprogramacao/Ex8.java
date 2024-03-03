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
 * @brief Class Ex8
 */

import java.util.*;

public class Ex8 {

    public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Definir variáveis A e B como inteiro
        int A, B;
        
	// Solicitar ao usuário para informar os valores de A e B
        System.out.println("Informe o primeiro valor: ");
        A = ler.nextInt();
        System.out.println("Informe o segundo valor: ");
        B = ler.nextInt();

	// Definir a variável maior como inteiro
	// Se A for maior que B, então escrever o valor de A, caso contrário, escrevar B
        int maior = (A > B) ? A : B;
        System.out.println("O maior número é: " + maior);
        System.out.println("");
    }

}
