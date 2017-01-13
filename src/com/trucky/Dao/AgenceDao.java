/**
 * 
 */
package com.trucky.Dao;

import java.util.List;

import com.trucky.Domain.Agence;
import com.trucky.Session.SessionDbUtil;

/**
 * @author Jean
 *
 */
public class AgenceDao {
	
	private SessionDbUtil sessionDbUtil;
	 
    public AgenceDao() {
          this.sessionDbUtil = new SessionDbUtil();
    }
   
    public SessionDbUtil getSession(){
          return this.sessionDbUtil;
    }
   

    public void persist(Agence entity) {
           this.sessionDbUtil.getCurrentSession().save(entity);
    }

    public void update(Agence entity) {
           this.sessionDbUtil.getCurrentSession().update(entity);
    }

    public Agence findById(int id) {
          Agence Agences = (Agence) this.sessionDbUtil.getCurrentSession().get(Agence.class, id);
          return Agences;
    }

    public void delete(Agence entity) {
           this.sessionDbUtil.getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Agence> findAll() {
          List<Agence> Agences = (List<Agence>) this.sessionDbUtil.getCurrentSession().createQuery("from Agence").list();
          return Agences;
    }

    public void deleteAll() {
          List<Agence> entityList = findAll();
          for (Agence entity : entityList) {
                 delete(entity);
          }
    }
}
