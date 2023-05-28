package se.yrgo.Domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Director {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;
    
    
    public Director(){}
    
    public Director(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
