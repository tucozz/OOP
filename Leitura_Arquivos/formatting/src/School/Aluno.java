package School;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private String matricula;
    private float cr;
    private float renda_familiar;
    private LocalDate nascimento;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public void setRenda_familiar(float renda_familiar) {
        this.renda_familiar = renda_familiar;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
