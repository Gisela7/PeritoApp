package dao;

import model.Perito;
import util.JPAUtil;
import jakarta.persistence.EntityManager;
import java.util.List;

public class PeritoDAO {

    public void salvar(Perito p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            // O merge serve tanto para salvar novo quanto para atualizar existente
            em.merge(p); 
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public List<Perito> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Perito p", Perito.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Perito p = em.find(Perito.class, id);
            if (p != null) {
                em.remove(p);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}