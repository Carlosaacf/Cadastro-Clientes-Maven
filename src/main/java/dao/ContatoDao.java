package dao;

import model.Contato;
import model.Linguagem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ContatoDao {

    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;

    public ContatoDao(){
        entityManagerFactory = Persistence.createEntityManagerFactory("moderna-jpa");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public void salvar(Contato contato){
        entityManager.persist(contato);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Contato pesquisarPorId(Long id){
        var contatoEncontrado = entityManager.find(Contato.class, id);
        entityManager.close();
        return contatoEncontrado;

    }

    public void deletar(Long id){
        var contatoEncontrado = entityManager.find(Contato.class, id);
        entityManager.remove(contatoEncontrado);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizar(Contato contato){
        entityManager.merge(contato);
        entityManager.getTransaction().commit();
        entityManager.close();


    }

    public void listarTodos(){

        var sql = "from Contato";
        TypedQuery typedQuery = entityManager.createQuery(sql, Contato.class);
        List<Contato> listaContato = typedQuery.getResultList();

        for (Contato contatoPercorrido : listaContato){
            System.out.println(contatoPercorrido);
        }

        entityManager.close();
    }

}
