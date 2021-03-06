/**
 * 
 */
package com.trucky.Session;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.trucky.Hibernate.*;
/**
 * @author Jean
 *
 */

public class SessionDbUtil {
      
       private Session currentSession;
       private Transaction currentTransaction;
      
       public Session openCurrentSession() {
             currentSession = HibernateUtils.getSessionFactory().openSession();
             return currentSession;
       }
 
       public Session openCurrentSessionwithTransaction() {
             currentSession = HibernateUtils.getSessionFactory().openSession();
             currentTransaction = currentSession.beginTransaction();
             return currentSession;
       }
      
       public void closeCurrentSession() {
             currentSession.close();
       }
      
       public void closeCurrentSessionwithTransaction() {
             currentTransaction.commit();
             currentSession.close();
       }
      
       public Session getCurrentSession() {
             return currentSession;
       }
 
       public void setCurrentSession(Session currentSession) {
             this.currentSession = currentSession;
       }
 
       public Transaction getCurrentTransaction() {
             return currentTransaction;
       }
 
       public void setCurrentTransaction(Transaction currentTransaction) {
             this.currentTransaction = currentTransaction;
       }
 
}