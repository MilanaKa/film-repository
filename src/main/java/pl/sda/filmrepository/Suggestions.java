package pl.sda.filmrepository;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Objects;

@Entity
public class Suggestions {
    @Id
    @GeneratedValue
    Long id;
    String title;
    String link;
    int score;
    String author;
    public String getAuthor(){
        return author;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getLink(){
        return link;
    }
    public void setLink(String link){
        this.link=link;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if((o == null) ||getClass() != o.getClass())return false;
        Suggestions that=(Suggestions) o;
        return Objects.equals(id,that.id);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
