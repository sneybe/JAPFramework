/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseravation.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import reservation.entity.Chambre;

/**
 *
 * @author formation
 */
public class JPATest {
   @Test 
public void testjpa(){
     EntityManager en =  Persistence.createEntityManagerFactory("PU").createEntityManager();
     Chambre c =new Chambre();
     c.setNom("suite royale");
     c.setPrix(20000.0);
     c.setDescription("c'est magnifique ");
     
     en.getTransaction().begin();
     
     en.persist(c);
     en.getTransaction().commit();
    
}    
}
