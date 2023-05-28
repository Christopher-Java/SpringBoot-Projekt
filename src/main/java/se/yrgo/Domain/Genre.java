
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
    private String category;
    
    public Genre(){}
    
    public Genre(Long id, String category) {
        this.id = id;
        this.category = category;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
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
        return "Genre{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}

