package se.yrgo.Domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genres {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String category;
    
    public Genres(){}
    
    public Genres(int id, String category) {
        this.id = id;
        this.category = category;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public String toString() {
        return "Genres{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}
