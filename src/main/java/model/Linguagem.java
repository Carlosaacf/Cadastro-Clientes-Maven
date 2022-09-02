package model;

import javax.persistence.*;

@Entity
@Table(name ="Linguagem")
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
        return "Linguagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", versao ='" + versao + '\'' +
                '}';
    }

    public Long getId(long l) { return id;}

    public void setId(Long id) { this.id = id;}

    public String getNome(String nome) { return nome;}

    public void setNome(String nome) { this.nome = nome;}

    public String getVersao(double v) { return versao;}

    public void setVersao(String versao) { this.versao = versao;}
}
