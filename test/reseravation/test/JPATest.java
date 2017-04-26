/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseravation.test;

import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class JPATest {
   @Test 
public void testjpa(){
       Persistence.createEntityManagerFactory("PU").createEntityManager();
    
}    
}
