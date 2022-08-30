import dao.DesenvolvedorDao;
import model.Desenvolvedor;

public class Principal {
    public static void main(String[] args) {

        Desenvolvedor p1 = new Desenvolvedor();
        p1.setId(20L);
        p1.setNome("Carlos");
        p1.setCpf("8845471423");

        DesenvolvedorDao desenvolvedorDao = new DesenvolvedorDao();
        desenvolvedorDao.listarTodos();

    }
}
