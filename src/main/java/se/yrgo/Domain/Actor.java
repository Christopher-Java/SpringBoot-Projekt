package se.yrgo.Domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String name;
    private long id;
    
    public Actor(){}
    public Actor(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
