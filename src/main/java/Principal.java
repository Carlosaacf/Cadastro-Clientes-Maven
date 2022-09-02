import dao.ContatoDao;
import dao.DesenvolvedorDao;
import dao.LinguagemDao;
import model.Contato;
import model.Desenvolvedor;
import model.Linguagem;

public class Principal {
    public static void main(String[] args) {

        Desenvolvedor p1 = new Desenvolvedor();
        p1.setId(20L);
        p1.setNome("Carlos");
        p1.setCpf("8845471423");

        DesenvolvedorDao desenvolvedorDao = new DesenvolvedorDao();
        desenvolvedorDao.listarTodos();

        Linguagem l1 = new Linguagem();
        l1.setId(30L);
        l1.setNome("Javascript");
        l1.setVersao("4.5");

        LinguagemDao linguagemDao = new LinguagemDao();
        linguagemDao.listarTodos();

        Contato c1 = new Contato();
        c1.setId(40L);
        c1.setEmail("Carlosaacf@gmail.com");
        c1.setDdd(81);
        c1.setNumero(988445566);

        ContatoDao contatoDao = new ContatoDao();
        contatoDao.listarTodos();

    }
}
