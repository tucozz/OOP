package School;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private String matricula;
    private float cr;
    private float renda_familiar;
    private LocalDate nascimento;

    public Aluno(String nome, String matricula, float cr, float renda_familiar, LocalDate nascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.cr = cr;
        this.renda_familiar = renda_familiar;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getCr() {
        return cr;
    }

    public float getRenda_familiar() {
        return renda_familiar;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}
