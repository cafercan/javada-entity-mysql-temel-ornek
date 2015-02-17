/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veritabani;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author cafercan
 */

public class Veritabani {
    public static EntityManagerFactory emf;
    public static EntityManager em;
    
    
    public static void persist(Object object){
        
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            em.getTransaction().rollback();
            System.out.print("Hata " + e.toString());
        }
    }
   

    public void baglan() {
        emf = javax.persistence.Persistence
                .createEntityManagerFactory("EntityAndMySQLPU");
        em = emf.createEntityManager();
    }
    
   
    
    public static void veriEkle(){
        
        //onCreate();
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
        
    }
}

