package br.edu.ifg.aulaJpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {

  private static final String PERSISTENCE_UNIT = "test";
  
  private static EntityManagerFactory factory;
  
  public static void main(String[] args) {
    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);   
    factory.createEntityManager();
    
    System.out.println("Hello World!");
  }
}
