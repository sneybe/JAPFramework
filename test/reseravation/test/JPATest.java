/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseravation.test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import reservation.entity.Adresse;
import reservation.entity.Chambre;
import reservation.entity.Client;
import reservation.entity.Hotel;
import static reservation.entity.Hotel_.chambre;
import reservation.entity.Reservation;

/**
 *
 * @author formation
 */
public class JPATest {

    /* @Test
    public void ListerChambresHotelId(){
        EntityManagerFactory fact=Persistence.createEntityManagerFactory("PU");
        EntityManager en =fact.createEntityManager();
        
        Hotel hotel=en.find(Hotel.class, 152L);
        List<Chambre>chambres =hotel.getChambre();
        
        for(Chambre c:chambres){
            System.out.println(c.getNom());
        }
    }
    
    
     @Test 
    public void recupererchambre(){
        
         EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
         EntityManager em=emf.createEntityManager();
         
         Chambre chambre=em.find(Chambre.class,1L);
         System.out.println(String.format("chambre: id=%d nom=%s prix=%9.2f hotel=%s",chambre.getId(),chambre.getNom(), chambre.getPrix(),
         chambre.getHotel().getNom()));
        
    }
    
    @Test 
    public void ajouterHotel(){
        
        Hotel h =new Hotel();
        Adresse a =new Adresse();
        a.setCodePostale(91700L);
        a.setLocalite("ESSONNE");
        a.setRue("leon tolstoi");
        a.setVille("sainte genevieve des bois");
        a.setPays("france");
        h.setAdr(a);
        
        h.setNom("Hotel LEON TOLSTOi");
        
        
       
    EntityManager en =Persistence.createEntityManagerFactory("PU").createEntityManager();
    
    en.getTransaction().begin();
    en.persist(h);
    en.getTransaction().commit();
}
    
    
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
     */
//   @Test
    public void testcli() {
        Reservation r = new Reservation();

        EntityManagerFactory enf = Persistence.createEntityManagerFactory("PU");
        EntityManager en = enf.createEntityManager();

        en.getTransaction().begin();

        en.persist(r);

        en.getTransaction().commit();
    }

    @Test
    public void testreser() {
 
     EntityManager en = Persistence.createEntityManagerFactory("PU").createEntityManager();
     
    }
}
