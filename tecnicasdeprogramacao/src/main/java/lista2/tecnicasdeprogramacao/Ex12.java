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
 * @brief Class Ex12
 */

import java.util.*;

public class Ex12 {

       public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Declarar variáveis com inteiro
	int num;
	int num2 = 1;

	// Solicite ao usuário para informar um número
        System.out.println("Digite um número: ");
        num = ler.nextInt();
        
	// Para a variável i iniciando com 1, enquanto i for menor ou igual a número digitado pelo usuário, inclua incremento 1
        for(int i = 1; i <= num; i++){
	// Armazenar produto da variável num2 pela variável de contagem
          num2 = num2 * i;
        }
	// Exibir valor na tela
        System.out.println(num2);
    }
}
