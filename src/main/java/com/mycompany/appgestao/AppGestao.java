package com.mycompany.appgestao;

import java.util.Scanner;  // Para entrada de dados (input)
import java.io.*;          // Para manipulação de arquivos (input e output)
import java.util.ArrayList; // Para uso de vetores dinâmicos (ArrayList)
import java.util.Map;


import usuarios.Aluno;
import usuarios.Professor;
import elementos.Disciplina;
import elementos.Turma;


/**
 *
 * @author vacin
 */
public class AppGestao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Disciplina> disciplinasCadastradas = new ArrayList<>();
        ArrayList<Aluno> alunosCadastrados = new ArrayList<>();
        ArrayList<Professor> professoresCadastrados = new ArrayList<>();
        ArrayList<Turma> turmasCadastradas = new ArrayList<>();
        
        disciplinasCadastradas.add( new Disciplina("Algoritimos", 40) );
        disciplinasCadastradas.add( new Disciplina("POO", 40) );
        disciplinasCadastradas.add( new Disciplina("AOC", 40) );
        
        while(true){
            
        System.out.println("1- Exibir Alunos Cadastrados\n");
        System.out.println("2- Exibir Professores Cadastrados\n");
        System.out.println("3- Exibir Todas As Turmas Cadastradas\n");
        System.out.println("--------------------------------------\n");
        System.out.println("4- Cadastrar Aluno\n");
        System.out.println("5- Cadastrar Professor\n");
        System.out.println("-----------------------------------------\n");
        System.out.println("6- Exibir Opções de Aluno\n");
        System.out.println("7- Exibir Opções de Professor\n");
        System.out.println("---------------------------------------\n");
        System.out.println("0- Sair\n"); 
        
        int input = scanner.nextInt();
        scanner.nextLine();
        
        }
        
        
    }
}
