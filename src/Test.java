import java.util.ArrayList;
import java.util.Comparator;

public class Test {


    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add(5);
        list.add(6);
        list.add("test");
        list.add(5);
        list.add(6.2);
        list.add("6.2");



        System.out.println(list);
        System.out.println(list.contains("test"));
        System.out.println(list.contains(1));
        System.out.println(list.remove(5));
        System.out.println(list.remove(new Integer(5)));
        System.out.println(list.remove("test"));
        Personne p1=new Personne(1,22,"Ben turkya","Aziz");
        Personne p2=new Personne(2,18,"Boumnijel","Rayen");
        Personne p3=new Personne(3,20,"Bouazizi","Ons");
        Personne p4=new Personne(4,23,"Ben Daya","Leith");
        Personne p5=new Personne(5,25,"Amiri","Wala");

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(5));
        //parcours de toute la liste
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        for(Object var:list)
            System.out.println(var);
        //parcourir et Afficher que les noms des personnes
        for(int i=0;i<list.size();i++){
            Object ob=list.get(i);
            if (ob instanceof Personne)
                System.out.println(((Personne)ob).getNom());
        }
        //list.sort(Comparator.comparing());
        
    }
}
