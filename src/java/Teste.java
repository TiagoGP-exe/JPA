
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Teste{
public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Medico");
  
    EntityManager em = factory.createEntityManager();
    
    Medico medico = new Medico();
    medico.setName("Anderson dos Santos Almeida");
    medico.setAdress("Rua David Alexandria, N353, Centro, Três Lagoas - MS");
    medico.setCrm("07318943-8/BR");
    medico.setTotalconsult(1);
    medico.setDataMedico(parseData("19/01/2002"));
    medico.setPhone("(89) 98229-1825");
    
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(medico);
    tx.commit();
    em.close();
    factory.close();


    
}

    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (Exception e) {
             throw new IllegalArgumentException(e);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
}
