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
 * @brief Class Ex9
 */

import java.util.*;

public class Ex9 {

public class exercicio09 {

      public static void main(String[] args) {

	// Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

	// Definir variável A, B e C como inteiro e ler os valores digitados pelo usuário
    	int A, B, C;
        System.out.println("Primeiro lado");
   	A = ler.nextInt();
  	System.out.println("Segundo lado");
   	B = ler.nextInt();
   	System.out.println("Terceiro lado");
  	C = ler.nextInt();
    
	// Se A for igual a B, A for igual a C e B for igual C, é um triângulo equilátero
  	if(A == B && A==C && B==C){
    	System.out.println("Equilátero");
    	}else{
	// Se A for diferente de B, A for diferente de C e B for diferente de C, é um triângulo Escaleno
   	if(A!=B && A!=C && B!=C){
        System.out.println("Escaleno");
    	}else{
	// Nenhum dos casos acima, é Isóceles
        System.out.println("isócelos");
        
              }
            }
        }
    }
}