package dao;

import model.Desenvolvedor;
import model.Linguagem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class LinguagemDao {

    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;

    public LinguagemDao(){
        entityManagerFactory = Persistence.createEntityManagerFactory("moderna-jpa");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public void salvar(Linguagem linguagem){
        entityManager.persist(linguagem);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Linguagem pesquisarPorId(Long id){
        var linguagemEncontrada = entityManager.find(Linguagem.class, id);
        entityManager.close();
        return linguagemEncontrada;

    }

    public void deletar(Long id){
        var linguagemEncontrada = entityManager.find(Linguagem.class, id);
        entityManager.remove(linguagemEncontrada);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizar(Linguagem linguagem){
        entityManager.merge(linguagem);
        entityManager.getTransaction().commit();
        entityManager.close();


    }

    public void listarTodos(){

        var sql = "from Linguagem";
        TypedQuery typedQuery = entityManager.createQuery(sql, Linguagem.class);
        List<Linguagem> listaLinguagens = typedQuery.getResultList();

        for (Linguagem linguagemPercorrida : listaLinguagens){
            System.out.println(linguagemPercorrida);
        }

        entityManager.close();
    }

}
