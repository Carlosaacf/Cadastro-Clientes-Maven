package model;

import javax.persistence.*;


@Entity
@Table(name ="db_desenvolvedor")
public class Desenvolvedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 13, nullable = false, unique = true)
    private String cpf;

    @Column(length = 9, nullable = false, unique = true)
    private String genero;

    @Column(length = 10, nullable = false, unique = true)
    private String anoNascimento;


    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", anoNascimento='" + anoNascimento + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() { return genero;}

    public void setGenero(String genero) { this.genero = genero;}

    public String getAnoNascimento() { return anoNascimento;}

    public void setAnoNascimento(String anoNascimento) { this.anoNascimento = anoNascimento;}
}
