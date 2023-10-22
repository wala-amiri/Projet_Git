
import java.util.Comparator;
import java.util.Objects;

public class Personne  implements  Comparable<Personne>{
    // Identifiant
    private int id;
    // Age
    private int age;
    // Nom de personne
    private String nom;
    // Prenom de personne
    private String prenom;


    public Personne() {
    }

    public Personne(int id, int age, String nom, String prenom) {
        this.id = id;
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return id == personne.id && age == personne.age && Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }


    @Override
    public int compareTo(Personne personne) {
        if (this.age> personne.age)
            return 1;
        else if ( this.age < personne.age)
            return -1;
        else return 0;
    }



}
