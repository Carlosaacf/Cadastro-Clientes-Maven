package model;

import javax.persistence.*;

    @Entity
    @Table(name = "Contato")
    public class Contato {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        @Column(length = 40, nullable = false)
        private String email;
        @Column(length = 2, nullable = false, unique = true)
        private int ddd;
        @Column(length = 9, nullable = false, unique = true)
        private long numero;

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", ddd='" + ddd + '\'' +
                ", genero='" + numero + '\'' +
                '}';
    }

        public Long getId() { return id;}

        public void setId(Long id) { this.id = id;}

        public String getEmail() { return email;}

        public void setEmail(String email) { this.email = email;}

        public int getDdd() { return ddd;}

        public void setDdd(int ddd) { this.ddd = ddd;}

        public long getNumero() { return numero;}

        public void setNumero(long numero) { this.numero = numero;}
    }

