package model;

import javax.persistence.*;

@Entity
@Table(name ="db_linguagem")
public class Linguagem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 25, nullable = false)
    private String nome;
    @Column(length = 5, nullable = false, unique = true)
    private String versao;


    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", versao ='" + versao + '\'' +
                '}';
    }

    public Long getId() { return id;}

    public void setId(Long id) { this.id = id;}

    public String getNome() { return nome;}

    public void setNome(String nome) { this.nome = nome;}

    public String getVersao() { return versao;}

    public void setVersao(String versao) { this.versao = versao;}
}
