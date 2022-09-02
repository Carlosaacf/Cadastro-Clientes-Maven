package dao;

import model.Desenvolvedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DesenvolvedorDao {

    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;

    public DesenvolvedorDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("moderna-jpa");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public void salvar(Desenvolvedor desenvolvedor) {
        entityManager.persist(desenvolvedor);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Desenvolvedor pesquisarPorId(Long id) {
        var desenvolvedorEncontrado = entityManager.find(Desenvolvedor.class, id);
        entityManager.close();
        return desenvolvedorEncontrado;

    }

    public void deletar(Long id) {
        var desenvolvedorEncontrado = entityManager.find(Desenvolvedor.class, id);
        entityManager.remove(desenvolvedorEncontrado);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizar(Desenvolvedor desenvolvedor) {
        entityManager.merge(desenvolvedor);
        entityManager.getTransaction().commit();
        entityManager.close();


    }

    public void listarTodos() {

        var sql = "from Desenvolvedor";
        TypedQuery typedQuery = entityManager.createQuery(sql, Desenvolvedor.class);
        List<Desenvolvedor> listaDesenvolvedor = typedQuery.getResultList();

        for (Desenvolvedor desenvolvedorPercorrido : listaDesenvolvedor) {
            System.out.println(desenvolvedorPercorrido);
        }

        entityManager.close();
    }

}