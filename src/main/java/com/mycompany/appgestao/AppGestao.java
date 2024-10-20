package com.mycompany.appgestao;

import java.util.Scanner;  // Para entrada de dados (input)
import java.io.*;          // Para manipulação de arquivos (input e output)
import java.util.ArrayList; // Para uso de vetores dinâmicos (ArrayList)
import java.util.Map;

import usuarios.Pessoa;


/**
 *
 * @author vacin
 */
public class AppGestao {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       Pessoa pessoa = new Pessoa(1, "João da Silva", 25, "Masculino", "joao.silva@email.com");

        // Exibindo as informações da pessoa
        System.out.println("ID: " + pessoa.getId());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Email: " + pessoa.getEmail());
    }
}
