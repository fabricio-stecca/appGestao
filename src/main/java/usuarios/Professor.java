/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

/**
 *
 * @author vacin
 */
import java.util.ArrayList;

import elementos.Disciplina;
import elementos.Turma;
import elementos.Feedback;

public class Professor extends Pessoa {
    private ArrayList<Turma> turmas;
    private ArrayList<Feedback> feedback;
    private ArrayList<Disciplina> disciplinasMinistradas;

    // Construtor
    public Professor(int id, String nome, int idade, String sexo, String email, 
                     ArrayList<Turma> turmas, ArrayList<Feedback> feedback, ArrayList<Disciplina> disciplinasMinistradas) {
        super(id, nome, idade, sexo, email);  // Chama o construtor da superclasse (Pessoa)
        this.turmas = turmas;
        this.feedback = feedback;
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    // Métodos Getters e Setters
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(ArrayList<Feedback> feedback) {
        this.feedback = feedback;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinasMinistradas = disciplinas;
    }
}