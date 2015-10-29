package br.com.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
  private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("EAD");

public static EntityManagerFactory getFactory() {
	return FACTORY;
}

}
