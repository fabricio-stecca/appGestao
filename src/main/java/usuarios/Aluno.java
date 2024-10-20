/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

/**
 *
 * @author vacin
 */
import java.util.Map;

import elementos.Disciplina;

public class Aluno extends Pessoa {
    private double cra;  // Coeficiente de Rendimento Acadêmico
    private Map<Disciplina, Integer> notasDisciplinas;

    // Construtor
    public Aluno(int id, String nome, int idade, String sexo, String email, double cra, Map<Disciplina, Integer> notasDisciplinas) {
        super(id, nome, idade, sexo, email); // Chama o construtor da superclasse (Pessoa)
        this.cra = cra;
        this.notasDisciplinas = notasDisciplinas;
    }

    // Métodos Getters e Setters
    public double getCra() {
        return cra;
    }

    public void setCra(double cra) {
        this.cra = cra;
    }

    public Map<Disciplina, Integer> getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(Map<Disciplina, Integer> notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
}
