package se.yrgo.Domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actors {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String name;
    private int id;
    
    public Actors(){}
    public Actors(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
