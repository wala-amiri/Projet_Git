import java.util.ArrayList;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList ();
        arrayList.add(1);
        arrayList.add("AZIZ");
        arrayList.add(123);
        arrayList.add("AddedString");


        System.out.println(arrayList.contains("AZIZ"));


        Personne p1 = new Personne(1,19,"Flen1","Fouleni1");
        Personne p2 = new Personne(2,20,"Flen2","Fouleni2");
        Personne p3 = new Personne(3,21,"Flen3","Fouleni3");
        Personne p4 = new Personne(4,22,"Flen4","Fouleni4");
        Personne p5 = new Personne(4,22,"Flen4","Fouleni4");


        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(5));
        //parcours de la liste
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //parcourir et Afficher que les noms des personnes avec deux méthodes
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) instanceof Personne)
                System.out.println(((Personne) arrayList.get(i)).getNom());
        }

        for (Object p: arrayList ) {
            if(p instanceof Personne) {
                System.out.println(((Personne) p).getNom());
            }
        }

        arrayList.forEach(
                elt -> System.out.println(elt)
        );



        ArrayList<Personne> personneArrayList = new ArrayList();
        personneArrayList.add(p1);
        personneArrayList.add(p4);
        personneArrayList.add(p2);
        personneArrayList.add(p3);

        System.out.println(personneArrayList.contains(p5));

        Personne personne = personneArrayList.get(0);
        //Création d'une liste de integer et faite le tri crois et decrois
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(4);
        integerArrayList.add(7);
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(5);

        integerArrayList.sort(Comparator.naturalOrder());
        System.out.println(integerArrayList);
        integerArrayList.sort(Comparator.reverseOrder());
        System.out.println(integerArrayList);

        //Création d'une liste de String et faite le tri crois et decr
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Aziz");
        stringArrayList.add("Leith");
        stringArrayList.add("Wala");
        stringArrayList.add("Ons");
        stringArrayList.add("Rayen");

        stringArrayList.sort(Comparator.naturalOrder());
        System.out.println(stringArrayList);
        stringArrayList.sort(Comparator.reverseOrder());
        System.out.println(stringArrayList);
        // trier la liste de personne
        // ON A TRIER SELON L'ÂGE AVEC L'IMPLEMENTATION DES METHODES DE L'INTERFACE COMPARABLE
        personneArrayList.sort(Comparator.naturalOrder());
        System.out.println(personneArrayList);

        personneArrayList.sort(Comparator.reverseOrder());
        System.out.println(personneArrayList);



    }
}