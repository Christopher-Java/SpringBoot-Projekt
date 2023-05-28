
package se.yrgo.Domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;
    
    public Genre(){}
    
    public Genre(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String geName() {
        return name;
    }
    
    public void setCategory(String category) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", category='" + name + '\'' +
                '}';
    }
}

