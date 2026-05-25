package dao;

import model.Alvara;
import util.JPAUtil;
import jakarta.persistence.EntityManager;

public class AlvaraDAO {
    
    public void salvar(Alvara a) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
