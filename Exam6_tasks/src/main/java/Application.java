import entity.Human;
import entity.Medicine;
import entity.Virus;
import org.hibernate.Session;
import util.HibernateUtil;

public class Application {
    public static void main(String[] args) {

        Medicine medicine1 = Medicine.builder().name("Azitramisin").build();
        Medicine medicine2 = Medicine.builder().name("Penicilin").build();
        Medicine medicine3 = Medicine.builder().name("Flemoksin Solutab").build();
        Medicine medicine4 = Medicine.builder().name("Vitamine C").build();

        saveOrUpdate(medicine1);
        saveOrUpdate(medicine2);
        saveOrUpdate(medicine3);
        saveOrUpdate(medicine4);

        Virus virus1 = Virus.builder().name("Covid-19").medicine(medicine1).build();
        Virus virus2 = Virus.builder().name("Flu").medicine(medicine1).build();
        Virus virus3 = Virus.builder().name("Mumps").medicine(medicine2).build();
        Virus virus4 = Virus.builder().name("Herpes").medicine(medicine3).build();
        Virus virus5 = Virus.builder().name("Rubella").medicine(medicine3).build();

        saveOrUpdate(virus1);
        saveOrUpdate(virus2);
        saveOrUpdate(virus3);
        saveOrUpdate(virus4);
        saveOrUpdate(virus5);

        Human human1 = Human.builder().name("Anna").age(21).virus(virus1).build();
        Human human2 = Human.builder().name("Mark").age(20).virus(virus1).build();
        Human human3 = Human.builder().name("Andrew").age(38).virus(virus2).build();
        Human human4 = Human.builder().name("Fred").age(26).virus(virus2).build();
        Human human5 = Human.builder().name("Ben").age(35).virus(virus3).build();
        Human human6 = Human.builder().name("Brad").age(40).virus(virus3).build();
        Human human7 = Human.builder().name("Kate").age(50).virus(virus4).build();


        saveOrUpdate(human1);
        saveOrUpdate(human2);
        saveOrUpdate(human3);
        saveOrUpdate(human4);
        saveOrUpdate(human5);
        saveOrUpdate(human6);
        saveOrUpdate(human7);

    }


    public static <T> T saveOrUpdate(T entity){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Запись создана/обновлена успешно");
        return entity;
    }
}
