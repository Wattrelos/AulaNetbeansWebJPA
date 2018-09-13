package aplicacao;

import dominio.Cadastro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Josias Wattrelos
 */
public class AulaJPA {

    public static void main(String[] args) {
        
        Cadastro p1 = new Cadastro(null, "Thais Daufouy",77777777777L,77,777);       
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursoJPA2PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        em.persist(p1);        
        
        em.getTransaction().commit();
        System.out.println("Pronto");
    }
    
}
